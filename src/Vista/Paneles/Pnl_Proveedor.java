
package Vista.Paneles;

public class Pnl_Proveedor extends javax.swing.JPanel {

    public Pnl_Proveedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtTelProv = new javax.swing.JTextField();
        txtContProv = new javax.swing.JTextField();
        txtCorreoProv = new javax.swing.JTextField();
        txtProvReal = new javax.swing.JTextField();
        txtCelProv = new javax.swing.JTextField();
        txtUbicacionProv = new javax.swing.JTextField();
        txtProvFantasia = new javax.swing.JTextField();
        cmbOrdenProv = new javax.swing.JComboBox<>();
        btnAgregarCuentaBanco = new javax.swing.JButton();
        btnModificarProv = new javax.swing.JButton();
        btnBuscarProv = new javax.swing.JButton();
        btnLimpiarProv = new javax.swing.JButton();
        btnEliminarProv = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCedProv1 = new javax.swing.JTextField();
        scpObservacionesProv = new javax.swing.JScrollPane();
        txaObservacionProv = new javax.swing.JTextArea();
        btnInsertarProv1 = new javax.swing.JButton();
        btnAgregarArt = new javax.swing.JButton();
        spnProveedor = new javax.swing.JScrollPane();
        tblProv = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtTelProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 250, -1));
        jPanel3.add(txtContProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 250, -1));
        jPanel3.add(txtCorreoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 250, -1));
        jPanel3.add(txtProvReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 250, -1));
        jPanel3.add(txtCelProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 250, -1));
        jPanel3.add(txtUbicacionProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 250, -1));
        jPanel3.add(txtProvFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 250, -1));

        cmbOrdenProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número Orden", "Descripción", "Días de entrega", "Orden", "Facturado", "Entregado" }));
        jPanel3.add(cmbOrdenProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 357, 250, -1));

        btnAgregarCuentaBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        btnAgregarCuentaBanco.setText("Agregar Cuentas y Bancos");
        jPanel3.add(btnAgregarCuentaBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, 40));

        btnModificarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarProv.setText("Modificar");
        jPanel3.add(btnModificarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        btnBuscarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscarProv.setText("Buscar");
        jPanel3.add(btnBuscarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        btnLimpiarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarProv.setText("Limpiar");
        jPanel3.add(btnLimpiarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        btnEliminarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarProv.setText("Eliminar");
        jPanel3.add(btnEliminarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, 33));

        jLabel8.setText("Celular");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel13.setText("Correo");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel24.setText("Proveedor Real");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel28.setText("Observaciones");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel29.setText("Cédula");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel30.setText("Contacto");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jLabel31.setText("Ubicación");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jLabel25.setText("Proveedor Fantasía");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel35.setText("Ordenar por:");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 357, -1, -1));

        jLabel17.setText("Teléfono");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel3.add(txtCedProv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 250, -1));

        txaObservacionProv.setColumns(20);
        txaObservacionProv.setRows(5);
        scpObservacionesProv.setViewportView(txaObservacionProv);

        jPanel3.add(scpObservacionesProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 250, -1));

        btnInsertarProv1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarProv1.setText("Agregar");
        jPanel3.add(btnInsertarProv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        btnAgregarArt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        btnAgregarArt.setText("Ver Artículos");
        jPanel3.add(btnAgregarArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 970, 400));

        tblProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Proveedor", "Cédula", "Correo", "Contacto", "Teléfono", "Ubicación", "Artículos", "Observaciones"
            }
        ));
        spnProveedor.setViewportView(tblProv);

        jPanel2.add(spnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 414, 967, 210));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarArt;
    public javax.swing.JButton btnAgregarCuentaBanco;
    public javax.swing.JButton btnBuscarProv;
    public javax.swing.JButton btnEliminarProv;
    public javax.swing.JButton btnInsertarProv1;
    public javax.swing.JButton btnLimpiarProv;
    public javax.swing.JButton btnModificarProv;
    public javax.swing.JComboBox<String> cmbOrdenProv;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane scpObservacionesProv;
    private javax.swing.JScrollPane spnProveedor;
    public javax.swing.JTable tblProv;
    public javax.swing.JTextArea txaObservacionProv;
    public javax.swing.JTextField txtCedProv1;
    public javax.swing.JTextField txtCelProv;
    public javax.swing.JTextField txtContProv;
    public javax.swing.JTextField txtCorreoProv;
    public javax.swing.JTextField txtProvFantasia;
    public javax.swing.JTextField txtProvReal;
    public javax.swing.JTextField txtTelProv;
    public javax.swing.JTextField txtUbicacionProv;
    // End of variables declaration//GEN-END:variables
}
