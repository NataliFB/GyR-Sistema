package Vista.Paneles;

/**
 * Clase para el panel que contiene Orden, Entrega y Adjudicada
 *
 * @author
 */
public class Pnl_2 extends javax.swing.JPanel {

    /**
     * Constructor de la clase Pnl_2.<br>
     * Inicializa los objetos que hay dentro del panel. Como los 3 paneles de
     * orden, entrega y adjudicada<br>
     * No recibe ningún parametro.
     */
    public Pnl_2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgTipo = new javax.swing.ButtonGroup();
        btgEstado = new javax.swing.ButtonGroup();
        btgEmpresa = new javax.swing.ButtonGroup();
        btgEmpresaEnt = new javax.swing.ButtonGroup();
        tbpContenedor = new javax.swing.JTabbedPane();
        pnlAdjudicada = new javax.swing.JPanel();
        scpAdjudicada = new javax.swing.JScrollPane();
        tblAdjudicada = new javax.swing.JTable();
        PanelControlAdj = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cmbBusqueda = new javax.swing.JComboBox<>();
        btnRefrescar = new javax.swing.JButton();
        PanelBaseAdj = new javax.swing.JPanel();
        PanelOpcionesAdj = new javax.swing.JPanel();
        btnInsertarContratacion5 = new javax.swing.JButton();
        btnModificarContratacion5 = new javax.swing.JButton();
        btnLimpiarAdjudicada = new javax.swing.JButton();
        btnEliminarContratacion5 = new javax.swing.JButton();
        PanelObjetosAdj = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        cmbModalidadAdjudicada9 = new javax.swing.JComboBox<>();
        rbtPBAdjudicada8 = new javax.swing.JRadioButton();
        rbtGyRAdjudicada8 = new javax.swing.JRadioButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        rbtHabilesAdjudicada8 = new javax.swing.JRadioButton();
        txtEntregaAdjudicada8 = new javax.swing.JTextField();
        rbtNaturalesAdjudicada8 = new javax.swing.JRadioButton();
        txtContratacionAdjudicada = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        lblLugarr8 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        scpObservacionesAdjudicada8 = new javax.swing.JScrollPane();
        txaObservacionAdjudicada8 = new javax.swing.JTextArea();
        rbtDudaAdjudicada8 = new javax.swing.JRadioButton();
        rbtFirmeAdjudicada8 = new javax.swing.JRadioButton();
        txtEncargadoAdjudicada8 = new javax.swing.JTextField();
        txtInstitución8 = new javax.swing.JTextField();
        txtDescripcionAdjudicada8 = new javax.swing.JTextField();
        pnlOrden = new javax.swing.JPanel();
        txtContratacionOrden = new javax.swing.JTextField();
        txtEntregaOrden = new javax.swing.JTextField();
        txtVigenciaContrato = new javax.swing.JTextField();
        txtDescripcionOrden = new javax.swing.JTextField();
        txtNumeroOrden = new javax.swing.JTextField();
        txtLugarEntOrden = new javax.swing.JTextField();
        txtEncargadoOrden = new javax.swing.JTextField();
        jdcLimiteOrden = new com.toedter.calendar.JDateChooser();
        scpOrden = new javax.swing.JScrollPane();
        tblOrden = new javax.swing.JTable();
        scpObservacionesOrden = new javax.swing.JScrollPane();
        txaObservacionesOrden = new javax.swing.JTextArea();
        btnInsertarOrden = new javax.swing.JButton();
        btnModificarOrden = new javax.swing.JButton();
        btnBuscarOrden = new javax.swing.JButton();
        btnLimpiarOrden = new javax.swing.JButton();
        btnEliminarOrden = new javax.swing.JButton();
        cmbOrden_Orden = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        cmbModalidadAdjudicada1 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        pnlEntregada = new javax.swing.JPanel();
        txtContratacionEntregada = new javax.swing.JTextField();
        txtEntregaEntregada = new javax.swing.JTextField();
        txtDescripcionEntregada = new javax.swing.JTextField();
        txtLugarEntregada = new javax.swing.JTextField();
        txtEncargadoEntregada = new javax.swing.JTextField();
        jdcFechaEntregada = new com.toedter.calendar.JDateChooser();
        cmbModalidadEntregada = new javax.swing.JComboBox<>();
        cmbOrdenEntregada = new javax.swing.JComboBox<>();
        rbtGyREntregada = new javax.swing.JRadioButton();
        rbtPBEntregada = new javax.swing.JRadioButton();
        scpObservacionesEntregada = new javax.swing.JScrollPane();
        txaObservacionesEntregada = new javax.swing.JTextArea();
        spnEntregada = new javax.swing.JScrollPane();
        tblEntregada = new javax.swing.JTable();
        btnInsertarEntregada = new javax.swing.JButton();
        btnModificarEntrega = new javax.swing.JButton();
        btnBuscarEntregada = new javax.swing.JButton();
        btnLimpiarEntregada = new javax.swing.JButton();
        btnEliminarEntregada = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

        scpAdjudicada.setViewportView(tblAdjudicada);

        PanelControlAdj.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Tabla"));

        jLabel8.setText("Buscar");

        cmbBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contratación", "Institución", "Descripción", "Fecha de Publicación", "Fecha de Apertura", "Estado", "Encargado" }));

        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        btnRefrescar.setText("Refrescar");

        javax.swing.GroupLayout PanelControlAdjLayout = new javax.swing.GroupLayout(PanelControlAdj);
        PanelControlAdj.setLayout(PanelControlAdjLayout);
        PanelControlAdjLayout.setHorizontalGroup(
            PanelControlAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlAdjLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelControlAdjLayout.setVerticalGroup(
            PanelControlAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlAdjLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelOpcionesAdj.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N

        btnInsertarContratacion5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarContratacion5.setText("Agregar");

        btnModificarContratacion5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarContratacion5.setText("Modificar");

        btnLimpiarAdjudicada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarAdjudicada.setText("Limpiar");

        btnEliminarContratacion5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarContratacion5.setText("Eliminar");

        javax.swing.GroupLayout PanelOpcionesAdjLayout = new javax.swing.GroupLayout(PanelOpcionesAdj);
        PanelOpcionesAdj.setLayout(PanelOpcionesAdjLayout);
        PanelOpcionesAdjLayout.setHorizontalGroup(
            PanelOpcionesAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesAdjLayout.createSequentialGroup()
                .addGroup(PanelOpcionesAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesAdjLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEliminarContratacion5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesAdjLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiarAdjudicada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesAdjLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnModificarContratacion5, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesAdjLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnInsertarContratacion5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelOpcionesAdjLayout.setVerticalGroup(
            PanelOpcionesAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesAdjLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnInsertarContratacion5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnModificarContratacion5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnLimpiarAdjudicada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnEliminarContratacion5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        PanelObjetosAdj.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        PanelObjetosAdj.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel87.setText("Modalidad entrega");
        PanelObjetosAdj.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 205, -1, -1));

        cmbModalidadAdjudicada9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Según demanda", "Cantidad definida", "Del 50%", "Parcial" }));
        PanelObjetosAdj.add(cmbModalidadAdjudicada9, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 202, 250, -1));

        btgEmpresa.add(rbtPBAdjudicada8);
        rbtPBAdjudicada8.setText("Principal Brands");
        PanelObjetosAdj.add(rbtPBAdjudicada8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        btgEmpresa.add(rbtGyRAdjudicada8);
        rbtGyRAdjudicada8.setText("GyR Grupo Asesor");
        PanelObjetosAdj.add(rbtGyRAdjudicada8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel88.setText("Empresa");
        PanelObjetosAdj.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel89.setText("Días de entrega");
        PanelObjetosAdj.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 132, -1, -1));

        btgTipo.add(rbtHabilesAdjudicada8);
        rbtHabilesAdjudicada8.setText("Hábiles");
        PanelObjetosAdj.add(rbtHabilesAdjudicada8, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 157, -1, -1));
        PanelObjetosAdj.add(txtEntregaAdjudicada8, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 129, 250, -1));

        btgTipo.add(rbtNaturalesAdjudicada8);
        rbtNaturalesAdjudicada8.setText("Naturales");
        PanelObjetosAdj.add(rbtNaturalesAdjudicada8, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 157, -1, -1));
        PanelObjetosAdj.add(txtContratacionAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 35, 250, -1));

        jLabel90.setText("Número de Contratación");
        PanelObjetosAdj.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 38, -1, -1));

        jLabel91.setText("Descripción");
        PanelObjetosAdj.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 38, -1, -1));

        lblLugarr8.setText("Institución");
        PanelObjetosAdj.add(lblLugarr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 85, -1, -1));

        jLabel92.setText("Encargado");
        PanelObjetosAdj.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 132, -1, -1));

        jLabel93.setText("Estado");
        PanelObjetosAdj.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 85, -1, -1));

        jLabel94.setText("Observación");
        PanelObjetosAdj.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 205, -1, -1));

        txaObservacionAdjudicada8.setColumns(20);
        txaObservacionAdjudicada8.setRows(5);
        scpObservacionesAdjudicada8.setViewportView(txaObservacionAdjudicada8);

        PanelObjetosAdj.add(scpObservacionesAdjudicada8, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 202, 252, -1));

        btgEstado.add(rbtDudaAdjudicada8);
        rbtDudaAdjudicada8.setText("En duda");
        PanelObjetosAdj.add(rbtDudaAdjudicada8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 83, -1, -1));

        btgEstado.add(rbtFirmeAdjudicada8);
        rbtFirmeAdjudicada8.setText("En firme");
        PanelObjetosAdj.add(rbtFirmeAdjudicada8, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 83, -1, -1));
        PanelObjetosAdj.add(txtEncargadoAdjudicada8, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 129, 252, -1));
        PanelObjetosAdj.add(txtInstitución8, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 82, 250, -1));
        PanelObjetosAdj.add(txtDescripcionAdjudicada8, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 35, 250, -1));

        javax.swing.GroupLayout PanelBaseAdjLayout = new javax.swing.GroupLayout(PanelBaseAdj);
        PanelBaseAdj.setLayout(PanelBaseAdjLayout);
        PanelBaseAdjLayout.setHorizontalGroup(
            PanelBaseAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseAdjLayout.createSequentialGroup()
                .addComponent(PanelObjetosAdj, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(PanelOpcionesAdj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBaseAdjLayout.setVerticalGroup(
            PanelBaseAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseAdjLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelBaseAdjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PanelOpcionesAdj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelObjetosAdj, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout pnlAdjudicadaLayout = new javax.swing.GroupLayout(pnlAdjudicada);
        pnlAdjudicada.setLayout(pnlAdjudicadaLayout);
        pnlAdjudicadaLayout.setHorizontalGroup(
            pnlAdjudicadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdjudicadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdjudicadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdjudicadaLayout.createSequentialGroup()
                        .addGroup(pnlAdjudicadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scpAdjudicada)
                            .addComponent(PanelBaseAdj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(pnlAdjudicadaLayout.createSequentialGroup()
                        .addComponent(PanelControlAdj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlAdjudicadaLayout.setVerticalGroup(
            pnlAdjudicadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdjudicadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBaseAdj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelControlAdj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpAdjudicada, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpContenedor.addTab("Adjudicada", pnlAdjudicada);

        pnlOrden.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlOrden.add(txtContratacionOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 250, -1));
        pnlOrden.add(txtEntregaOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 250, -1));
        pnlOrden.add(txtVigenciaContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 250, -1));
        pnlOrden.add(txtDescripcionOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 250, -1));
        pnlOrden.add(txtNumeroOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 250, -1));
        pnlOrden.add(txtLugarEntOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 250, -1));
        pnlOrden.add(txtEncargadoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 250, -1));
        pnlOrden.add(jdcLimiteOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 240, -1));

        scpOrden.setViewportView(tblOrden);

        pnlOrden.add(scpOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 963, 242));

        txaObservacionesOrden.setColumns(20);
        txaObservacionesOrden.setRows(5);
        scpObservacionesOrden.setViewportView(txaObservacionesOrden);

        pnlOrden.add(scpObservacionesOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 250, -1));

        btnInsertarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarOrden.setText("Agregar");
        pnlOrden.add(btnInsertarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btnModificarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarOrden.setText("Modificar");
        pnlOrden.add(btnModificarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        btnBuscarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscarOrden.setText("Buscar");
        pnlOrden.add(btnBuscarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        btnLimpiarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarOrden.setText("Limpiar");
        pnlOrden.add(btnLimpiarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        btnEliminarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarOrden.setText("Borrar");
        pnlOrden.add(btnEliminarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, 33));

        cmbOrden_Orden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número Orden", "Descripción", "Días de entrega", "Orden", "Facturado", "Entregado" }));
        pnlOrden.add(cmbOrden_Orden, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 307, 250, -1));

        jLabel1.setText("N° Contratación");
        pnlOrden.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, -1, -1));

        jLabel2.setText("Descripción");
        pnlOrden.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 20, -1, -1));

        jLabel3.setText("Días de entrega");
        pnlOrden.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, -1, -1));

        jLabel4.setText("N° Orden");
        pnlOrden.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 60, -1, -1));

        jLabel11.setText("Vigencia contrato");
        pnlOrden.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, 130, -1));

        jLabel12.setText("Lugar de entrega");
        pnlOrden.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 100, -1, -1));

        jLabel17.setText("Ordenar por:");
        pnlOrden.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        jLabel31.setText("Fecha límite entrega");
        pnlOrden.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 154, -1, -1));

        jLabel33.setText("Encargado");
        pnlOrden.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        jLabel41.setText("Observación");
        pnlOrden.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, 10));

        cmbModalidadAdjudicada1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Según demanda", "Cantidad definida", "Del 50%", "Parcial" }));
        pnlOrden.add(cmbModalidadAdjudicada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 250, -1));

        jLabel36.setText("Modalidad entrega");
        pnlOrden.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        tbpContenedor.addTab("Orden", pnlOrden);

        pnlEntregada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlEntregada.add(txtContratacionEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 250, -1));
        pnlEntregada.add(txtEntregaEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 250, -1));
        pnlEntregada.add(txtDescripcionEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 250, -1));
        pnlEntregada.add(txtLugarEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 250, -1));
        pnlEntregada.add(txtEncargadoEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 250, -1));
        pnlEntregada.add(jdcFechaEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 250, -1));

        cmbModalidadEntregada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Encomienda", "Proveedor", "Encargado" }));
        pnlEntregada.add(cmbModalidadEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 250, -1));

        cmbOrdenEntregada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número Orden", "Descripción", "Días de entrega", "Orden", "Facturado", "Entregado" }));
        pnlEntregada.add(cmbOrdenEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 277, 250, -1));

        btgEmpresaEnt.add(rbtGyREntregada);
        rbtGyREntregada.setText("GyR Grupo Asesor");
        pnlEntregada.add(rbtGyREntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 250, -1));

        btgEmpresaEnt.add(rbtPBEntregada);
        rbtPBEntregada.setText("Principal Brands");
        pnlEntregada.add(rbtPBEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 250, -1));

        txaObservacionesEntregada.setColumns(20);
        txaObservacionesEntregada.setRows(5);
        scpObservacionesEntregada.setViewportView(txaObservacionesEntregada);

        pnlEntregada.add(scpObservacionesEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 250, -1));

        spnEntregada.setViewportView(tblEntregada);

        pnlEntregada.add(spnEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 960, 270));

        btnInsertarEntregada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarEntregada.setText("Agregar");
        pnlEntregada.add(btnInsertarEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        btnModificarEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarEntrega.setText("Modificar");
        pnlEntregada.add(btnModificarEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        btnBuscarEntregada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscarEntregada.setText("Buscar");
        pnlEntregada.add(btnBuscarEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        btnLimpiarEntregada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarEntregada.setText("Limpiar");
        pnlEntregada.add(btnLimpiarEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        btnEliminarEntregada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarEntregada.setText("Eliminar");
        pnlEntregada.add(btnEliminarEntregada, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, 33));

        jLabel22.setText("N° Contratación");
        pnlEntregada.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, -1, -1));

        jLabel23.setText("Descripción");
        pnlEntregada.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jLabel24.setText("Días de entrega");
        pnlEntregada.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, -1, -1));

        jLabel25.setText("Medio de entrega");
        pnlEntregada.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        jLabel26.setText("Lugar de entrega");
        pnlEntregada.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel27.setText("Fecha de entrega");
        pnlEntregada.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        jLabel28.setText("Empresa");
        pnlEntregada.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        jLabel38.setText("Encargado");
        pnlEntregada.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        jLabel42.setText("Observación");
        pnlEntregada.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel34.setText("Ordenar por:");
        pnlEntregada.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, -1));

        tbpContenedor.addTab("Entregada", pnlEntregada);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpContenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpContenedor)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBaseAdj;
    private javax.swing.JPanel PanelControlAdj;
    private javax.swing.JPanel PanelObjetosAdj;
    private javax.swing.JPanel PanelOpcionesAdj;
    public javax.swing.ButtonGroup btgEmpresa;
    public javax.swing.ButtonGroup btgEmpresaEnt;
    public javax.swing.ButtonGroup btgEstado;
    public javax.swing.ButtonGroup btgTipo;
    public javax.swing.JButton btnBuscarEntregada;
    public javax.swing.JButton btnBuscarOrden;
    public javax.swing.JButton btnEliminarContratacion5;
    public javax.swing.JButton btnEliminarEntregada;
    public javax.swing.JButton btnEliminarOrden;
    public javax.swing.JButton btnInsertarContratacion5;
    public javax.swing.JButton btnInsertarEntregada;
    public javax.swing.JButton btnInsertarOrden;
    public javax.swing.JButton btnLimpiarAdjudicada;
    public javax.swing.JButton btnLimpiarEntregada;
    public javax.swing.JButton btnLimpiarOrden;
    public javax.swing.JButton btnModificarContratacion5;
    public javax.swing.JButton btnModificarEntrega;
    public javax.swing.JButton btnModificarOrden;
    public javax.swing.JButton btnRefrescar;
    public javax.swing.JComboBox<String> cmbBusqueda;
    public javax.swing.JComboBox<String> cmbModalidadAdjudicada1;
    public javax.swing.JComboBox<String> cmbModalidadAdjudicada9;
    public javax.swing.JComboBox<String> cmbModalidadEntregada;
    public javax.swing.JComboBox<String> cmbOrdenEntregada;
    public javax.swing.JComboBox<String> cmbOrden_Orden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    public com.toedter.calendar.JDateChooser jdcFechaEntregada;
    public com.toedter.calendar.JDateChooser jdcLimiteOrden;
    private javax.swing.JLabel lblLugarr8;
    private javax.swing.JPanel pnlAdjudicada;
    private javax.swing.JPanel pnlEntregada;
    private javax.swing.JPanel pnlOrden;
    public javax.swing.JRadioButton rbtDudaAdjudicada8;
    public javax.swing.JRadioButton rbtFirmeAdjudicada8;
    public javax.swing.JRadioButton rbtGyRAdjudicada8;
    public javax.swing.JRadioButton rbtGyREntregada;
    public javax.swing.JRadioButton rbtHabilesAdjudicada8;
    public javax.swing.JRadioButton rbtNaturalesAdjudicada8;
    public javax.swing.JRadioButton rbtPBAdjudicada8;
    public javax.swing.JRadioButton rbtPBEntregada;
    public javax.swing.JScrollPane scpAdjudicada;
    private javax.swing.JScrollPane scpObservacionesAdjudicada8;
    private javax.swing.JScrollPane scpObservacionesEntregada;
    private javax.swing.JScrollPane scpObservacionesOrden;
    private javax.swing.JScrollPane scpOrden;
    private javax.swing.JScrollPane spnEntregada;
    private javax.swing.JTable tblAdjudicada;
    public javax.swing.JTable tblEntregada;
    public javax.swing.JTable tblOrden;
    public javax.swing.JTabbedPane tbpContenedor;
    public javax.swing.JTextArea txaObservacionAdjudicada8;
    public javax.swing.JTextArea txaObservacionesEntregada;
    public javax.swing.JTextArea txaObservacionesOrden;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtContratacionAdjudicada;
    public javax.swing.JTextField txtContratacionEntregada;
    public javax.swing.JTextField txtContratacionOrden;
    public javax.swing.JTextField txtDescripcionAdjudicada8;
    public javax.swing.JTextField txtDescripcionEntregada;
    public javax.swing.JTextField txtDescripcionOrden;
    public javax.swing.JTextField txtEncargadoAdjudicada8;
    public javax.swing.JTextField txtEncargadoEntregada;
    public javax.swing.JTextField txtEncargadoOrden;
    public javax.swing.JTextField txtEntregaAdjudicada8;
    public javax.swing.JTextField txtEntregaEntregada;
    public javax.swing.JTextField txtEntregaOrden;
    public javax.swing.JTextField txtInstitución8;
    public javax.swing.JTextField txtLugarEntOrden;
    public javax.swing.JTextField txtLugarEntregada;
    public javax.swing.JTextField txtNumeroOrden;
    public javax.swing.JTextField txtVigenciaContrato;
    // End of variables declaration//GEN-END:variables
}
