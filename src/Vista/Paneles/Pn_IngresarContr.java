
package Vista.Paneles;

public class Pn_IngresarContr extends javax.swing.JPanel {


    public Pn_IngresarContr() {
        initComponents();
        setSize(getPreferredSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgEstado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        spnContratacion = new javax.swing.JScrollPane();
        txaContratacion = new javax.swing.JTextArea();
        spnDescripcion = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        txtFechaPublicacion = new javax.swing.JTextField();
        txtFechaApertura = new javax.swing.JTextField();
        txtResponsable = new javax.swing.JTextField();
        rbtEnviada = new javax.swing.JRadioButton();
        rbtDescartada = new javax.swing.JRadioButton();
        btnInsertarContratacion = new javax.swing.JButton();
        btnModificarContratacion = new javax.swing.JButton();
        btnBuscarContratacion = new javax.swing.JButton();
        btnLimpiarContratacion = new javax.swing.JButton();
        btnEliminarContratacion = new javax.swing.JButton();
        cmbOrdenContratacion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        spnContrataciones = new javax.swing.JScrollPane();
        tblContrataciones = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Contratación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txaContratacion.setColumns(20);
        txaContratacion.setRows(5);
        spnContratacion.setViewportView(txaContratacion);

        jPanel1.add(spnContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 280, 100));

        txaDescripcion.setColumns(20);
        txaDescripcion.setRows(5);
        spnDescripcion.setViewportView(txaDescripcion);

        jPanel1.add(spnDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 280, 100));
        jPanel1.add(txtFechaPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 280, -1));
        jPanel1.add(txtFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 280, -1));
        jPanel1.add(txtResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 280, -1));

        btgEstado.add(rbtEnviada);
        rbtEnviada.setText("Enviada");
        jPanel1.add(rbtEnviada, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        btgEstado.add(rbtDescartada);
        rbtDescartada.setText("Descartada");
        jPanel1.add(rbtDescartada, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, -1));

        btnInsertarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarContratacion.setText("Agregar");
        btnInsertarContratacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarContratacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertarContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btnModificarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarContratacion.setText("Modificar");
        jPanel1.add(btnModificarContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        btnBuscarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscarContratacion.setText("Buscar");
        jPanel1.add(btnBuscarContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        btnLimpiarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarContratacion.setText("Limpiar");
        jPanel1.add(btnLimpiarContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        btnEliminarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarContratacion.setText("Eliminar");
        jPanel1.add(btnEliminarContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, 33));

        cmbOrdenContratacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "Fecha y hora de apertura", "Número Orden", "Descripción", "Días de entrega", "Orden", "Facturado", "Entregado" }));
        cmbOrdenContratacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrdenContratacionActionPerformed(evt);
            }
        });
        jPanel1.add(cmbOrdenContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 307, 250, -1));

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

        jLabel35.setText("Ordenar por:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 970, 350));

        tblContrataciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° de Contratación", "Descripción", "Fecha de Publicación", "Fecha de Apertura", "Estado del Concurso", "Responsable", "Estado"
            }
        ));
        spnContrataciones.setViewportView(tblContrataciones);

        add(spnContrataciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 364, 967, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarContratacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarContratacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertarContratacionActionPerformed

    private void cmbOrdenContratacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrdenContratacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOrdenContratacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgEstado;
    public javax.swing.JButton btnBuscarContratacion;
    public javax.swing.JButton btnEliminarContratacion;
    public javax.swing.JButton btnInsertarContratacion;
    public javax.swing.JButton btnLimpiarContratacion;
    public javax.swing.JButton btnModificarContratacion;
    private javax.swing.JComboBox<String> cmbOrdenContratacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtDescartada;
    private javax.swing.JRadioButton rbtEnviada;
    private javax.swing.JScrollPane spnContratacion;
    private javax.swing.JScrollPane spnContrataciones;
    private javax.swing.JScrollPane spnDescripcion;
    public javax.swing.JTable tblContrataciones;
    public javax.swing.JTextArea txaContratacion;
    public javax.swing.JTextArea txaDescripcion;
    public javax.swing.JTextField txtFechaApertura;
    public javax.swing.JTextField txtFechaPublicacion;
    private javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables
}
