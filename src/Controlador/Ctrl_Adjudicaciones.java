package Controlador;

import Consultas.Consultas_Adjudicaciones;
import Modelo.Mod_Usuario;
import Vista.Paneles.Pnl_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 * Clase para las acciones que ejecutan los botones en la ventana de
 * Adjudicaiones, Orden y Entregadas
 *
 * @author
 */
public class Ctrl_Adjudicaciones implements ActionListener {

    private Pnl_2 panelAdjudicaiones;
    private Consultas_Adjudicaciones consultas;

    /**
     * Constructor de la clase Ctrl_IngresarContr. Le asgina valores a variables
     * privadas, inicializa objetos y le añade eventos a los botones
     *
     * @param viewPnl_2 Recibe un objeto de tipo Pnl_2 que es el panel donde el
     * usuario interactua para insertar datos
     *
     * @param consultas Recibe un objeto de tipo Consultas_Adjudicaciones para
     * realizar conexion con la base de datos
     */
    public Ctrl_Adjudicaciones(Pnl_2 viewPnl_2, Consultas_Adjudicaciones consultas) {
        this.panelAdjudicaiones = viewPnl_2;
        this.consultas = consultas;

        Iniciar();

        panelAdjudicaiones.btnLimpiarAdjudicada.addActionListener(this);
        panelAdjudicaiones.btnInsertarAdjudicada.addActionListener(this);
        panelAdjudicaiones.btnRefrescarAdjudicada.addActionListener(this);

        panelAdjudicaiones.btnLimpiarEntregada.addActionListener(this);
        panelAdjudicaiones.btnLimpiarOrden.addActionListener(this);

        panelAdjudicaiones.txtContratacionAdjudicada.addKeyListener(EventoTextField);
        panelAdjudicaiones.txtContratacionEntregada.addKeyListener(EventoTextField);
        panelAdjudicaiones.txtContratacionOrden.addKeyListener(EventoTextField);

        panelAdjudicaiones.txtBuscarAdjudicada.addCaretListener(EventoBuscar);
        panelAdjudicaiones.txtBuscarEntregada.addCaretListener(EventoBuscar);
        panelAdjudicaiones.txtBuscarOrden.addCaretListener(EventoBuscar);
        
        panelAdjudicaiones.tblAdjudicada.addMouseListener(EventoTablas);
    }

    /**
     * Metodo que inicializa la ventana
     */
    private void Iniciar() {
        CargarTablas();

        Mod_Usuario us = new Mod_Usuario();
        panelAdjudicaiones.txtEncargadoAdjudicada.setText(us.getNombreEmpleado());
        panelAdjudicaiones.txtEncargadoEntregada.setText(us.getNombreEmpleado());
        panelAdjudicaiones.txtEncargadoOrden.setText(us.getNombreEmpleado());
        panelAdjudicaiones.txtEncargadoAdjudicada.setEditable(false);
        panelAdjudicaiones.txtEncargadoEntregada.setEditable(false);
        panelAdjudicaiones.txtEncargadoOrden.setEditable(false);
        panelAdjudicaiones.txtInstituciónAdjudicada.setEditable(false);

        panelAdjudicaiones.setVisible(true);
    }

    /**
     * Metodo para limpiar el texto de los componentes
     */
    private void Limpiar() {
        panelAdjudicaiones.txtContratacionAdjudicada.setText("");
        panelAdjudicaiones.txtInstituciónAdjudicada.setText("");
        panelAdjudicaiones.spnDiasEntregaAdjudicaciones.getModel().setValue(1);
        panelAdjudicaiones.txtDescripcionAdjudicada.setText("");
        panelAdjudicaiones.txtDescripcionAdjudicada.setText("");
        panelAdjudicaiones.txaObservacionAdjudicada.setText("");
        panelAdjudicaiones.txtContratacionAdjudicada.setEditable(true);
        panelAdjudicaiones.txtInstituciónAdjudicada.setEditable(true);

        panelAdjudicaiones.txtContratacionOrden.setText("");
        panelAdjudicaiones.txtDiasEntregaOrden.setText("");
        panelAdjudicaiones.txtVigenciaContratoOrden.setText("");
        panelAdjudicaiones.txtNumOrden.setText("");
        panelAdjudicaiones.txtLugarEntregaOrden.setText("");
        panelAdjudicaiones.txtDescripcionOrden.setText("");
        panelAdjudicaiones.txtEncargadoOrden.setText("");
        panelAdjudicaiones.txaObservacionOrden.setText("");
        panelAdjudicaiones.txtContratacionOrden.setEditable(true);

        panelAdjudicaiones.txtContratacionEntregada.setText("");
        panelAdjudicaiones.txtDiasEntregada.setText("");
        panelAdjudicaiones.txtLugarEntregada.setText("");
        panelAdjudicaiones.txtDescripcionEntregada.setText("");
        panelAdjudicaiones.txtEncargadoOrden.setText("");
        panelAdjudicaiones.txaObservacionEntregada.setText("");
        panelAdjudicaiones.txtContratacionEntregada.setEditable(true);

        panelAdjudicaiones.btgEmpresaAdjudicada.clearSelection();
        panelAdjudicaiones.btgEmpresaEntregada.clearSelection();
        panelAdjudicaiones.btgEstadoAdjudicada.clearSelection();
        panelAdjudicaiones.btgDiasEntregaAdjudicada.clearSelection();
    }

    /**
     * Metodo para añadir adjudicaciones
     */
    private void AñadirAdjudicacion() {
        // Declaracion de modelo de los botones y grupos para comprobar si están seleccionados y asignar valores
        ButtonGroup grupoDias = panelAdjudicaiones.btgDiasEntregaAdjudicada;
        ButtonModel modeloNaturales = panelAdjudicaiones.rbtNaturalesAdjudicada.getModel();
        ButtonModel modeloHabiles = panelAdjudicaiones.rbtHabilesAdjudicada.getModel();

        ButtonGroup grupoEmpresa = panelAdjudicaiones.btgEmpresaAdjudicada;
        ButtonModel modeloGyR = panelAdjudicaiones.rbtGyRAdjudicada.getModel();
        ButtonModel modeloPB = panelAdjudicaiones.rbtPBAdjudicada.getModel();

        ButtonGroup grupoEstado = panelAdjudicaiones.btgEstadoAdjudicada;
        ButtonModel modeloEnFirme = panelAdjudicaiones.rbtFirmeAdjudicada.getModel();
        ButtonModel modeloEnDuda = panelAdjudicaiones.rbtDudaAdjudicada.getModel();

        //Variables para insertar
        String contratacion = panelAdjudicaiones.txtContratacionAdjudicada.getText().trim();
        String institucion = panelAdjudicaiones.txtInstituciónAdjudicada.getText().trim();
        int diasEntrega = Integer.parseInt(String.valueOf(panelAdjudicaiones.spnDiasEntregaAdjudicaciones.getModel().getValue()).trim());
        boolean modalidadDias;
        boolean empresa;
        String modalidadEntrega = String.valueOf(panelAdjudicaiones.cmbModalidadAdjudicada.getSelectedItem()).trim();
        String descripcion = panelAdjudicaiones.txtDescripcionAdjudicada.getText().trim();
        boolean estado;
        String observaciones = panelAdjudicaiones.txaObservacionAdjudicada.getText().trim();

        if (!(contratacion.isEmpty()) && !(panelAdjudicaiones.txtContratacionAdjudicada.isEditable())) {
            if ((grupoDias.isSelected(modeloNaturales) || grupoDias.isSelected(modeloHabiles))
                    && (grupoEmpresa.isSelected(modeloPB) || grupoEmpresa.isSelected(modeloGyR))
                    && (grupoEstado.isSelected(modeloEnDuda) || grupoEstado.isSelected(modeloEnFirme))) {

                if (grupoDias.isSelected(modeloNaturales)) {
                    modalidadDias = true;
                } else {
                    modalidadDias = false;
                }

                if (grupoEmpresa.isSelected(modeloGyR)) {
                    empresa = true;
                } else {
                    empresa = false;
                }

                if (grupoEstado.isSelected(modeloEnFirme)) {
                    estado = true;
                } else {
                    estado = false;
                }

                if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    if (consultas.InsertarAdjudicacion(institucion, diasEntrega, modalidadDias, empresa, modalidadEntrega, descripcion, estado, observaciones, contratacion)) {
                        JOptionPane.showMessageDialog(null, "Adjudicación insertada");
                        Limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error en el proceso");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Rellene los campos necesarios");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Inserte una contratación válida");
        }
    }

    /**
     * Metodo para cargar las tablas y rellenar los combo con los nombres de las
     * columnas de la tabla
     */
    private void CargarTablas() {
        panelAdjudicaiones.tblAdjudicada.setModel(consultas.CargarTabla("adjudicaciones"));
        panelAdjudicaiones.tblOrden.setModel(consultas.CargarTabla("orden"));
        panelAdjudicaiones.tblEntregada.setModel(consultas.CargarTabla("entregadas"));

        for (int i = 0; i < panelAdjudicaiones.tblAdjudicada.getColumnCount(); i++) {
            panelAdjudicaiones.cmbBusquedaAdjudicada.addItem(String.valueOf(panelAdjudicaiones.tblAdjudicada.getModel().getColumnName(i)));
        }

        for (int i = 0; i < panelAdjudicaiones.tblEntregada.getColumnCount(); i++) {
            panelAdjudicaiones.cmbBusquedaEntregada.addItem(String.valueOf(panelAdjudicaiones.tblEntregada.getModel().getColumnName(i)));
        }

        for (int i = 0; i < panelAdjudicaiones.tblOrden.getColumnCount(); i++) {
            panelAdjudicaiones.cmbBusquedaOrden.addItem(String.valueOf(panelAdjudicaiones.tblOrden.getModel().getColumnName(i)));
        }
    }

    /**
     * Evento para filtrar datos entre las tablas
     *
     * @param tabla Tabla a la que se le quieren filtrar los datos
     * @param combo Combo del cual se va a filtrar los datos
     * @param text Campo de texto del cual se va a filtrar los datos
     */
    private void Buscar(JTable tabla, JComboBox combo, JTextField text) {
        TableRowSorter modeloOrdenado = new TableRowSorter<TableModel>(tabla.getModel());
        tabla.setRowSorter(modeloOrdenado);
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + text.getText(),
                combo.getSelectedIndex()));
    }

    /**
     * Metodo abstracto de la clase ActionListener, le aplica los eventos a los
     * botones
     *
     * @param e Evento por ser procesado
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelAdjudicaiones.btnLimpiarAdjudicada || e.getSource() == panelAdjudicaiones.btnLimpiarEntregada
                || e.getSource() == panelAdjudicaiones.btnLimpiarOrden) {
            Limpiar();
        }

        if (e.getSource() == panelAdjudicaiones.btnInsertarAdjudicada) {
            AñadirAdjudicacion();
        }

        if (e.getSource() == panelAdjudicaiones.btnRefrescarAdjudicada) {
            CargarTablas();
        }
    }

    /**
     * Se crea un evento de tipo KeyListener para validar las contrataciones
     * ingresadas
     */
    private KeyListener EventoTextField = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                String institucion = "";
                JTextField text = (JTextField) e.getSource();
                if (!(text.getText().trim().isEmpty())) {
                    institucion = consultas.BuscarContratacion(text.getText());
                    if (!(institucion.equals("Vacio"))) {
                        if (text == panelAdjudicaiones.txtContratacionAdjudicada) {
                            panelAdjudicaiones.txtInstituciónAdjudicada.setText(institucion);
                            panelAdjudicaiones.txtContratacionAdjudicada.setEditable(false);
                            panelAdjudicaiones.txtInstituciónAdjudicada.setEditable(false);
                        } else if (text == panelAdjudicaiones.txtContratacionEntregada) {
                            panelAdjudicaiones.txtContratacionEntregada.setEditable(false);
                        } else {
                            panelAdjudicaiones.txtContratacionOrden.setEditable(false);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Revise que los datos ingresados están correctos");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Rellene el campo primero");
                }
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    };

    /**
     * Evento para buscar en las tablas los datos
     */
    private CaretListener EventoBuscar = new CaretListener() {
        @Override
        public void caretUpdate(CaretEvent e) {
            if (e.getSource() == panelAdjudicaiones.txtBuscarAdjudicada) {
                Buscar(panelAdjudicaiones.tblAdjudicada, panelAdjudicaiones.cmbBusquedaAdjudicada, panelAdjudicaiones.txtBuscarAdjudicada);
            }

            if (e.getSource() == panelAdjudicaiones.txtBuscarEntregada) {
                Buscar(panelAdjudicaiones.tblEntregada, panelAdjudicaiones.cmbBusquedaEntregada, panelAdjudicaiones.txtBuscarEntregada);
            }

            if (e.getSource() == panelAdjudicaiones.txtBuscarOrden) {
                Buscar(panelAdjudicaiones.tblOrden, panelAdjudicaiones.cmbBusquedaOrden, panelAdjudicaiones.txtBuscarOrden);
            }

        }
    };

    /**
     * Evento para cargar datos de la tabla
     */
    private MouseListener EventoTablas = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getClickCount() == 2){
                if(e.getSource() == panelAdjudicaiones.tblAdjudicada){
                    Limpiar();
                    int cod = Integer.parseInt(String.valueOf(panelAdjudicaiones.tblAdjudicada.getModel().
                            getValueAt(panelAdjudicaiones.tblAdjudicada.getSelectedRow(), 0)));
                    Object[] datos = consultas.BuscarAdjudicacion(cod);
                    panelAdjudicaiones.txtContratacionAdjudicada.setText(String.valueOf(datos[0]));
                    panelAdjudicaiones.txtInstituciónAdjudicada.setText(String.valueOf(datos[1]));
                    panelAdjudicaiones.spnDiasEntregaAdjudicaciones.getModel().setValue(datos[2]);
                    
                    if(Boolean.valueOf(String.valueOf(datos[3])) == false){
                        panelAdjudicaiones.rbtNaturalesAdjudicada.setSelected(true);
                    }else{
                        panelAdjudicaiones.rbtHabilesAdjudicada.setSelected(true);
                    }
                    
                    panelAdjudicaiones.cmbModalidadAdjudicada.setSelectedItem(datos[4]);
                    
                    if(Boolean.valueOf(String.valueOf(datos[5])) == true){
                        panelAdjudicaiones.rbtGyRAdjudicada.setSelected(true);
                    }else{
                        panelAdjudicaiones.rbtPBAdjudicada.setSelected(true);
                    }
                    
                    panelAdjudicaiones.txtDescripcionAdjudicada.setText(String.valueOf(datos[6]));
                
                    if(Boolean.valueOf(String.valueOf(datos[7])) == true){
                        panelAdjudicaiones.rbtFirmeAdjudicada.setSelected(true);
                    }else{
                        panelAdjudicaiones.rbtDudaAdjudicada.setSelected(true);
                    }
                    
                    panelAdjudicaiones.txaObservacionAdjudicada.setText(String.valueOf(datos[8]));
                    
                    panelAdjudicaiones.txtContratacionAdjudicada.setEditable(false);
                    panelAdjudicaiones.txtInstituciónAdjudicada.setEditable(false);
                }
            }
        }
    };
}
