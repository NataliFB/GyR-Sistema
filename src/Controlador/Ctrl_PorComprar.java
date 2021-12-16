package Controlador;

import Consultas.Consultas_PorComprar;
import Modelo.Mod_Usuario;
import Vista.Paneles.Pnl_3;
import java.awt.Component;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.*;

public class Ctrl_PorComprar implements ActionListener {

    private Pnl_3 panelPorComprar;
    private Consultas_PorComprar consultas;
    private Mod_Usuario us;

    public Ctrl_PorComprar(Pnl_3 viewPnl_3, Consultas_PorComprar consultas, Mod_Usuario us) {
        this.panelPorComprar = viewPnl_3;
        this.consultas = consultas;
        this.us = us;

        Iniciar();

        panelPorComprar.btnLimpiarPorComprar.addActionListener(this);
        panelPorComprar.btnRefrescarPorComprar.addActionListener(this);
        panelPorComprar.btnInsertarPorComprar.addActionListener(this);
        panelPorComprar.btnEliminarPorComprar.addActionListener(this);
        panelPorComprar.btnModificarPorComprar.addActionListener(this);

        panelPorComprar.cmbProveedores.addActionListener(this);

        panelPorComprar.txtBuscarPorComprar.addCaretListener(EventoBuscar);

        panelPorComprar.txtContratacionPorComprar.addKeyListener(EventoTextField);
        
        panelPorComprar.tblPorComprar.addMouseListener(EventoTablas);
    }

    /**
     * Metodo que inicia la ventana
     */
    private void Iniciar() {
        CargarTabla();

        panelPorComprar.codPorComprar.setVisible(false);
        panelPorComprar.codProveedor.setVisible(false);

        panelPorComprar.setVisible(true);
    }

    /**
     * Metodo que limpia los componentes de las pestañas de la ventana
     */
    private void Limpiar() {
        for (Component c : panelPorComprar.PanelObjetosPorComprar.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
                ((JTextField) c).setEditable(true);
            }
        }
        for (Component c : panelPorComprar.panelProveedores.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
                ((JTextField) c).setEditable(true);
            }
        }
        panelPorComprar.txaObservacionPorComprar.setText("");
        panelPorComprar.txaCuentasBancosPorComprar.setText("");
        panelPorComprar.txaCuentasBancosPorComprar.setEditable(true);
    }

    /**
     * Metodo para cargar las tablas de las pestañas
     */
    private void CargarTabla() {
        panelPorComprar.tblPorComprar.setModel(consultas.CargarTabla());

        panelPorComprar.cmbBusquedaPorComprar.removeAllItems();
        for (int i = 0; i < panelPorComprar.tblPorComprar.getColumnCount(); i++) {
            panelPorComprar.cmbBusquedaPorComprar.addItem(String.valueOf(panelPorComprar.tblPorComprar.getModel().getColumnName(i)));
        }

        Buscar(panelPorComprar.tblPorComprar, panelPorComprar.cmbBusquedaPorComprar, panelPorComprar.txtBuscarPorComprar);

        PintarFilas(panelPorComprar.tblPorComprar);

        panelPorComprar.cmbProveedores.removeAllItems();
        CargarProveedores();
    }
    
    /**
     * Metodo para borrar
     */
    private void BorrarCompra(){
        int cod = 0;
        if (JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrarlo?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (!panelPorComprar.codPorComprar.getText().equals("NA")) {
                cod = Integer.parseInt(panelPorComprar.codPorComprar.getText());
                if(consultas.BorrarCompra(cod)){
                    JOptionPane.showMessageDialog(null, "Compra borrada con exito!");
                    Limpiar();
                    CargarTabla();
                }else{
                    JOptionPane.showMessageDialog(null, "Error al borrar");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione una compra para borrar");
            }
        }
    }

    /**
     * Metodo para modificar una compra
     */
    private void ModificarCompra(){
        String contratacion = panelPorComprar.txtContratacionPorComprar.getText();
        String proveedor = panelPorComprar.txtProvRealPorComprar.getText();

        String objeto = panelPorComprar.txtObjetoPorComprar.getText().trim();
        double montoOfertado = 0;
        double costo = 0;
        String observaciones = panelPorComprar.txaObservacionPorComprar.getText();
        int cod = 0;
        
        if (!panelPorComprar.codPorComprar.getText().equals("NA")) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (!(objeto.isEmpty()) || !(panelPorComprar.txtMontoPorComprar.getText().trim().isEmpty())
                        || !(panelPorComprar.txtCostoPorComprar.getText().trim().isEmpty())) {
                    montoOfertado = Double.parseDouble(panelPorComprar.txtMontoPorComprar.getText());
                    costo = Double.parseDouble(panelPorComprar.txtCostoPorComprar.getText());
                    cod = Integer.parseInt(panelPorComprar.codPorComprar.getText());
                    
                    if(consultas.ModificarCompra(cod, objeto, montoOfertado, costo, observaciones, contratacion, us)){
                        JOptionPane.showMessageDialog(null, "Compra modificada con exito!");
                        Limpiar();
                        CargarTabla();
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al modificar");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Rellene todos los espacios");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una contratación");
        }
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

    private void CargarProveedores() {
        String[] proveedores = consultas.CargarProveedores();

        for (int i = 0; i < proveedores.length; i++) {
            panelPorComprar.cmbProveedores.addItem(proveedores[i]);
        }
    }

    private void CargarDatosProveedor() {
        panelPorComprar.txaCuentasBancosPorComprar.setText("");
        String proveedor = String.valueOf(panelPorComprar.cmbProveedores.getSelectedItem());
        int cod = 0;

        for (int i = 0; i < proveedor.length(); i++) {
            if (proveedor.charAt(i) == '(') {
                cod = Integer.parseInt(String.valueOf(proveedor.charAt(i + 1)));
            }
        }

        panelPorComprar.codProveedor.setText(String.valueOf(cod));
        List<String[]> datos = consultas.BuscarProveedor(cod);

        for (String[] fila : datos) {
            panelPorComprar.txtProvRealPorComprar.setText(fila[0]);
            panelPorComprar.txtProvFantPorComprar.setText(fila[1]);
            panelPorComprar.txtCedulaPorComprar.setText(fila[2]);
            panelPorComprar.txaCuentasBancosPorComprar.append("Cuenta: " + fila[3] + "  " + "Banco: " + fila[4] + "\n");
        }
        for (Component c : panelPorComprar.panelProveedores.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setEditable(false);
            }
        }
        panelPorComprar.txaCuentasBancosPorComprar.setEditable(false);
    }

    private void AñadirCompra() {
        String contratacion = panelPorComprar.txtContratacionPorComprar.getText();
        String proveedor = panelPorComprar.txtProvRealPorComprar.getText();

        String objeto = panelPorComprar.txtObjetoPorComprar.getText().trim();
        double montoOfertado = 0;
        double costo = 0;
        String observaciones = panelPorComprar.txaObservacionPorComprar.getText();
        int codProveedor = 0;

        if ((!(contratacion.isEmpty()) && !(panelPorComprar.txtContratacionPorComprar.isEditable()))
                && (!(proveedor.isEmpty()) && !(panelPorComprar.txtProvFantPorComprar.isEditable()))) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos ingresados?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (!(objeto.isEmpty()) || !(panelPorComprar.txtMontoPorComprar.getText().trim().isEmpty())
                        || !(panelPorComprar.txtCostoPorComprar.getText().trim().isEmpty())) {
                    codProveedor = Integer.parseInt(String.valueOf(panelPorComprar.codProveedor.getText()));

                    montoOfertado = Double.parseDouble(panelPorComprar.txtMontoPorComprar.getText());
                    costo = Double.parseDouble(panelPorComprar.txtCostoPorComprar.getText());

                    if (consultas.AñadirCompra(objeto, montoOfertado, costo, observaciones, codProveedor, contratacion, us)) {
                        JOptionPane.showMessageDialog(null, "Datos insertados con exito!");
                        Limpiar();
                        CargarTabla();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error al insertar los datos");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Rellene todos los campos necesarios");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una contratacion y un proveedor válido");
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
        if (e.getSource() == panelPorComprar.btnLimpiarPorComprar) {
            Limpiar();
        }

        if (e.getSource() == panelPorComprar.btnRefrescarPorComprar) {
            CargarTabla();
        }

        if (e.getSource() == panelPorComprar.cmbProveedores) {
            CargarDatosProveedor();
        }

        if (e.getSource() == panelPorComprar.btnInsertarPorComprar) {
            AñadirCompra();
        }
        
        if(e.getSource() == panelPorComprar.btnEliminarPorComprar){
            BorrarCompra();
        }
        
        if(e.getSource() == panelPorComprar.btnModificarPorComprar){
            ModificarCompra();
        }
    }

    private CaretListener EventoBuscar = new CaretListener() {
        @Override
        public void caretUpdate(CaretEvent e) {
            Buscar(panelPorComprar.tblPorComprar, panelPorComprar.cmbBusquedaPorComprar, panelPorComprar.txtBuscarPorComprar);
        }
    };

    private KeyListener EventoTextField = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                String contratacion = "";
                JTextField text = (JTextField) e.getSource();

                if (!(text.getText().trim().isEmpty())) {
                    contratacion = text.getText();
                    if (consultas.BuscarContratacion(contratacion)) {
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
            if(e.getClickCount() == 2){
                Limpiar();
                int cod = Integer.parseInt(String.valueOf(panelPorComprar.tblPorComprar.getModel().
                            getValueAt(panelPorComprar.tblPorComprar.getSelectedRow(), 0)));
                panelPorComprar.codPorComprar.setText(String.valueOf(cod));
                Object[] datos = consultas.CargarCompra(cod);
                
                panelPorComprar.txtContratacionPorComprar.setText(String.valueOf(datos[0]));
                panelPorComprar.txtObjetoPorComprar.setText(String.valueOf(datos[1]));
                panelPorComprar.txtMontoPorComprar.setText(String.valueOf(datos[2]));
                panelPorComprar.txtCostoPorComprar.setText(String.valueOf(datos[3]));
                panelPorComprar.txaObservacionPorComprar.setText(String.valueOf(datos[4]));
                
                String[] proveedores = new String[panelPorComprar.cmbProveedores.getItemCount()];
                
                for(int i = 0; i < proveedores.length; i++){
                    proveedores[i] = panelPorComprar.cmbProveedores.getItemAt(i);
                }
                
                for(int i = 0; i < proveedores.length; i++){
                    String prov = proveedores[i];
                    for(int j = 0; j < prov.length(); j++){
                        if(prov.charAt(j) == '('){
                            if(prov.charAt(j + 1) == String.valueOf(datos[5]).trim().charAt(0)){
                                panelPorComprar.cmbProveedores.setSelectedIndex(i);
                            }
                        }
                    }
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
