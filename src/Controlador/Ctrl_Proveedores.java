package Controlador;

import Consultas.Consultas_Proveedores;
import Vista.JDialogs.AgregarArticulo;
import Vista.JDialogs.AgregarCuentaBanco;
import Vista.Paneles.Pnl_Proveedor;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Ctrl_Proveedores implements ActionListener {

    private Pnl_Proveedor panelProveedor;
    private Consultas_Proveedores consultas;
    private AgregarCuentaBanco VentanaBancosCuentas;
    private AgregarArticulo VentanaArticulos;

    public Ctrl_Proveedores(Pnl_Proveedor viewProveedor, Consultas.Consultas_Proveedores consultas, AgregarCuentaBanco VentaBancosCuentas, AgregarArticulo VentaArticulos) {
        this.panelProveedor = viewProveedor;
        this.consultas = consultas;
        this.VentanaArticulos = VentaArticulos;
        this.VentanaBancosCuentas = VentaBancosCuentas;

        Iniciar();

        panelProveedor.btnLimpiarProveedores.addActionListener(this);
        panelProveedor.btnAgregarCuentaBanco.addActionListener(this);
        panelProveedor.btnAgregarArt.addActionListener(this);
        panelProveedor.btnRefrescarProveedores.addActionListener(this);
        panelProveedor.btnInsertarProveedores.addActionListener(this);
        panelProveedor.btnModificarProveedores.addActionListener(this);
        panelProveedor.btnEliminarProveedores.addActionListener(this);

        VentanaBancosCuentas.btnAgregarBancoCuenta.addActionListener(this);
        VentanaBancosCuentas.cmbProveedores.addActionListener(this);
        VentanaBancosCuentas.btnBorrarBancoCuenta.addActionListener(this);

        VentanaArticulos.btnAgregarArticulo.addActionListener(this);
        VentanaArticulos.cmbProveedores.addActionListener(this);
        VentanaArticulos.btnBorrarArticulo.addActionListener(this);

        panelProveedor.txtBuscarProveedores.addCaretListener(EventoBuscar);

        panelProveedor.tblProveedores.addMouseListener(EventoTablas);
    }

    private void Iniciar() {
        CargarTabla();

        panelProveedor.codProveedores.setVisible(false);

        panelProveedor.setVisible(true);
    }

    private void Limpiar() {
        panelProveedor.txaObservacionProv.setText("");
        for (Component c : panelProveedor.PanelObjetosProveedores.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
                ((JTextField) c).setEditable(true);
            }
        }
    }

    private void CargarTabla() {
        panelProveedor.tblProveedores.setModel(consultas.CargarDatos());

        panelProveedor.cmbBusquedaProveedores.removeAllItems();
        for (int i = 0; i < panelProveedor.tblProveedores.getColumnCount(); i++) {
            panelProveedor.cmbBusquedaProveedores.addItem(String.valueOf(panelProveedor.tblProveedores.getModel().getColumnName(i)));
        }
        Buscar(panelProveedor.tblProveedores, panelProveedor.cmbBusquedaProveedores, panelProveedor.txtBuscarProveedores);

        CargarProveedores();
        CuentasBancosProveedor();
        ArticulosProovedor();
    }

    private void Buscar(JTable tabla, JComboBox combo, JTextField text) {
        TableRowSorter modeloOrdenado = new TableRowSorter<TableModel>(tabla.getModel());
        tabla.setRowSorter(modeloOrdenado);
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + text.getText(),
                combo.getSelectedIndex()));
    }

    private void AñadirProveedor() {
        String provedorReal = panelProveedor.txtProvReal.getText().trim();
        String proveedorFantasia = panelProveedor.txtProvFantasia.getText().trim();
        String correo = panelProveedor.txtCorreoProv.getText().trim();
        int tel = 0;
        int cel = 0;
        int cedula = 0;
        String contacto = panelProveedor.txtContactoProv.getText().trim();
        String ubicacion = panelProveedor.txtUbicacionProv.getText().trim();
        String observacion = panelProveedor.txaObservacionProv.getText().trim();

        if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (!(provedorReal.isEmpty()) || !(proveedorFantasia.isEmpty()) || !(correo.isEmpty()) || !(contacto.isEmpty()) || !(ubicacion.isEmpty())
                    || !(panelProveedor.txtTelProv.getText().trim().isEmpty()) || !(panelProveedor.txtCedulaProv.getText().trim().isEmpty())
                    || !(panelProveedor.txtCelularProv.getText().trim().isEmpty())) {
                tel = Integer.parseInt(panelProveedor.txtTelProv.getText().trim());
                cel = Integer.parseInt(panelProveedor.txtCelularProv.getText().trim());
                cedula = Integer.parseInt(panelProveedor.txtCedulaProv.getText().trim());
                if (consultas.Añadir_Proveedor(provedorReal, proveedorFantasia, correo, tel, cel, cedula, contacto, ubicacion, observacion)) {
                    JOptionPane.showMessageDialog(null, "Proveedor ingresado con exito!");
                    Limpiar();
                    CargarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error al ingresar el proveedor");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Rellene todos los campos necesarios");
            }
        }
    }

    private void ModificarProveedor() {
        String provedorReal = panelProveedor.txtProvReal.getText().trim();
        String proveedorFantasia = panelProveedor.txtProvFantasia.getText().trim();
        String correo = panelProveedor.txtCorreoProv.getText().trim();
        int tel = 0;
        int cel = 0;
        int cedula = 0;
        String contacto = panelProveedor.txtContactoProv.getText().trim();
        String ubicacion = panelProveedor.txtUbicacionProv.getText().trim();
        String observacion = panelProveedor.txaObservacionProv.getText().trim();
        int cod = 0;

        if (!(panelProveedor.codProveedores.getText().equals("NA"))) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (!(provedorReal.isEmpty()) || !(proveedorFantasia.isEmpty()) || !(correo.isEmpty()) || !(contacto.isEmpty()) || !(ubicacion.isEmpty())
                        || !(panelProveedor.txtTelProv.getText().trim().isEmpty()) || !(panelProveedor.txtCedulaProv.getText().trim().isEmpty())
                        || !(panelProveedor.txtCelularProv.getText().trim().isEmpty())) {
                    tel = Integer.parseInt(panelProveedor.txtTelProv.getText().trim());
                    cel = Integer.parseInt(panelProveedor.txtCelularProv.getText().trim());
                    cedula = Integer.parseInt(panelProveedor.txtCedulaProv.getText().trim());
                    cod = Integer.parseInt(panelProveedor.codProveedores.getText().trim());
                    if (consultas.actualizar_proveedor(cod, provedorReal, proveedorFantasia, correo, tel, cel, cedula, contacto, ubicacion, observacion)) {
                        JOptionPane.showMessageDialog(null, "Se modificó con exito el proveedor!");
                        Limpiar();
                        CargarTabla();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error al modificar el proveedor");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una contratación");
        }
    }

    private void BorrarProveedor() {
        int cod = 0;

        if (!(panelProveedor.codProveedores.getText().equals("NA"))) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                cod = Integer.parseInt(panelProveedor.codProveedores.getText().trim());
                if (consultas.BorrarProveedor(cod)) {
                    JOptionPane.showMessageDialog(null, "Se eliminó con exito!");
                    Limpiar();
                    CargarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error al eliminar");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una contratación");
        }
    }
    
    private void CargarProveedores() {
        String[] proveedores = consultas.CargarProveedores();

        VentanaBancosCuentas.cmbProveedores.removeAllItems();
        VentanaArticulos.cmbProveedores.removeAllItems();
        for (int i = 0; i < proveedores.length; i++) {
            VentanaBancosCuentas.cmbProveedores.addItem(proveedores[i]);
            VentanaArticulos.cmbProveedores.addItem(proveedores[i]);
        }
    }

    private void AgregarBancoCuenta() {
        String proveedor = String.valueOf(VentanaBancosCuentas.cmbProveedores.getSelectedItem());
        int cod = 0;

        for (int i = 0; i < proveedor.length(); i++) {
            if (proveedor.charAt(i) == '(') {
                cod = Integer.parseInt(String.valueOf(proveedor.charAt(i + 1)));
            }
        }

        String cuenta = VentanaBancosCuentas.txtCuentaNueva.getText().trim();
        String banco = VentanaBancosCuentas.txtBancoNuevo.getText().trim();

        if (!(cuenta.isEmpty()) || !(banco.isEmpty())) {
            if (consultas.Insertar_bancos_cuentas(cuenta, banco, cod)) {
                JOptionPane.showMessageDialog(null, "Banco y Cuenta ingresada con exito!");
                VentanaBancosCuentas.txtBancoNuevo.setText("");
                VentanaBancosCuentas.txtCuentaNueva.setText("");
                CargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error al insertar los datos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        }
    }

    private void CuentasBancosProveedor() {
        VentanaBancosCuentas.txaBancosCuentas.setText("");
        String proveedor = String.valueOf(VentanaBancosCuentas.cmbProveedores.getSelectedItem());
        int cod = 0;

        for (int i = 0; i < proveedor.length(); i++) {
            if (proveedor.charAt(i) == '(') {
                cod = Integer.parseInt(String.valueOf(proveedor.charAt(i + 1)));
            }
        }

        java.util.List<String[]> datos = consultas.CargarBancosCuentas(cod);

        for (String[] fila : datos) {
            VentanaBancosCuentas.txtProveedor.setText(fila[0]);
            VentanaBancosCuentas.txaBancosCuentas.append("Cuenta: " + fila[1] + "  " + "Banco: " + fila[2] + "\n");
        }

        VentanaBancosCuentas.txaBancosCuentas.setEditable(false);

    }
    
    private void BorrarBancoCuenta() {
        String[] datosCuentasBancos = null;
        String[] datosBancos = null;
        String[] datosCuentas = null;

        String proveedor = String.valueOf(VentanaBancosCuentas.cmbProveedores.getSelectedItem());
        int cod = 0;

        for (int i = 0; i < proveedor.length(); i++) {
            if (proveedor.charAt(i) == '(') {
                cod = Integer.parseInt(String.valueOf(proveedor.charAt(i + 1)));
            }
        }

        java.util.List<String[]> datos = consultas.CargarBancosCuentas(cod);

        int filas = 0;
        for (String[] fila : datos) {
            filas++;
        }

        datosCuentasBancos = new String[filas];
        datosBancos = new String[filas];
        datosCuentas = new String[filas];

        int i = 0;
        for (String[] fila : datos) {
            datosCuentasBancos[i] = "Cuenta: " + fila[1] + " - " + "Banco: " + fila[2];
            datosCuentas[i] = fila[1];
            datosBancos[i] = fila[2];
            i++;
        }

        JComboBox opciones = new JComboBox(datosCuentasBancos);
        int confirmacion = JOptionPane.showConfirmDialog(null, opciones, "Banco y Cuenta por eliminar", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            for (int j = 0; j < datosCuentasBancos.length; j++) {
                if (opciones.getSelectedItem().equals(datosCuentasBancos[j])) {
                    String cuenta = datosCuentas[j];
                    String banco = datosBancos[j];
                    if (consultas.BorrarCuentaBanco(cod, cuenta, banco)) {
                        JOptionPane.showMessageDialog(null, "Cuenta y Banco eliminados con exito!");
                        VentanaBancosCuentas.txtBancoNuevo.setText("");
                        VentanaBancosCuentas.txtCuentaNueva.setText("");
                        CargarTabla();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un eror al eliminar");
                    }
                }
            }
        }
    }

    private void AgregarArticulos() {
        String proveedor = String.valueOf(VentanaArticulos.cmbProveedores.getSelectedItem());
        int cod = 0;

        for (int i = 0; i < proveedor.length(); i++) {
            if (proveedor.charAt(i) == '(') {
                cod = Integer.parseInt(String.valueOf(proveedor.charAt(i + 1)));
            }
        }

        String articulo = VentanaArticulos.txtArticuloNuevo.getText().trim();

        if (!(articulo.isEmpty())) {
            if (consultas.Insertar_articulos(cod, articulo)) {
                JOptionPane.showMessageDialog(null, "Se insertó el articulo con exito");
                VentanaArticulos.txtArticuloNuevo.setText("");
                CargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error al insertar el artículo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellene los campos");
        }
    }

    private void ArticulosProovedor() {
        VentanaArticulos.txaArticulos.setText("");
        String proveedor = String.valueOf(VentanaArticulos.cmbProveedores.getSelectedItem());
        int cod = 0;

        for (int i = 0; i < proveedor.length(); i++) {
            if (proveedor.charAt(i) == '(') {
                cod = Integer.parseInt(String.valueOf(proveedor.charAt(i + 1)));
            }
        }

        java.util.List<String[]> datos = consultas.CargarArticulos(cod);

        for (String[] fila : datos) {
            VentanaArticulos.txtProveedor.setText(fila[0]);
            VentanaArticulos.txaArticulos.append("Artículo: " + fila[1] + "\n");
        }

        VentanaArticulos.txaArticulos.setEditable(false);
    }
    
    private void BorrarArticulo(){
        String[] datosProveedorArticulos = null;
        String[] datosArticulos = null;
        
        String proveedor = String.valueOf(VentanaArticulos.cmbProveedores.getSelectedItem());
        int cod = 0;

        for (int i = 0; i < proveedor.length(); i++) {
            if (proveedor.charAt(i) == '(') {
                cod = Integer.parseInt(String.valueOf(proveedor.charAt(i + 1)));
            }
        }

        java.util.List<String[]> datos = consultas.CargarArticulos(cod);

        int filas = 0;
        for (String[] fila : datos) {
            filas++;
        }
        
        datosProveedorArticulos = new String[filas];
        datosArticulos = new String[filas];
        
        int i = 0;
        for (String[] fila : datos) {
            datosProveedorArticulos[i] = "Artículo: " + fila[1];
            datosArticulos[i] = fila[1];
            i++;
        }
        
        JComboBox opciones = new JComboBox(datosProveedorArticulos);
        int confirmacion = JOptionPane.showConfirmDialog(null, opciones, "Articulo por eliminar", JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            for (int j = 0; j < datosProveedorArticulos.length; j++) {
                if (opciones.getSelectedItem().equals(datosProveedorArticulos[j])) {
                    String articulo = datosArticulos[j];
                    if (consultas.BorrarArticulo(cod, articulo)) {
                        JOptionPane.showMessageDialog(null, "Artículo eliminado con exito!");
                        VentanaArticulos.txtArticuloNuevo.setText("");
                        CargarTabla();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un eror al eliminar");
                    }
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelProveedor.btnLimpiarProveedores) {
            Limpiar();
        }

        if (e.getSource() == panelProveedor.btnAgregarArt) {
            VentanaArticulos.setLocationRelativeTo(null);
            VentanaArticulos.setVisible(true);
        }

        if (e.getSource() == panelProveedor.btnAgregarCuentaBanco) {
            VentanaBancosCuentas.setLocationRelativeTo(null);
            VentanaBancosCuentas.setVisible(true);
        }

        if (e.getSource() == panelProveedor.btnRefrescarProveedores) {
            CargarTabla();
        }

        if (e.getSource() == panelProveedor.btnInsertarProveedores) {
            AñadirProveedor();
        }

        if (e.getSource() == panelProveedor.btnModificarProveedores) {
            ModificarProveedor();
        }

        if (e.getSource() == panelProveedor.btnEliminarProveedores) {
            BorrarProveedor();
        }

        ////////////////////////////////////////////////////////////////////////
        if (e.getSource() == VentanaBancosCuentas.btnAgregarBancoCuenta) {
            AgregarBancoCuenta();
        }

        if (e.getSource() == VentanaBancosCuentas.cmbProveedores) {
            CuentasBancosProveedor();
        }

        if (e.getSource() == VentanaBancosCuentas.btnBorrarBancoCuenta) {
            BorrarBancoCuenta();
        }

        ////////////////////////////////////////////////////////////////////////
        if (e.getSource() == VentanaArticulos.btnAgregarArticulo) {
            AgregarArticulos();
        }

        if (e.getSource() == VentanaArticulos.cmbProveedores) {
            ArticulosProovedor();
        }
        
        if(e.getSource() == VentanaArticulos.btnBorrarArticulo){
            BorrarArticulo();
        }
    }

    private CaretListener EventoBuscar = new CaretListener() {
        @Override
        public void caretUpdate(CaretEvent e) {
            Buscar(panelProveedor.tblProveedores, panelProveedor.cmbBusquedaProveedores, panelProveedor.txtBuscarProveedores);
        }
    };

    private MouseListener EventoTablas = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                Limpiar();
                int cod = Integer.parseInt(String.valueOf(panelProveedor.tblProveedores.getModel().
                        getValueAt(panelProveedor.tblProveedores.getSelectedRow(), 0)));
                Object[] datos = consultas.CargarProveedor(cod);

                panelProveedor.codProveedores.setText(String.valueOf(datos[0]));
                panelProveedor.txtProvReal.setText(String.valueOf(datos[1]));
                panelProveedor.txtProvFantasia.setText(String.valueOf(datos[2]));
                panelProveedor.txtCorreoProv.setText(String.valueOf(datos[3]));
                panelProveedor.txtTelProv.setText(String.valueOf(datos[4]));
                panelProveedor.txtCelularProv.setText(String.valueOf(datos[5]));
                panelProveedor.txtCedulaProv.setText(String.valueOf(datos[6]));
                panelProveedor.txtContactoProv.setText(String.valueOf(datos[7]));
                panelProveedor.txtUbicacionProv.setText(String.valueOf(datos[8]));
                panelProveedor.txaObservacionProv.setText(String.valueOf(datos[9]));
            }
        }
    };
}
