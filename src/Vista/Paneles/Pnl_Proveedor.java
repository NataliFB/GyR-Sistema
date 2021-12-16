
package Vista.Paneles;

/**
 * Clase para el panel de facturas
 * @author
 */
public class Pnl_Proveedor extends javax.swing.JPanel {

    /**
     * Constructor de la clase Pnl_Facturas.<br>
     * Inicializa los objetos que hay dentro del panel.<br>
     * No recibe ningún parametro.
     */
    public Pnl_Proveedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProveedores = new javax.swing.JPanel();
        scpProveedores = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        PanelControlRenta = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtBuscarProveedores = new javax.swing.JTextField();
        cmbBusquedaProveedores = new javax.swing.JComboBox<>();
        btnRefrescarProveedores = new javax.swing.JButton();
        PanelBaseProveedores = new javax.swing.JPanel();
        PanelOpcionesProveedores = new javax.swing.JPanel();
        btnInsertarProveedores = new javax.swing.JButton();
        btnModificarProveedores = new javax.swing.JButton();
        btnLimpiarProveedores = new javax.swing.JButton();
        btnEliminarProveedores = new javax.swing.JButton();
        PanelObjetosProveedores = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtProvReal = new javax.swing.JTextField();
        txtProvFantasia = new javax.swing.JTextField();
        btnAgregarArt = new javax.swing.JButton();
        txtCorreoProv = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtContactoProv = new javax.swing.JTextField();
        txtCelularProv = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btnAgregarCuentaBanco = new javax.swing.JButton();
        txtUbicacionProv = new javax.swing.JTextField();
        txtCedulaProv = new javax.swing.JTextField();
        scpObservacionesProv = new javax.swing.JScrollPane();
        txaObservacionProv = new javax.swing.JTextArea();
        txtTelProv = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        codProveedores = new javax.swing.JLabel();

        scpProveedores.setViewportView(tblProveedores);

        PanelControlRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Tabla"));

        jLabel17.setText("Buscar");

        btnRefrescarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        btnRefrescarProveedores.setText("Refrescar");

        javax.swing.GroupLayout PanelControlRentaLayout = new javax.swing.GroupLayout(PanelControlRenta);
        PanelControlRenta.setLayout(PanelControlRentaLayout);
        PanelControlRentaLayout.setHorizontalGroup(
            PanelControlRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlRentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBusquedaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefrescarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelControlRentaLayout.setVerticalGroup(
            PanelControlRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlRentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlRentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtBuscarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBusquedaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescarProveedores))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelOpcionesProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N

        btnInsertarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarProveedores.setText("Agregar");

        btnModificarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarProveedores.setText("Modificar");

        btnLimpiarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarProveedores.setText("Limpiar");

        btnEliminarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarProveedores.setText("Eliminar");

        javax.swing.GroupLayout PanelOpcionesProveedoresLayout = new javax.swing.GroupLayout(PanelOpcionesProveedores);
        PanelOpcionesProveedores.setLayout(PanelOpcionesProveedoresLayout);
        PanelOpcionesProveedoresLayout.setHorizontalGroup(
            PanelOpcionesProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesProveedoresLayout.createSequentialGroup()
                .addGroup(PanelOpcionesProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEliminarProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiarProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnModificarProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesProveedoresLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnInsertarProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelOpcionesProveedoresLayout.setVerticalGroup(
            PanelOpcionesProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesProveedoresLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnInsertarProveedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnModificarProveedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnLimpiarProveedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnEliminarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        PanelObjetosProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        PanelObjetosProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setText("Teléfono");
        PanelObjetosProveedores.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel29.setText("Cédula");
        PanelObjetosProveedores.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        PanelObjetosProveedores.add(txtProvReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 250, -1));
        PanelObjetosProveedores.add(txtProvFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 250, -1));

        btnAgregarArt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        btnAgregarArt.setText("Ver Artículos");
        PanelObjetosProveedores.add(btnAgregarArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 40));
        PanelObjetosProveedores.add(txtCorreoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 250, -1));

        jLabel28.setText("Observaciones");
        PanelObjetosProveedores.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel24.setText("Proveedor Real");
        PanelObjetosProveedores.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel8.setText("Celular");
        PanelObjetosProveedores.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        PanelObjetosProveedores.add(txtContactoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 250, -1));
        PanelObjetosProveedores.add(txtCelularProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 250, -1));

        jLabel25.setText("Proveedor Fantasía");
        PanelObjetosProveedores.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        btnAgregarCuentaBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        btnAgregarCuentaBanco.setText("Agregar Cuentas y Bancos");
        PanelObjetosProveedores.add(btnAgregarCuentaBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, 40));
        PanelObjetosProveedores.add(txtUbicacionProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 250, -1));
        PanelObjetosProveedores.add(txtCedulaProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 250, -1));

        txaObservacionProv.setColumns(20);
        txaObservacionProv.setRows(5);
        scpObservacionesProv.setViewportView(txaObservacionProv);

        PanelObjetosProveedores.add(scpObservacionesProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 250, -1));
        PanelObjetosProveedores.add(txtTelProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 250, -1));

        jLabel13.setText("Correo");
        PanelObjetosProveedores.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel30.setText("Contacto");
        PanelObjetosProveedores.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jLabel31.setText("Ubicación");
        PanelObjetosProveedores.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        javax.swing.GroupLayout PanelBaseProveedoresLayout = new javax.swing.GroupLayout(PanelBaseProveedores);
        PanelBaseProveedores.setLayout(PanelBaseProveedoresLayout);
        PanelBaseProveedoresLayout.setHorizontalGroup(
            PanelBaseProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseProveedoresLayout.createSequentialGroup()
                .addComponent(PanelObjetosProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelOpcionesProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBaseProveedoresLayout.setVerticalGroup(
            PanelBaseProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseProveedoresLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelBaseProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PanelOpcionesProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelObjetosProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        codProveedores.setText("NA");

        javax.swing.GroupLayout pnlProveedoresLayout = new javax.swing.GroupLayout(pnlProveedores);
        pnlProveedores.setLayout(pnlProveedoresLayout);
        pnlProveedoresLayout.setHorizontalGroup(
            pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProveedoresLayout.createSequentialGroup()
                        .addComponent(PanelControlRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codProveedores))
                    .addComponent(scpProveedores, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelBaseProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnlProveedoresLayout.setVerticalGroup(
            pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBaseProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelControlRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codProveedores))
                .addGap(12, 12, 12)
                .addComponent(scpProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBaseProveedores;
    private javax.swing.JPanel PanelControlRenta;
    public javax.swing.JPanel PanelObjetosProveedores;
    private javax.swing.JPanel PanelOpcionesProveedores;
    public javax.swing.JButton btnAgregarArt;
    public javax.swing.JButton btnAgregarCuentaBanco;
    public javax.swing.JButton btnEliminarProveedores;
    public javax.swing.JButton btnInsertarProveedores;
    public javax.swing.JButton btnLimpiarProveedores;
    public javax.swing.JButton btnModificarProveedores;
    public javax.swing.JButton btnRefrescarProveedores;
    public javax.swing.JComboBox<String> cmbBusquedaProveedores;
    public javax.swing.JLabel codProveedores;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel pnlProveedores;
    private javax.swing.JScrollPane scpObservacionesProv;
    public javax.swing.JScrollPane scpProveedores;
    public javax.swing.JTable tblProveedores;
    public javax.swing.JTextArea txaObservacionProv;
    public javax.swing.JTextField txtBuscarProveedores;
    public javax.swing.JTextField txtCedulaProv;
    public javax.swing.JTextField txtCelularProv;
    public javax.swing.JTextField txtContactoProv;
    public javax.swing.JTextField txtCorreoProv;
    public javax.swing.JTextField txtProvFantasia;
    public javax.swing.JTextField txtProvReal;
    public javax.swing.JTextField txtTelProv;
    public javax.swing.JTextField txtUbicacionProv;
    // End of variables declaration//GEN-END:variables
}
