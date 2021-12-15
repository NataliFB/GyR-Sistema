package Vista.Paneles;

/**
 * Clase para el panel de Facturas
 *
 * @author
 */
public class Pnl_4 extends javax.swing.JPanel {

    /**
     * Constructor de la clase Pnl_4.<br>
     * Inicializa los objetos que hay dentro del panel.<br>
     * No recibe ningún parametro.
     */
    public Pnl_4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgMoneda = new javax.swing.ButtonGroup();
        btgMetodo = new javax.swing.ButtonGroup();
        pnlPorComprar = new javax.swing.JPanel();
        scpFacturas = new javax.swing.JScrollPane();
        tblFacturas = new javax.swing.JTable();
        PanelControlFacturas = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtBuscarFacturas = new javax.swing.JTextField();
        cmbBusquedaFacturas = new javax.swing.JComboBox<>();
        btnRefrescarFacturas = new javax.swing.JButton();
        PanelBaseFacturas = new javax.swing.JPanel();
        PanelOpcionesFacturas = new javax.swing.JPanel();
        btnInsertarFacturas = new javax.swing.JButton();
        btnModificarFacturas = new javax.swing.JButton();
        btnLimpiarFacturas = new javax.swing.JButton();
        btnEliminarFacturas = new javax.swing.JButton();
        PanelObjetosFacturas = new javax.swing.JPanel();
        rbtTarjeta = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rbtEfectivo = new javax.swing.JRadioButton();
        txtEstadoFacturas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtInstCedidaFacturas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInstitucionFacturas = new javax.swing.JTextField();
        txtObservacionFacturas = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtContratacionFacturas = new javax.swing.JTextField();
        jdcFechaFacturas = new com.toedter.calendar.JDateChooser();
        txtTransferenciaFacturas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRentaFacturas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbtColones = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtMontoFacturas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jdcCanceladoFacturas = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcionFacturas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtBancoFacturas = new javax.swing.JTextField();
        rbtDolares = new javax.swing.JRadioButton();
        codFacturas = new javax.swing.JLabel();

        scpFacturas.setViewportView(tblFacturas);

        PanelControlFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Tabla"));

        jLabel17.setText("Buscar");

        btnRefrescarFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        btnRefrescarFacturas.setText("Refrescar");

        javax.swing.GroupLayout PanelControlFacturasLayout = new javax.swing.GroupLayout(PanelControlFacturas);
        PanelControlFacturas.setLayout(PanelControlFacturasLayout);
        PanelControlFacturasLayout.setHorizontalGroup(
            PanelControlFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlFacturasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBusquedaFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefrescarFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelControlFacturasLayout.setVerticalGroup(
            PanelControlFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlFacturasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtBuscarFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBusquedaFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescarFacturas))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelOpcionesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N

        btnInsertarFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarFacturas.setText("Agregar");

        btnModificarFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarFacturas.setText("Modificar");

        btnLimpiarFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarFacturas.setText("Limpiar");

        btnEliminarFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarFacturas.setText("Eliminar");

        javax.swing.GroupLayout PanelOpcionesFacturasLayout = new javax.swing.GroupLayout(PanelOpcionesFacturas);
        PanelOpcionesFacturas.setLayout(PanelOpcionesFacturasLayout);
        PanelOpcionesFacturasLayout.setHorizontalGroup(
            PanelOpcionesFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesFacturasLayout.createSequentialGroup()
                .addGroup(PanelOpcionesFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesFacturasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEliminarFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesFacturasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiarFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesFacturasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnModificarFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesFacturasLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnInsertarFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelOpcionesFacturasLayout.setVerticalGroup(
            PanelOpcionesFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesFacturasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnInsertarFacturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnModificarFacturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnLimpiarFacturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnEliminarFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        PanelObjetosFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Facturas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        PanelObjetosFacturas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btgMetodo.add(rbtTarjeta);
        rbtTarjeta.setText("Tarjeta");
        PanelObjetosFacturas.add(rbtTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        jLabel1.setText("Moneda:");
        PanelObjetosFacturas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        btgMetodo.add(rbtEfectivo);
        rbtEfectivo.setText("Efectivo");
        PanelObjetosFacturas.add(rbtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));
        PanelObjetosFacturas.add(txtEstadoFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 210, -1));

        jLabel10.setText("Metodo de pago");
        PanelObjetosFacturas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));
        PanelObjetosFacturas.add(txtInstCedidaFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 190, -1));

        jLabel6.setText("Estado");
        PanelObjetosFacturas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel11.setText("Institución cedida");
        PanelObjetosFacturas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        jLabel14.setText("Fecha cancelado");
        PanelObjetosFacturas.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel2.setText("Fecha de Factura");
        PanelObjetosFacturas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        PanelObjetosFacturas.add(txtInstitucionFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 210, -1));
        PanelObjetosFacturas.add(txtObservacionFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 190, -1));

        jLabel13.setText("Banco");
        PanelObjetosFacturas.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));
        PanelObjetosFacturas.add(txtContratacionFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 210, -1));
        PanelObjetosFacturas.add(jdcFechaFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 210, -1));
        PanelObjetosFacturas.add(txtTransferenciaFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 210, -1));

        jLabel5.setText("Monto");
        PanelObjetosFacturas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));
        PanelObjetosFacturas.add(txtRentaFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 190, -1));

        jLabel8.setText("Observacion");
        PanelObjetosFacturas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        btgMoneda.add(rbtColones);
        rbtColones.setText("Colones");
        PanelObjetosFacturas.add(rbtColones, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jLabel7.setText("Renta 2%");
        PanelObjetosFacturas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));
        PanelObjetosFacturas.add(txtMontoFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 190, -1));

        jLabel9.setText("Descripción");
        PanelObjetosFacturas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        PanelObjetosFacturas.add(jdcCanceladoFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 210, -1));

        jLabel3.setText("Institución");
        PanelObjetosFacturas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        PanelObjetosFacturas.add(txtDescripcionFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 210, -1));

        jLabel4.setText("Número de Contratación");
        PanelObjetosFacturas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel12.setText("Transferencia");
        PanelObjetosFacturas.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        PanelObjetosFacturas.add(txtBancoFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 190, -1));

        btgMoneda.add(rbtDolares);
        rbtDolares.setText("Dolares");
        PanelObjetosFacturas.add(rbtDolares, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        javax.swing.GroupLayout PanelBaseFacturasLayout = new javax.swing.GroupLayout(PanelBaseFacturas);
        PanelBaseFacturas.setLayout(PanelBaseFacturasLayout);
        PanelBaseFacturasLayout.setHorizontalGroup(
            PanelBaseFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseFacturasLayout.createSequentialGroup()
                .addComponent(PanelObjetosFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelOpcionesFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBaseFacturasLayout.setVerticalGroup(
            PanelBaseFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseFacturasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelBaseFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PanelOpcionesFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelObjetosFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        codFacturas.setText("NA");

        javax.swing.GroupLayout pnlPorComprarLayout = new javax.swing.GroupLayout(pnlPorComprar);
        pnlPorComprar.setLayout(pnlPorComprarLayout);
        pnlPorComprarLayout.setHorizontalGroup(
            pnlPorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPorComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPorComprarLayout.createSequentialGroup()
                        .addComponent(PanelControlFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codFacturas))
                    .addComponent(scpFacturas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelBaseFacturas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnlPorComprarLayout.setVerticalGroup(
            pnlPorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPorComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBaseFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnlPorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelControlFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codFacturas))
                .addGap(12, 12, 12)
                .addComponent(scpFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlPorComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPorComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBaseFacturas;
    private javax.swing.JPanel PanelControlFacturas;
    private javax.swing.JPanel PanelObjetosFacturas;
    private javax.swing.JPanel PanelOpcionesFacturas;
    public javax.swing.ButtonGroup btgMetodo;
    public javax.swing.ButtonGroup btgMoneda;
    public javax.swing.JButton btnEliminarFacturas;
    public javax.swing.JButton btnInsertarFacturas;
    public javax.swing.JButton btnLimpiarFacturas;
    public javax.swing.JButton btnModificarFacturas;
    private javax.swing.JButton btnRefrescarFacturas;
    private javax.swing.JComboBox<String> cmbBusquedaFacturas;
    private javax.swing.JLabel codFacturas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public com.toedter.calendar.JDateChooser jdcCanceladoFacturas;
    public com.toedter.calendar.JDateChooser jdcFechaFacturas;
    private javax.swing.JPanel pnlPorComprar;
    public javax.swing.JRadioButton rbtColones;
    public javax.swing.JRadioButton rbtDolares;
    public javax.swing.JRadioButton rbtEfectivo;
    public javax.swing.JRadioButton rbtTarjeta;
    private javax.swing.JScrollPane scpFacturas;
    private javax.swing.JTable tblFacturas;
    public javax.swing.JTextField txtBancoFacturas;
    private javax.swing.JTextField txtBuscarFacturas;
    public javax.swing.JTextField txtContratacionFacturas;
    public javax.swing.JTextField txtDescripcionFacturas;
    public javax.swing.JTextField txtEstadoFacturas;
    public javax.swing.JTextField txtInstCedidaFacturas;
    public javax.swing.JTextField txtInstitucionFacturas;
    public javax.swing.JTextField txtMontoFacturas;
    public javax.swing.JTextField txtObservacionFacturas;
    public javax.swing.JTextField txtRentaFacturas;
    public javax.swing.JTextField txtTransferenciaFacturas;
    // End of variables declaration//GEN-END:variables
}
