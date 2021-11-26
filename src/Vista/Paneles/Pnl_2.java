
package Vista.Paneles;

public class Pnl_2 extends javax.swing.JPanel {

    public Pnl_2() {
        initComponents();
        setSize(getPreferredSize());
    }

    public void Limpiar(){
        btgEmpresa.clearSelection();
        btgEmpresaEnt.clearSelection();
        btgEstado.clearSelection();
        btgTipo.clearSelection();
        jdcFechaEntregada.setCalendar(null);
        jdcLimiteOrden.setCalendar(null);
        txaObservacionAdjudicada.setText("");
        txaObservacionesEntregada.setText("");
        txaObservacionesOrden.setText("");
        txtContratacionAdjudicada.setText("");
        txtContratacionEntregada.setText("");
        txtContratacionOrden.setText("");
        txtDescripcionAdjudicada.setText("");
        txtDescripcionEntregada.setText("");
        txtDescripcionOrden.setText("");
        txtEncargadoAdjudicada.setText("");
        txtEncargadoEntregada.setText("");
        txtEncargadoOrden.setText("");
        txtEntregaEntregada.setText("");
        txtEntregaOrden.setText("");
        txtEntregaAdjudicada.setText("");
        txtLugarEntOrden.setText("");
        txtLugarEntregada.setText("");
        txtLugar.setText("");
        txtNumeroOrden.setText("");
        txtVigenciaContrato.setText("");
        cmbModalidadAdjudicada.setSelectedIndex(0);
        cmbModalidadAdjudicada1.setSelectedIndex(0);
        cmbModalidadEntregada.setSelectedIndex(0);
        cmbOrdenEntregada.setSelectedIndex(0);
        cmbOrden_Orden.setSelectedIndex(0);
        cmbOrdenarAdjudicaciones.setSelectedIndex(0);
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
        txtContratacionAdjudicada = new javax.swing.JTextField();
        txtEntregaAdjudicada = new javax.swing.JTextField();
        txtDescripcionAdjudicada = new javax.swing.JTextField();
        txtLugar = new javax.swing.JTextField();
        txtEncargadoAdjudicada = new javax.swing.JTextField();
        rbtHabilesAdjudicada = new javax.swing.JRadioButton();
        rbtNaturalesAdjudicada = new javax.swing.JRadioButton();
        rbtGyRAdjudicada = new javax.swing.JRadioButton();
        rbtPBAdjudicada = new javax.swing.JRadioButton();
        rbtFirmeAdjudicada = new javax.swing.JRadioButton();
        rbtDudaAdjudicada = new javax.swing.JRadioButton();
        cmbModalidadAdjudicada = new javax.swing.JComboBox<>();
        cmbOrdenarAdjudicaciones = new javax.swing.JComboBox<>();
        btnInsertarAdjudicada = new javax.swing.JButton();
        btnModificarAdjudicada = new javax.swing.JButton();
        btnBuscarAdjudicada = new javax.swing.JButton();
        btnLimpiarAdjudicada = new javax.swing.JButton();
        btnBorrarAdjudicada = new javax.swing.JButton();
        scpAdjudicada = new javax.swing.JScrollPane();
        tblAdjudicada = new javax.swing.JTable();
        scpObservacionesAdjudicada = new javax.swing.JScrollPane();
        txaObservacionAdjudicada = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblLugarr = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
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

        pnlAdjudicada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlAdjudicada.add(txtContratacionAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 250, -1));
        pnlAdjudicada.add(txtEntregaAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 250, -1));
        pnlAdjudicada.add(txtDescripcionAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 250, -1));
        pnlAdjudicada.add(txtLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 250, -1));
        pnlAdjudicada.add(txtEncargadoAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 250, -1));

        btgTipo.add(rbtHabilesAdjudicada);
        rbtHabilesAdjudicada.setText("Hábiles");
        pnlAdjudicada.add(rbtHabilesAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        btgTipo.add(rbtNaturalesAdjudicada);
        rbtNaturalesAdjudicada.setText("Naturales");
        pnlAdjudicada.add(rbtNaturalesAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        btgEmpresa.add(rbtGyRAdjudicada);
        rbtGyRAdjudicada.setText("GyR Grupo Asesor");
        pnlAdjudicada.add(rbtGyRAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        btgEmpresa.add(rbtPBAdjudicada);
        rbtPBAdjudicada.setText("Principal Brands");
        pnlAdjudicada.add(rbtPBAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        btgEstado.add(rbtFirmeAdjudicada);
        rbtFirmeAdjudicada.setText("En firme");
        pnlAdjudicada.add(rbtFirmeAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        btgEstado.add(rbtDudaAdjudicada);
        rbtDudaAdjudicada.setText("En duda");
        pnlAdjudicada.add(rbtDudaAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        cmbModalidadAdjudicada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Según demanda", "Cantidad definida", "Del 50%", "Parcial" }));
        pnlAdjudicada.add(cmbModalidadAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 250, -1));

        cmbOrdenarAdjudicaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número Orden", "Empresa", "Descripción", "Lugar/Institución", "Días de entrega", "Estado" }));
        pnlAdjudicada.add(cmbOrdenarAdjudicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 307, 250, -1));

        btnInsertarAdjudicada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarAdjudicada.setText("Agregar");
        pnlAdjudicada.add(btnInsertarAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btnModificarAdjudicada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarAdjudicada.setText("Modificar");
        pnlAdjudicada.add(btnModificarAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        btnBuscarAdjudicada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscarAdjudicada.setText("Buscar");
        pnlAdjudicada.add(btnBuscarAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        btnLimpiarAdjudicada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarAdjudicada.setText("Limpiar");
        btnLimpiarAdjudicada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarAdjudicadaActionPerformed(evt);
            }
        });
        pnlAdjudicada.add(btnLimpiarAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        btnBorrarAdjudicada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnBorrarAdjudicada.setText("Borrar");
        btnBorrarAdjudicada.setPreferredSize(new java.awt.Dimension(101, 33));
        pnlAdjudicada.add(btnBorrarAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        tblAdjudicada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Contratación", "Empresa", "M Entrega", "Descripción", "Lugar/Institución", "Días de entrega", "Estado", "Encargado", "Observaciones"
            }
        ));
        scpAdjudicada.setViewportView(tblAdjudicada);

        pnlAdjudicada.add(scpAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 960, 240));

        txaObservacionAdjudicada.setColumns(20);
        txaObservacionAdjudicada.setRows(5);
        scpObservacionesAdjudicada.setViewportView(txaObservacionAdjudicada);

        pnlAdjudicada.add(scpObservacionesAdjudicada, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 250, -1));

        jLabel5.setText("N° Contratación");
        pnlAdjudicada.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel6.setText("Descripción");
        pnlAdjudicada.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jLabel7.setText("Días de entrega");
        pnlAdjudicada.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblLugarr.setText("Lugar/Institución");
        pnlAdjudicada.add(lblLugarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel9.setText("Empresa");
        pnlAdjudicada.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel10.setText("Ordenar por:");
        pnlAdjudicada.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        jLabel16.setText("Estado");
        pnlAdjudicada.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        jLabel30.setText("Modalidad entrega");
        pnlAdjudicada.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel32.setText("Encargado");
        pnlAdjudicada.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jLabel40.setText("Observación");
        pnlAdjudicada.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

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

        tblOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Contratación", "Descripción", "Días de entrega", "V Contrato", "N° Orden", "Fecha límite", "Lugar entrega", "Encargado", "Observaciones"
            }
        ));
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
        btnLimpiarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarOrdenActionPerformed(evt);
            }
        });
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

        tblEntregada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Contratación", "Empresa", "Descripción", "Días de entrega", "Lugar de entrega", "Fecha de entrega", "Medio entrega", "Encargado", "Observaciones"
            }
        ));
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
        btnLimpiarEntregada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEntregadaActionPerformed(evt);
            }
        });
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
            .addComponent(tbpContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 630, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarAdjudicadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarAdjudicadaActionPerformed
            Limpiar();
    }//GEN-LAST:event_btnLimpiarAdjudicadaActionPerformed

    private void btnLimpiarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarOrdenActionPerformed
            Limpiar();
    }//GEN-LAST:event_btnLimpiarOrdenActionPerformed

    private void btnLimpiarEntregadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEntregadaActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarEntregadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgEmpresa;
    private javax.swing.ButtonGroup btgEmpresaEnt;
    private javax.swing.ButtonGroup btgEstado;
    private javax.swing.ButtonGroup btgTipo;
    private javax.swing.JButton btnBorrarAdjudicada;
    private javax.swing.JButton btnBuscarAdjudicada;
    private javax.swing.JButton btnBuscarEntregada;
    private javax.swing.JButton btnBuscarOrden;
    private javax.swing.JButton btnEliminarEntregada;
    private javax.swing.JButton btnEliminarOrden;
    private javax.swing.JButton btnInsertarAdjudicada;
    private javax.swing.JButton btnInsertarEntregada;
    private javax.swing.JButton btnInsertarOrden;
    private javax.swing.JButton btnLimpiarAdjudicada;
    private javax.swing.JButton btnLimpiarEntregada;
    private javax.swing.JButton btnLimpiarOrden;
    private javax.swing.JButton btnModificarAdjudicada;
    private javax.swing.JButton btnModificarEntrega;
    private javax.swing.JButton btnModificarOrden;
    private javax.swing.JComboBox<String> cmbModalidadAdjudicada;
    private javax.swing.JComboBox<String> cmbModalidadAdjudicada1;
    private javax.swing.JComboBox<String> cmbModalidadEntregada;
    private javax.swing.JComboBox<String> cmbOrdenEntregada;
    private javax.swing.JComboBox<String> cmbOrden_Orden;
    private javax.swing.JComboBox<String> cmbOrdenarAdjudicaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jdcFechaEntregada;
    private com.toedter.calendar.JDateChooser jdcLimiteOrden;
    private javax.swing.JLabel lblLugarr;
    private javax.swing.JPanel pnlAdjudicada;
    private javax.swing.JPanel pnlEntregada;
    private javax.swing.JPanel pnlOrden;
    private javax.swing.JRadioButton rbtDudaAdjudicada;
    private javax.swing.JRadioButton rbtFirmeAdjudicada;
    private javax.swing.JRadioButton rbtGyRAdjudicada;
    private javax.swing.JRadioButton rbtGyREntregada;
    private javax.swing.JRadioButton rbtHabilesAdjudicada;
    private javax.swing.JRadioButton rbtNaturalesAdjudicada;
    private javax.swing.JRadioButton rbtPBAdjudicada;
    private javax.swing.JRadioButton rbtPBEntregada;
    private javax.swing.JScrollPane scpAdjudicada;
    private javax.swing.JScrollPane scpObservacionesAdjudicada;
    private javax.swing.JScrollPane scpObservacionesEntregada;
    private javax.swing.JScrollPane scpObservacionesOrden;
    private javax.swing.JScrollPane scpOrden;
    private javax.swing.JScrollPane spnEntregada;
    private javax.swing.JTable tblAdjudicada;
    private javax.swing.JTable tblEntregada;
    private javax.swing.JTable tblOrden;
    private javax.swing.JTabbedPane tbpContenedor;
    private javax.swing.JTextArea txaObservacionAdjudicada;
    private javax.swing.JTextArea txaObservacionesEntregada;
    private javax.swing.JTextArea txaObservacionesOrden;
    private javax.swing.JTextField txtContratacionAdjudicada;
    private javax.swing.JTextField txtContratacionEntregada;
    private javax.swing.JTextField txtContratacionOrden;
    private javax.swing.JTextField txtDescripcionAdjudicada;
    private javax.swing.JTextField txtDescripcionEntregada;
    private javax.swing.JTextField txtDescripcionOrden;
    private javax.swing.JTextField txtEncargadoAdjudicada;
    private javax.swing.JTextField txtEncargadoEntregada;
    private javax.swing.JTextField txtEncargadoOrden;
    private javax.swing.JTextField txtEntregaAdjudicada;
    private javax.swing.JTextField txtEntregaEntregada;
    private javax.swing.JTextField txtEntregaOrden;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtLugarEntOrden;
    private javax.swing.JTextField txtLugarEntregada;
    private javax.swing.JTextField txtNumeroOrden;
    private javax.swing.JTextField txtVigenciaContrato;
    // End of variables declaration//GEN-END:variables
}
