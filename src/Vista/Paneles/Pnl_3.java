
package Vista.Paneles;

public class Pnl_3 extends javax.swing.JPanel {

    public Pnl_3() {
        initComponents();
        setSize(getPreferredSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtProveedorReal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        txtMontoOfertado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroContrato = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBanco1 = new javax.swing.JTextField();
        txtObjeto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCuentas1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtBanco3 = new javax.swing.JTextField();
        txtCuentas3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBanco2 = new javax.swing.JTextField();
        txtCuentas2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtProveedorFan = new javax.swing.JTextField();
        btnInsertarDemanda = new javax.swing.JButton();
        btnModificarDemanda = new javax.swing.JButton();
        btnBuscarDemanda = new javax.swing.JButton();
        btnLimpiarDemanda = new javax.swing.JButton();
        btnEliminarDemanda = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        cmbOrdenDemanda = new javax.swing.JComboBox<>();
        scpObservacionesDemanda = new javax.swing.JScrollPane();
        txaObservacionesDemanda = new javax.swing.JTextArea();
        jLabel43 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Número Contratación", "Proveedor", "Objeto", "Costo", "Monto Ofertado", "Cuentas", "Banco", "Observación"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 427, 967, 197));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Por comprar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Prov. Real");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 250, -1, 14));

        txtProveedorReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorRealActionPerformed(evt);
            }
        });
        jPanel1.add(txtProveedorReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 246, 190, -1));

        jLabel6.setText("Banco 1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel1.setText("Número contratación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 39, -1, -1));
        jPanel1.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 204, 190, -1));
        jPanel1.add(txtMontoOfertado, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 120, 190, -1));

        jLabel2.setText("Monto ofertado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, -1, -1));
        jPanel1.add(txtNumeroContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 36, 190, -1));

        jLabel8.setText("Cuenta 1");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jLabel3.setText("Objeto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 81, -1, -1));

        txtBanco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBanco1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtBanco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 190, -1));
        jPanel1.add(txtObjeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 78, 190, -1));

        jLabel4.setText("Costo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 207, -1, -1));
        jPanel1.add(txtCuentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 190, -1));

        jLabel10.setText("Cedula juridica");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 162, 190, -1));

        jLabel11.setText("Banco 3");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jLabel12.setText("Cuenta 3");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        txtBanco3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBanco3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtBanco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 190, -1));
        jPanel1.add(txtCuentas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 190, -1));

        jLabel13.setText("Banco 2");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jLabel14.setText("Cuenta 2");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        txtBanco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBanco2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtBanco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 190, -1));
        jPanel1.add(txtCuentas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 190, -1));

        jLabel15.setText("Prov. Fantasía");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 292, -1, 14));

        txtProveedorFan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorFanActionPerformed(evt);
            }
        });
        jPanel1.add(txtProveedorFan, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 288, 190, -1));

        btnInsertarDemanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarDemanda.setText("Agregar");
        jPanel1.add(btnInsertarDemanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        btnModificarDemanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarDemanda.setText("Modificar");
        jPanel1.add(btnModificarDemanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        btnBuscarDemanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscarDemanda.setText("Buscar");
        jPanel1.add(btnBuscarDemanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        btnLimpiarDemanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarDemanda.setText("Limpiar");
        jPanel1.add(btnLimpiarDemanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        btnEliminarDemanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarDemanda.setText("Eliminar");
        jPanel1.add(btnEliminarDemanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, 33));

        jLabel35.setText("Ordenar por:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, -1, -1));

        cmbOrdenDemanda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número Orden", "Descripción", "Días de entrega", "Orden", "Facturado", "Entregado" }));
        jPanel1.add(cmbOrdenDemanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 250, -1));

        txaObservacionesDemanda.setColumns(20);
        txaObservacionesDemanda.setRows(5);
        scpObservacionesDemanda.setViewportView(txaObservacionesDemanda);

        jPanel1.add(scpObservacionesDemanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 250, -1));

        jLabel43.setText("Observación");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 967, 415));
    }// </editor-fold>//GEN-END:initComponents

    private void txtProveedorRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorRealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorRealActionPerformed

    private void txtBanco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBanco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBanco1ActionPerformed

    private void txtBanco3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBanco3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBanco3ActionPerformed

    private void txtBanco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBanco2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBanco2ActionPerformed

    private void txtProveedorFanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorFanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorFanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarDemanda;
    private javax.swing.JButton btnEliminarDemanda;
    private javax.swing.JButton btnInsertarDemanda;
    private javax.swing.JButton btnLimpiarDemanda;
    private javax.swing.JButton btnModificarDemanda;
    private javax.swing.JComboBox<String> cmbOrdenDemanda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane scpObservacionesDemanda;
    private javax.swing.JTextArea txaObservacionesDemanda;
    private javax.swing.JTextField txtBanco1;
    private javax.swing.JTextField txtBanco2;
    private javax.swing.JTextField txtBanco3;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtCuentas1;
    private javax.swing.JTextField txtCuentas2;
    private javax.swing.JTextField txtCuentas3;
    private javax.swing.JTextField txtMontoOfertado;
    private javax.swing.JTextField txtNumeroContrato;
    private javax.swing.JTextField txtObjeto;
    private javax.swing.JTextField txtProveedorFan;
    private javax.swing.JTextField txtProveedorReal;
    // End of variables declaration//GEN-END:variables
}
