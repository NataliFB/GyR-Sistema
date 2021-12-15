package Vista.Paneles;

/**
 * Clase para el panel de por comprar
 *
 * @author
 */
public class Pnl_3 extends javax.swing.JPanel {

    /**
     * Constructor de la clase Pnl_3.<br>
     * Inicializa los objetos que hay dentro del panel.<br>
     * No recibe ningún parametro.
     */
    public Pnl_3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPorComprar = new javax.swing.JPanel();
        scpPorComprar = new javax.swing.JScrollPane();
        tblPorComprar = new javax.swing.JTable();
        PanelControlPorComprar = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtBuscarPorComprar = new javax.swing.JTextField();
        cmbBusquedaPorComprar = new javax.swing.JComboBox<>();
        btnRefrescarPorComprar = new javax.swing.JButton();
        PanelBasePorComprar = new javax.swing.JPanel();
        PanelOpcionesPorComprar = new javax.swing.JPanel();
        btnInsertarPorComprar = new javax.swing.JButton();
        btnModificarPorComprar = new javax.swing.JButton();
        btnLimpiarPorComprar = new javax.swing.JButton();
        btnEliminarPorComprar = new javax.swing.JButton();
        PanelObjetosPorComprar = new javax.swing.JPanel();
        txtContratacionPorComprar = new javax.swing.JTextField();
        txtObjetoPorComprar = new javax.swing.JTextField();
        txtMontoPorComprar = new javax.swing.JTextField();
        txtCostoPorComprar = new javax.swing.JTextField();
        scpObservacionesPorComprar = new javax.swing.JScrollPane();
        txaObservacionPorComprar = new javax.swing.JTextArea();
        jLabel91 = new javax.swing.JLabel();
        lblLugarr9 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        panelProveedores = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCedulaPorComprar = new javax.swing.JTextField();
        txtProvRealPorComprar = new javax.swing.JTextField();
        txtProvFantPorComprar = new javax.swing.JTextField();
        spnBancosCuentasPorComprar = new javax.swing.JScrollPane();
        txaCuentasBancosPorComprar = new javax.swing.JTextArea();
        cmbProveedores = new javax.swing.JComboBox<>();
        codPorComprar = new javax.swing.JLabel();

        scpPorComprar.setViewportView(tblPorComprar);

        PanelControlPorComprar.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Tabla"));

        jLabel17.setText("Buscar");

        btnRefrescarPorComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        btnRefrescarPorComprar.setText("Refrescar");

        javax.swing.GroupLayout PanelControlPorComprarLayout = new javax.swing.GroupLayout(PanelControlPorComprar);
        PanelControlPorComprar.setLayout(PanelControlPorComprarLayout);
        PanelControlPorComprarLayout.setHorizontalGroup(
            PanelControlPorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlPorComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarPorComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBusquedaPorComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefrescarPorComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelControlPorComprarLayout.setVerticalGroup(
            PanelControlPorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlPorComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlPorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtBuscarPorComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBusquedaPorComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescarPorComprar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelOpcionesPorComprar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N

        btnInsertarPorComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarPorComprar.setText("Agregar");

        btnModificarPorComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarPorComprar.setText("Modificar");

        btnLimpiarPorComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarPorComprar.setText("Limpiar");

        btnEliminarPorComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarPorComprar.setText("Eliminar");

        javax.swing.GroupLayout PanelOpcionesPorComprarLayout = new javax.swing.GroupLayout(PanelOpcionesPorComprar);
        PanelOpcionesPorComprar.setLayout(PanelOpcionesPorComprarLayout);
        PanelOpcionesPorComprarLayout.setHorizontalGroup(
            PanelOpcionesPorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesPorComprarLayout.createSequentialGroup()
                .addGroup(PanelOpcionesPorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesPorComprarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEliminarPorComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesPorComprarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiarPorComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesPorComprarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnModificarPorComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesPorComprarLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnInsertarPorComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelOpcionesPorComprarLayout.setVerticalGroup(
            PanelOpcionesPorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesPorComprarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnInsertarPorComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnModificarPorComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnLimpiarPorComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnEliminarPorComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        PanelObjetosPorComprar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Por Comprar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        PanelObjetosPorComprar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelObjetosPorComprar.add(txtContratacionPorComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 35, 250, -1));
        PanelObjetosPorComprar.add(txtObjetoPorComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 250, -1));
        PanelObjetosPorComprar.add(txtMontoPorComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 125, 250, -1));
        PanelObjetosPorComprar.add(txtCostoPorComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 250, -1));

        txaObservacionPorComprar.setColumns(20);
        txaObservacionPorComprar.setRows(5);
        scpObservacionesPorComprar.setViewportView(txaObservacionPorComprar);

        PanelObjetosPorComprar.add(scpObservacionesPorComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 252, 90));

        jLabel91.setText("Número de Contratación");
        PanelObjetosPorComprar.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, -1, -1));

        lblLugarr9.setText("Objeto");
        PanelObjetosPorComprar.add(lblLugarr9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel96.setText("Observación");
        PanelObjetosPorComprar.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel56.setText("Monto Ofertado");
        PanelObjetosPorComprar.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        jLabel57.setText("Costo");
        PanelObjetosPorComprar.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        panelProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedores"));
        panelProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Buscar");
        panelProveedores.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setText("Proveedor Fantasía");
        panelProveedores.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setText("Proveedor Real");
        panelProveedores.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setText("Cédula Jurídica");
        panelProveedores.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        panelProveedores.add(txtCedulaPorComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 230, -1));
        panelProveedores.add(txtProvRealPorComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 230, -1));
        panelProveedores.add(txtProvFantPorComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 230, -1));

        txaCuentasBancosPorComprar.setColumns(20);
        txaCuentasBancosPorComprar.setRows(5);
        spnBancosCuentasPorComprar.setViewportView(txaCuentasBancosPorComprar);

        panelProveedores.add(spnBancosCuentasPorComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 340, -1));

        panelProveedores.add(cmbProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 230, -1));

        PanelObjetosPorComprar.add(panelProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 380, 300));

        javax.swing.GroupLayout PanelBasePorComprarLayout = new javax.swing.GroupLayout(PanelBasePorComprar);
        PanelBasePorComprar.setLayout(PanelBasePorComprarLayout);
        PanelBasePorComprarLayout.setHorizontalGroup(
            PanelBasePorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBasePorComprarLayout.createSequentialGroup()
                .addComponent(PanelObjetosPorComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelOpcionesPorComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBasePorComprarLayout.setVerticalGroup(
            PanelBasePorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBasePorComprarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelBasePorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PanelOpcionesPorComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelObjetosPorComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        codPorComprar.setText("NA");

        javax.swing.GroupLayout pnlPorComprarLayout = new javax.swing.GroupLayout(pnlPorComprar);
        pnlPorComprar.setLayout(pnlPorComprarLayout);
        pnlPorComprarLayout.setHorizontalGroup(
            pnlPorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPorComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPorComprarLayout.createSequentialGroup()
                        .addComponent(PanelControlPorComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codPorComprar))
                    .addComponent(scpPorComprar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelBasePorComprar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnlPorComprarLayout.setVerticalGroup(
            pnlPorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPorComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBasePorComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnlPorComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelControlPorComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codPorComprar))
                .addGap(12, 12, 12)
                .addComponent(scpPorComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
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
    private javax.swing.JPanel PanelBasePorComprar;
    private javax.swing.JPanel PanelControlPorComprar;
    private javax.swing.JPanel PanelObjetosPorComprar;
    private javax.swing.JPanel PanelOpcionesPorComprar;
    public javax.swing.JButton btnEliminarPorComprar;
    public javax.swing.JButton btnInsertarPorComprar;
    public javax.swing.JButton btnLimpiarPorComprar;
    public javax.swing.JButton btnModificarPorComprar;
    public javax.swing.JButton btnRefrescarPorComprar;
    public javax.swing.JComboBox<String> cmbBusquedaPorComprar;
    public javax.swing.JComboBox<String> cmbProveedores;
    public javax.swing.JLabel codPorComprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel lblLugarr9;
    private javax.swing.JPanel panelProveedores;
    private javax.swing.JPanel pnlPorComprar;
    private javax.swing.JScrollPane scpObservacionesPorComprar;
    public javax.swing.JScrollPane scpPorComprar;
    private javax.swing.JScrollPane spnBancosCuentasPorComprar;
    public javax.swing.JTable tblPorComprar;
    public javax.swing.JTextArea txaCuentasBancosPorComprar;
    public javax.swing.JTextArea txaObservacionPorComprar;
    public javax.swing.JTextField txtBuscarPorComprar;
    public javax.swing.JTextField txtCedulaPorComprar;
    public javax.swing.JTextField txtContratacionPorComprar;
    public javax.swing.JTextField txtCostoPorComprar;
    public javax.swing.JTextField txtMontoPorComprar;
    public javax.swing.JTextField txtObjetoPorComprar;
    public javax.swing.JTextField txtProvFantPorComprar;
    public javax.swing.JTextField txtProvRealPorComprar;
    // End of variables declaration//GEN-END:variables
}
