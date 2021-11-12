
package Vista.Paneles;

public class Pn_IngresarContr extends javax.swing.JPanel {


    public Pn_IngresarContr() {
        initComponents();
        setSize(getPreferredSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnContrataciones = new javax.swing.JScrollPane();
        tblContrataciones = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        spnContratacion = new javax.swing.JScrollPane();
        txaContratacion = new javax.swing.JTextArea();
        spnDescripcion = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        txtFechaPublicacion = new javax.swing.JTextField();
        txtFechaApertura = new javax.swing.JTextField();
        txtEstadoConcurso = new javax.swing.JTextField();
        cmbOrdenar = new javax.swing.JComboBox<>();
        btnBorrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblContrataciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° de Contratación", "Descripción", "Fecha de Publicación", "Fecha de Apertura", "Estado del Concurso"
            }
        ));
        spnContrataciones.setViewportView(tblContrataciones);

        add(spnContrataciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 401, 967, 223));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Contratación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txaContratacion.setColumns(20);
        txaContratacion.setRows(5);
        spnContratacion.setViewportView(txaContratacion);

        jPanel1.add(spnContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 44, 280, 100));

        txaDescripcion.setColumns(20);
        txaDescripcion.setRows(5);
        spnDescripcion.setViewportView(txaDescripcion);

        jPanel1.add(spnDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 44, 280, 100));
        jPanel1.add(txtFechaPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 187, 280, -1));
        jPanel1.add(txtFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 187, 280, -1));
        jPanel1.add(txtEstadoConcurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 253, 280, -1));

        cmbOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha", "Institución", "Contratación", "Monto colones", "Monto Dolares", "Renta 2%", "Cambios", "Descripción", "Estado", "Institución cedida", "Transferencia", "Banco", "Fecha Cancelado", "Efectivo", "Tarjeta", "Monto-Renta" }));
        jPanel1.add(cmbOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 150, -1));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar-archivo.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 340, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 338, -1, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 337, -1, -1));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 337, -1, -1));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 337, -1, -1));

        jLabel1.setText("Número de Contratación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 44, -1, -1));

        jLabel2.setText("Descripción");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 44, -1, -1));

        jLabel3.setText("Fecha de publicación");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 193, -1, -1));

        jLabel4.setText("Fecha de Apertura");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 193, -1, -1));

        jLabel5.setText("Estado del Concurso");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 259, -1, 17));

        jLabel18.setText("Ordenar por:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 970, 383));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBorrar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnIngresar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JComboBox<String> cmbOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane spnContratacion;
    private javax.swing.JScrollPane spnContrataciones;
    private javax.swing.JScrollPane spnDescripcion;
    public javax.swing.JTable tblContrataciones;
    public javax.swing.JTextArea txaContratacion;
    public javax.swing.JTextArea txaDescripcion;
    public javax.swing.JTextField txtEstadoConcurso;
    public javax.swing.JTextField txtFechaApertura;
    public javax.swing.JTextField txtFechaPublicacion;
    // End of variables declaration//GEN-END:variables
}
