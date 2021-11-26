
package Vista.Paneles;

public class Pnl_5 extends javax.swing.JPanel {

    public Pnl_5() {
        initComponents();
        setSize(getPreferredSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgMoneda = new javax.swing.ButtonGroup();
        btgTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtContratacionRenta = new javax.swing.JTextField();
        txtSubtotalRenta = new javax.swing.JTextField();
        txtTotalRenta = new javax.swing.JTextField();
        txtIVARenta = new javax.swing.JTextField();
        txtProveedorRenta = new javax.swing.JTextField();
        txtCedulaRenta = new javax.swing.JTextField();
        txtTelefonoRenta = new javax.swing.JTextField();
        txtNacionalidadRenta = new javax.swing.JTextField();
        txtFacturaRenta = new javax.swing.JTextField();
        txtDescripcionRenta = new javax.swing.JTextField();
        txtrenta = new javax.swing.JTextField();
        jdcFechaRenta = new com.toedter.calendar.JDateChooser();
        btnInsertarRenta = new javax.swing.JButton();
        btnModificarRenta = new javax.swing.JButton();
        btnBuscarRenta = new javax.swing.JButton();
        btnLimpiarRenta = new javax.swing.JButton();
        btnEliminarRenta = new javax.swing.JButton();
        cmbOrdenRenta = new javax.swing.JComboBox<>();
        cbmModalidadRenta = new javax.swing.JComboBox<>();
        rbtColonesRenta = new javax.swing.JRadioButton();
        rbtDolares = new javax.swing.JRadioButton();
        rbtGastoRenta = new javax.swing.JRadioButton();
        rbtVentaRenta = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        spnRenta = new javax.swing.JScrollPane();
        tblRenta = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Renta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtContratacionRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 190, -1));
        jPanel1.add(txtSubtotalRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 172, 220, -1));
        jPanel1.add(txtTotalRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 220, -1));
        jPanel1.add(txtIVARenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 214, 220, -1));
        jPanel1.add(txtProveedorRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 190, -1));
        jPanel1.add(txtCedulaRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 190, -1));
        jPanel1.add(txtTelefonoRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 190, -1));
        jPanel1.add(txtNacionalidadRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 88, 220, -1));
        jPanel1.add(txtFacturaRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 190, -1));
        jPanel1.add(txtDescripcionRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 190, -1));
        jPanel1.add(txtrenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 220, -1));
        jPanel1.add(jdcFechaRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 46, 220, -1));

        btnInsertarRenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarRenta.setText("Agregar");
        jPanel1.add(btnInsertarRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        btnModificarRenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarRenta.setText("Modificar");
        jPanel1.add(btnModificarRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        btnBuscarRenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscarRenta.setText("Buscar");
        jPanel1.add(btnBuscarRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        btnLimpiarRenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarRenta.setText("Limpiar");
        btnLimpiarRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarRentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiarRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        btnEliminarRenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarRenta.setText("Eliminar");
        jPanel1.add(btnEliminarRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, 33));

        cmbOrdenRenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número Orden", "Descripción", "Días de entrega", "Orden", "Facturado", "Entregado" }));
        jPanel1.add(cmbOrdenRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 250, -1));

        cbmModalidadRenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Según Demanda", "Cantidad Definida", "Del 50%", "Parcial" }));
        jPanel1.add(cbmModalidadRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 190, -1));

        btgMoneda.add(rbtColonesRenta);
        rbtColonesRenta.setText("Colones");
        jPanel1.add(rbtColonesRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 131, -1, -1));

        btgMoneda.add(rbtDolares);
        rbtDolares.setText("Dolares");
        jPanel1.add(rbtDolares, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 131, -1, -1));

        btgTipo.add(rbtGastoRenta);
        rbtGastoRenta.setText("Gasto");
        jPanel1.add(rbtGastoRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        btgTipo.add(rbtVentaRenta);
        rbtVentaRenta.setText("Ventas");
        jPanel1.add(rbtVentaRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, -1, -1));

        jLabel1.setText("Proveedor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 133, -1, -1));

        jLabel2.setText("Fecha de Renta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 49, -1, -1));

        jLabel3.setText("Cédula");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 172, -1, -1));

        jLabel4.setText("Teléfono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 301, -1, -1));

        jLabel5.setText("Nacionalidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 91, -1, -1));

        jLabel6.setText("Número Factura");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 91, -1, -1));

        jLabel7.setText("Descripción");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 217, -1, -1));

        jLabel15.setText("Número de Contratación");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 49, -1, -1));

        jLabel16.setText("Modalidad");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 256, -1, -1));

        jLabel17.setText("Tipo de ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 330, -1, -1));

        jLabel14.setText("Moneda");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 133, -1, -1));

        jLabel19.setText("Subtotal");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 175, -1, -1));

        jLabel20.setText("IVA");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 217, -1, -1));

        jLabel21.setText("Monto total");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 290, -1, -1));

        jLabel35.setText("Ordenar por:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, -1));

        jLabel22.setText("Renta 2%");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 250, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 967, 430));

        tblRenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Número Factura", "Proveedor", "Fecha", "Cédula", "Teléfono", "Nacionalidad", "Descripción", "Subtotal Colones", "Subtotal Dólares", "IVA", "IVA Dólares", "Monto total colones", "Monto total dólares"
            }
        ));
        spnRenta.setViewportView(tblRenta);

        add(spnRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 444, 967, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarRentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarRentaActionPerformed
        jdcFechaRenta.setCalendar(null);
        txtCedulaRenta.setText("");
        txtContratacionRenta.setText("");
        txtDescripcionRenta.setText("");
        txtFacturaRenta.setText("");
        txtIVARenta.setText("");
        txtNacionalidadRenta.setText("");
        txtProveedorRenta.setText("");
        txtSubtotalRenta.setText("");
        txtTelefonoRenta.setText("");
        txtTotalRenta.setText("");
        txtrenta.setText("");
        cmbOrdenRenta.setSelectedIndex(0);
        cbmModalidadRenta.setSelectedIndex(0);
        btgMoneda.clearSelection();        
        btgTipo.clearSelection();
    }//GEN-LAST:event_btnLimpiarRentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgMoneda;
    private javax.swing.ButtonGroup btgTipo;
    private javax.swing.JButton btnBuscarRenta;
    private javax.swing.JButton btnEliminarRenta;
    private javax.swing.JButton btnInsertarRenta;
    private javax.swing.JButton btnLimpiarRenta;
    private javax.swing.JButton btnModificarRenta;
    private javax.swing.JComboBox<String> cbmModalidadRenta;
    private javax.swing.JComboBox<String> cmbOrdenRenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdcFechaRenta;
    private javax.swing.JRadioButton rbtColonesRenta;
    private javax.swing.JRadioButton rbtDolares;
    private javax.swing.JRadioButton rbtGastoRenta;
    private javax.swing.JRadioButton rbtVentaRenta;
    private javax.swing.JScrollPane spnRenta;
    private javax.swing.JTable tblRenta;
    private javax.swing.JTextField txtCedulaRenta;
    private javax.swing.JTextField txtContratacionRenta;
    private javax.swing.JTextField txtDescripcionRenta;
    private javax.swing.JTextField txtFacturaRenta;
    private javax.swing.JTextField txtIVARenta;
    private javax.swing.JTextField txtNacionalidadRenta;
    private javax.swing.JTextField txtProveedorRenta;
    private javax.swing.JTextField txtSubtotalRenta;
    private javax.swing.JTextField txtTelefonoRenta;
    private javax.swing.JTextField txtTotalRenta;
    private javax.swing.JTextField txtrenta;
    // End of variables declaration//GEN-END:variables
}
