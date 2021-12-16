package Controlador;

import Consultas.Consultas_TimbresGarantiasMuestras;
import Modelo.Mod_Usuario;
import Vista.Paneles.Pnl_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
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
 * Clase para las acciones que ejecutan los botones en la ventana de Timbres,
 * Garantias y Muestras
 *
 * @author
 */
public class Ctrl_TimbresGarantiasMuestras implements ActionListener {

    private Pnl_1 panelTimbres;
    private Consultas_TimbresGarantiasMuestras consultas;

    /**
     * Constructor de la clase Ctrl_IngresarContr. Le asgina valores a variables
     * privadas, inicializa objetos y le añade eventos a los botones
     *
     * @param viewPanel1 Recibe un objeto de tipo Pnl_2 que es el panel donde el
     * usuario interactua para insertar datos
     * @param consultas Recibe un objeto de tipo Consultas_Adjudicaciones para
     * realizar conexion con la base de datos
     */
    public Ctrl_TimbresGarantiasMuestras(Pnl_1 viewPanel1, Consultas_TimbresGarantiasMuestras consultas) {
        this.panelTimbres = viewPanel1;
        this.consultas = consultas;

        Iniciar();

        panelTimbres.btnLimpiarGarantias.addActionListener(this);
        panelTimbres.btnRefrescarGarantias.addActionListener(this);
        panelTimbres.btnInsertarGarantias.addActionListener(this);
        panelTimbres.btnEliminarGarantias.addActionListener(this);
        panelTimbres.btnModificarGarantias.addActionListener(this);

        panelTimbres.btnLimpiarTimbres.addActionListener(this);
        panelTimbres.btnRefrescarTimbres.addActionListener(this);
        panelTimbres.btnInsertarTimbres.addActionListener(this);
        panelTimbres.btnEliminarTimbres.addActionListener(this);
        panelTimbres.btnModificarTimbres.addActionListener(this);

        panelTimbres.btnLimpiarMuestras.addActionListener(this);
        panelTimbres.btnRefrescarMuestras.addActionListener(this);
        panelTimbres.btnInsertarMuestras.addActionListener(this);
        panelTimbres.btnEliminarMuestras.addActionListener(this);
        panelTimbres.btnModificarMuestras.addActionListener(this);

        panelTimbres.txtBuscarGarantias.addCaretListener(EventoBuscar);
        panelTimbres.txtBuscarMuestras.addCaretListener(EventoBuscar);
        panelTimbres.txtBuscarTimbres.addCaretListener(EventoBuscar);

        panelTimbres.txtContratacionGarantias.addKeyListener(EventoTextField);
        panelTimbres.txtContratacionMuestras.addKeyListener(EventoTextField);
        panelTimbres.txtContratacionTimbres.addKeyListener(EventoTextField);

        panelTimbres.tblGarantias.addMouseListener(EventoTablas);
        panelTimbres.tblMuestras.addMouseListener(EventoTablas);
        panelTimbres.tblTimbres.addMouseListener(EventoTablas);
    }

    /**
     * Metodo que inicializa la ventana
     */
    private void Iniciar() {
        CargarTablas();

        Mod_Usuario us = new Mod_Usuario();
        panelTimbres.txtEncargadoMuestras.setText(us.getNombreEmpleado());
        panelTimbres.txtEncargadoEnvioTimbres.setText(us.getNombreEmpleado());
        panelTimbres.txtEncargadoEnvioGarantias.setText(us.getNombreEmpleado());

        panelTimbres.txtEncargadoEnvioGarantias.setEditable(false);
        panelTimbres.txtEncargadoEnvioTimbres.setEditable(false);
        panelTimbres.txtEncargadoMuestras.setEditable(false);

        panelTimbres.codGarantias.setVisible(false);
        panelTimbres.codTimbres.setVisible(false);
        panelTimbres.codMuestras.setVisible(false);

        panelTimbres.setVisible(true);
    }

    /**
     * Metodo que limpia los componentes de las pestañas de la ventana
     */
    private void Limpiar() {
        panelTimbres.txtContratacionGarantias.setText("");
        panelTimbres.txtInstituciónGarantias.setText("");
        panelTimbres.txtObjetoGarantias.setText("");
        panelTimbres.txtMontoGarantias.setText("");
        panelTimbres.txtEstadoGarantias.setText("");
        panelTimbres.txtTiempoGarantias.setText("");
        panelTimbres.txtEncargadoContratacionGarantias.setText("");
        panelTimbres.txaObservacionGarantias.setText("");
        panelTimbres.txtContratacionGarantias.setEditable(true);
        panelTimbres.txtInstituciónGarantias.setEditable(true);
        panelTimbres.txtEncargadoContratacionGarantias.setEditable(true);

        panelTimbres.txtContratacionTimbres.setText("");
        panelTimbres.txtInstituciónTimbres.setText("");
        panelTimbres.txtDescripcionTimbres.setText("");
        panelTimbres.txtEstadoTimbres.setText("");
        panelTimbres.txtEncargadoContratacionTimbres.setText("");
        panelTimbres.txaObservacionTimbres.setText("");
        panelTimbres.txtMontoTimbres.setText("");
        panelTimbres.txtContratacionMuestras.setEditable(true);
        panelTimbres.txtEncargadoContratacionTimbres.setEditable(true);
        panelTimbres.txtInstituciónMuestras.setEditable(true);

        panelTimbres.txtContratacionMuestras.setText("");
        panelTimbres.txtInstituciónMuestras.setText("");
        panelTimbres.txtObjetoMuestras.setText("");
        panelTimbres.spnCantidadMuestras.getModel().setValue(1);
        panelTimbres.txtEstadoMuestras.setText("");
        panelTimbres.txaObservacionMuestras.setText("");
        panelTimbres.txtContratacionTimbres.setEditable(true);
        panelTimbres.txtInstituciónTimbres.setEditable(true);
    }

    /**
     * Metodo para cargar las tablas de las pestañas
     */
    private void CargarTablas() {
        panelTimbres.tblGarantias.setModel(consultas.CargarDatos("garantias"));
        panelTimbres.tblMuestras.setModel(consultas.CargarDatos("muestras"));
        panelTimbres.tblTimbres.setModel(consultas.CargarDatos("timbres"));

        panelTimbres.cmbBusquedaGarantias.removeAllItems();
        for (int i = 0; i < panelTimbres.tblGarantias.getColumnCount(); i++) {
            panelTimbres.cmbBusquedaGarantias.addItem(String.valueOf(panelTimbres.tblGarantias.getModel().getColumnName(i)));
        }

        panelTimbres.cmbBusquedaMuestras.removeAllItems();
        for (int i = 0; i < panelTimbres.tblMuestras.getColumnCount(); i++) {
            panelTimbres.cmbBusquedaMuestras.addItem(String.valueOf(panelTimbres.tblMuestras.getModel().getColumnName(i)));
        }

        panelTimbres.cmbBusquedaTimbres.removeAllItems();
        for (int i = 0; i < panelTimbres.tblTimbres.getColumnCount(); i++) {
            panelTimbres.cmbBusquedaTimbres.addItem(String.valueOf(panelTimbres.tblTimbres.getModel().getColumnName(i)));
        }

        Buscar(panelTimbres.tblGarantias, panelTimbres.cmbBusquedaGarantias, panelTimbres.txtBuscarGarantias);
        Buscar(panelTimbres.tblMuestras, panelTimbres.cmbBusquedaMuestras, panelTimbres.txtBuscarMuestras);
        Buscar(panelTimbres.tblTimbres, panelTimbres.cmbBusquedaTimbres, panelTimbres.txtBuscarTimbres);

        PintarFilas(panelTimbres.tblGarantias);
        PintarFilas(panelTimbres.tblMuestras);
        PintarFilas(panelTimbres.tblTimbres);
    }

    /**
     * Metodo para buscar datos entre las tablas
     *
     * @param tabla Tabla a la que se le aplica el filtro
     * @param combo Combo de donde se obtiene el campo que se busca
     * @param text TextField donde se escribe lo que se quiere buscar
     */
    private void Buscar(JTable tabla, JComboBox combo, JTextField text) {
        TableRowSorter modeloOrdenado = new TableRowSorter<TableModel>(tabla.getModel());
        tabla.setRowSorter(modeloOrdenado);
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + text.getText(),
                combo.getSelectedIndex()));
    }

    /////////////////////////////////////////////////////////////////////////////////////////////
    private void AñadirGarantia() {
        Mod_Usuario us = new Mod_Usuario();

        String contratacion = panelTimbres.txtContratacionGarantias.getText().trim();
        String institucion = panelTimbres.txtInstituciónGarantias.getText();
        String objeto = panelTimbres.txtObjetoGarantias.getText().trim();
        double monto;
        String estado = panelTimbres.txtEstadoGarantias.getText().trim();
        String tiempo = panelTimbres.txtTiempoGarantias.getText().trim();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String pago;
        String devolucion;
        String tipoGarantia = String.valueOf(panelTimbres.cmbTipoGarantias.getSelectedItem());
        String observaciones = panelTimbres.txaObservacionGarantias.getText();
        int codEmpleado = us.getCodEmpleado();

        if (!(contratacion.isEmpty()) && !(panelTimbres.txtContratacionGarantias.isEditable())) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (!(objeto.isEmpty()) || !(panelTimbres.txtMontoGarantias.getText().trim().isEmpty()) || !(estado.isEmpty())
                        || !(tiempo.isEmpty()) || !(panelTimbres.jdcPagoGarantias.equals("")) || !(panelTimbres.jdcDevolucionGarantias.equals(""))) {
                    monto = Double.parseDouble(panelTimbres.txtMontoGarantias.getText().trim());
                    pago = sdf.format(panelTimbres.jdcPagoGarantias.getDate());
                    devolucion = sdf.format(panelTimbres.jdcDevolucionGarantias.getDate());
                    if (consultas.AñadirGarantia(institucion, pago, devolucion, tiempo, estado, objeto, observaciones, monto, tipoGarantia, codEmpleado, contratacion)) {
                        JOptionPane.showMessageDialog(null, "Garantía ingresada con exito!");
                        Limpiar();
                        CargarTablas();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error al insertar la garantía");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Rellene todos los campos");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una contratació válida");
        }
    }

    private void BorrarGarantia() {
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrarlo?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (!panelTimbres.codGarantias.getText().equals("NA")) {
                if (consultas.BorrarRegistro(Integer.parseInt(panelTimbres.codGarantias.getText()), "garantia")) {
                    JOptionPane.showMessageDialog(null, "Se borró el registro");
                    Limpiar();
                    CargarTablas();
                    panelTimbres.codGarantias.setText("NA");
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error al borrar el registro");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un registro para borrar");
            }
        }
    }

    private void ModificarGarantia() {
        Mod_Usuario us = new Mod_Usuario();

        int cod = 0;
        String objeto = panelTimbres.txtObjetoGarantias.getText().trim();
        String institucion = panelTimbres.txtInstituciónGarantias.getText();
        double monto;
        String estado = panelTimbres.txtEstadoGarantias.getText().trim();
        String tiempo = panelTimbres.txtTiempoGarantias.getText().trim();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String pago;
        String devolucion;
        String tipoGarantia = String.valueOf(panelTimbres.cmbTipoGarantias.getSelectedItem());
        String observaciones = panelTimbres.txaObservacionGarantias.getText();
        int codEmpleado = us.getCodEmpleado();

        if (!panelTimbres.codGarantias.getText().equals("NA")) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (!(objeto.isEmpty()) || !(panelTimbres.txtMontoGarantias.getText().trim().isEmpty()) || !(estado.isEmpty())
                        || !(tiempo.isEmpty()) || !(panelTimbres.jdcPagoGarantias.equals("")) || !(panelTimbres.jdcDevolucionGarantias.equals(""))) {
                    monto = Double.parseDouble(panelTimbres.txtMontoGarantias.getText().trim());
                    pago = sdf.format(panelTimbres.jdcPagoGarantias.getDate());
                    devolucion = sdf.format(panelTimbres.jdcDevolucionGarantias.getDate());
                    cod = Integer.parseInt(panelTimbres.codGarantias.getText());
                    if (consultas.ModificarGarantia(cod, institucion, pago, devolucion, tiempo, estado, objeto, observaciones, monto, tipoGarantia, codEmpleado)) {
                        JOptionPane.showMessageDialog(null, "Garantía acualizada");
                        CargarTablas();
                        Limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error al actualizar la garantía");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un timbre");
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////
    private void AñadirTimbre() {
        Mod_Usuario us = new Mod_Usuario();

        String contratacion = panelTimbres.txtContratacionTimbres.getText().trim();
        String institucion = panelTimbres.txtInstituciónTimbres.getText().trim();
        double monto;
        String estado = panelTimbres.txtEstadoGarantias.getText().trim();
        String observaciones = panelTimbres.txaObservacionGarantias.getText().trim();
        String descripcion = panelTimbres.txtDescripcionTimbres.getText().trim();

        int codEmpleado = us.getCodEmpleado();

        if (!(contratacion.isEmpty()) && !(panelTimbres.txtContratacionTimbres.isEditable())) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (!(estado.isEmpty()) || !(panelTimbres.txtEstadoTimbres.getText().trim().isEmpty()) || !(descripcion.isEmpty())) {
                    monto = Double.parseDouble(panelTimbres.txtMontoTimbres.getText().trim());
                    if (consultas.AñadirTimbre(institucion, descripcion, monto, estado, observaciones, codEmpleado, contratacion)) {
                        JOptionPane.showMessageDialog(null, "Timbre ingresado con exito!");
                        CargarTablas();
                        Limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error al ingresar el timbre");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Rellene los campos necesarios");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una contratación válida");
        }
    }

    private void BorrarTimbre() {
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrarlo?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (!panelTimbres.codTimbres.getText().equals("NA")) {
                if (consultas.BorrarRegistro(Integer.parseInt(panelTimbres.codTimbres.getText()), "timbre")) {
                    JOptionPane.showMessageDialog(null, "Se borró el registro");
                    Limpiar();
                    CargarTablas();
                    panelTimbres.codTimbres.setText("NA");
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error al borrar el registro");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un registro para borrar");
            }
        }
    }

    private void ModificarTimbre() {
        Mod_Usuario us = new Mod_Usuario();

        String institucion = panelTimbres.txtInstituciónTimbres.getText().trim();
        double monto;
        String estado = panelTimbres.txtEstadoTimbres.getText().trim();
        String observaciones = panelTimbres.txaObservacionTimbres.getText().trim();
        String descripcion = panelTimbres.txtDescripcionTimbres.getText().trim();
        int codTimbre = 0;

        int codEmpleado = us.getCodEmpleado();

        if (!panelTimbres.codTimbres.getText().equals("NA")) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (!(estado.isEmpty()) || !(panelTimbres.txtEstadoTimbres.getText().trim().isEmpty()) || !(descripcion.isEmpty())) {
                    monto = Double.parseDouble(panelTimbres.txtMontoTimbres.getText().trim());
                    codTimbre = Integer.parseInt(String.valueOf(panelTimbres.codTimbres.getText()));
                    if (consultas.ModificarTimbre(codTimbre, descripcion, institucion, monto, estado, observaciones, codEmpleado)) {
                        JOptionPane.showMessageDialog(null, "Se modificó el timbre con exito!");
                        CargarTablas();
                        Limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error al actualizar el timbre");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Rellene todos los espacios necesarios");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una contratación válida");
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////

    private void AñadirMuestra() {
        String contratacion = panelTimbres.txtContratacionMuestras.getText().trim();
        String institucion = panelTimbres.txtInstituciónMuestras.getText().trim();
        String objeto = panelTimbres.txtObjetoMuestras.getText().trim();
        int cantidad = Integer.parseInt(String.valueOf(panelTimbres.spnCantidadMuestras.getModel().getValue()));
        String estado = panelTimbres.txtEstadoTimbres.getText().trim();
        String observaciones = panelTimbres.txaObservacionMuestras.getText().trim();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String entrega;
        String retiro;

        if (!(contratacion.isEmpty()) && !(panelTimbres.txtContratacionMuestras.isEditable())) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (!(objeto.isEmpty()) || !(estado.isEmpty())) {
                    entrega = sdf.format(panelTimbres.jdcFechaEntregaMuestras.getDate());
                    retiro = sdf.format(panelTimbres.jdcFechaRetiroMuestras.getDate());
                    if (consultas.AñadirMuestra(institucion, objeto, cantidad, entrega, retiro, estado, observaciones, contratacion)) {
                        JOptionPane.showMessageDialog(null, "Se añadió con exito la muestra!");
                        CargarTablas();
                        Limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error al insertar la muestra");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Inserte una contratación válida");
        }
    }

    private void BorrarMuestra() {
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrarlo?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (!panelTimbres.codMuestras.getText().equals("NA")) {
                if (consultas.BorrarRegistro(Integer.parseInt(panelTimbres.codMuestras.getText()), "muestra")) {
                    JOptionPane.showMessageDialog(null, "Se borró el registro");
                    Limpiar();
                    CargarTablas();
                    panelTimbres.codMuestras.setText("NA");
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error al borrar el registro");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un registro para borrar");
            }
        }
    }

    private void ModificarMuestra() {
        String institucion = panelTimbres.txtInstituciónMuestras.getText().trim();
        String objeto = panelTimbres.txtObjetoMuestras.getText().trim();
        int cantidad = Integer.parseInt(String.valueOf(panelTimbres.spnCantidadMuestras.getModel().getValue()));
        String estado = panelTimbres.txtEstadoTimbres.getText().trim();
        String observaciones = panelTimbres.txaObservacionMuestras.getText().trim();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String entrega;
        String retiro;
        int codMuestra;

        if (!panelTimbres.codMuestras.getText().equals("NA")) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                entrega = sdf.format(panelTimbres.jdcFechaEntregaMuestras.getDate());
                retiro = sdf.format(panelTimbres.jdcFechaRetiroMuestras.getDate());
                codMuestra = Integer.parseInt(panelTimbres.codMuestras.getText());
                if (!(objeto.isEmpty()) || !(estado.isEmpty())) {
                    if(consultas.ModificarMuestra(codMuestra, institucion, objeto, cantidad, entrega, retiro, estado, observaciones)){
                        JOptionPane.showMessageDialog(null, "Se modificó con exito la muestra!");
                        CargarTablas();
                        Limpiar();
                    }else{
                        JOptionPane.showMessageDialog(null, "Hubo un error al modificar");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Rellene todos los campos necesarios");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una contratación válida");
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
    public void actionPerformed(ActionEvent e
    ) {
        if (e.getSource() == panelTimbres.btnLimpiarGarantias || e.getSource() == panelTimbres.btnLimpiarMuestras
                || e.getSource() == panelTimbres.btnLimpiarTimbres) {
            Limpiar();
        }

        if (e.getSource() == panelTimbres.btnRefrescarGarantias || e.getSource() == panelTimbres.btnRefrescarMuestras
                || e.getSource() == panelTimbres.btnRefrescarTimbres) {
            CargarTablas();
        }

        /////////////////////////////////////////////////////////////////////////////////////////////
        if (e.getSource() == panelTimbres.btnInsertarGarantias) {
            AñadirGarantia();
        }

        if (e.getSource() == panelTimbres.btnEliminarGarantias) {
            BorrarGarantia();
        }

        if (e.getSource() == panelTimbres.btnModificarGarantias) {
            ModificarGarantia();
        }
        /////////////////////////////////////////////////////////////////////////////////////////////
        if (e.getSource() == panelTimbres.btnInsertarMuestras) {
            AñadirMuestra();
        }

        if (e.getSource() == panelTimbres.btnEliminarMuestras) {
            BorrarMuestra();
        }

        if (e.getSource() == panelTimbres.btnModificarMuestras) {
            ModificarMuestra();
        }
        /////////////////////////////////////////////////////////////////////////////////////////////
        if (e.getSource() == panelTimbres.btnInsertarTimbres) {
            AñadirTimbre();
        }

        if (e.getSource() == panelTimbres.btnEliminarTimbres) {
            BorrarTimbre();
        }

        if (e.getSource() == panelTimbres.btnModificarTimbres) {
            ModificarTimbre();
        }
    }
    /**
     * Evento para buscar datos entre los campos de la tabla
     */
    private CaretListener EventoBuscar = new CaretListener() {
        @Override
        public void caretUpdate(CaretEvent e) {
            if (e.getSource() == panelTimbres.txtBuscarGarantias) {
                Buscar(panelTimbres.tblGarantias, panelTimbres.cmbBusquedaGarantias, panelTimbres.txtBuscarGarantias);
            }

            if (e.getSource() == panelTimbres.txtBuscarMuestras) {
                Buscar(panelTimbres.tblMuestras, panelTimbres.cmbBusquedaMuestras, panelTimbres.txtBuscarMuestras);
            }

            if (e.getSource() == panelTimbres.txtBuscarTimbres) {
                Buscar(panelTimbres.tblTimbres, panelTimbres.cmbBusquedaTimbres, panelTimbres.txtBuscarTimbres);
            }

        }
    };

    /**
     * Evento para cargar las contrataciones
     */
    private KeyListener EventoTextField = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                String institucion = "";
                String encargado = "";
                JTextField text = (JTextField) e.getSource();
                if (!(text.getText().trim().isEmpty())) {
                    if (!(consultas.BuscarContratacion(text.getText()) == null)) {
                        institucion = consultas.BuscarContratacion(text.getText())[0];
                        encargado = consultas.BuscarContratacion(text.getText())[1];
                        if (text == panelTimbres.txtContratacionGarantias) {
                            panelTimbres.txtInstituciónGarantias.setText(institucion);
                            panelTimbres.txtEncargadoContratacionGarantias.setText(encargado);
                            panelTimbres.txtContratacionGarantias.setEditable(false);
                            panelTimbres.txtInstituciónGarantias.setEditable(false);
                            panelTimbres.txtEncargadoContratacionGarantias.setEditable(false);
                        }

                        if (text == panelTimbres.txtContratacionMuestras) {
                            panelTimbres.txtInstituciónMuestras.setText(institucion);
                            panelTimbres.txtContratacionMuestras.setEditable(false);
                            panelTimbres.txtInstituciónMuestras.setEditable(false);
                        }

                        if (text == panelTimbres.txtContratacionTimbres) {
                            panelTimbres.txtInstituciónTimbres.setText(institucion);
                            panelTimbres.txtEncargadoContratacionTimbres.setText(encargado);
                            panelTimbres.txtContratacionTimbres.setEditable(false);
                            panelTimbres.txtInstituciónTimbres.setEditable(false);
                            panelTimbres.txtEncargadoContratacionTimbres.setEditable(false);
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
     * Evento para cargar datos de las tablas
     */
    private MouseListener EventoTablas = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                if (e.getSource() == panelTimbres.tblGarantias) {
                    Limpiar();
                    LocalDate ld;
                    Date fecha;
                    ZoneId defaultZoneId = ZoneId.systemDefault();

                    int cod = Integer.parseInt(String.valueOf(panelTimbres.tblGarantias.getModel().
                            getValueAt(panelTimbres.tblGarantias.getSelectedRow(), 0)));
                    panelTimbres.codGarantias.setText(String.valueOf(cod));
                    Object[] datos = consultas.BuscarRegistro(cod, 1);

                    panelTimbres.txtContratacionGarantias.setText(String.valueOf(datos[0]));
                    panelTimbres.txtInstituciónGarantias.setText(String.valueOf(datos[1]));
                    panelTimbres.txtObjetoGarantias.setText(String.valueOf(datos[2]));
                    panelTimbres.txtMontoGarantias.setText(String.valueOf(datos[3]));
                    panelTimbres.txtEstadoGarantias.setText(String.valueOf(datos[4]));
                    panelTimbres.txtTiempoGarantias.setText(String.valueOf(datos[5]));

                    ld = LocalDate.parse(String.valueOf(datos[6]));
                    fecha = Date.from(ld.atStartOfDay(defaultZoneId).toInstant());
                    panelTimbres.jdcPagoGarantias.setDate(fecha);

                    ld = LocalDate.parse(String.valueOf(datos[7]));
                    fecha = Date.from(ld.atStartOfDay(defaultZoneId).toInstant());
                    panelTimbres.jdcDevolucionGarantias.setDate(fecha);

                    panelTimbres.txtEncargadoContratacionGarantias.setText(String.valueOf(datos[8]));
                    panelTimbres.cmbTipoGarantias.setSelectedItem(datos[9]);
                    panelTimbres.txaObservacionGarantias.setText(String.valueOf(datos[10]));

                    panelTimbres.txtContratacionGarantias.setEditable(false);
                    panelTimbres.txtInstituciónGarantias.setEditable(false);
                    panelTimbres.txtEncargadoContratacionGarantias.setEditable(false);
                }

                if (e.getSource() == panelTimbres.tblTimbres) {
                    Limpiar();
                    int cod = Integer.parseInt(String.valueOf(panelTimbres.tblTimbres.getModel().
                            getValueAt(panelTimbres.tblTimbres.getSelectedRow(), 0)));
                    panelTimbres.codTimbres.setText(String.valueOf(cod));
                    Object[] datos = consultas.BuscarRegistro(cod, 2);

                    panelTimbres.txtContratacionTimbres.setText(String.valueOf(datos[0]));
                    panelTimbres.txtInstituciónTimbres.setText(String.valueOf(datos[1]));
                    panelTimbres.txtDescripcionTimbres.setText(String.valueOf(datos[2]));
                    panelTimbres.txtMontoTimbres.setText(String.valueOf(datos[3]));
                    panelTimbres.txtEstadoTimbres.setText(String.valueOf(datos[4]));
                    panelTimbres.txtEncargadoContratacionTimbres.setText(String.valueOf(datos[5]));
                    panelTimbres.txaObservacionTimbres.setText(String.valueOf(datos[6]));

                    panelTimbres.txtContratacionTimbres.setEditable(false);
                    panelTimbres.txtInstituciónTimbres.setEditable(false);
                    panelTimbres.txtEncargadoContratacionTimbres.setEditable(false);
                }

                if (e.getSource() == panelTimbres.tblMuestras) {
                    Limpiar();
                    LocalDate ld;
                    Date fecha;
                    ZoneId defaultZoneId = ZoneId.systemDefault();

                    int cod = Integer.parseInt(String.valueOf(panelTimbres.tblMuestras.getModel().
                            getValueAt(panelTimbres.tblMuestras.getSelectedRow(), 0)));
                    panelTimbres.codMuestras.setText(String.valueOf(cod));
                    Object[] datos = consultas.BuscarRegistro(cod, 3);

                    panelTimbres.txtContratacionMuestras.setText(String.valueOf(datos[0]));
                    panelTimbres.txtInstituciónMuestras.setText(String.valueOf(datos[1]));
                    panelTimbres.txtObjetoMuestras.setText(String.valueOf(datos[2]));
                    panelTimbres.spnCantidadMuestras.getModel().setValue(datos[3]);
                    panelTimbres.txtEstadoMuestras.setText(String.valueOf(datos[4]));

                    ld = LocalDate.parse(String.valueOf(datos[5]));
                    fecha = Date.from(ld.atStartOfDay(defaultZoneId).toInstant());
                    panelTimbres.jdcFechaEntregaMuestras.setDate(fecha);

                    ld = LocalDate.parse(String.valueOf(datos[6]));
                    fecha = Date.from(ld.atStartOfDay(defaultZoneId).toInstant());
                    panelTimbres.jdcFechaRetiroMuestras.setDate(fecha);

                    panelTimbres.txaObservacionMuestras.setText(String.valueOf(datos[7]));
                    
                    panelTimbres.txtContratacionMuestras.setEditable(false);
                    panelTimbres.txtInstituciónMuestras.setEditable(false);
                }
            }
        }
    };

    /**
     * Metodo para pintar filas
     *
     * @param tabla Tabla de las filas que se van a pintar
     */
    private void PintarFilas(JTable tabla) {

        PintarFilas pf = new PintarFilas();
        int cantColumnas = tabla.getColumnCount();
        for (int i = 0; i < cantColumnas; i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(pf);
        }
    }
}
