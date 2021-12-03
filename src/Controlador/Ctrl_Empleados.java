package Controlador;

import Consultas.Consultas_Usuario;
import Modelo.Mod_Usuario;
import Vista.JDialogs.Empleados;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Ctrl_Empleados implements ActionListener {

    private Mod_Usuario ModUsuario;
    private Empleados FrameEmpleados;
    private Consultas_Usuario consultas;

    public Ctrl_Empleados(Mod_Usuario mod, Empleados view, Consultas_Usuario consultas) {
        this.FrameEmpleados = view;
        this.ModUsuario = mod;
        this.consultas = consultas;

        FrameEmpleados.btnAgregar.addActionListener(this);
        FrameEmpleados.btnRefresh.addActionListener(this);
        FrameEmpleados.cbxBusqueda.addActionListener(this);
        FrameEmpleados.btnBorrar.addActionListener(this);
        FrameEmpleados.btnModificar.addActionListener(this);

        Iniciar();
    }

    private void Iniciar() {

        CargarTabla();
        MetodoBuscar();
        TomarDatosEmpleado();

        FrameEmpleados.txtCodigoEmpleado.setEditable(false);
        FrameEmpleados.setTitle("Empleados");
        FrameEmpleados.setVisible(true);
    }

    private void Limpiar() {
        FrameEmpleados.txtCodigoEmpleado.setText("");
        FrameEmpleados.txtNombre.setText("");
        FrameEmpleados.txtApp1.setText("");
        FrameEmpleados.txtApp2.setText("");
    }

    private void Agregar() {
        int rol = FrameEmpleados.cbxRol.getSelectedIndex() + 1;
        Color color = (Color) FrameEmpleados.cbxColor.getSelectedItem();
        String Hex = String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());

        if (!(FrameEmpleados.txtNombre.getText().trim().equals("") || FrameEmpleados.txtApp1.getText().trim().equals("")
                || FrameEmpleados.txtApp2.getText().trim().equals(""))) {
            if (consultas.AgregarEmpleado(FrameEmpleados.txtNombre.getText().trim(), FrameEmpleados.txtApp1.getText().trim(),
                    FrameEmpleados.txtApp2.getText().trim(), rol, Hex)) {
                JOptionPane.showMessageDialog(null, "Empleado añadido con exito!");
                CargarTabla();
                Limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se necesitan todos los campos rellenados");
        }
    }

    private void CargarTabla() {
        FrameEmpleados.tblEmpleados.setModel(consultas.CargarEmpleados());
        Buscar();
    }

    private void MetodoBuscar() {
        FrameEmpleados.txtBuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Buscar();
            }
        });
    }

    private void Buscar() {
        TableRowSorter modeloOrdenado = new TableRowSorter<TableModel>(FrameEmpleados.tblEmpleados.getModel());
        FrameEmpleados.tblEmpleados.setRowSorter(modeloOrdenado);
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + FrameEmpleados.txtBuscar.getText(),
                FrameEmpleados.cbxBusqueda.getSelectedIndex()));
    }

    private void TomarDatosEmpleado() {
        FrameEmpleados.tblEmpleados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {

                    String cod = String.valueOf(FrameEmpleados.tblEmpleados.getModel().getValueAt(FrameEmpleados.tblEmpleados.getSelectedRow(), 0));
                    Object[] datos = consultas.BuscarEmpleado(cod);
                    String CadenaHex = String.valueOf(datos[4]);
                    String aux = "";
                    for (int i = 0; i < CadenaHex.length(); i++) {
                        if (CadenaHex.charAt(i) != '#') {
                            aux += CadenaHex.charAt(i);
                        }
                    }

                    int hex = Integer.parseInt(aux, 16);
                    int r = (hex & 0xFF0000) >> 16;
                    int g = (hex & 0xFF00) >> 8;
                    int b = (hex & 0xFF);
                    Color color = new Color(r, g, b);

                    FrameEmpleados.txtCodigoEmpleado.setText(cod);
                    FrameEmpleados.txtNombre.setText(String.valueOf(datos[0]));
                    FrameEmpleados.txtApp1.setText(String.valueOf(datos[1]));
                    FrameEmpleados.txtApp2.setText(String.valueOf(datos[2]));
                    FrameEmpleados.cbxRol.setSelectedIndex(Integer.parseInt(String.valueOf(datos[3])) - 1);
                    FrameEmpleados.cbxColor.setSelectedItem(color);
                }
            }
        });
    }

    private void Borrar() {
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrar al empleado?", "Borrar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (!(FrameEmpleados.txtCodigoEmpleado.getText().isEmpty())) {
                if (ModUsuario.getCodEmpleado() != Integer.parseInt(FrameEmpleados.txtCodigoEmpleado.getText())) {
                    if (consultas.BorrarEmpleado(Integer.parseInt(FrameEmpleados.txtCodigoEmpleado.getText()))) {
                        JOptionPane.showMessageDialog(null, "Empleado borrado con exito!");
                        Limpiar();
                        CargarTabla();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error al borrar el empleado.\nReintente luego");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No puede eliminar a este empleado porque está con la sesión activa");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione a un empleado primero");
            }
        }
    }

    private void Modificar() {
        int rol = FrameEmpleados.cbxRol.getSelectedIndex() + 1;
        Color color = (Color) FrameEmpleados.cbxColor.getSelectedItem();
        String Hex = String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea modificar este empleado?", "Modificar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (!(FrameEmpleados.txtNombre.getText().trim().equals("") || FrameEmpleados.txtApp1.getText().trim().equals("")
                    || FrameEmpleados.txtApp2.getText().trim().equals(""))) {    
                if(consultas.ModificarEmpleado(FrameEmpleados.txtNombre.getText().trim(), FrameEmpleados.txtApp1.getText().trim(), 
                        FrameEmpleados.txtApp2.getText().trim(), rol, Hex, Integer.parseInt(FrameEmpleados.txtCodigoEmpleado.getText()))){
                    JOptionPane.showMessageDialog(null, "Empleado actualizado con exito!");
                    Limpiar();
                    CargarTabla();
                }else{
                    JOptionPane.showMessageDialog(null, "Hubo un error al modificar los datos");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Se necesitan todos los campos rellenados");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == FrameEmpleados.btnAgregar) {
            Agregar();
        }

        if (e.getSource() == FrameEmpleados.btnRefresh) {
            CargarTabla();
        }

        if (e.getSource() == FrameEmpleados.cbxBusqueda) {
            Buscar();
        }

        if (e.getSource() == FrameEmpleados.btnBorrar) {
            Borrar();
        }

        if (e.getSource() == FrameEmpleados.btnModificar) {
            Modificar();
        }
    }
}
