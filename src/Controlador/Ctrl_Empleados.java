package Controlador;

import Consultas.Consultas_Usuario;
import Modelo.Mod_Usuario;
import Vista.Frames.Usuario;
import Vista.JDialogs.Empleados;
import Vista.JDialogs.VentanaPersonalizado;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 * Clase para las acciones que ejecutan los botones en la ventana de Empleado.
 * Esta solo puede ser vista por Administradores
 *
 * @author
 */
public class Ctrl_Empleados implements ActionListener {

    private Mod_Usuario ModUsuario;
    private Empleados FrameEmpleados;
    private Consultas_Usuario consultas;
    
    private VentanaPersonalizado vp;
    private Ctrl_VentanaPersonalizada ctrl_vp;

    /**
     * Constructor de la clase Ctrl_Empleados. Le asgina valores a variables
     * privadas, inicializa objetos y le añade eventos a los botones
     *
     * @param mod Recibe un objeto de tipo modUsuarios que es donde están las
     * variables almacenadas
     * @param view Recibe un objeto de tipo Empleados que es la ventana donde se
     * muestrans los distintos botones para interactuar
     * @param consultas Recibe un objeto de tipo Consultas_Usuario para poder
     * hacer consultas a la base de datos
     */
    public Ctrl_Empleados(Mod_Usuario mod, Empleados view, Consultas_Usuario consultas) {
        this.FrameEmpleados = view;
        this.ModUsuario = mod;
        this.consultas = consultas;

        FrameEmpleados.btnAgregar.addActionListener(this);
        FrameEmpleados.btnRefresh.addActionListener(this);
        FrameEmpleados.cmbBusqueda.addActionListener(this);
        FrameEmpleados.btnBorrar.addActionListener(this);
        FrameEmpleados.btnModificar.addActionListener(this);

        FrameEmpleados.cbxRol.addActionListener(this);

        Iniciar();
    }

    /**
     * Metodo que inicia estados en la ventana de Empleados
     */
    private void Iniciar() {

        CargarTabla();
        MetodoBuscar();
        TomarDatosEmpleado();

        FrameEmpleados.txtCodigoEmpleado.setEditable(false);
        FrameEmpleados.setTitle("Empleados");
        FrameEmpleados.setVisible(true);
    }

    /**
     * Metodo que limpia campos
     */
    private void Limpiar() {
        FrameEmpleados.txtCodigoEmpleado.setText("");
        FrameEmpleados.txtNombre.setText("");
        FrameEmpleados.txtApp1.setText("");
        FrameEmpleados.txtApp2.setText("");
    }

    /**
     * Metodo para añadir empleados
     */
    private void Agregar() {
        int rol = FrameEmpleados.cbxRol.getSelectedIndex() + 1;
        Color color = (Color) FrameEmpleados.cbxColor.getSelectedItem();
        String Hex = String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());
        boolean[] permisos = new boolean[9];

        if (rol == 1) {
            for (int i = 0; i < permisos.length; i++) {
                permisos[i] = true;
            }
        } else if (rol == 2) {
            for (int i = 0; i < permisos.length; i++) {
                if (i <= 6) {
                    permisos[i] = true;
                } else {
                    permisos[i] = false;
                }
            }
        } else if (rol == 3) {
            for (int i = 0; i < permisos.length; i++) {
                if (i == 4 || i == 5) {
                    permisos[i] = true;
                } else {
                    permisos[i] = false;
                }
            }
        }else{
            permisos = ctrl_vp.getPermisos();
        }

        if (!(FrameEmpleados.txtNombre.getText().trim().equals("") || FrameEmpleados.txtApp1.getText().trim().equals("")
                || FrameEmpleados.txtApp2.getText().trim().equals(""))) {
            if (consultas.AgregarEmpleado(FrameEmpleados.txtNombre.getText().trim(), FrameEmpleados.txtApp1.getText().trim(),
                    FrameEmpleados.txtApp2.getText().trim(), rol, Hex, permisos)) {
                JOptionPane.showMessageDialog(null, "Empleado añadido con exito!");
                CargarTabla();
                Limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se necesitan todos los campos rellenados");
        }
    }

    /**
     * Metodo que carga los empleados a la tabla
     */
    private void CargarTabla() {
        FrameEmpleados.tblEmpleados.setModel(consultas.CargarEmpleados());
        Buscar();
    }

    /**
     * Metodo que le añade un evento al textbox de buscar
     */
    private void MetodoBuscar() {
        FrameEmpleados.txtBuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Buscar();
            }
        });
    }

    /**
     * Metodo para buscar datos en las tablas en base al indice del Combobox de
     * Busqueda, mediante las clases de TableRowSorter y RowFilter
     */
    private void Buscar() {
        TableRowSorter modeloOrdenado = new TableRowSorter<TableModel>(FrameEmpleados.tblEmpleados.getModel());
        FrameEmpleados.tblEmpleados.setRowSorter(modeloOrdenado);
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + FrameEmpleados.txtBuscar.getText(),
                FrameEmpleados.cmbBusqueda.getSelectedIndex()));
    }

    /**
     * Metodo para traer los datos de un empleado que está en la tabla a los
     * campos de texto, esto mediante el valor de la celda que esté en la fila
     * seleccionada y la columna 0
     */
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

    /**
     * Metodo para borrar empleados
     */
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

    /**
     * Metodo para modificar empleados
     */
    private void Modificar() {
        int rol = FrameEmpleados.cbxRol.getSelectedIndex() + 1;
        Color color = (Color) FrameEmpleados.cbxColor.getSelectedItem();
        String Hex = String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea modificar este empleado?", "Modificar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (!(FrameEmpleados.txtNombre.getText().trim().equals("") || FrameEmpleados.txtApp1.getText().trim().equals("")
                    || FrameEmpleados.txtApp2.getText().trim().equals(""))) {
                if (consultas.ModificarEmpleado(FrameEmpleados.txtNombre.getText().trim(), FrameEmpleados.txtApp1.getText().trim(),
                        FrameEmpleados.txtApp2.getText().trim(), rol, Hex, Integer.parseInt(FrameEmpleados.txtCodigoEmpleado.getText()))) {
                    JOptionPane.showMessageDialog(null, "Empleado actualizado con exito!");
                    Limpiar();
                    CargarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error al modificar los datos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Se necesitan todos los campos rellenados");
            }
        }
    }

    /**
     * Metodo abstracto de la clase ActionListener, le aplica los eventos a los
     * botones
     *
     * @param e Evento por ser procesado
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == FrameEmpleados.btnAgregar) {
            Agregar();
        }

        if (e.getSource() == FrameEmpleados.btnRefresh) {
            CargarTabla();
        }

        if (e.getSource() == FrameEmpleados.cmbBusqueda) {
            Buscar();
        }

        if (e.getSource() == FrameEmpleados.btnBorrar) {
            Borrar();
        }

        if (e.getSource() == FrameEmpleados.btnModificar) {
            Modificar();
        }

        if (e.getSource() == FrameEmpleados.cbxRol) {
            if (FrameEmpleados.cbxRol.getSelectedItem().equals("Personalizado")) {
                Usuario us = new Usuario();
                vp = new VentanaPersonalizado(us, true);
                ctrl_vp = new Ctrl_VentanaPersonalizada(vp);
            }
        }
    }
}
