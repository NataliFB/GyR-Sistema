package Controlador;

import Consultas.Consultas_Contrataciones;
import Modelo.Mod_IngresarContr;
import Modelo.Mod_Usuario;
import Vista.Paneles.Pn_IngresarContr;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 * Clase para las acciones que ejecutan los botones en la ventana de Ingresar
 * Contrataciones
 *
 * @author
 */
public class Ctrl_IngresarContr implements ActionListener {

    private Pn_IngresarContr pnlC;
    private Mod_IngresarContr modC;
    private Consultas_Contrataciones consulta;

    /**
     * Constructor de la clase Ctrl_IngresarContr. Le asgina valores a variables
     * privadas, inicializa objetos y le añade eventos a los botones
     *
     * @param viewContratacion Recibe un objeto de tipo Pn_IngresarContr que es
     * la vista donde interactua el usuario
     * @param modContratacion Recibe un objeto de tipo modContratacion que es
     * donde están las variables almacenadas
     * @param consultas Recibe un objeto de tipo Consultas_Contrataciones para
     * poder hacer consutlas como insertar, borrar, actualizar y buscar
     */
    public Ctrl_IngresarContr(Pn_IngresarContr viewContratacion, Mod_IngresarContr modContratacion, Consultas_Contrataciones consultas) {
        this.pnlC = viewContratacion;
        this.modC = modContratacion;
        this.consulta = consultas;

        Iniciar();

        //Se añade los eventos a los botones
        this.pnlC.btnInsertarContratacion.addActionListener(this);
        this.pnlC.btnLimpiarContratacion.addActionListener(this);
        this.pnlC.cmbBusqueda.addActionListener(this);
        this.pnlC.btnModificarContratacion.addActionListener(this);
        this.pnlC.btnEliminarContratacion.addActionListener(this);
        this.pnlC.btnRefrescar.addActionListener(this);
        this.pnlC.btnTomarContratacion.addActionListener(this);
    }

    /**
     * Metodo que inicializa la ventana
     */
    private void Iniciar() {
        CargarTablaIncompletas();
        CargarTablasCompletas();
        MetodoBuscar();
        TomarDatosContratación();
        PintarFilas();

        pnlC.setVisible(true);
    }

    /**
     * Metodo que limpia los campos en la ventana
     */
    private void Limpiar() {
        pnlC.txtContratacion.setText("");
        pnlC.txaDescripcion.setText("");
        pnlC.txtFechaPublicacion.setText("");
        pnlC.txtFechaApertura.setText("");
        pnlC.txtInstitucion.setText("");
        pnlC.btgEstado.clearSelection();

        modC.setNumContratacion("");
        modC.setDescripcion("");
        modC.setFechaPublicacion("");
        modC.setFechaApertura("");
        modC.setInstitución("");
    }

    /**
     * Metodo que carga los datos en la tabla de Contrataciones Incompletas
     */
    private void CargarTablaIncompletas() {
        pnlC.tblContratacionesIncomp.setModel(consulta.CargarContratacionesIncompletas());
        Buscar();
        PintarFilas();
    }

    /**
     * Metodo que carga los datos en la tabla de Contrataciones Completas
     */
    private void CargarTablasCompletas() {
        pnlC.tblContratacionesComp.setModel(consulta.CargarContratacionesCompletas());
        Buscar();
        PintarFilas();
    }

    /**
     * Metodo que le añade un evento al textbox Buscar
     */
    private void MetodoBuscar() {
        pnlC.txtBuscar.addCaretListener(new javax.swing.event.CaretListener() {
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
        TableRowSorter modeloOrdenado = new TableRowSorter<TableModel>(pnlC.tblContratacionesIncomp.getModel());
        pnlC.tblContratacionesIncomp.setRowSorter(modeloOrdenado);
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + pnlC.txtBuscar.getText(),
                pnlC.cmbBusqueda.getSelectedIndex()));

        TableRowSorter modeloOrdenado2 = new TableRowSorter<TableModel>(pnlC.tblContratacionesComp.getModel());
        pnlC.tblContratacionesComp.setRowSorter(modeloOrdenado2);
        modeloOrdenado2.setRowFilter(RowFilter.regexFilter("(?i)" + pnlC.txtBuscar.getText(),
                pnlC.cmbBusqueda.getSelectedIndex()));
    }

    /**
     * Metodo para insertar datos en los campos<br>
     * Este metodo obtiene lo que hay en el portapapeles del sistema y busca
     * patrones en lo obtenido para poder insertarlo en los campos de texto. Si
     * lo copiado no es texto dara error<br>
     * Por ultimo se insertaran los datos en la base de datos si el usuario
     * acepta
     */
    private void Insertar() {
        Limpiar();
        int i;
        String Portapapeles = getPortapapeles();

        try {
            for (i = 0; i < Portapapeles.length(); i++) {
                if (Portapapeles.charAt(i) != '[') {
                    if (Character.isLetter(Portapapeles.charAt(i)) && !Character.isDigit(Portapapeles.charAt(i + 3)) || Character.isSpaceChar(Portapapeles.charAt(i))) {
                        modC.setInstitución(modC.getInstitución() + Portapapeles.charAt(i));
                    } else {
                        modC.setNumContratacion(modC.getNumContratacion() + Portapapeles.charAt(i));
                    }
                } else {
                    break;
                }
            }

            for (i = i; i < Portapapeles.length(); i++) {
                if (!(Portapapeles.charAt(i) == '/')) {
                    modC.setDescripcion(modC.getDescripcion() + Portapapeles.charAt(i));
                } else {
                    if (Character.isLetter(Portapapeles.charAt(i + 1))) {
                    } else {
                        modC.setDescripcion(modC.getDescripcion().substring(0, modC.getDescripcion().length() - 2));
                        break;
                    }

                }
            }

            for (i = i - 2; i < Portapapeles.length(); i++) {
                if (!(Portapapeles.charAt(i) == ':')) {
                    modC.setFechaPublicacion(modC.getFechaPublicacion() + Portapapeles.charAt(i));
                } else {
                    modC.setFechaPublicacion(modC.getFechaPublicacion() + ":" + Portapapeles.charAt(i + 1) + Portapapeles.charAt(i + 2));
                    break;
                }
            }

            for (i = i + 3; i < Portapapeles.length(); i++) {
                if (!(Portapapeles.charAt(i) == ':')) {
                    modC.setFechaApertura(modC.getFechaApertura() + Portapapeles.charAt(i));
                } else {
                    modC.setFechaApertura(modC.getFechaApertura() + ":" + Portapapeles.charAt(i + 1) + Portapapeles.charAt(i + 2));
                    break;
                }
            }

            modC.setNumContratacion(modC.getNumContratacion().trim());
            modC.setDescripcion(modC.getDescripcion().trim());
            modC.setFechaPublicacion(modC.getFechaPublicacion().trim());
            modC.setFechaApertura(modC.getFechaApertura().trim());
            modC.setInstitución(modC.getInstitución().trim());

            pnlC.txtContratacion.setText(modC.getNumContratacion());
            pnlC.txaDescripcion.setText(modC.getDescripcion());
            pnlC.txtFechaPublicacion.setText(modC.getFechaPublicacion());
            pnlC.txtFechaApertura.setText(modC.getFechaApertura());
            pnlC.txtInstitucion.setText(modC.getInstitución());

            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos copiados?", "Confirmar", JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {
                if (consulta.IngresarContratacion(modC)) {
                    JOptionPane.showMessageDialog(null, "Contratación ingresada");
                    CargarTablaIncompletas();
                    CargarTablasCompletas();
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error durante el proceso");
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Verifique que lo que haya copiado sea valido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Metodo para traer los datos de una contratación que está en la tabla a
     * los campos de texto, esto mediante el valor de la celda que esté en la
     * fila seleccionada y la columna 0
     */
    private void TomarDatosContratación() {
        pnlC.tblContratacionesComp.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    Limpiar();
                    String contratación = String.valueOf(pnlC.tblContratacionesComp.getModel().getValueAt(pnlC.tblContratacionesComp.getSelectedRow(), 0));
                    Object[] datos = consulta.BuscarContratacion(contratación);
                    pnlC.txtContratacion.setText(contratación);
                    pnlC.txtInstitucion.setText(String.valueOf(datos[0]));
                    pnlC.txaDescripcion.setText(String.valueOf(datos[1]));
                    pnlC.txtFechaPublicacion.setText(String.valueOf(datos[2]));
                    pnlC.txtFechaApertura.setText(String.valueOf(datos[3]));
                    if (String.valueOf(datos[4]).equals("Enviada")) {
                        pnlC.rbtEnviada.setSelected(true);
                    } else if (String.valueOf(datos[4]).equals("Descartada")) {
                        pnlC.rbtDescartada.setSelected(true);
                    } else {
                        pnlC.btgEstado.clearSelection();
                    }
                    pnlC.txaObservaciones.setText(String.valueOf(datos[5]));
                }
            }
        });
        pnlC.tblContratacionesIncomp.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    Limpiar();
                    String contratación = String.valueOf(pnlC.tblContratacionesIncomp.getModel().getValueAt(pnlC.tblContratacionesIncomp.getSelectedRow(), 0));
                    Object[] datos = consulta.BuscarContratacion(contratación);
                    pnlC.txtContratacion.setText(contratación);
                    pnlC.txtInstitucion.setText(String.valueOf(datos[0]));
                    pnlC.txaDescripcion.setText(String.valueOf(datos[1]));
                    pnlC.txtFechaPublicacion.setText(String.valueOf(datos[2]));
                    pnlC.txtFechaApertura.setText(String.valueOf(datos[3]));
                    if (String.valueOf(datos[4]).equals("Enviada")) {
                        pnlC.rbtEnviada.setSelected(true);
                    } else if (String.valueOf(datos[4]).equals("Descartada")) {
                        pnlC.rbtDescartada.setSelected(true);
                    } else {
                        pnlC.btgEstado.clearSelection();
                    }
                    pnlC.txaObservaciones.setText(String.valueOf(datos[5]));
                }
            }
        });
    }

    /**
     * Metodo para actualizar el estado de una contratación
     */
    private void ActualizarEstado() {
        if (!(pnlC.txtContratacion.getText().isEmpty()) && (pnlC.btgEstado.isSelected(pnlC.rbtDescartada.getModel())
                || pnlC.btgEstado.isSelected(pnlC.rbtEnviada.getModel()))) {
            String estado = "";
            if (pnlC.btgEstado.isSelected(pnlC.rbtEnviada.getModel())) {
                estado = "Enviada";
            } else {
                estado = "Descartada";
            }
            if (consulta.ModificarContratacion(pnlC.txtContratacion.getText(), estado, pnlC.txaObservaciones.getText())) {
                JOptionPane.showMessageDialog(null, "Se actualizo con exito la contratación!");
                CargarTablaIncompletas();
                CargarTablasCompletas();
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error durante el proceso");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una contratación y seleccione el estado que desea agregar");
        }
    }

    /**
     * Metodo para obtener lo que el usuario tenga en el portapapeles
     *
     * @return Si es texto el metodo devuelve el texto que haya en el
     * portapapeles
     */
    private String getPortapapeles() {
        // Metodo para obtener lo que tenga en el portapapeles
        String Portapapeles = "";
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable t = cb.getContents(this);

        // Construimos el DataFlavor correspondiente al String java
        try {
            DataFlavor dataFlavorStringJava = new DataFlavor("application/x-java-serialized-object; class=java.lang.String");

            // Y si el dato se puede conseguir como String java, lo sacamos por pantalla
            if (t.isDataFlavorSupported(dataFlavorStringJava)) {
                Portapapeles = (String) t.getTransferData(dataFlavorStringJava);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return Portapapeles;
    }

    /**
     * Metodo para borrar una contratación
     */
    private void BorrarContratacion() {
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrar esta contratación?", "Confirmar", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {
            if (!(pnlC.txtContratacion.getText().isEmpty())) {
                String contratacion = pnlC.txtContratacion.getText();
                if (consulta.BorrarContratacion(contratacion)) {
                    JOptionPane.showMessageDialog(null, "Se borró con exito la contratación!");
                    CargarTablaIncompletas();
                    CargarTablasCompletas();
                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error durante el proceso");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione la contratación que desea borrar");
            }
        }
    }

    /**
     * Metodo para hacerse cargo de la contratación seleccionada por el usuario
     */
    private void TomarContratacion() {
        if (!(pnlC.txtContratacion.getText().isEmpty())) {
            Mod_Usuario mod = new Mod_Usuario();
            int codEmpleado = mod.getCodEmpleado();
            String contratacion = pnlC.txtContratacion.getText();
            if (consulta.TomarContratacion(codEmpleado, contratacion)) {
                JOptionPane.showMessageDialog(null, "Contratación tomada\n" + contratacion);
                CargarTablaIncompletas();
                CargarTablasCompletas();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "El proceso no pudo continuar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una contratación primero");
        }
    }

    /**
     * Metodo que pinta las filas de la tabla de Contrataciones completas
     */
    private void PintarFilas() {

        PintarFilas pf = new PintarFilas();
        int cantColumnas = pnlC.tblContratacionesComp.getColumnCount();
        for (int i = 0; i < cantColumnas; i++) {
            pnlC.tblContratacionesComp.getColumnModel().getColumn(i).setCellRenderer(pf);
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
        // Eventos para los botones
        //Evento que acciona el boton de insertar contratación
        if (e.getSource() == pnlC.btnInsertarContratacion) {
            Insertar();
        }

        //Evento para el boton de limpiar
        if (e.getSource() == pnlC.btnLimpiarContratacion) {
            Limpiar();
        }

        if (e.getSource() == pnlC.cmbBusqueda) {
            Buscar();
        }

        if (e.getSource() == pnlC.btnModificarContratacion) {
            ActualizarEstado();
        }

        if (e.getSource() == pnlC.btnEliminarContratacion) {
            BorrarContratacion();
        }

        if (e.getSource() == pnlC.btnRefrescar) {
            CargarTablaIncompletas();
            CargarTablasCompletas();
        }

        if (e.getSource() == pnlC.btnTomarContratacion) {
            TomarContratacion();
        }
    }
}
