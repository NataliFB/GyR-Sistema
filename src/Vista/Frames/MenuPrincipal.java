package Vista.Frames;

/**
 * Clase para la ventana del Menu Principal
 *
 * @author
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Constructor para el JFrame MenuPrincipal<br>
     * Inicializa los objetos que tiene
     */
    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        PanelBtn = new javax.swing.JPanel();
        Usuario = new javax.swing.JPanel();
        btnUsuario = new rsbuttom.RSButtonMetro();
        jSeparator2 = new javax.swing.JSeparator();
        IngrsarContr = new javax.swing.JPanel();
        btnIngresarContr = new rsbuttom.RSButtonMetro();
        Adjudicaciones = new javax.swing.JPanel();
        btnAdjudicaciones = new rsbuttom.RSButtonMetro();
        Timbres = new javax.swing.JPanel();
        btnTimbre = new rsbuttom.RSButtonMetro();
        PorComprar = new javax.swing.JPanel();
        btnPorComprar = new rsbuttom.RSButtonMetro();
        Facturas = new javax.swing.JPanel();
        btnFacturas = new rsbuttom.RSButtonMetro();
        Renta = new javax.swing.JPanel();
        btnRenta = new rsbuttom.RSButtonMetro();
        Proveedores = new javax.swing.JPanel();
        btnProveedores = new rsbuttom.RSButtonMetro();
        Salir = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        pnl_prin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1500, 800));

        PanelBtn.setLayout(new javax.swing.BoxLayout(PanelBtn, javax.swing.BoxLayout.PAGE_AXIS));

        Usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsuario.setText("Usuario");
        Usuario.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, 254, -1));

        jSeparator2.setBackground(new java.awt.Color(102, 153, 255));
        jSeparator2.setForeground(new java.awt.Color(102, 153, 255));
        Usuario.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 49, 254, -1));

        PanelBtn.add(Usuario);

        IngrsarContr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresarContr.setText("Ingresar Contratación");
        IngrsarContr.add(btnIngresarContr, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 254, -1));

        PanelBtn.add(IngrsarContr);

        Adjudicaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdjudicaciones.setText("Adjudicaciones");
        Adjudicaciones.add(btnAdjudicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 254, -1));

        PanelBtn.add(Adjudicaciones);

        Timbres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTimbre.setText("Timbres, Muestras y Garantías");
        Timbres.add(btnTimbre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 254, -1));

        PanelBtn.add(Timbres);

        PorComprar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPorComprar.setText("Por Comprar");
        PorComprar.add(btnPorComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 254, -1));

        PanelBtn.add(PorComprar);

        Facturas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFacturas.setText("Facturas");
        Facturas.add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 254, -1));

        PanelBtn.add(Facturas);

        Renta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRenta.setText("Renta");
        Renta.add(btnRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 254, -1));

        PanelBtn.add(Renta);

        Proveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProveedores.setText("Proveedores");
        Proveedores.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 254, 29));

        PanelBtn.add(Proveedores);

        Salir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setText("Salir");
        Salir.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 254, 28));

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addComponent(PanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_prin.setPreferredSize(new java.awt.Dimension(1103, 809));
        pnl_prin.setRequestFocusEnabled(false);

        javax.swing.GroupLayout pnl_prinLayout = new javax.swing.GroupLayout(pnl_prin);
        pnl_prin.setLayout(pnl_prinLayout);
        pnl_prinLayout.setHorizontalGroup(
            pnl_prinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
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
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_prin, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_prin, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    public javax.swing.JPanel Adjudicaciones;
    public javax.swing.JPanel Facturas;
    public javax.swing.JPanel IngrsarContr;
    private javax.swing.JPanel PanelBtn;
    private javax.swing.JPanel PanelMenu;
    public javax.swing.JPanel PorComprar;
    public javax.swing.JPanel Proveedores;
    public javax.swing.JPanel Renta;
    private javax.swing.JPanel Salir;
    public javax.swing.JPanel Timbres;
    public javax.swing.JPanel Usuario;
    public rsbuttom.RSButtonMetro btnAdjudicaciones;
    public rsbuttom.RSButtonMetro btnFacturas;
    public rsbuttom.RSButtonMetro btnIngresarContr;
    public rsbuttom.RSButtonMetro btnPorComprar;
    public rsbuttom.RSButtonMetro btnProveedores;
    public rsbuttom.RSButtonMetro btnRenta;
    public javax.swing.JButton btnSalir;
    public rsbuttom.RSButtonMetro btnTimbre;
    public rsbuttom.RSButtonMetro btnUsuario;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JPanel pnl_prin;
    // End of variables declaration//GEN-END:variables
}
