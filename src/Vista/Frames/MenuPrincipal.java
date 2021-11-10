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

        ModIngresarContr model = new ModIngresarContr();
        Pn_IngresarContr view = new Pn_IngresarContr();
        
        CtrlIngresarContr controlador = new CtrlIngresarContr(view, model);
        view.setVisible(true);
        
        pnl_prin.removeAll();
        pnl_prin.repaint();
        view.setSize(872, 573);
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
        jButton2 = new javax.swing.JButton();
        btn_IngresarContr = new rsbuttom.RSButtonMetro();
        pnl_prin = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rSButtonMetro1.setBackground(javax.swing.UIManager.getDefaults().getColor("Panel.background"));
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

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_IngresarContr.setText("Ingresar Contratación");
        btn_IngresarContr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarContrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_adj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_com, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_fac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rSButtonMetro1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(btn_timbre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_IngresarContr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btn_IngresarContr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btn_timbre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btn_adj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btn_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btn_fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btn_ren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pnl_prin.setPreferredSize(new java.awt.Dimension(1103, 809));
        pnl_prin.setRequestFocusEnabled(false);

        javax.swing.GroupLayout pnl_prinLayout = new javax.swing.GroupLayout(pnl_prin);
        pnl_prin.setLayout(pnl_prinLayout);
        pnl_prinLayout.setHorizontalGroup(
            pnl_prinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        pnl_prinLayout.setVerticalGroup(
            pnl_prinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_prin, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_prin, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
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
        timbre.setSize(928, 603);
        pnl_prin.add(timbre).setVisible(true);
    }//GEN-LAST:event_btn_timbreActionPerformed

    private void btn_adjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adjActionPerformed
        Pnl_2 adj = new Pnl_2();
        pnl_prin.removeAll();
        pnl_prin.repaint();
        adj.setSize(928, 603);
        pnl_prin.add(adj).setVisible(true);
    }//GEN-LAST:event_btn_adjActionPerformed

    private void btn_comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comActionPerformed
        Pnl_3 com = new Pnl_3();
        pnl_prin.removeAll();
        pnl_prin.repaint();
        com.setSize(928, 603);
        pnl_prin.add(com).setVisible(true);
    }//GEN-LAST:event_btn_comActionPerformed

    private void btn_facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facActionPerformed
        Pnl_4 fac = new Pnl_4();
        pnl_prin.removeAll();
        pnl_prin.repaint();
        fac.setSize(928, 603);
        pnl_prin.add(fac).setVisible(true);
    }//GEN-LAST:event_btn_facActionPerformed

    private void btn_renActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_renActionPerformed
        Pnl_5 ren=new Pnl_5();
        pnl_prin.removeAll();
        pnl_prin.repaint();
        ren.setSize(928, 603);
        pnl_prin.add(ren).setVisible(true); 
    }//GEN-LAST:event_btn_renActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_IngresarContrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarContrActionPerformed
        ModIngresarContr model = new ModIngresarContr();
        Pn_IngresarContr view = new Pn_IngresarContr();

        CtrlIngresarContr controlador = new CtrlIngresarContr(view, model);
        view.setVisible(true);

        pnl_prin.removeAll();
        pnl_prin.repaint();
        view.setSize(872, 573);
        pnl_prin.add(view).setVisible(true);
    }//GEN-LAST:event_btn_IngresarContrActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
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
    private rsbuttom.RSButtonMetro btn_IngresarContr;
    private rsbuttom.RSButtonMetro btn_adj;
    private rsbuttom.RSButtonMetro btn_com;
    private rsbuttom.RSButtonMetro btn_fac;
    private rsbuttom.RSButtonMetro btn_ren;
    private rsbuttom.RSButtonMetro btn_timbre;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JPanel pnl_prin;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    // End of variables declaration//GEN-END:variables
}
