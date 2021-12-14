package Controlador;

import Consultas.Consultas_Adjudicaciones;
import Modelo.Mod_Usuario;
import Vista.Paneles.Pnl_2;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

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
        panelAdjudicaiones.btnEliminarAdjudicada.addActionListener(this);
        panelAdjudicaiones.btnModificarAdjudicada.addActionListener(this);

        panelAdjudicaiones.btnLimpiarOrden.addActionListener(this);
        panelAdjudicaiones.btnInsertarOrden.addActionListener(this);
        panelAdjudicaiones.btnRefrescarOrden.addActionListener(this);
        panelAdjudicaiones.btnEliminarOrden.addActionListener(this);
        panelAdjudicaiones.btnModificarOrden.addActionListener(this);

        panelAdjudicaiones.btnLimpiarEntregada.addActionListener(this);
        panelAdjudicaiones.btnInsertarEntregada.addActionListener(this);
        panelAdjudicaiones.btnRefrescarEntregada.addActionListener(this);
        panelAdjudicaiones.btnEliminarEntregada.addActionListener(this);
        panelAdjudicaiones.btnModificarEntregada.addActionListener(this);

        panelAdjudicaiones.txtContratacionAdjudicada.addKeyListener(EventoTextField);
        panelAdjudicaiones.txtContratacionEntregada.addKeyListener(EventoTextField);
        panelAdjudicaiones.txtContratacionOrden.addKeyListener(EventoTextField);

        panelAdjudicaiones.txtBuscarAdjudicada.addCaretListener(EventoBuscar);
        panelAdjudicaiones.txtBuscarEntregada.addCaretListener(EventoBuscar);
        panelAdjudicaiones.txtBuscarOrden.addCaretListener(EventoBuscar);

        panelAdjudicaiones.tblAdjudicada.addMouseListener(EventoTablas);
        panelAdjudicaiones.tblOrden.addMouseListener(EventoTablas);
        panelAdjudicaiones.tblEntregada.addMouseListener(EventoTablas);
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

        panelAdjudicaiones.codAdjudicacion.setVisible(false);
        panelAdjudicaiones.codEntregada.setVisible(false);
        panelAdjudicaiones.codOrden.setVisible(false);

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
        panelAdjudicaiones.spnDiasEntregaOrden.getModel().setValue(1);
        panelAdjudicaiones.spnVigenciaContratoOrden.getModel().setValue(1);
        panelAdjudicaiones.txtNumOrden.setText("");
        panelAdjudicaiones.txtLugarEntregaOrden.setText("");
        panelAdjudicaiones.txtDescripcionOrden.setText("");
        panelAdjudicaiones.txaObservacionOrden.setText("");
        panelAdjudicaiones.txtContratacionOrden.setEditable(true);

        panelAdjudicaiones.txtContratacionEntregada.setText("");
        panelAdjudicaiones.spnDiasEntregaEntregada.getModel().setValue(1);
        panelAdjudicaiones.txtLugarEntregada.setText("");
        panelAdjudicaiones.txtDescripcionEntregada.setText("");
        panelAdjudicaiones.txaObservacionEntregada.setText("");
        panelAdjudicaiones.txtContratacionEntregada.setEditable(true);

        panelAdjudicaiones.btgEmpresaAdjudicada.clearSelection();
        panelAdjudicaiones.btgEmpresaEntregada.clearSelection();
        panelAdjudicaiones.btgEstadoAdjudicada.clearSelection();
        panelAdjudicaiones.btgDiasEntregaAdjudicada.clearSelection();
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

        Buscar(panelAdjudicaiones.tblAdjudicada, panelAdjudicaiones.cmbBusquedaAdjudicada, panelAdjudicaiones.txtBuscarAdjudicada);
        Buscar(panelAdjudicaiones.tblEntregada, panelAdjudicaiones.cmbBusquedaEntregada, panelAdjudicaiones.txtBuscarEntregada);
        Buscar(panelAdjudicaiones.tblOrden, panelAdjudicaiones.cmbBusquedaOrden, panelAdjudicaiones.txtBuscarOrden);

        PintarFilas(panelAdjudicaiones.tblAdjudicada);
        PintarFilas(panelAdjudicaiones.tblOrden);
        PintarFilas(panelAdjudicaiones.tblEntregada);
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

    /////////////////////////////////////////////////////////////////////////////////////////////
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
                        CargarTablas();
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
     * Metodo para borrar adjudicaciones
     */
    private void BorrarAdjudicacion() {
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrar la adjudicación?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (!panelAdjudicaiones.codAdjudicacion.getText().equals("NA")) {
                if (consultas.BorrarRegistro(Integer.parseInt(panelAdjudicaiones.codAdjudicacion.getText()), "adjudicacion")) {
                    JOptionPane.showMessageDialog(null, "Se borró la adjudicación");
                    Limpiar();
                    CargarTablas();
                    panelAdjudicaiones.codAdjudicacion.setText("NA");
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error al borrar la adjudicación");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una adjudicación para borrarla");
            }
        }
    }

    /**
     * Método para modificar una adjudicación
     */
    private void ModificarAdjudicacion() {
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
        int diasEntrega = Integer.parseInt(String.valueOf(panelAdjudicaiones.spnDiasEntregaAdjudicaciones.getModel().getValue()).trim());
        boolean modalidadDias;
        boolean empresa;
        String modalidadEntrega = String.valueOf(panelAdjudicaiones.cmbModalidadAdjudicada.getSelectedItem()).trim();
        String descripcion = panelAdjudicaiones.txtDescripcionAdjudicada.getText().trim();
        boolean estado;
        String observaciones = panelAdjudicaiones.txaObservacionAdjudicada.getText().trim();

        if (!panelAdjudicaiones.codAdjudicacion.getText().equals("NA")) {
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
                        int codAdjudiacion = Integer.parseInt(panelAdjudicaiones.codAdjudicacion.getText());
                        if (consultas.ModificarAjudicacion(codAdjudiacion, diasEntrega, modalidadDias, empresa, modalidadEntrega, descripcion, estado, observaciones)) {
                            JOptionPane.showMessageDialog(null, "Adjudicación modificada");
                            CargarTablas();
                            Limpiar();
                            panelAdjudicaiones.codAdjudicacion.setText("NA");
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
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una contratación");
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Metodo para añadir registros en la tabla de por orden
     */
    private void AñadirOrden() {
        String contratacion = panelAdjudicaiones.txtContratacionOrden.getText().trim();
        int diasEntrega = Integer.parseInt(String.valueOf(panelAdjudicaiones.spnDiasEntregaOrden.getModel().getValue()).trim());
        int vigenciaContrato = Integer.parseInt(String.valueOf(panelAdjudicaiones.spnVigenciaContratoOrden.getModel().getValue()).trim());
        int numOrden = 0;
        String modalidad = String.valueOf(panelAdjudicaiones.cmbModalidadOrden.getSelectedItem());
        String lugarEntrega = panelAdjudicaiones.txtLugarEntregaOrden.getText().trim();
        String descripcion = panelAdjudicaiones.txtDescripcionOrden.getText().trim();
        String observaciones = panelAdjudicaiones.txaObservacionOrden.getText().trim();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha;

        if (!(contratacion.isEmpty()) && !(panelAdjudicaiones.txtContratacionOrden.isEditable())) {

            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                if (!(modalidad.isEmpty()) && !(lugarEntrega.isEmpty()) && !(panelAdjudicaiones.txtNumOrden.getText().trim().isEmpty())) {
                    numOrden = Integer.parseInt(panelAdjudicaiones.txtNumOrden.getText().trim());
                    fecha = fecha = sdf.format(panelAdjudicaiones.jdcFechaLimiteOrden.getDate());
                    if (consultas.InsertarOrden(diasEntrega, vigenciaContrato, fecha, descripcion, numOrden, lugarEntrega, observaciones, modalidad, contratacion)) {
                        JOptionPane.showMessageDialog(null, "Registros ingresado con exito!");
                        Limpiar();
                        CargarTablas();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error al insertar el registro");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Rellene todos los campos");
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Inserte una contratación válida");
        }
    }

    /**
     * Metodo para borrar registros en la tabla orden
     */
    private void BorrarOrden() {
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrarlo?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (!panelAdjudicaiones.codOrden.getText().equals("NA")) {
                if (consultas.BorrarRegistro(Integer.parseInt(panelAdjudicaiones.codOrden.getText()), "orden")) {
                    JOptionPane.showMessageDialog(null, "Se borró el registro");
                    Limpiar();
                    CargarTablas();
                    panelAdjudicaiones.codAdjudicacion.setText("NA");
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error al borrar el registro");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un registro para borrar");
            }
        }
    }

    /**
     * Metodo para modificar registros en Orden
     */
    private void ModificarOrden() {
        String contratacion = panelAdjudicaiones.txtContratacionOrden.getText().trim();
        int diasEntrega = Integer.parseInt(String.valueOf(panelAdjudicaiones.spnDiasEntregaOrden.getModel().getValue()).trim());
        int vigenciaContrato = Integer.parseInt(String.valueOf(panelAdjudicaiones.spnVigenciaContratoOrden.getModel().getValue()).trim());
        int numOrden = 0;
        int codOrden = 0;
        String modalidad = String.valueOf(panelAdjudicaiones.cmbModalidadOrden.getSelectedItem());
        String lugarEntrega = panelAdjudicaiones.txtLugarEntregaOrden.getText().trim();
        String descripcion = panelAdjudicaiones.txtDescripcionOrden.getText().trim();
        String observaciones = panelAdjudicaiones.txaObservacionOrden.getText().trim();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha;

        if (!panelAdjudicaiones.codOrden.getText().equals("NA")) {
            if (!(contratacion.isEmpty()) && !(panelAdjudicaiones.txtContratacionOrden.isEditable())) {

                if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    if (!(modalidad.isEmpty()) && !(lugarEntrega.isEmpty()) && !(panelAdjudicaiones.txtNumOrden.getText().trim().isEmpty())) {
                        numOrden = Integer.parseInt(panelAdjudicaiones.txtNumOrden.getText().trim());
                        fecha = fecha = sdf.format(panelAdjudicaiones.jdcFechaLimiteOrden.getDate());
                        codOrden = Integer.parseInt(String.valueOf(panelAdjudicaiones.codOrden.getText()));
                        if (consultas.ModificarOrden(codOrden, diasEntrega, vigenciaContrato, fecha, descripcion, numOrden, lugarEntrega, observaciones, modalidad)) {
                            JOptionPane.showMessageDialog(null, "Se modificó el registro con exito!");
                            CargarTablas();
                            Limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Hubo un error al modificar el registro");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Rellene todos los campos");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Inserte una contratación válida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una orden para poder modificarla");
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Metodo para añadir registros a entregadas
     */
    private void AñadirEntregada() {
        ButtonGroup grupoEmpresa = panelAdjudicaiones.btgEmpresaAdjudicada;
        ButtonModel modeloGyR = panelAdjudicaiones.rbtGyREntregada.getModel();
        ButtonModel modeloPB = panelAdjudicaiones.rbtPBEntregada.getModel();

        String contratacion = panelAdjudicaiones.txtContratacionEntregada.getText().trim();
        int diasEntrega = Integer.parseInt(String.valueOf(panelAdjudicaiones.spnDiasEntregaEntregada.getModel().getValue()).trim());
        String lugarEntrega = panelAdjudicaiones.txtLugarEntregada.getText().trim();
        String descripcion = panelAdjudicaiones.txtDescripcionEntregada.getText().trim();
        String observaciones = panelAdjudicaiones.txaObservacionEntregada.getText().trim();
        String medioEntrega = String.valueOf(panelAdjudicaiones.cmbMedioEntregada.getSelectedItem());
        boolean empresa = false;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha;

        if (!(contratacion.isEmpty()) && !(panelAdjudicaiones.txtContratacionEntregada.isEditable())) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (grupoEmpresa.isSelected(modeloGyR) || grupoEmpresa.isSelected(modeloPB)) {
                    if (!(lugarEntrega.isEmpty())) {
                        if (grupoEmpresa.isSelected(modeloGyR)) {
                            empresa = true;
                        } else {
                            empresa = false;
                        }

                        fecha = fecha = sdf.format(panelAdjudicaiones.jdcFechaEntregada.getDate());
                        if (consultas.InsertarEntregada(diasEntrega, fecha, lugarEntrega, descripcion, empresa, observaciones, medioEntrega, contratacion)) {
                            JOptionPane.showMessageDialog(null, "Registro ingresado con exito!");
                            Limpiar();
                            CargarTablas();
                        } else {
                            JOptionPane.showMessageDialog(null, "Hubo un error al insertar los datos");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Rellene todos los espacio");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Rellene todos los campos");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Inserte una contratación válida");
        }
    }

    /**
     * Metodo para borrar registros de entregadas
     */
    private void BorrarEntregada() {
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrarlo?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (!panelAdjudicaiones.codEntregada.getText().equals("NA")) {
                if (consultas.BorrarRegistro(Integer.parseInt(panelAdjudicaiones.codEntregada.getText()), "entregadas")) {
                    JOptionPane.showMessageDialog(null, "Se borró el registro");
                    Limpiar();
                    CargarTablas();
                    panelAdjudicaiones.codEntregada.setText("NA");
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error al borrar el registro");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un registro para borrar");
            }
        }
    }

    /**
     * Metodo para modificar de entregadas
     */
    private void ModificarEntregada() {
        ButtonGroup grupoEmpresa = panelAdjudicaiones.btgEmpresaAdjudicada;
        ButtonModel modeloGyR = panelAdjudicaiones.rbtGyREntregada.getModel();
        ButtonModel modeloPB = panelAdjudicaiones.rbtPBEntregada.getModel();

        String contratacion = panelAdjudicaiones.txtContratacionEntregada.getText().trim();
        int diasEntrega = Integer.parseInt(String.valueOf(panelAdjudicaiones.spnDiasEntregaEntregada.getModel().getValue()).trim());
        String lugarEntrega = panelAdjudicaiones.txtLugarEntregada.getText().trim();
        String descripcion = panelAdjudicaiones.txtDescripcionEntregada.getText().trim();
        String observaciones = panelAdjudicaiones.txaObservacionEntregada.getText().trim();
        String medioEntrega = String.valueOf(panelAdjudicaiones.cmbMedioEntregada.getSelectedItem());
        boolean empresa = false;
        int codEntregadas = 0;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha;

        if (!panelAdjudicaiones.codEntregada.getText().equals("NA")) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (grupoEmpresa.isSelected(modeloGyR) || grupoEmpresa.isSelected(modeloPB)) {
                    if (!(lugarEntrega.isEmpty())) {
                        if (grupoEmpresa.isSelected(modeloGyR)) {
                            empresa = true;
                        } else {
                            empresa = false;
                        }
                        codEntregadas = Integer.parseInt(panelAdjudicaiones.codEntregada.getText());
                        fecha = fecha = sdf.format(panelAdjudicaiones.jdcFechaEntregada.getDate());
                        if (consultas.ModificarEntregadas(codEntregadas, diasEntrega, fecha, lugarEntrega, descripcion, empresa, observaciones, medioEntrega)) {
                            JOptionPane.showMessageDialog(null, "Registro ingresado con exito!");
                            Limpiar();
                            CargarTablas();
                        } else {
                            JOptionPane.showMessageDialog(null, "Hubo un error al insertar los datos");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Rellene todos los espacio");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Rellene todos los campos");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un registro de entregada para modificar");
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Metodo abstracto de la clase ActionListener, le aplica los eventos a los
     * botones
     *
     * @param e Evento por ser procesado
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelAdjudicaiones.btnRefrescarAdjudicada || e.getSource() == panelAdjudicaiones.btnRefrescarOrden || e.getSource() == panelAdjudicaiones.btnRefrescarEntregada) {
            CargarTablas();
        }

        if (e.getSource() == panelAdjudicaiones.btnLimpiarAdjudicada || e.getSource() == panelAdjudicaiones.btnLimpiarEntregada
                || e.getSource() == panelAdjudicaiones.btnLimpiarOrden) {
            Limpiar();
        }

        /////////////////////////////////////////////////////////////////////////////////////////////
        if (e.getSource() == panelAdjudicaiones.btnInsertarAdjudicada) {
            AñadirAdjudicacion();
        }

        if (e.getSource() == panelAdjudicaiones.btnEliminarAdjudicada) {
            BorrarAdjudicacion();
        }

        if (e.getSource() == panelAdjudicaiones.btnModificarAdjudicada) {
            ModificarAdjudicacion();
        }

        /////////////////////////////////////////////////////////////////////////////////////////////
        if (e.getSource() == panelAdjudicaiones.btnInsertarOrden) {
            AñadirOrden();
        }

        if (e.getSource() == panelAdjudicaiones.btnEliminarOrden) {
            BorrarOrden();
        }

        if (e.getSource() == panelAdjudicaiones.btnModificarOrden) {
            ModificarOrden();
        }

        /////////////////////////////////////////////////////////////////////////////////////////////
        if (e.getSource() == panelAdjudicaiones.btnInsertarEntregada) {
            AñadirEntregada();
        }

        if (e.getSource() == panelAdjudicaiones.btnEliminarEntregada) {
            BorrarEntregada();
        }

        if (e.getSource() == panelAdjudicaiones.btnModificarEntregada) {
            ModificarEntregada();
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
                        }

                        if (text == panelAdjudicaiones.txtContratacionEntregada) {
                            panelAdjudicaiones.txtContratacionEntregada.setEditable(false);
                        }

                        if (text == panelAdjudicaiones.txtContratacionOrden) {
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
            if (e.getClickCount() == 2) {
                if (e.getSource() == panelAdjudicaiones.tblAdjudicada) {
                    Limpiar();
                    int cod = Integer.parseInt(String.valueOf(panelAdjudicaiones.tblAdjudicada.getModel().
                            getValueAt(panelAdjudicaiones.tblAdjudicada.getSelectedRow(), 0)));
                    panelAdjudicaiones.codAdjudicacion.setText(String.valueOf(cod));
                    Object[] datos = consultas.BuscarAdjudicacion(cod);
                    panelAdjudicaiones.txtContratacionAdjudicada.setText(String.valueOf(datos[0]));
                    panelAdjudicaiones.txtInstituciónAdjudicada.setText(String.valueOf(datos[1]));
                    panelAdjudicaiones.spnDiasEntregaAdjudicaciones.getModel().setValue(datos[2]);

                    if (Boolean.valueOf(String.valueOf(datos[3])) == false) {
                        panelAdjudicaiones.rbtNaturalesAdjudicada.setSelected(true);
                    } else {
                        panelAdjudicaiones.rbtHabilesAdjudicada.setSelected(true);
                    }

                    panelAdjudicaiones.cmbModalidadAdjudicada.setSelectedItem(datos[4]);

                    if (Boolean.valueOf(String.valueOf(datos[5])) == true) {
                        panelAdjudicaiones.rbtGyRAdjudicada.setSelected(true);
                    } else {
                        panelAdjudicaiones.rbtPBAdjudicada.setSelected(true);
                    }

                    panelAdjudicaiones.txtDescripcionAdjudicada.setText(String.valueOf(datos[6]));

                    if (Boolean.valueOf(String.valueOf(datos[7])) == true) {
                        panelAdjudicaiones.rbtFirmeAdjudicada.setSelected(true);
                    } else {
                        panelAdjudicaiones.rbtDudaAdjudicada.setSelected(true);
                    }

                    panelAdjudicaiones.txaObservacionAdjudicada.setText(String.valueOf(datos[8]));

                    panelAdjudicaiones.txtContratacionAdjudicada.setEditable(false);
                    panelAdjudicaiones.txtInstituciónAdjudicada.setEditable(false);
                }

                if (e.getSource() == panelAdjudicaiones.tblOrden) {
                    Limpiar();
                    LocalDate ld;
                    Date fecha;
                    ZoneId defaultZoneId = ZoneId.systemDefault();
                    
                    int cod = Integer.parseInt(String.valueOf(panelAdjudicaiones.tblOrden.getModel().
                            getValueAt(panelAdjudicaiones.tblOrden.getSelectedRow(), 0)));
                    panelAdjudicaiones.codOrden.setText(String.valueOf(cod));
                    Object[] datos = consultas.BuscarOrden(cod);

                    panelAdjudicaiones.txtContratacionOrden.setText(String.valueOf(datos[0]));
                    panelAdjudicaiones.spnDiasEntregaOrden.getModel().setValue(datos[1]);
                    panelAdjudicaiones.spnVigenciaContratoOrden.getModel().setValue(datos[2]);

                    ld = LocalDate.parse(String.valueOf(datos[3]));
                    fecha = Date.from(ld.atStartOfDay(defaultZoneId).toInstant());
                    panelAdjudicaiones.jdcFechaLimiteOrden.setDate(fecha);
                    
                    panelAdjudicaiones.txtDescripcionOrden.setText(String.valueOf(datos[4]));
                    panelAdjudicaiones.txtNumOrden.setText(String.valueOf(datos[5]));
                    panelAdjudicaiones.txtLugarEntregaOrden.setText(String.valueOf(datos[6]));
                    panelAdjudicaiones.txaObservacionOrden.setText(String.valueOf(datos[7]));
                    panelAdjudicaiones.cmbModalidadOrden.setSelectedItem(datos[8]);

                    panelAdjudicaiones.txtContratacionOrden.setEditable(false);
                }

                if (e.getSource() == panelAdjudicaiones.tblEntregada) {
                    Limpiar();
                    LocalDate ld;
                    Date fecha;
                    ZoneId defaultZoneId = ZoneId.systemDefault();
                    
                    int cod = Integer.parseInt(String.valueOf(panelAdjudicaiones.tblEntregada.getModel().
                            getValueAt(panelAdjudicaiones.tblEntregada.getSelectedRow(), 0)));
                    panelAdjudicaiones.codEntregada.setText(String.valueOf(cod));
                    Object[] datos = consultas.BuscarEntregada(cod);

                    panelAdjudicaiones.txtContratacionEntregada.setText(String.valueOf(datos[0]));
                    panelAdjudicaiones.spnDiasEntregaEntregada.getModel().setValue(datos[1]);

                    ld = LocalDate.parse(String.valueOf(datos[2]));
                    fecha = Date.from(ld.atStartOfDay(defaultZoneId).toInstant());
                    panelAdjudicaiones.jdcFechaEntregada.setDate(fecha);
                    
                    panelAdjudicaiones.txtLugarEntregada.setText(String.valueOf(datos[3]));
                    panelAdjudicaiones.txtDescripcionEntregada.setText(String.valueOf(datos[4]));

                    if (Boolean.valueOf(String.valueOf(datos[5])) == true) {
                        panelAdjudicaiones.rbtGyREntregada.setSelected(true);
                    } else {
                        panelAdjudicaiones.rbtPBEntregada.setSelected(true);
                    }

                    panelAdjudicaiones.txaObservacionEntregada.setText(String.valueOf(datos[6]));
                    panelAdjudicaiones.cmbMedioEntregada.setSelectedItem(datos[7]);
                    
                    panelAdjudicaiones.txtContratacionEntregada.setEditable(false);
                }
            }
        }
    };

    /**
     * Metodo para pintar las filas de las tablas
     */
    private void PintarFilas(JTable tabla) {

        PintarFilas pf = new PintarFilas();
        int cantColumnas = tabla.getColumnCount();
        for (int i = 0; i < cantColumnas; i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(pf);
        }
    }
}
