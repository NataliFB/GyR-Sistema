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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlGarantias = new javax.swing.JPanel();
        txtContratacionGarantias = new javax.swing.JTextField();
        txtInstitucionGarantias = new javax.swing.JTextField();
        txtEstadoGarantias = new javax.swing.JTextField();
        txtTiempoGarantias = new javax.swing.JTextField();
        txtObjetoGarantias = new javax.swing.JTextField();
        txtMontoGarantias = new javax.swing.JTextField();
        txtEntregaGarantias = new javax.swing.JTextField();
        txtEnvioGarantias = new javax.swing.JTextField();
        jdcPagoGarantias = new com.toedter.calendar.JDateChooser();
        jdcDevolucionGarantias = new com.toedter.calendar.JDateChooser();
        btnIngresarGarantias = new javax.swing.JButton();
        btnModificarGarantias = new javax.swing.JButton();
        btnBuscarGarantias = new javax.swing.JButton();
        btnLimpiarGarantias = new javax.swing.JButton();
        btnBorrarGarantias = new javax.swing.JButton();
        cmbOrdenarGarantias = new javax.swing.JComboBox<>();
        spnObservacionesGarantias = new javax.swing.JScrollPane();
        txaObservacionesGarantias = new javax.swing.JTextArea();
        spnGarantias = new javax.swing.JScrollPane();
        tblGarantias = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        cmbTipoGarantias = new javax.swing.JComboBox<>();
        pnlTimbres = new javax.swing.JPanel();
        txtContratacionTimbres = new javax.swing.JTextField();
        txtMontoTimbres = new javax.swing.JTextField();
        txtInstitucionTimbres = new javax.swing.JTextField();
        txtEstadoTimbres = new javax.swing.JTextField();
        txtProductoTimbres = new javax.swing.JTextField();
        txtEncargadoTimbres = new javax.swing.JTextField();
        txtEnvioTimbres = new javax.swing.JTextField();
        spnObservaionesTimbres = new javax.swing.JScrollPane();
        txaObservacionesTimbres = new javax.swing.JTextArea();
        spnTimbres = new javax.swing.JScrollPane();
        tblTimbres = new javax.swing.JTable();
        btnIngresarTimbres = new javax.swing.JButton();
        btnModificarTimbres = new javax.swing.JButton();
        btnLimpiarTimbres = new javax.swing.JButton();
        btnBorrarTimbres = new javax.swing.JButton();
        btnBuscarTimbres = new javax.swing.JButton();
        cmbOrdenarTimbres = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        pnlMuestras = new javax.swing.JPanel();
        txtContratacionMuestras = new javax.swing.JTextField();
        txtObjetoMuestras = new javax.swing.JTextField();
        txtInstitucionMuestras = new javax.swing.JTextField();
        txtCantidadMuestras = new javax.swing.JTextField();
        txtEncargadoMuestras = new javax.swing.JTextField();
        txtEstadoMuestras = new javax.swing.JTextField();
        jdcEntregaMuestras = new com.toedter.calendar.JDateChooser();
        jdcRetiroMuestras = new com.toedter.calendar.JDateChooser();
        spnObservacionesMuestras = new javax.swing.JScrollPane();
        txaObservacionesMuestras = new javax.swing.JTextArea();
        spnMuestras = new javax.swing.JScrollPane();
        tblMuestras = new javax.swing.JTable();
        cmbOrdenMuestras = new javax.swing.JComboBox<>();
        btnIngresarMuestras = new javax.swing.JButton();
        btnModificarMuestras = new javax.swing.JButton();
        btnBuscarMuestras = new javax.swing.JButton();
        btnLimpiarMuestras = new javax.swing.JButton();
        btnBorrarMuestras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(979, 618));

        pnlGarantias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlGarantias.add(txtContratacionGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 250, -1));
        pnlGarantias.add(txtInstitucionGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 250, -1));
        pnlGarantias.add(txtEstadoGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 250, -1));
        pnlGarantias.add(txtTiempoGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 250, -1));
        pnlGarantias.add(txtObjetoGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 250, -1));
        pnlGarantias.add(txtMontoGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 250, -1));
        pnlGarantias.add(txtEntregaGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 250, -1));
        pnlGarantias.add(txtEnvioGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 250, -1));
        pnlGarantias.add(jdcPagoGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 250, -1));
        pnlGarantias.add(jdcDevolucionGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 250, -1));

        btnIngresarGarantias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnIngresarGarantias.setText("Ingresar");
        pnlGarantias.add(btnIngresarGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 336, -1, -1));

        btnModificarGarantias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarGarantias.setText("Modificar");
        pnlGarantias.add(btnModificarGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 336, -1, -1));

        btnBuscarGarantias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscarGarantias.setText("Buscar");
        pnlGarantias.add(btnBuscarGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 336, -1, -1));

        btnLimpiarGarantias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarGarantias.setText("Limpiar");
        pnlGarantias.add(btnLimpiarGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 337, -1, -1));

        btnBorrarGarantias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnBorrarGarantias.setText("Borrar");
        pnlGarantias.add(btnBorrarGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 339, -1, -1));

        cmbOrdenarGarantias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "Contratación", "Cumplimiento", "Monto", "Estado", "Producto", "Encargado" }));
        pnlGarantias.add(cmbOrdenarGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 342, 240, -1));

        txaObservacionesGarantias.setColumns(20);
        txaObservacionesGarantias.setRows(5);
        spnObservacionesGarantias.setViewportView(txaObservacionesGarantias);

        pnlGarantias.add(spnObservacionesGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 250, -1));

        tblGarantias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número Contrato", "Institución", "Objeto", "Monto", "Fecha pago", "Fecha solicitud", "Estado"
            }
        ));
        spnGarantias.setViewportView(tblGarantias);

        pnlGarantias.add(spnGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 391, 960, 190));

        jLabel32.setText("Número de Contratación");
        pnlGarantias.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, -1, -1));

        jLabel33.setText("Institución");
        pnlGarantias.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, -1, -1));

        jLabel34.setText("Observación");
        pnlGarantias.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel35.setText("Fecha de Pago");
        pnlGarantias.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, -1, -1));

        jLabel36.setText("Estado");
        pnlGarantias.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, -1, -1));

        jLabel37.setText("Tiempo");
        pnlGarantias.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 191, -1, -1));

        jLabel38.setText("Fecha devolución");
        pnlGarantias.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 23, -1, -1));

        jLabel39.setText("Objeto");
        pnlGarantias.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 65, -1, -1));

        jLabel40.setText("Encargado Contratación");
        pnlGarantias.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 149, -1, -1));

        jLabel41.setText("Monto");
        pnlGarantias.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 107, -1, -1));

        jLabel42.setText("Tipo de Garantía");
        pnlGarantias.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 230, -1, -1));

        jLabel15.setText("Ordenar por:");
        pnlGarantias.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 345, -1, -1));

        jLabel43.setText("Encargo de envio");
        pnlGarantias.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 191, -1, -1));

        cmbTipoGarantias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "De Cumplimiento", "De Participación" }));
        pnlGarantias.add(cmbTipoGarantias, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 250, -1));

        jTabbedPane1.addTab("Garantías", pnlGarantias);

        pnlTimbres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlTimbres.add(txtContratacionTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 250, -1));
        pnlTimbres.add(txtMontoTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 250, -1));
        pnlTimbres.add(txtInstitucionTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 250, -1));
        pnlTimbres.add(txtEstadoTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 250, -1));
        pnlTimbres.add(txtProductoTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 250, -1));
        pnlTimbres.add(txtEncargadoTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 250, -1));
        pnlTimbres.add(txtEnvioTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 250, -1));

        txaObservacionesTimbres.setColumns(20);
        txaObservacionesTimbres.setRows(5);
        spnObservaionesTimbres.setViewportView(txaObservacionesTimbres);

        pnlTimbres.add(spnObservaionesTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 250, -1));

        tblTimbres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Contrato", "Institución", "Producto", "Monto", "Estado", "Enc. de Contratacion", "Enc. de Envio", "Observaciones"
            }
        ));
        spnTimbres.setViewportView(tblTimbres);

        pnlTimbres.add(spnTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 354, 960, 235));

        btnIngresarTimbres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnIngresarTimbres.setText("Ingresar");
        pnlTimbres.add(btnIngresarTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, -1, -1));

        btnModificarTimbres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarTimbres.setText("Modificar");
        pnlTimbres.add(btnModificarTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 299, -1, -1));

        btnLimpiarTimbres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarTimbres.setText("Limpiar");
        pnlTimbres.add(btnLimpiarTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 300, -1, -1));

        btnBorrarTimbres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnBorrarTimbres.setText("Borrar");
        pnlTimbres.add(btnBorrarTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 302, -1, -1));

        btnBuscarTimbres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscarTimbres.setText("Buscar");
        pnlTimbres.add(btnBuscarTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 299, -1, -1));

        cmbOrdenarTimbres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contratación", "Monto", "Estado", "Producto", "Encargado" }));
        pnlTimbres.add(cmbOrdenarTimbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 182, -1));

        jLabel1.setText("Número de Contratación");
        pnlTimbres.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, -1, -1));

        jLabel2.setText("Descripción/Producto");
        pnlTimbres.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 23, -1, -1));

        jLabel3.setText("Monto");
        pnlTimbres.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, -1, -1));

        jLabel4.setText("Encargado contratación");
        pnlTimbres.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 65, -1, -1));

        jLabel5.setText("Estado");
        pnlTimbres.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, -1, -1));

        jLabel6.setText("Ordenar por:");
        pnlTimbres.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 308, -1, -1));

        jLabel25.setText("Institución");
        pnlTimbres.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, -1, -1));

        jLabel27.setText("Encargado de envio");
        pnlTimbres.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 107, -1, -1));

        jLabel44.setText("Observación");
        pnlTimbres.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 193, -1, -1));

        jTabbedPane1.addTab("Timbres", pnlTimbres);

        pnlMuestras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlMuestras.add(txtContratacionMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 250, -1));
        pnlMuestras.add(txtObjetoMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 250, -1));
        pnlMuestras.add(txtInstitucionMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 250, -1));
        pnlMuestras.add(txtCantidadMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 250, -1));
        pnlMuestras.add(txtEncargadoMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 250, -1));
        pnlMuestras.add(txtEstadoMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 250, -1));
        pnlMuestras.add(jdcEntregaMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 250, -1));
        pnlMuestras.add(jdcRetiroMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 250, -1));

        txaObservacionesMuestras.setColumns(20);
        txaObservacionesMuestras.setRows(5);
        spnObservacionesMuestras.setViewportView(txaObservacionesMuestras);

        pnlMuestras.add(spnObservacionesMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 250, -1));

        tblMuestras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número Contrato", "Objeto", "Cantidad", "Fecha Entrega", "Fecha Retiro", "Estado", "Descripción"
            }
        ));
        spnMuestras.setViewportView(tblMuestras);

        pnlMuestras.add(spnMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 346, 970, 243));

        cmbOrdenMuestras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número Contratación", "Objeto", "Fecha entrega", "Fecha retiro", "Estado" }));
        pnlMuestras.add(cmbOrdenMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));

        btnIngresarMuestras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnIngresarMuestras.setText("Ingresar");
        pnlMuestras.add(btnIngresarMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 291, -1, -1));

        btnModificarMuestras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificarMuestras.setText("Modificar");
        pnlMuestras.add(btnModificarMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 291, -1, -1));

        btnBuscarMuestras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscarMuestras.setText("Buscar");
        pnlMuestras.add(btnBuscarMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 291, -1, -1));

        btnLimpiarMuestras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiarMuestras.setText("Limpiar");
        pnlMuestras.add(btnLimpiarMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 292, -1, -1));

        btnBorrarMuestras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnBorrarMuestras.setText("Borrar");
        pnlMuestras.add(btnBorrarMuestras, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 294, -1, -1));

        jLabel7.setText("Número de Contratación");
        pnlMuestras.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, -1, -1));

        jLabel8.setText("Objeto");
        pnlMuestras.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, -1, -1));

        jLabel9.setText("Encargado");
        pnlMuestras.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 65, -1, -1));

        jLabel10.setText("Cantidad");
        pnlMuestras.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 23, -1, -1));

        jLabel11.setText("Fecha entrega");
        pnlMuestras.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 146, -1, -1));

        jLabel12.setText("Fecha retiro");
        pnlMuestras.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 107, -1, -1));

        jLabel13.setText("Estado");
        pnlMuestras.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 144, -1, -1));

        jLabel14.setText("Ordenar por");
        pnlMuestras.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 300, -1, -1));

        jLabel23.setText("Institución");
        pnlMuestras.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 104, -1, -1));

        jLabel45.setText("Observación");
        pnlMuestras.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, -1, -1));

        jTabbedPane1.addTab("Muestras", pnlMuestras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBorrarGarantias;
    public javax.swing.JButton btnBorrarMuestras;
    public javax.swing.JButton btnBorrarTimbres;
    public javax.swing.JButton btnBuscarGarantias;
    public javax.swing.JButton btnBuscarMuestras;
    public javax.swing.JButton btnBuscarTimbres;
    public javax.swing.JButton btnIngresarGarantias;
    public javax.swing.JButton btnIngresarMuestras;
    public javax.swing.JButton btnIngresarTimbres;
    public javax.swing.JButton btnLimpiarGarantias;
    public javax.swing.JButton btnLimpiarMuestras;
    public javax.swing.JButton btnLimpiarTimbres;
    public javax.swing.JButton btnModificarGarantias;
    public javax.swing.JButton btnModificarMuestras;
    public javax.swing.JButton btnModificarTimbres;
    public javax.swing.JComboBox<String> cmbOrdenMuestras;
    public javax.swing.JComboBox<String> cmbOrdenarGarantias;
    public javax.swing.JComboBox<String> cmbOrdenarTimbres;
    public javax.swing.JComboBox<String> cmbTipoGarantias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTabbedPane jTabbedPane1;
    public com.toedter.calendar.JDateChooser jdcDevolucionGarantias;
    public com.toedter.calendar.JDateChooser jdcEntregaMuestras;
    public com.toedter.calendar.JDateChooser jdcPagoGarantias;
    public com.toedter.calendar.JDateChooser jdcRetiroMuestras;
    public javax.swing.JPanel pnlGarantias;
    public javax.swing.JPanel pnlMuestras;
    public javax.swing.JPanel pnlTimbres;
    public javax.swing.JScrollPane spnGarantias;
    private javax.swing.JScrollPane spnMuestras;
    private javax.swing.JScrollPane spnObservacionesGarantias;
    private javax.swing.JScrollPane spnObservacionesMuestras;
    private javax.swing.JScrollPane spnObservaionesTimbres;
    private javax.swing.JScrollPane spnTimbres;
    private javax.swing.JTable tblGarantias;
    public javax.swing.JTable tblMuestras;
    public javax.swing.JTable tblTimbres;
    public javax.swing.JTextArea txaObservacionesGarantias;
    public javax.swing.JTextArea txaObservacionesMuestras;
    public javax.swing.JTextArea txaObservacionesTimbres;
    public javax.swing.JTextField txtCantidadMuestras;
    public javax.swing.JTextField txtContratacionGarantias;
    public javax.swing.JTextField txtContratacionMuestras;
    public javax.swing.JTextField txtContratacionTimbres;
    public javax.swing.JTextField txtEncargadoMuestras;
    public javax.swing.JTextField txtEncargadoTimbres;
    public javax.swing.JTextField txtEntregaGarantias;
    public javax.swing.JTextField txtEnvioGarantias;
    public javax.swing.JTextField txtEnvioTimbres;
    public javax.swing.JTextField txtEstadoGarantias;
    public javax.swing.JTextField txtEstadoMuestras;
    public javax.swing.JTextField txtEstadoTimbres;
    public javax.swing.JTextField txtInstitucionGarantias;
    public javax.swing.JTextField txtInstitucionMuestras;
    public javax.swing.JTextField txtInstitucionTimbres;
    public javax.swing.JTextField txtMontoGarantias;
    public javax.swing.JTextField txtMontoTimbres;
    public javax.swing.JTextField txtObjetoGarantias;
    public javax.swing.JTextField txtObjetoMuestras;
    public javax.swing.JTextField txtProductoTimbres;
    public javax.swing.JTextField txtTiempoGarantias;
    // End of variables declaration//GEN-END:variables
}
