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

        Iniciar();
    }

    private void Iniciar() {

        CargarTabla();
        MetodoBuscar();
        TomarDatosEmpleado();

        FrameEmpleados.setTitle("Empleados");
        FrameEmpleados.setVisible(true);
    }

    private void Limpiar() {
        FrameEmpleados.txtNombre.setText("");
        FrameEmpleados.txtApp1.setText("");
        FrameEmpleados.txtApp2.setText("");
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
        int columnas = FrameEmpleados.tblEmpleados.getModel().getColumnCount();
        Object[] Datos = new Object[columnas];
        
        FrameEmpleados.tblEmpleados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    for (int i = 0; i < columnas; i++) {
                        Datos[i] = FrameEmpleados.tblEmpleados.getModel().getValueAt(FrameEmpleados.tblEmpleados.getSelectedRow(), i);
                    }
//                    FrameEmpleados.txtNombre.setText(String.valueOf(Datos[1]));
//                    FrameEmpleados.txtApp1.setText(String.valueOf(Datos[2]));
//                    FrameEmpleados.txtApp2.setText(String.valueOf(Datos[3]));
//                    FrameEmpleados.cbxRol.setSelectedItem(String.valueOf(Datos[4]));
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == FrameEmpleados.btnAgregar) {
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

        if (e.getSource() == FrameEmpleados.btnRefresh) {
            CargarTabla();
        }

        if (e.getSource() == FrameEmpleados.cbxBusqueda) {
            Buscar();
        }
    }

}
