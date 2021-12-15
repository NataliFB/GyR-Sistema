package Vista.Paneles;

/**
 * Clase para el panel de Ingresar Contrataciones
 *
 * @author
 */
public class Pn_IngresarContr extends javax.swing.JPanel {

    /**
     * Constructor de la clase Ingresar Contrataciones.<br> 
     * Inicializa los objetos que hay dentro del panel.<br>
     * No recibe ningún parametro.
     */
    public Pn_IngresarContr() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgEstado = new javax.swing.ButtonGroup();
        panelBase = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblContratacionesComp = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContratacionesIncomp = new javax.swing.JTable();
        PanelControl = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cmbBusqueda = new javax.swing.JComboBox<>();
        btnRefrescar = new javax.swing.JButton();
        PanelBaseObj = new javax.swing.JPanel();
        PanelObjetos = new javax.swing.JPanel();
        spnDescripcion4 = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        scpObservaciones4 = new javax.swing.JScrollPane();
        txaObservaciones = new javax.swing.JTextArea();
        txtFechaPublicacion = new javax.swing.JTextField();
        txtFechaApertura = new javax.swing.JTextField();
        txtContratacion = new javax.swing.JTextField();
        txtInstitucion = new javax.swing.JTextField();
        rbtEnviada = new javax.swing.JRadioButton();
        rbtDescartada = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        PanelOpciones = new javax.swing.JPanel();
        btnInsertarContratacion = new javax.swing.JButton();
        btnModificarContratacion = new javax.swing.JButton();
        btnLimpiarContratacion = new javax.swing.JButton();
        btnEliminarContratacion = new javax.swing.JButton();
        btnTomarContratacion = new javax.swing.JButton();

        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setViewportView(tblContratacionesComp);

        jPanel2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Contrataciones completas", jPanel2);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(tblContratacionesIncomp);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Contrataciones agregadas", jPanel3);

        PanelControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Tabla"));

        jLabel48.setText("Buscar");

        cmbBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contratación", "Institución", "Descripción", "Fecha de Publicación", "Fecha de Apertura", "Estado", "Encargado" }));

        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        btnRefrescar.setText("Refrescar");

        javax.swing.GroupLayout PanelControlLayout = new javax.swing.GroupLayout(PanelControl);
        PanelControl.setLayout(PanelControlLayout);
        PanelControlLayout.setHorizontalGroup(
            PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        PanelControlLayout.setVerticalGroup(
            PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelObjetos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Contratación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        PanelObjetos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txaDescripcion.setColumns(20);
        txaDescripcion.setRows(5);
        spnDescripcion4.setViewportView(txaDescripcion);

        PanelObjetos.add(spnDescripcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 280, 100));

        txaObservaciones.setColumns(20);
        txaObservaciones.setRows(5);
        scpObservaciones4.setViewportView(txaObservaciones);

        PanelObjetos.add(scpObservaciones4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 270, 50));
        PanelObjetos.add(txtFechaPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 280, -1));
        PanelObjetos.add(txtFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 280, -1));
        PanelObjetos.add(txtContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 280, -1));
        PanelObjetos.add(txtInstitucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 280, -1));

        rbtEnviada.setText("Enviada");
        PanelObjetos.add(rbtEnviada, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        rbtDescartada.setText("Descartada");
        PanelObjetos.add(rbtDescartada, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, -1));

        jLabel30.setText("Número de Contratación");
        PanelObjetos.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel31.setText("Descripción");
        PanelObjetos.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jLabel32.setText("Fecha de publicación");
        PanelObjetos.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel33.setText("Fecha de Apertura");
        PanelObjetos.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel34.setText("Estado");
        PanelObjetos.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        jLabel35.setText("Institución");
        PanelObjetos.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel36.setText("Observaciones");
        PanelObjetos.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        PanelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N

        btnInsertarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarContratacion.setText("Agregar");

        btnModificarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarContratacion.setText("Modificar");

        btnLimpiarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarContratacion.setText("Limpiar");

        btnEliminarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarContratacion.setText("Eliminar");

        btnTomarContratacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargo.png"))); // NOI18N
        btnTomarContratacion.setText("Tomar Contratación");

        javax.swing.GroupLayout PanelOpcionesLayout = new javax.swing.GroupLayout(PanelOpciones);
        PanelOpciones.setLayout(PanelOpcionesLayout);
        PanelOpcionesLayout.setHorizontalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsertarContratacion, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(btnModificarContratacion, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(btnLimpiarContratacion, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(btnEliminarContratacion, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(btnTomarContratacion, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );
        PanelOpcionesLayout.setVerticalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnInsertarContratacion)
                .addGap(15, 15, 15)
                .addComponent(btnModificarContratacion)
                .addGap(15, 15, 15)
                .addComponent(btnLimpiarContratacion)
                .addGap(17, 17, 17)
                .addComponent(btnEliminarContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnTomarContratacion)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelBaseObjLayout = new javax.swing.GroupLayout(PanelBaseObj);
        PanelBaseObj.setLayout(PanelBaseObjLayout);
        PanelBaseObjLayout.setHorizontalGroup(
            PanelBaseObjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBaseObjLayout.createSequentialGroup()
                .addComponent(PanelObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBaseObjLayout.setVerticalGroup(
            PanelBaseObjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseObjLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBaseObjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelObjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addComponent(PanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelBaseObj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPane1))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBaseObj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBaseObj;
    private javax.swing.JPanel PanelControl;
    private javax.swing.JPanel PanelObjetos;
    private javax.swing.JPanel PanelOpciones;
    public javax.swing.ButtonGroup btgEstado;
    public javax.swing.JButton btnEliminarContratacion;
    public javax.swing.JButton btnInsertarContratacion;
    public javax.swing.JButton btnLimpiarContratacion;
    public javax.swing.JButton btnModificarContratacion;
    public javax.swing.JButton btnRefrescar;
    public javax.swing.JButton btnTomarContratacion;
    public javax.swing.JComboBox<String> cmbBusqueda;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelBase;
    public javax.swing.JRadioButton rbtDescartada;
    public javax.swing.JRadioButton rbtEnviada;
    private javax.swing.JScrollPane scpObservaciones4;
    private javax.swing.JScrollPane spnDescripcion4;
    public javax.swing.JTable tblContratacionesComp;
    public javax.swing.JTable tblContratacionesIncomp;
    public javax.swing.JTextArea txaDescripcion;
    public javax.swing.JTextArea txaObservaciones;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtContratacion;
    public javax.swing.JTextField txtFechaApertura;
    public javax.swing.JTextField txtFechaPublicacion;
    public javax.swing.JTextField txtInstitucion;
    // End of variables declaration//GEN-END:variables
}
