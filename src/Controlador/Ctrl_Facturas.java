package Controlador;

import Consultas.Consultas_Facturas;
import Vista.Paneles.Pnl_4;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
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

public class Ctrl_Facturas implements ActionListener {

    private Pnl_4 panelFacturas;
    private Consultas_Facturas consultas;

    public Ctrl_Facturas(Pnl_4 viewPnl_4, Consultas_Facturas consultas) {
        this.panelFacturas = viewPnl_4;
        this.consultas = consultas;

        Iniciar();

        panelFacturas.txtBuscarFacturas.addCaretListener(EventoBuscar);

        panelFacturas.txtContratacionFacturas.addKeyListener(EventoTextField);

        panelFacturas.tblFacturas.addMouseListener(EventoTablas);

        panelFacturas.btnLimpiarFacturas.addActionListener(this);
        panelFacturas.btnRefrescarFacturas.addActionListener(this);
        panelFacturas.btnInsertarFacturas.addActionListener(this);
        panelFacturas.btnEliminarFacturas.addActionListener(this);
        panelFacturas.btnModificarFacturas.addActionListener(this);

        panelFacturas.cmbBusquedaFacturas.addActionListener(this);
    }

    private void Iniciar() {
        CargarTabla();

        panelFacturas.codFacturas.setVisible(false);

        panelFacturas.setVisible(true);
    }

    private void CargarTabla() {
        panelFacturas.tblFacturas.setModel(consultas.CargarDatos());

        panelFacturas.cmbBusquedaFacturas.removeAllItems();
        for (int i = 0; i < panelFacturas.tblFacturas.getColumnCount(); i++) {
            panelFacturas.cmbBusquedaFacturas.addItem(String.valueOf(panelFacturas.tblFacturas.getModel().getColumnName(i)));
        }

        Buscar(panelFacturas.tblFacturas, panelFacturas.cmbBusquedaFacturas, panelFacturas.txtBuscarFacturas);
    }

    private void Buscar(JTable tabla, JComboBox combo, JTextField text) {
        TableRowSorter modeloOrdenado = new TableRowSorter<TableModel>(tabla.getModel());
        tabla.setRowSorter(modeloOrdenado);
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + text.getText(),
                combo.getSelectedIndex()));
    }

    private void Limpiar() {
        for (Component c : panelFacturas.PanelObjetosFacturas.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
                ((JTextField) c).setEditable(true);
            }
            if (c instanceof JDateChooser) {
                ((JDateChooser) c).setCalendar(null);
            }
        }
        panelFacturas.btgMetodo.clearSelection();
        panelFacturas.btgMoneda.clearSelection();
    }

    private void AñadirFactura() {
        ButtonModel monedaColones = panelFacturas.rbtColones.getModel();
        ButtonModel monedaDolares = panelFacturas.rbtDolares.getModel();

        ButtonModel metodoEfectivo = panelFacturas.rbtEfectivo.getModel();
        ButtonModel metodoTarjeta = panelFacturas.rbtTarjeta.getModel();

        String contratacion = panelFacturas.txtContratacionFacturas.getText().trim();
        String institucion = panelFacturas.txtInstitucionFacturas.getText().trim();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFactura;
        String fechaCancelado;

        boolean efectivo;
        boolean moneda;

        String descripcion = panelFacturas.txtDescripcionFacturas.getText().trim();
        int transferencia;
        String estado = panelFacturas.txtEstadoFacturas.getText().trim();
        double monto;
        double renta;
        String institucionCedida = panelFacturas.txtInstCedidaFacturas.getText().trim();
        String banco = panelFacturas.txtBancoFacturas.getText().trim();
        String observaciones = panelFacturas.txtObservacionFacturas.getText().trim();

        if ((!(contratacion.isEmpty()) && !(panelFacturas.txtContratacionFacturas.isEditable()))) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if ((monedaColones.isSelected() || monedaDolares.isSelected())
                        && (metodoTarjeta.isSelected() || metodoEfectivo.isSelected())) {
                    if (monedaColones.isSelected()) {
                        moneda = true;
                    } else {
                        moneda = false;
                    }

                    if (metodoEfectivo.isSelected()) {
                        efectivo = true;
                    } else {
                        efectivo = false;
                    }

                    if (!(descripcion.isEmpty()) || !(estado.isEmpty()) || !(institucionCedida.isEmpty())
                            || !(banco.isEmpty())
                            || !(panelFacturas.txtMontoFacturas.getText().trim().isEmpty())
                            || !(panelFacturas.txtRentaFacturas.getText().trim().isEmpty())
                            || !(panelFacturas.txtTransferenciaFacturas.getText().trim().isEmpty())) {

                        fechaFactura = sdf.format(panelFacturas.jdcFechaFacturas.getDate());
                        fechaCancelado = sdf.format(panelFacturas.jdcCanceladoFacturas.getDate());

                        transferencia = Integer.parseInt(panelFacturas.txtTransferenciaFacturas.getText().trim());
                        monto = Double.parseDouble(panelFacturas.txtMontoFacturas.getText().trim());
                        renta = Double.parseDouble(panelFacturas.txtRentaFacturas.getText().trim());

                        if (consultas.insertar_facturas(institucion, fechaFactura, fechaCancelado, transferencia, estado, efectivo, moneda, monto,
                                institucionCedida, banco, observaciones, contratacion, renta, descripcion)) {
                            JOptionPane.showMessageDialog(null, "Se insertó la factura con exito");
                            Limpiar();
                            CargarTabla();
                        } else {
                            JOptionPane.showMessageDialog(null, "Hubo un error al insertar");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Rellene todos los espacios");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Rellene todos los espacios");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una contratación válida");
        }
    }

    private void BorrarFactura() {
        int cod = 0;
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrar la factura?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (!panelFacturas.codFacturas.getText().equals("NA")) {
                cod = Integer.parseInt(panelFacturas.codFacturas.getText());
                if (consultas.Borrar_Factura(cod)) {
                    JOptionPane.showMessageDialog(null, "Factura borrada con exito!");
                    Limpiar();
                    CargarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al borrar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una compra para borrar");
            }
        }
    }

    private void ModificarFactura() {
        ButtonModel monedaColones = panelFacturas.rbtColones.getModel();
        ButtonModel monedaDolares = panelFacturas.rbtDolares.getModel();

        ButtonModel metodoEfectivo = panelFacturas.rbtEfectivo.getModel();
        ButtonModel metodoTarjeta = panelFacturas.rbtTarjeta.getModel();

        String contratacion = panelFacturas.txtContratacionFacturas.getText().trim();
        String institucion = panelFacturas.txtInstitucionFacturas.getText().trim();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFactura;
        String fechaCancelado;

        boolean efectivo;
        boolean moneda;
        int cod = 0;

        String descripcion = panelFacturas.txtDescripcionFacturas.getText().trim();
        int transferencia;
        String estado = panelFacturas.txtEstadoFacturas.getText().trim();
        double monto;
        double renta;
        String institucionCedida = panelFacturas.txtInstCedidaFacturas.getText().trim();
        String banco = panelFacturas.txtBancoFacturas.getText().trim();
        String observaciones = panelFacturas.txtObservacionFacturas.getText().trim();

        if (!panelFacturas.codFacturas.getText().equals("NA")) {
            cod = Integer.parseInt(panelFacturas.codFacturas.getText());
            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if ((monedaColones.isSelected() || monedaDolares.isSelected())
                        && (metodoTarjeta.isSelected() || metodoEfectivo.isSelected())) {
                    if (monedaColones.isSelected()) {
                        moneda = true;
                    } else {
                        moneda = false;
                    }

                    if (metodoEfectivo.isSelected()) {
                        efectivo = true;
                    } else {
                        efectivo = false;
                    }

                    if (!(descripcion.isEmpty()) || !(estado.isEmpty()) || !(institucionCedida.isEmpty())
                            || !(banco.isEmpty())
                            || !(panelFacturas.txtMontoFacturas.getText().trim().isEmpty())
                            || !(panelFacturas.txtRentaFacturas.getText().trim().isEmpty())
                            || !(panelFacturas.txtTransferenciaFacturas.getText().trim().isEmpty())) {

                        fechaFactura = sdf.format(panelFacturas.jdcFechaFacturas.getDate());
                        fechaCancelado = sdf.format(panelFacturas.jdcCanceladoFacturas.getDate());

                        transferencia = Integer.parseInt(panelFacturas.txtTransferenciaFacturas.getText().trim());
                        monto = Double.parseDouble(panelFacturas.txtMontoFacturas.getText().trim());
                        renta = Double.parseDouble(panelFacturas.txtRentaFacturas.getText().trim());

                        if (consultas.actualizar_facturas(cod, institucion, fechaFactura, fechaCancelado, transferencia, estado, efectivo, moneda, 
                                monto, institucionCedida, banco, observaciones, contratacion, renta, descripcion)) {
                            JOptionPane.showMessageDialog(null, "Se acualizó la factura con exito");
                            Limpiar();
                            CargarTabla();
                        } else {
                            JOptionPane.showMessageDialog(null, "Hubo un error al actualizar");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Rellene todos los espacios");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Rellene todos los espacios");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una contratación válida");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelFacturas.btnLimpiarFacturas) {
            Limpiar();
        }

        if (e.getSource() == panelFacturas.btnRefrescarFacturas) {
            CargarTabla();
        }

        if (e.getSource() == panelFacturas.btnInsertarFacturas) {
            AñadirFactura();
        }

        if (e.getSource() == panelFacturas.btnEliminarFacturas) {
            BorrarFactura();
        }

        if (e.getSource() == panelFacturas.btnModificarFacturas) {
            ModificarFactura();
        }
    }

    private CaretListener EventoBuscar = new CaretListener() {
        @Override
        public void caretUpdate(CaretEvent e) {
            Buscar(panelFacturas.tblFacturas, panelFacturas.cmbBusquedaFacturas, panelFacturas.txtBuscarFacturas);
        }
    };

    private KeyListener EventoTextField = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                String contratacion = "";
                String institucion = "";
                JTextField text = (JTextField) e.getSource();

                if (!(text.getText().trim().isEmpty())) {
                    contratacion = text.getText();
                    institucion = consultas.BuscarContratacion(contratacion);
                    if (!(institucion.equals("Vacio"))) {
                        panelFacturas.txtInstitucionFacturas.setText(institucion);
                        panelFacturas.txtInstitucionFacturas.setEditable(false);
                        text.setEditable(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Seleccione una contratación válida");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Rellene el campo");
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

    private MouseListener EventoTablas = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                Limpiar();
                LocalDate ld;
                Date fecha;
                ZoneId defaultZoneId = ZoneId.systemDefault();

                int cod = Integer.parseInt(String.valueOf(panelFacturas.tblFacturas.getModel().
                        getValueAt(panelFacturas.tblFacturas.getSelectedRow(), 0)));
                panelFacturas.codFacturas.setText(String.valueOf(cod));

                Object[] datos = consultas.CargarFactura(cod);

                panelFacturas.txtInstitucionFacturas.setText(String.valueOf(datos[1]));

                ld = LocalDate.parse(String.valueOf(datos[2]));
                fecha = Date.from(ld.atStartOfDay(defaultZoneId).toInstant());
                panelFacturas.jdcFechaFacturas.setDate(fecha);

                ld = LocalDate.parse(String.valueOf(datos[3]));
                fecha = Date.from(ld.atStartOfDay(defaultZoneId).toInstant());
                panelFacturas.jdcCanceladoFacturas.setDate(fecha);

                panelFacturas.txtTransferenciaFacturas.setText(String.valueOf(datos[4]));
                panelFacturas.txtEstadoFacturas.setText(String.valueOf(datos[5]));

                if (Boolean.valueOf(String.valueOf(datos[6])) == true) {
                    panelFacturas.rbtEfectivo.setSelected(true);
                } else {
                    panelFacturas.rbtTarjeta.setSelected(true);
                }

                if (Boolean.valueOf(String.valueOf(datos[7])) == true) {
                    panelFacturas.rbtColones.setSelected(true);
                } else {
                    panelFacturas.rbtDolares.setSelected(true);
                }

                panelFacturas.txtMontoFacturas.setText(String.valueOf(datos[8]));
                panelFacturas.txtInstCedidaFacturas.setText(String.valueOf(datos[9]));
                panelFacturas.txtBancoFacturas.setText(String.valueOf(datos[10]));
                panelFacturas.txtObservacionFacturas.setText(String.valueOf(datos[11]));
                panelFacturas.txtContratacionFacturas.setText(String.valueOf(datos[12]));
                panelFacturas.txtRentaFacturas.setText(String.valueOf(datos[13]));
                panelFacturas.txtDescripcionFacturas.setText(String.valueOf(datos[14]));

                panelFacturas.txtContratacionFacturas.setEditable(false);
                panelFacturas.txtInstitucionFacturas.setEditable(false);
            }
        }
    };
}
