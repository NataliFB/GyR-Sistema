
package Vista.Paneles;

public class Pn_IngresarContr extends javax.swing.JPanel {

    public Pn_IngresarContr() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgEstado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        spnDescripcion = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        txtFechaPublicacion = new javax.swing.JTextField();
        txtFechaApertura = new javax.swing.JTextField();
        txtResponsable = new javax.swing.JTextField();
        txtContratacion = new javax.swing.JTextField();
        txtInstitucion = new javax.swing.JTextField();
        rbtEnviada = new javax.swing.JRadioButton();
        rbtDescartada = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnInsertarContratacion = new javax.swing.JButton();
        btnModificarContratacion = new javax.swing.JButton();
        btnLimpiarContratacion = new javax.swing.JButton();
        btnEliminarContratacion = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContrataciones = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscarContratacion = new javax.swing.JButton();
        cmbBusqueda = new javax.swing.JComboBox<>();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Contratación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txaDescripcion.setColumns(20);
        txaDescripcion.setRows(5);
        spnDescripcion.setViewportView(txaDescripcion);

        jPanel1.add(spnDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 280, 100));
        jPanel1.add(txtFechaPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 280, -1));
        jPanel1.add(txtFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 280, -1));
        jPanel1.add(txtResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 280, -1));
        jPanel1.add(txtContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 280, -1));
        jPanel1.add(txtInstitucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 280, -1));

        btgEstado.add(rbtEnviada);
        rbtEnviada.setText("Enviada");
        jPanel1.add(rbtEnviada, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        btgEstado.add(rbtDescartada);
        rbtDescartada.setText("Descartada");
        jPanel1.add(rbtDescartada, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, -1));

        jLabel1.setText("Número de Contratación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setText("Descripción");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jLabel3.setText("Fecha de publicación");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel4.setText("Fecha de Apertura");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel6.setText("Responsable");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        jLabel7.setText("Estado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        jLabel5.setText("Institución");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsertarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarContratacion.setText("Agregar");
        jPanel4.add(btnInsertarContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, -1));

        btnModificarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarContratacion.setText("Modificar");
        jPanel4.add(btnModificarContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 230, -1));

        btnLimpiarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarContratacion.setText("Limpiar");
        jPanel4.add(btnLimpiarContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 230, -1));

        btnEliminarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarContratacion.setText("Eliminar");
        jPanel4.add(btnEliminarContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 230, 33));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Contrataciones completas", jPanel2);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(tblContrataciones);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Contrataciones agregadas", jPanel3);

        jLabel8.setText("Buscar");

        btnBuscarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        btnBuscarContratacion.setText("Refrescar");

        cmbBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contratación", "Institución", "Descripción", "Fecha de Publicación", "Fecha de Apertura", "Estado" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(cmbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(15, 15, 15)
                                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(240, 240, 240)
                                        .addComponent(btnBuscarContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTabbedPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(270, 270, 270)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarContratacion)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(cmbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup btgEstado;
    private javax.swing.JButton btnBuscarContratacion;
    public javax.swing.JButton btnEliminarContratacion;
    public javax.swing.JButton btnInsertarContratacion;
    public javax.swing.JButton btnLimpiarContratacion;
    public javax.swing.JButton btnModificarContratacion;
    public javax.swing.JComboBox<String> cmbBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JRadioButton rbtDescartada;
    public javax.swing.JRadioButton rbtEnviada;
    private javax.swing.JScrollPane spnDescripcion;
    public javax.swing.JTable tblContrataciones;
    public javax.swing.JTextArea txaDescripcion;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtContratacion;
    public javax.swing.JTextField txtFechaApertura;
    public javax.swing.JTextField txtFechaPublicacion;
    public javax.swing.JTextField txtInstitucion;
    private javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables
}
