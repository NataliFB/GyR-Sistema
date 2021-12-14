package Vista.Paneles;

/**
 * Clase para el panel que contiene Timbres, Garantias y Muestras
 *
 * @author
 */
public class Pnl_1 extends javax.swing.JPanel {

    /**
     * Constructor de la clase Pnl_1.<br>
     * Inicializa los objetos que hay dentro del panel. Como los 3 paneles de
     * timbres, garantias y muestras<br>
     * No recibe ningún parametro.
     */
    public Pnl_1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbpContenedor = new javax.swing.JTabbedPane();
        pnlGarantias = new javax.swing.JPanel();
        scpGarantias = new javax.swing.JScrollPane();
        tblGarantias = new javax.swing.JTable();
        PanelControlGarantias = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtBuscarGarantias = new javax.swing.JTextField();
        cmbBusquedaGarantias = new javax.swing.JComboBox<>();
        btnRefrescarGarantias = new javax.swing.JButton();
        PanelBaseGarantias = new javax.swing.JPanel();
        PanelOpcionesGarantias = new javax.swing.JPanel();
        btnInsertarGarantias = new javax.swing.JButton();
        btnModificarGarantias = new javax.swing.JButton();
        btnLimpiarGarantias = new javax.swing.JButton();
        btnEliminarGarantias = new javax.swing.JButton();
        PanelObjetosGarantias = new javax.swing.JPanel();
        txtContratacionGarantias = new javax.swing.JTextField();
        txtEncargadoContratacionGarantias = new javax.swing.JTextField();
        txtInstituciónGarantias = new javax.swing.JTextField();
        txtEstadoGarantias = new javax.swing.JTextField();
        txtTiempoGarantias = new javax.swing.JTextField();
        txtObjetoGarantias = new javax.swing.JTextField();
        txtMontoGarantias = new javax.swing.JTextField();
        txtEncargadoEnvioGarantias = new javax.swing.JTextField();
        scpObservacionesGarantias = new javax.swing.JScrollPane();
        txaObservacionGarantias = new javax.swing.JTextArea();
        jdcPagoGarantias = new com.toedter.calendar.JDateChooser();
        jdcDevolucionGarantias = new com.toedter.calendar.JDateChooser();
        cmbTipoGarantias = new javax.swing.JComboBox<>();
        jLabel91 = new javax.swing.JLabel();
        lblLugarr9 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        codGarantias = new javax.swing.JLabel();
        pnlTimbre = new javax.swing.JPanel();
        scpTimbres = new javax.swing.JScrollPane();
        tblTimbres = new javax.swing.JTable();
        PanelControlTimbres = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtBuscarTimbres = new javax.swing.JTextField();
        cmbBusquedaTimbres = new javax.swing.JComboBox<>();
        btnRefrescarTimbres = new javax.swing.JButton();
        PanelBaseTimbres = new javax.swing.JPanel();
        PanelOpcionesTimbres = new javax.swing.JPanel();
        btnInsertarTimbres = new javax.swing.JButton();
        btnModificarTimbres = new javax.swing.JButton();
        btnLimpiarTimbres = new javax.swing.JButton();
        btnEliminarTimbres = new javax.swing.JButton();
        PanelObjetosTimbres = new javax.swing.JPanel();
        txtContratacionTimbres = new javax.swing.JTextField();
        txtEncargadoContratacionTimbres = new javax.swing.JTextField();
        txtInstituciónTimbres = new javax.swing.JTextField();
        txtEstadoTimbres = new javax.swing.JTextField();
        txtDescripcionTimbres = new javax.swing.JTextField();
        txtMontoTimbres = new javax.swing.JTextField();
        txtEncargadoEnvioTimbres = new javax.swing.JTextField();
        scpObservacionesTimbres = new javax.swing.JScrollPane();
        txaObservacionTimbres = new javax.swing.JTextArea();
        jLabel90 = new javax.swing.JLabel();
        lblLugarr8 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        codTimbres = new javax.swing.JLabel();
        pnlMuestras = new javax.swing.JPanel();
        scpMuestras = new javax.swing.JScrollPane();
        tblMuestras = new javax.swing.JTable();
        PanelControlMuestras = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtBuscarMuestras = new javax.swing.JTextField();
        cmbBusquedaMuestras = new javax.swing.JComboBox<>();
        btnRefrescarMuestras = new javax.swing.JButton();
        PanelBaseMuestras = new javax.swing.JPanel();
        PanelOpcionesMuestras = new javax.swing.JPanel();
        btnInsertarMuestras = new javax.swing.JButton();
        btnModificarMuestras = new javax.swing.JButton();
        btnLimpiarMuestras = new javax.swing.JButton();
        btnEliminarMuestras = new javax.swing.JButton();
        PanelObjetosMuestras = new javax.swing.JPanel();
        txtContratacionMuestras = new javax.swing.JTextField();
        txtEncargadoMuestras = new javax.swing.JTextField();
        txtInstituciónMuestras = new javax.swing.JTextField();
        txtEstadoMuestras = new javax.swing.JTextField();
        txtObjetoMuestras = new javax.swing.JTextField();
        jdcFechaEntregaMuestras = new com.toedter.calendar.JDateChooser();
        jdcFechaRetiroMuestras = new com.toedter.calendar.JDateChooser();
        scpObservacionesMuestras = new javax.swing.JScrollPane();
        txaObservacionMuestras = new javax.swing.JTextArea();
        spnCantidadMuestras = new javax.swing.JSpinner();
        jLabel98 = new javax.swing.JLabel();
        lblLugarr10 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        codMuestras = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));

        scpGarantias.setViewportView(tblGarantias);

        PanelControlGarantias.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Tabla"));

        jLabel17.setText("Buscar");

        btnRefrescarGarantias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        btnRefrescarGarantias.setText("Refrescar");

        javax.swing.GroupLayout PanelControlGarantiasLayout = new javax.swing.GroupLayout(PanelControlGarantias);
        PanelControlGarantias.setLayout(PanelControlGarantiasLayout);
        PanelControlGarantiasLayout.setHorizontalGroup(
            PanelControlGarantiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlGarantiasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarGarantias, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBusquedaGarantias, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefrescarGarantias, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelControlGarantiasLayout.setVerticalGroup(
            PanelControlGarantiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlGarantiasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlGarantiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtBuscarGarantias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBusquedaGarantias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescarGarantias))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelOpcionesGarantias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N

        btnInsertarGarantias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarGarantias.setText("Agregar");

        btnModificarGarantias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarGarantias.setText("Modificar");

        btnLimpiarGarantias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarGarantias.setText("Limpiar");

        btnEliminarGarantias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarGarantias.setText("Eliminar");

        javax.swing.GroupLayout PanelOpcionesGarantiasLayout = new javax.swing.GroupLayout(PanelOpcionesGarantias);
        PanelOpcionesGarantias.setLayout(PanelOpcionesGarantiasLayout);
        PanelOpcionesGarantiasLayout.setHorizontalGroup(
            PanelOpcionesGarantiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesGarantiasLayout.createSequentialGroup()
                .addGroup(PanelOpcionesGarantiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesGarantiasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEliminarGarantias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesGarantiasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiarGarantias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesGarantiasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnModificarGarantias, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesGarantiasLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnInsertarGarantias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelOpcionesGarantiasLayout.setVerticalGroup(
            PanelOpcionesGarantiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesGarantiasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnInsertarGarantias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnModificarGarantias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnLimpiarGarantias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnEliminarGarantias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        PanelObjetosGarantias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Garantía", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        PanelObjetosGarantias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelObjetosGarantias.add(txtContratacionGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 35, 250, -1));
        PanelObjetosGarantias.add(txtEncargadoContratacionGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 252, -1));
        PanelObjetosGarantias.add(txtInstituciónGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 250, -1));
        PanelObjetosGarantias.add(txtEstadoGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 215, 250, -1));
        PanelObjetosGarantias.add(txtTiempoGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 250, -1));
        PanelObjetosGarantias.add(txtObjetoGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 125, 250, -1));
        PanelObjetosGarantias.add(txtMontoGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 250, -1));
        PanelObjetosGarantias.add(txtEncargadoEnvioGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 125, 252, -1));

        txaObservacionGarantias.setColumns(20);
        txaObservacionGarantias.setRows(5);
        scpObservacionesGarantias.setViewportView(txaObservacionGarantias);

        PanelObjetosGarantias.add(scpObservacionesGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 246, 252, 70));
        PanelObjetosGarantias.add(jdcPagoGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 35, 250, -1));
        PanelObjetosGarantias.add(jdcDevolucionGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 250, -1));

        cmbTipoGarantias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Cumplimiento", "De Participación" }));
        PanelObjetosGarantias.add(cmbTipoGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 250, -1));

        jLabel91.setText("Número de Contratación");
        PanelObjetosGarantias.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, -1, -1));

        lblLugarr9.setText("Institución");
        PanelObjetosGarantias.add(lblLugarr9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel95.setText("Encargado Contratación");
        PanelObjetosGarantias.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jLabel96.setText("Observación");
        PanelObjetosGarantias.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        jLabel53.setText("Fecha de Pago");
        PanelObjetosGarantias.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 35, -1, -1));

        jLabel54.setText("Tiempo");
        PanelObjetosGarantias.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel55.setText("Estado");
        PanelObjetosGarantias.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 215, -1, -1));

        jLabel56.setText("Objeto");
        PanelObjetosGarantias.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        jLabel57.setText("Monto");
        PanelObjetosGarantias.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel58.setText("Fecha devolución");
        PanelObjetosGarantias.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jLabel97.setText("Encargado de Envio");
        PanelObjetosGarantias.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 125, -1, -1));

        jLabel59.setText("Tipo de Garantía");
        PanelObjetosGarantias.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 215, -1, -1));

        javax.swing.GroupLayout PanelBaseGarantiasLayout = new javax.swing.GroupLayout(PanelBaseGarantias);
        PanelBaseGarantias.setLayout(PanelBaseGarantiasLayout);
        PanelBaseGarantiasLayout.setHorizontalGroup(
            PanelBaseGarantiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseGarantiasLayout.createSequentialGroup()
                .addComponent(PanelObjetosGarantias, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelOpcionesGarantias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBaseGarantiasLayout.setVerticalGroup(
            PanelBaseGarantiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseGarantiasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelBaseGarantiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PanelOpcionesGarantias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelObjetosGarantias, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        codGarantias.setText("NA");

        javax.swing.GroupLayout pnlGarantiasLayout = new javax.swing.GroupLayout(pnlGarantias);
        pnlGarantias.setLayout(pnlGarantiasLayout);
        pnlGarantiasLayout.setHorizontalGroup(
            pnlGarantiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGarantiasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGarantiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGarantiasLayout.createSequentialGroup()
                        .addComponent(PanelControlGarantias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codGarantias))
                    .addComponent(scpGarantias, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelBaseGarantias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnlGarantiasLayout.setVerticalGroup(
            pnlGarantiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGarantiasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBaseGarantias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnlGarantiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelControlGarantias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codGarantias))
                .addGap(12, 12, 12)
                .addComponent(scpGarantias, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        tbpContenedor.addTab("Garantías", pnlGarantias);

        scpTimbres.setViewportView(tblTimbres);

        PanelControlTimbres.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Tabla"));

        jLabel16.setText("Buscar");

        btnRefrescarTimbres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        btnRefrescarTimbres.setText("Refrescar");

        javax.swing.GroupLayout PanelControlTimbresLayout = new javax.swing.GroupLayout(PanelControlTimbres);
        PanelControlTimbres.setLayout(PanelControlTimbresLayout);
        PanelControlTimbresLayout.setHorizontalGroup(
            PanelControlTimbresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlTimbresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarTimbres, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBusquedaTimbres, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefrescarTimbres, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelControlTimbresLayout.setVerticalGroup(
            PanelControlTimbresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlTimbresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlTimbresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtBuscarTimbres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBusquedaTimbres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescarTimbres))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelOpcionesTimbres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N

        btnInsertarTimbres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarTimbres.setText("Agregar");

        btnModificarTimbres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarTimbres.setText("Modificar");

        btnLimpiarTimbres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarTimbres.setText("Limpiar");

        btnEliminarTimbres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarTimbres.setText("Eliminar");

        javax.swing.GroupLayout PanelOpcionesTimbresLayout = new javax.swing.GroupLayout(PanelOpcionesTimbres);
        PanelOpcionesTimbres.setLayout(PanelOpcionesTimbresLayout);
        PanelOpcionesTimbresLayout.setHorizontalGroup(
            PanelOpcionesTimbresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesTimbresLayout.createSequentialGroup()
                .addGroup(PanelOpcionesTimbresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesTimbresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEliminarTimbres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesTimbresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiarTimbres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesTimbresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnModificarTimbres, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesTimbresLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnInsertarTimbres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelOpcionesTimbresLayout.setVerticalGroup(
            PanelOpcionesTimbresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesTimbresLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnInsertarTimbres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnModificarTimbres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnLimpiarTimbres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnEliminarTimbres, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        PanelObjetosTimbres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Timbre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        PanelObjetosTimbres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelObjetosTimbres.add(txtContratacionTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 35, 250, -1));
        PanelObjetosTimbres.add(txtEncargadoContratacionTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 252, -1));
        PanelObjetosTimbres.add(txtInstituciónTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 250, -1));
        PanelObjetosTimbres.add(txtEstadoTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 215, 250, -1));
        PanelObjetosTimbres.add(txtDescripcionTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 125, 250, -1));
        PanelObjetosTimbres.add(txtMontoTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 250, -1));
        PanelObjetosTimbres.add(txtEncargadoEnvioTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 35, 252, -1));

        txaObservacionTimbres.setColumns(20);
        txaObservacionTimbres.setRows(5);
        scpObservacionesTimbres.setViewportView(txaObservacionTimbres);

        PanelObjetosTimbres.add(scpObservacionesTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 125, 252, -1));

        jLabel90.setText("Número de Contratación");
        PanelObjetosTimbres.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, -1, -1));

        lblLugarr8.setText("Institución");
        PanelObjetosTimbres.add(lblLugarr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel92.setText("Encargado Contratación");
        PanelObjetosTimbres.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jLabel94.setText("Observación");
        PanelObjetosTimbres.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 125, -1, -1));

        jLabel48.setText("Estado");
        PanelObjetosTimbres.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 215, -1, -1));

        jLabel49.setText("Descripción");
        PanelObjetosTimbres.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        jLabel50.setText("Monto");
        PanelObjetosTimbres.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel93.setText("Encargado de Envio");
        PanelObjetosTimbres.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 35, -1, -1));

        javax.swing.GroupLayout PanelBaseTimbresLayout = new javax.swing.GroupLayout(PanelBaseTimbres);
        PanelBaseTimbres.setLayout(PanelBaseTimbresLayout);
        PanelBaseTimbresLayout.setHorizontalGroup(
            PanelBaseTimbresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseTimbresLayout.createSequentialGroup()
                .addComponent(PanelObjetosTimbres, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelOpcionesTimbres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBaseTimbresLayout.setVerticalGroup(
            PanelBaseTimbresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseTimbresLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelBaseTimbresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PanelOpcionesTimbres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelObjetosTimbres, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        codTimbres.setText("NA");

        javax.swing.GroupLayout pnlTimbreLayout = new javax.swing.GroupLayout(pnlTimbre);
        pnlTimbre.setLayout(pnlTimbreLayout);
        pnlTimbreLayout.setHorizontalGroup(
            pnlTimbreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimbreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimbreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTimbreLayout.createSequentialGroup()
                        .addComponent(PanelControlTimbres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codTimbres))
                    .addComponent(scpTimbres, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelBaseTimbres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnlTimbreLayout.setVerticalGroup(
            pnlTimbreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimbreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBaseTimbres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnlTimbreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelControlTimbres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codTimbres))
                .addGap(12, 12, 12)
                .addComponent(scpTimbres, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        tbpContenedor.addTab("Timbres", pnlTimbre);

        scpMuestras.setViewportView(tblMuestras);

        PanelControlMuestras.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Tabla"));

        jLabel18.setText("Buscar");

        btnRefrescarMuestras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        btnRefrescarMuestras.setText("Refrescar");

        javax.swing.GroupLayout PanelControlMuestrasLayout = new javax.swing.GroupLayout(PanelControlMuestras);
        PanelControlMuestras.setLayout(PanelControlMuestrasLayout);
        PanelControlMuestrasLayout.setHorizontalGroup(
            PanelControlMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelControlMuestrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBusquedaMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefrescarMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelControlMuestrasLayout.setVerticalGroup(
            PanelControlMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlMuestrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtBuscarMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBusquedaMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescarMuestras))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelOpcionesMuestras.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N

        btnInsertarMuestras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnInsertarMuestras.setText("Agregar");

        btnModificarMuestras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarMuestras.setText("Modificar");

        btnLimpiarMuestras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarMuestras.setText("Limpiar");

        btnEliminarMuestras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnEliminarMuestras.setText("Eliminar");

        javax.swing.GroupLayout PanelOpcionesMuestrasLayout = new javax.swing.GroupLayout(PanelOpcionesMuestras);
        PanelOpcionesMuestras.setLayout(PanelOpcionesMuestrasLayout);
        PanelOpcionesMuestrasLayout.setHorizontalGroup(
            PanelOpcionesMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesMuestrasLayout.createSequentialGroup()
                .addGroup(PanelOpcionesMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesMuestrasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEliminarMuestras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesMuestrasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiarMuestras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesMuestrasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnModificarMuestras, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                    .addGroup(PanelOpcionesMuestrasLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnInsertarMuestras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelOpcionesMuestrasLayout.setVerticalGroup(
            PanelOpcionesMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesMuestrasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnInsertarMuestras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnModificarMuestras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnLimpiarMuestras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnEliminarMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        PanelObjetosMuestras.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Muestra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        PanelObjetosMuestras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelObjetosMuestras.add(txtContratacionMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 35, 250, -1));
        PanelObjetosMuestras.add(txtEncargadoMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 125, 252, -1));
        PanelObjetosMuestras.add(txtInstituciónMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 250, -1));
        PanelObjetosMuestras.add(txtEstadoMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 215, 250, -1));
        PanelObjetosMuestras.add(txtObjetoMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 125, 250, -1));
        PanelObjetosMuestras.add(jdcFechaEntregaMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 35, 250, -1));
        PanelObjetosMuestras.add(jdcFechaRetiroMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 250, -1));

        txaObservacionMuestras.setColumns(20);
        txaObservacionMuestras.setRows(5);
        scpObservacionesMuestras.setViewportView(txaObservacionMuestras);

        PanelObjetosMuestras.add(scpObservacionesMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 252, -1));

        spnCantidadMuestras.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        PanelObjetosMuestras.add(spnCantidadMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 250, -1));

        jLabel98.setText("Número de Contratación");
        PanelObjetosMuestras.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, -1, -1));

        lblLugarr10.setText("Institución");
        PanelObjetosMuestras.add(lblLugarr10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel99.setText("Encargado");
        PanelObjetosMuestras.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 125, -1, -1));

        jLabel100.setText("Observación");
        PanelObjetosMuestras.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jLabel60.setText("Fecha de Entrega");
        PanelObjetosMuestras.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 35, -1, -1));

        jLabel61.setText("Cantidad");
        PanelObjetosMuestras.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel62.setText("Estado");
        PanelObjetosMuestras.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 215, -1, -1));

        jLabel63.setText("Objeto");
        PanelObjetosMuestras.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        jLabel65.setText("Fecha de Retiro");
        PanelObjetosMuestras.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        javax.swing.GroupLayout PanelBaseMuestrasLayout = new javax.swing.GroupLayout(PanelBaseMuestras);
        PanelBaseMuestras.setLayout(PanelBaseMuestrasLayout);
        PanelBaseMuestrasLayout.setHorizontalGroup(
            PanelBaseMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseMuestrasLayout.createSequentialGroup()
                .addComponent(PanelObjetosMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelOpcionesMuestras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBaseMuestrasLayout.setVerticalGroup(
            PanelBaseMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseMuestrasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelBaseMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PanelOpcionesMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelObjetosMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        codMuestras.setText("NA");

        javax.swing.GroupLayout pnlMuestrasLayout = new javax.swing.GroupLayout(pnlMuestras);
        pnlMuestras.setLayout(pnlMuestrasLayout);
        pnlMuestrasLayout.setHorizontalGroup(
            pnlMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMuestrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMuestrasLayout.createSequentialGroup()
                        .addComponent(PanelControlMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codMuestras))
                    .addComponent(scpMuestras, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelBaseMuestras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnlMuestrasLayout.setVerticalGroup(
            pnlMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMuestrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBaseMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnlMuestrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelControlMuestras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codMuestras))
                .addGap(12, 12, 12)
                .addComponent(scpMuestras, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        tbpContenedor.addTab("Muestras", pnlMuestras);

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
    private javax.swing.JPanel PanelBaseGarantias;
    private javax.swing.JPanel PanelBaseMuestras;
    private javax.swing.JPanel PanelBaseTimbres;
    private javax.swing.JPanel PanelControlGarantias;
    private javax.swing.JPanel PanelControlMuestras;
    private javax.swing.JPanel PanelControlTimbres;
    private javax.swing.JPanel PanelObjetosGarantias;
    private javax.swing.JPanel PanelObjetosMuestras;
    private javax.swing.JPanel PanelObjetosTimbres;
    private javax.swing.JPanel PanelOpcionesGarantias;
    private javax.swing.JPanel PanelOpcionesMuestras;
    private javax.swing.JPanel PanelOpcionesTimbres;
    public javax.swing.JButton btnEliminarGarantias;
    public javax.swing.JButton btnEliminarMuestras;
    public javax.swing.JButton btnEliminarTimbres;
    public javax.swing.JButton btnInsertarGarantias;
    public javax.swing.JButton btnInsertarMuestras;
    public javax.swing.JButton btnInsertarTimbres;
    public javax.swing.JButton btnLimpiarGarantias;
    public javax.swing.JButton btnLimpiarMuestras;
    public javax.swing.JButton btnLimpiarTimbres;
    public javax.swing.JButton btnModificarGarantias;
    public javax.swing.JButton btnModificarMuestras;
    public javax.swing.JButton btnModificarTimbres;
    public javax.swing.JButton btnRefrescarGarantias;
    public javax.swing.JButton btnRefrescarMuestras;
    public javax.swing.JButton btnRefrescarTimbres;
    public javax.swing.JComboBox<String> cmbBusquedaGarantias;
    public javax.swing.JComboBox<String> cmbBusquedaMuestras;
    public javax.swing.JComboBox<String> cmbBusquedaTimbres;
    public javax.swing.JComboBox<String> cmbTipoGarantias;
    public javax.swing.JLabel codGarantias;
    public javax.swing.JLabel codMuestras;
    public javax.swing.JLabel codTimbres;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    public com.toedter.calendar.JDateChooser jdcDevolucionGarantias;
    public com.toedter.calendar.JDateChooser jdcFechaEntregaMuestras;
    public com.toedter.calendar.JDateChooser jdcFechaRetiroMuestras;
    public com.toedter.calendar.JDateChooser jdcPagoGarantias;
    private javax.swing.JLabel lblLugarr10;
    private javax.swing.JLabel lblLugarr8;
    private javax.swing.JLabel lblLugarr9;
    private javax.swing.JPanel pnlGarantias;
    private javax.swing.JPanel pnlMuestras;
    private javax.swing.JPanel pnlTimbre;
    public javax.swing.JScrollPane scpGarantias;
    public javax.swing.JScrollPane scpMuestras;
    private javax.swing.JScrollPane scpObservacionesGarantias;
    private javax.swing.JScrollPane scpObservacionesMuestras;
    private javax.swing.JScrollPane scpObservacionesTimbres;
    public javax.swing.JScrollPane scpTimbres;
    public javax.swing.JSpinner spnCantidadMuestras;
    public javax.swing.JTable tblGarantias;
    public javax.swing.JTable tblMuestras;
    public javax.swing.JTable tblTimbres;
    public javax.swing.JTabbedPane tbpContenedor;
    public javax.swing.JTextArea txaObservacionGarantias;
    public javax.swing.JTextArea txaObservacionMuestras;
    public javax.swing.JTextArea txaObservacionTimbres;
    public javax.swing.JTextField txtBuscarGarantias;
    public javax.swing.JTextField txtBuscarMuestras;
    public javax.swing.JTextField txtBuscarTimbres;
    public javax.swing.JTextField txtContratacionGarantias;
    public javax.swing.JTextField txtContratacionMuestras;
    public javax.swing.JTextField txtContratacionTimbres;
    public javax.swing.JTextField txtDescripcionTimbres;
    public javax.swing.JTextField txtEncargadoContratacionGarantias;
    public javax.swing.JTextField txtEncargadoContratacionTimbres;
    public javax.swing.JTextField txtEncargadoEnvioGarantias;
    public javax.swing.JTextField txtEncargadoEnvioTimbres;
    public javax.swing.JTextField txtEncargadoMuestras;
    public javax.swing.JTextField txtEstadoGarantias;
    public javax.swing.JTextField txtEstadoMuestras;
    public javax.swing.JTextField txtEstadoTimbres;
    public javax.swing.JTextField txtInstituciónGarantias;
    public javax.swing.JTextField txtInstituciónMuestras;
    public javax.swing.JTextField txtInstituciónTimbres;
    public javax.swing.JTextField txtMontoGarantias;
    public javax.swing.JTextField txtMontoTimbres;
    public javax.swing.JTextField txtObjetoGarantias;
    public javax.swing.JTextField txtObjetoMuestras;
    public javax.swing.JTextField txtTiempoGarantias;
    // End of variables declaration//GEN-END:variables
}
