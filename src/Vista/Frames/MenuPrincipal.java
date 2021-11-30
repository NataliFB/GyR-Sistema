package Vista.Frames;

import Vista.Paneles.*;
import Controlador.*;
import Modelo.*;

/**
 *
 * @author Aaron
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        VentanaContratacion();
    }
    
    public void VentanaContratacion(){
        ModIngresarContr model = new ModIngresarContr();
        Pn_IngresarContr view = new Pn_IngresarContr();
        
        CtrlIngresarContr controlador = new CtrlIngresarContr(view, model);
        view.setVisible(true);
        
        pnl_prin.removeAll();
        pnl_prin.repaint();
        pnl_prin.add(view).setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        jSeparator1 = new javax.swing.JSeparator();
        btn_timbre = new rsbuttom.RSButtonMetro();
        btn_adj = new rsbuttom.RSButtonMetro();
        btn_com = new rsbuttom.RSButtonMetro();
        btn_fac = new rsbuttom.RSButtonMetro();
        btn_ren = new rsbuttom.RSButtonMetro();
        btnSalir = new javax.swing.JButton();
        btn_IngresarContr = new rsbuttom.RSButtonMetro();
        btn_ren1 = new rsbuttom.RSButtonMetro();
        pnl_prin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        rSButtonMetro1.setText("Usuario");
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(102, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(102, 153, 255));

        btn_timbre.setText("Timbres, Muestras y Garantías");
        btn_timbre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timbreActionPerformed(evt);
            }
        });

        btn_adj.setText("Adjudicaciones");
        btn_adj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adjActionPerformed(evt);
            }
        });

        btn_com.setText("Por Comprar");
        btn_com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comActionPerformed(evt);
            }
        });

        btn_fac.setText("Facturas");
        btn_fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facActionPerformed(evt);
            }
        });

        btn_ren.setText("Renta");
        btn_ren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_renActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btn_IngresarContr.setText("Ingresar Contratación");
        btn_IngresarContr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarContrActionPerformed(evt);
            }
        });

        btn_ren1.setText("Proveedores");
        btn_ren1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ren1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_adj, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_com, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_fac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ren, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timbre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_IngresarContr, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ren1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_IngresarContr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_timbre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_adj, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_com, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_fac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_ren, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_ren1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_prin.setPreferredSize(new java.awt.Dimension(1103, 809));
        pnl_prin.setRequestFocusEnabled(false);

        javax.swing.GroupLayout pnl_prinLayout = new javax.swing.GroupLayout(pnl_prin);
        pnl_prin.setLayout(pnl_prinLayout);
        pnl_prinLayout.setHorizontalGroup(
            pnl_prinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1022, Short.MAX_VALUE)
        );
        pnl_prinLayout.setVerticalGroup(
            pnl_prinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_prin, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_prin, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        new Usuario().setVisible(true);
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void btn_timbreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timbreActionPerformed
        Pnl_1 timbre = new Pnl_1();
        pnl_prin.removeAll();
        pnl_prin.repaint();
        pnl_prin.add(timbre).setVisible(true);
    }//GEN-LAST:event_btn_timbreActionPerformed

    private void btn_adjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adjActionPerformed
        Pnl_2 adj = new Pnl_2();
        pnl_prin.removeAll();
        pnl_prin.repaint();
        pnl_prin.add(adj).setVisible(true);
    }//GEN-LAST:event_btn_adjActionPerformed

    private void btn_comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comActionPerformed
        Pnl_3 com = new Pnl_3();
        pnl_prin.removeAll();
        pnl_prin.repaint();
        pnl_prin.add(com).setVisible(true);
    }//GEN-LAST:event_btn_comActionPerformed

    private void btn_facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facActionPerformed
        Pnl_4 fac = new Pnl_4();
        pnl_prin.removeAll();
        pnl_prin.repaint();
        pnl_prin.add(fac).setVisible(true);
    }//GEN-LAST:event_btn_facActionPerformed

    private void btn_renActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_renActionPerformed
        Pnl_5 ren=new Pnl_5();
        pnl_prin.removeAll();
        pnl_prin.repaint();
        pnl_prin.add(ren).setVisible(true); 
    }//GEN-LAST:event_btn_renActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btn_IngresarContrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarContrActionPerformed
        VentanaContratacion();
    }//GEN-LAST:event_btn_IngresarContrActionPerformed

    private void btn_ren1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ren1ActionPerformed
        Pnl_Proveedor prov=new Pnl_Proveedor();
        pnl_prin.removeAll();
        pnl_prin.repaint();
        pnl_prin.add(prov).setVisible(true); 
    }//GEN-LAST:event_btn_ren1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private rsbuttom.RSButtonMetro btn_IngresarContr;
    private rsbuttom.RSButtonMetro btn_adj;
    private rsbuttom.RSButtonMetro btn_com;
    private rsbuttom.RSButtonMetro btn_fac;
    private rsbuttom.RSButtonMetro btn_ren;
    private rsbuttom.RSButtonMetro btn_ren1;
    private rsbuttom.RSButtonMetro btn_timbre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JPanel pnl_prin;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    // End of variables declaration//GEN-END:variables
}
