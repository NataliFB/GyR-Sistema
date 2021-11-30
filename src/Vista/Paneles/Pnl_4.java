
package Vista.Paneles;

public class Pnl_4 extends javax.swing.JPanel {

    public Pnl_4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgMoneda = new javax.swing.ButtonGroup();
        btgMetodo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtContratacionFacturas = new javax.swing.JTextField();
        txtDescripcionFacturas = new javax.swing.JTextField();
        txtTransferenciaFacturas = new javax.swing.JTextField();
        txtEstadoFacturas = new javax.swing.JTextField();
        txtInstitucionFacturas = new javax.swing.JTextField();
        txtMontoFacturas = new javax.swing.JTextField();
        txtRentaFacturas = new javax.swing.JTextField();
        txtInstCedidaFacturas = new javax.swing.JTextField();
        txtBancoFacturas = new javax.swing.JTextField();
        txtObservacionFacturas = new javax.swing.JTextField();
        jdcFechaFacturas = new com.toedter.calendar.JDateChooser();
        jdcCanceladoFacturas = new com.toedter.calendar.JDateChooser();
        rbtColones = new javax.swing.JRadioButton();
        rbtDolares = new javax.swing.JRadioButton();
        rbtTarjeta = new javax.swing.JRadioButton();
        rbtEfectivo = new javax.swing.JRadioButton();
        btnInsertarFacturas = new javax.swing.JButton();
        btnModificarFacturas = new javax.swing.JButton();
        btnBuscarFacturas = new javax.swing.JButton();
        btnLimpiarFacturas = new javax.swing.JButton();
        btnEliminarFacturas = new javax.swing.JButton();
        cmbOrdenFacturas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spnFacturas = new javax.swing.JScrollPane();
        tblFacturas = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Facturas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtContratacionFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 190, -1));
        jPanel1.add(txtDescripcionFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 190, -1));
        jPanel1.add(txtTransferenciaFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 190, -1));
        jPanel1.add(txtEstadoFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 190, -1));
        jPanel1.add(txtInstitucionFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 190, -1));
        jPanel1.add(txtMontoFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 190, -1));
        jPanel1.add(txtRentaFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 190, -1));
        jPanel1.add(txtInstCedidaFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 190, -1));
        jPanel1.add(txtBancoFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 190, -1));
        jPanel1.add(txtObservacionFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 190, -1));
        jPanel1.add(jdcFechaFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 190, -1));
        jPanel1.add(jdcCanceladoFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 190, -1));

        btgMoneda.add(rbtColones);
        rbtColones.setText("Colones");
        jPanel1.add(rbtColones, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));

        btgMoneda.add(rbtDolares);
        rbtDolares.setText("Dolares");
        jPanel1.add(rbtDolares, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, -1));

        btgMetodo.add(rbtTarjeta);
        rbtTarjeta.setText("Tarjeta");
        jPanel1.add(rbtTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, -1, -1));

        btgMetodo.add(rbtEfectivo);
        rbtEfectivo.setText("Efectivo");
        jPanel1.add(rbtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        btnInsertarFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarFacturas.setText("Agregar");
        jPanel1.add(btnInsertarFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        btnModificarFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarFacturas.setText("Modificar");
        jPanel1.add(btnModificarFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        btnBuscarFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscarFacturas.setText("Buscar");
        jPanel1.add(btnBuscarFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        btnLimpiarFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarFacturas.setText("Limpiar");
        jPanel1.add(btnLimpiarFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        btnEliminarFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarFacturas.setText("Eliminar");
        jPanel1.add(btnEliminarFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, 33));

        cmbOrdenFacturas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número Orden", "Descripción", "Días de entrega", "Orden", "Facturado", "Entregado" }));
        jPanel1.add(cmbOrdenFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 250, -1));

        jLabel2.setText("Fecha de Factura");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 130, -1, -1));

        jLabel3.setText("Institución");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 90, -1, -1));

        jLabel4.setText("Número de Contratación");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 49, -1, -1));

        jLabel5.setText("Monto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 91, -1, -1));

        jLabel7.setText("Renta 2%");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 133, -1, -1));

        jLabel9.setText("Descripción");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 170, -1, -1));

        jLabel11.setText("Institución cedida");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 217, -1, -1));

        jLabel12.setText("Transferencia");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 210, -1, -1));

        jLabel13.setText("Banco");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 259, -1, -1));

        jLabel14.setText("Fecha cancelado");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 300, -1, -1));

        jLabel1.setText("Moneda:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        jLabel6.setText("Estado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 260, -1, -1));

        jLabel8.setText("Observacion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 301, -1, -1));

        jLabel35.setText("Ordenar por:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, -1));

        jLabel10.setText("Metodo de pago");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 967, 399));

        tblFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Institución", "Contratación", "Monto Colones", "Monto Dolares", "Renta 2%", "Descripción", "Estado", "Institución cedida", "Transferencia", "Banco", "Fecha Cancelado", "Efectivo"
            }
        ));
        spnFacturas.setViewportView(tblFacturas);

        add(spnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 960, 210));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup btgMetodo;
    public javax.swing.ButtonGroup btgMoneda;
    public javax.swing.JButton btnBuscarFacturas;
    public javax.swing.JButton btnEliminarFacturas;
    public javax.swing.JButton btnInsertarFacturas;
    public javax.swing.JButton btnLimpiarFacturas;
    public javax.swing.JButton btnModificarFacturas;
    public javax.swing.JComboBox<String> cmbOrdenFacturas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public com.toedter.calendar.JDateChooser jdcCanceladoFacturas;
    public com.toedter.calendar.JDateChooser jdcFechaFacturas;
    public javax.swing.JRadioButton rbtColones;
    public javax.swing.JRadioButton rbtDolares;
    public javax.swing.JRadioButton rbtEfectivo;
    public javax.swing.JRadioButton rbtTarjeta;
    private javax.swing.JScrollPane spnFacturas;
    public javax.swing.JTable tblFacturas;
    public javax.swing.JTextField txtBancoFacturas;
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
