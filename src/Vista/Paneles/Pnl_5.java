package Vista.Paneles;

/**
 * Clase para el panel de Renta
 *
 * @author Aaron
 */
public class Pnl_5 extends javax.swing.JPanel {

    /**
     * Constructor de la clase Pnl_5.<br>
     * Inicializa los objetos que hay dentro del panel.<br>
     * No recibe ningún parametro.
     */
    public Pnl_5() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgMoneda = new javax.swing.ButtonGroup();
        btgTipo = new javax.swing.ButtonGroup();
        pnlRenta = new javax.swing.JPanel();
        scpRenta = new javax.swing.JScrollPane();
        tblRenta = new javax.swing.JTable();
        PanelControlRenta = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtBuscarRenta = new javax.swing.JTextField();
        cmbBusquedaRenta = new javax.swing.JComboBox<>();
        btnRefrescarRenta = new javax.swing.JButton();
        PanelBaseRenta = new javax.swing.JPanel();
        PanelOpcionesRenta = new javax.swing.JPanel();
        btnInsertarRenta = new javax.swing.JButton();
        btnModificarRenta = new javax.swing.JButton();
        btnLimpiarRenta = new javax.swing.JButton();
        btnEliminarRenta = new javax.swing.JButton();
        PanelObjetosRenta = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTelefonoRenta = new javax.swing.JTextField();
        cbmModalidadRenta = new javax.swing.JComboBox<>();
        txtDescripcionRenta = new javax.swing.JTextField();
        txtCedulaRenta = new javax.swing.JTextField();
        txtProveedorRenta = new javax.swing.JTextField();
        txtFacturaRenta = new javax.swing.JTextField();
        txtContratacionRenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        rbtGastoRenta = new javax.swing.JRadioButton();
        rbtVentaRenta = new javax.swing.JRadioButton();
        txtTotalRenta = new javax.swing.JTextField();
        txtrenta = new javax.swing.JTextField();
        txtIVARenta = new javax.swing.JTextField();
        txtSubtotalRenta = new javax.swing.JTextField();
        rbtColonesRenta = new javax.swing.JRadioButton();
        txtNacionalidadRenta = new javax.swing.JTextField();
        jdcFechaRenta = new com.toedter.calendar.JDateChooser();
        rbtDolares = new javax.swing.JRadioButton();
        codRenta = new javax.swing.JLabel();

        scpRenta.setViewportView(tblRenta);

        PanelControlRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Tabla"));

        jLabel17.setText("Buscar");

        btnRefrescarRenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        btnRefrescarRenta.setText("Refrescar");

        javax.swing.GroupLayout PanelControlRentaLayout = new javax.swing.GroupLayout(PanelControlRenta);
        PanelControlRenta.setLayout(PanelControlRentaLayout);
        PanelControlRentaLayout.setHorizontalGroup(
            PanelControlRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlRentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBusquedaRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefrescarRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelControlRentaLayout.setVerticalGroup(
            PanelControlRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlRentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtBuscarRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBusquedaRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescarRenta))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelOpcionesRenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N

        btnInsertarRenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarRenta.setText("Agregar");

        btnModificarRenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarRenta.setText("Modificar");

        btnLimpiarRenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarRenta.setText("Limpiar");

        btnEliminarRenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarRenta.setText("Eliminar");

        javax.swing.GroupLayout PanelOpcionesRentaLayout = new javax.swing.GroupLayout(PanelOpcionesRenta);
        PanelOpcionesRenta.setLayout(PanelOpcionesRentaLayout);
        PanelOpcionesRentaLayout.setHorizontalGroup(
            PanelOpcionesRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesRentaLayout.createSequentialGroup()
                .addGroup(PanelOpcionesRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesRentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEliminarRenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesRentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiarRenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesRentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnModificarRenta, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesRentaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnInsertarRenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelOpcionesRentaLayout.setVerticalGroup(
            PanelOpcionesRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesRentaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnInsertarRenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnModificarRenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnLimpiarRenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnEliminarRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        PanelObjetosRenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Renta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        PanelObjetosRenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Número de Contratación");
        PanelObjetosRenta.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel6.setText("Número Factura");
        PanelObjetosRenta.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel1.setText("Proveedor");
        PanelObjetosRenta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel3.setText("Cédula");
        PanelObjetosRenta.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel7.setText("Descripción");
        PanelObjetosRenta.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel16.setText("Modalidad");
        PanelObjetosRenta.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel4.setText("Teléfono");
        PanelObjetosRenta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        PanelObjetosRenta.add(txtTelefonoRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 210, -1));

        cbmModalidadRenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Según Demanda", "Cantidad Definida", "Del 50%", "Parcial" }));
        PanelObjetosRenta.add(cbmModalidadRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 210, -1));
        PanelObjetosRenta.add(txtDescripcionRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 210, -1));
        PanelObjetosRenta.add(txtCedulaRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 210, -1));
        PanelObjetosRenta.add(txtProveedorRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 210, -1));
        PanelObjetosRenta.add(txtFacturaRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 210, -1));
        PanelObjetosRenta.add(txtContratacionRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 210, -1));

        jLabel2.setText("Fecha de Renta");
        PanelObjetosRenta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jLabel5.setText("Nacionalidad");
        PanelObjetosRenta.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jLabel14.setText("Moneda");
        PanelObjetosRenta.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel19.setText("Subtotal");
        PanelObjetosRenta.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        jLabel20.setText("IVA");
        PanelObjetosRenta.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jLabel22.setText("Renta 2%");
        PanelObjetosRenta.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        jLabel21.setText("Monto total");
        PanelObjetosRenta.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jLabel18.setText("Tipo de ");
        PanelObjetosRenta.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        btgTipo.add(rbtGastoRenta);
        rbtGastoRenta.setText("Gasto");
        PanelObjetosRenta.add(rbtGastoRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        btgTipo.add(rbtVentaRenta);
        rbtVentaRenta.setText("Ventas");
        PanelObjetosRenta.add(rbtVentaRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, -1, -1));
        PanelObjetosRenta.add(txtTotalRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 220, -1));
        PanelObjetosRenta.add(txtrenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 220, -1));
        PanelObjetosRenta.add(txtIVARenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 220, -1));
        PanelObjetosRenta.add(txtSubtotalRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 220, -1));

        btgMoneda.add(rbtColonesRenta);
        rbtColonesRenta.setText("Colones");
        PanelObjetosRenta.add(rbtColonesRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));
        PanelObjetosRenta.add(txtNacionalidadRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 220, -1));
        PanelObjetosRenta.add(jdcFechaRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 220, -1));

        btgMoneda.add(rbtDolares);
        rbtDolares.setText("Dolares");
        PanelObjetosRenta.add(rbtDolares, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, -1));

        javax.swing.GroupLayout PanelBaseRentaLayout = new javax.swing.GroupLayout(PanelBaseRenta);
        PanelBaseRenta.setLayout(PanelBaseRentaLayout);
        PanelBaseRentaLayout.setHorizontalGroup(
            PanelBaseRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseRentaLayout.createSequentialGroup()
                .addComponent(PanelObjetosRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelOpcionesRenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBaseRentaLayout.setVerticalGroup(
            PanelBaseRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseRentaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelBaseRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PanelOpcionesRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelObjetosRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        codRenta.setText("NA");

        javax.swing.GroupLayout pnlRentaLayout = new javax.swing.GroupLayout(pnlRenta);
        pnlRenta.setLayout(pnlRentaLayout);
        pnlRentaLayout.setHorizontalGroup(
            pnlRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRentaLayout.createSequentialGroup()
                        .addComponent(PanelControlRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codRenta))
                    .addComponent(scpRenta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelBaseRenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnlRentaLayout.setVerticalGroup(
            pnlRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBaseRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnlRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelControlRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codRenta))
                .addGap(12, 12, 12)
                .addComponent(scpRenta, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlRenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBaseRenta;
    private javax.swing.JPanel PanelControlRenta;
    private javax.swing.JPanel PanelObjetosRenta;
    private javax.swing.JPanel PanelOpcionesRenta;
    public javax.swing.ButtonGroup btgMoneda;
    public javax.swing.ButtonGroup btgTipo;
    public javax.swing.JButton btnEliminarRenta;
    public javax.swing.JButton btnInsertarRenta;
    public javax.swing.JButton btnLimpiarRenta;
    public javax.swing.JButton btnModificarRenta;
    public javax.swing.JButton btnRefrescarRenta;
    public javax.swing.JComboBox<String> cbmModalidadRenta;
    public javax.swing.JComboBox<String> cmbBusquedaRenta;
    public javax.swing.JLabel codRenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public com.toedter.calendar.JDateChooser jdcFechaRenta;
    private javax.swing.JPanel pnlRenta;
    public javax.swing.JRadioButton rbtColonesRenta;
    public javax.swing.JRadioButton rbtDolares;
    public javax.swing.JRadioButton rbtGastoRenta;
    public javax.swing.JRadioButton rbtVentaRenta;
    public javax.swing.JScrollPane scpRenta;
    public javax.swing.JTable tblRenta;
    public javax.swing.JTextField txtBuscarRenta;
    public javax.swing.JTextField txtCedulaRenta;
    public javax.swing.JTextField txtContratacionRenta;
    public javax.swing.JTextField txtDescripcionRenta;
    public javax.swing.JTextField txtFacturaRenta;
    public javax.swing.JTextField txtIVARenta;
    public javax.swing.JTextField txtNacionalidadRenta;
    public javax.swing.JTextField txtProveedorRenta;
    public javax.swing.JTextField txtSubtotalRenta;
    public javax.swing.JTextField txtTelefonoRenta;
    public javax.swing.JTextField txtTotalRenta;
    public javax.swing.JTextField txtrenta;
    // End of variables declaration//GEN-END:variables
}
