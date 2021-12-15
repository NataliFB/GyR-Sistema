package Controlador;

import Consultas.Consultas_PorComprar;
import Vista.Paneles.Pnl_3;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;

public class Ctrl_PorComprar implements ActionListener {

    private Pnl_3 panelPorComprar;
    private Consultas_PorComprar consultas;

    public Ctrl_PorComprar(Pnl_3 viewPnl_3, Consultas_PorComprar consultas) {
        this.panelPorComprar = viewPnl_3;
        this.consultas = consultas;

        Iniciar();

        panelPorComprar.btnLimpiarPorComprar.addActionListener(this);
        
        panelPorComprar.cmbProveedores.addActionListener(this);
    }

    /**
     * Metodo que inicia la ventana
     */
    private void Iniciar() {
        CargarTabla();

        panelPorComprar.setVisible(true);
    }

    /**
     * Metodo que limpia los componentes de las pestañas de la ventana
     */
    private void Limpiar() {
        panelPorComprar.txaObservacionPorComprar.setText("");
        panelPorComprar.txtCedulaPorComprar.setText("");
        panelPorComprar.txtCostoPorComprar.setText("");
        panelPorComprar.txtMontoPorComprar.setText("");
        panelPorComprar.txtContratacionPorComprar.setText("");
        panelPorComprar.txtObjetoPorComprar.setText("");
        panelPorComprar.txtProvFantPorComprar.setText("");
        panelPorComprar.txtProvRealPorComprar.setText("");
        panelPorComprar.txaCuentasBancosPorComprar.setText("");
    }

    /**
     * Metodo para cargar las tablas de las pestañas
     */
    private void CargarTabla() {
        panelPorComprar.tblPorComprar.setModel(consultas.CargarTabla());

        for (int i = 0; i < panelPorComprar.tblPorComprar.getColumnCount(); i++) {
            panelPorComprar.cmbBusquedaPorComprar.addItem(String.valueOf(panelPorComprar.tblPorComprar.getModel().getColumnName(i)));
        }

        Buscar(panelPorComprar.tblPorComprar, panelPorComprar.cmbBusquedaPorComprar, panelPorComprar.txtBuscarPorComprar);

        PintarFilas(panelPorComprar.tblPorComprar);
        
        CargarProveedores();
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
    
    private void CargarProveedores(){
        String[] proveedores = consultas.CargarProveedores();
        
        for(int i = 0; i < proveedores.length; i++){
            panelPorComprar.cmbProveedores.addItem(proveedores[i]);
        }
    }
    
    private void CargarDatosProveedor(){
        String proveedor = String.valueOf(panelPorComprar.cmbProveedores.getSelectedItem());
        int cod = 0;
        
        for(int i = 0; i < proveedor.length(); i++){
            if(proveedor.charAt(i) == '('){
                cod = Integer.parseInt(String.valueOf(proveedor.charAt(i + 1)));
            }
        }
        System.out.println(cod);
        
        List<String[]> datos = consultas.BuscarProveedor(cod);
        
        for (String[] fila : datos) {
            panelPorComprar.txtProvRealPorComprar.setText(fila[0]);
            panelPorComprar.txtProvFantPorComprar.setText(fila[1]);
            panelPorComprar.txtCedulaPorComprar.setText(fila[2]);
            panelPorComprar.txaCuentasBancosPorComprar.append("Cuenta: " + fila[3] + "  " + "Banco: " + fila[4] + "\n");
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
        
        if(e.getSource() == panelPorComprar.cmbProveedores){
            CargarDatosProveedor();
        }
    }

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
