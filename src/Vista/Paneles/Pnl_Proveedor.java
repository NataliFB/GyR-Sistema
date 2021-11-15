
package Vista.Paneles;

/**
 *
 * @author Aaron
 */
public class Pnl_Proveedor extends javax.swing.JPanel {

    public Pnl_Proveedor() {
        initComponents();
        setSize(getPreferredSize());
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
        txtCedProv = new javax.swing.JTextField();
        txtUbicacionProv = new javax.swing.JTextField();
        txtProvFantasia = new javax.swing.JTextField();
        txtCuenta1 = new javax.swing.JTextField();
        txtBanco1 = new javax.swing.JTextField();
        txtCuenta2 = new javax.swing.JTextField();
        txtBanco2 = new javax.swing.JTextField();
        txtBanco3 = new javax.swing.JTextField();
        txtCuenta3 = new javax.swing.JTextField();
        spnProv = new javax.swing.JScrollPane();
        txtaObservacionesProv = new javax.swing.JTextArea();
        spnArticulos = new javax.swing.JScrollPane();
        txaArticulos = new javax.swing.JTextArea();
        cmbOrdenProv = new javax.swing.JComboBox<>();
        btnInsertarProv = new javax.swing.JButton();
        btnModificarProv = new javax.swing.JButton();
        btnBuscarProv = new javax.swing.JButton();
        btnLimpiarProv = new javax.swing.JButton();
        btnEliminarProv = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        spnProveedor = new javax.swing.JScrollPane();
        tblProv = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtTelProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 250, -1));
        jPanel3.add(txtContProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 250, -1));
        jPanel3.add(txtCorreoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 250, -1));
        jPanel3.add(txtProvReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 250, -1));
        jPanel3.add(txtCedProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 250, -1));
        jPanel3.add(txtUbicacionProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 275, 250, -1));

        txtProvFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvFantasiaActionPerformed(evt);
            }
        });
        jPanel3.add(txtProvFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 250, -1));

        txtCuenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuenta1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 250, -1));

        txtBanco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBanco1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtBanco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 250, -1));

        txtCuenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuenta2ActionPerformed(evt);
            }
        });
        jPanel3.add(txtCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 250, -1));

        txtBanco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBanco2ActionPerformed(evt);
            }
        });
        jPanel3.add(txtBanco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 250, -1));

        txtBanco3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBanco3ActionPerformed(evt);
            }
        });
        jPanel3.add(txtBanco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 250, -1));

        txtCuenta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuenta3ActionPerformed(evt);
            }
        });
        jPanel3.add(txtCuenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 250, -1));

        txtaObservacionesProv.setColumns(20);
        txtaObservacionesProv.setRows(5);
        spnProv.setViewportView(txtaObservacionesProv);

        jPanel3.add(spnProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 275, 250, 46));

        txaArticulos.setColumns(20);
        txaArticulos.setRows(5);
        spnArticulos.setViewportView(txaArticulos);

        jPanel3.add(spnArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 250, 46));

        cmbOrdenProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número Orden", "Descripción", "Días de entrega", "Orden", "Facturado", "Entregado" }));
        jPanel3.add(cmbOrdenProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 250, -1));

        btnInsertarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarProv.setText("Agregar");
        jPanel3.add(btnInsertarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        btnModificarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarProv.setText("Modificar");
        jPanel3.add(btnModificarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        btnBuscarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscarProv.setText("Buscar");
        jPanel3.add(btnBuscarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        btnLimpiarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarProv.setText("Limpiar");
        jPanel3.add(btnLimpiarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        btnEliminarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarProv.setText("Eliminar");
        jPanel3.add(btnEliminarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, 33));

        jLabel8.setText("Teléfono");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel9.setText("Cuenta 1");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 40, -1, -1));

        jLabel10.setText("Artículos");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel12.setText("Banco 1");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 80, -1, -1));

        jLabel13.setText("Correo");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel24.setText("Proveedor Real");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel28.setText("Observaciones");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 275, -1, -1));

        jLabel29.setText("Cédula");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel30.setText("Contacto");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel31.setText("Ubicación");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 275, -1, -1));

        jLabel25.setText("Proveedor Fantasía");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel11.setText("Cuenta 2");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 120, -1, -1));

        jLabel14.setText("Banco 2");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 160, -1, -1));

        jLabel15.setText("Cuenta 3");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 200, -1, -1));

        jLabel16.setText("Banco 3");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 240, -1, -1));

        jLabel35.setText("Ordenar por:");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 970, 420));

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

        jPanel2.add(spnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 434, 967, 190));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtProvFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProvFantasiaActionPerformed

    private void txtCuenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuenta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuenta1ActionPerformed

    private void txtBanco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBanco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBanco1ActionPerformed

    private void txtCuenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuenta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuenta2ActionPerformed

    private void txtBanco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBanco2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBanco2ActionPerformed

    private void txtBanco3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBanco3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBanco3ActionPerformed

    private void txtCuenta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuenta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuenta3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProv;
    private javax.swing.JButton btnEliminarProv;
    private javax.swing.JButton btnInsertarProv;
    private javax.swing.JButton btnLimpiarProv;
    private javax.swing.JButton btnModificarProv;
    private javax.swing.JComboBox<String> cmbOrdenProv;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane spnArticulos;
    private javax.swing.JScrollPane spnProv;
    private javax.swing.JScrollPane spnProveedor;
    private javax.swing.JTable tblProv;
    private javax.swing.JTextArea txaArticulos;
    private javax.swing.JTextField txtBanco1;
    private javax.swing.JTextField txtBanco2;
    private javax.swing.JTextField txtBanco3;
    private javax.swing.JTextField txtCedProv;
    private javax.swing.JTextField txtContProv;
    private javax.swing.JTextField txtCorreoProv;
    private javax.swing.JTextField txtCuenta1;
    private javax.swing.JTextField txtCuenta2;
    private javax.swing.JTextField txtCuenta3;
    private javax.swing.JTextField txtProvFantasia;
    private javax.swing.JTextField txtProvReal;
    private javax.swing.JTextField txtTelProv;
    private javax.swing.JTextField txtUbicacionProv;
    private javax.swing.JTextArea txtaObservacionesProv;
    // End of variables declaration//GEN-END:variables
}
