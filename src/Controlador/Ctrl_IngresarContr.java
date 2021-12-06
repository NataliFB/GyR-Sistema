package Controlador;

import Consultas.Consultas_Contrataciones;
import Modelo.Mod_IngresarContr;
import Vista.Paneles.Pn_IngresarContr;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import Vista.Frames.MenuPrincipal;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Ctrl_IngresarContr implements ActionListener {

    private Pn_IngresarContr pnlC;
    private Mod_IngresarContr modC;
    private Consultas_Contrataciones consulta; 
    
    public Ctrl_IngresarContr(Pn_IngresarContr viewContratacion, Mod_IngresarContr modContratacion, Consultas_Contrataciones consultas) {
        this.pnlC = viewContratacion;
        this.modC = modContratacion;
        this.consulta = consultas;

        Iniciar();

        //Se añade los eventos a los botones
        this.pnlC.btnInsertarContratacion.addActionListener(this);
        this.pnlC.btnLimpiarContratacion.addActionListener(this);
        this.pnlC.cmbBusqueda.addActionListener(this);
        this.pnlC.btnModificarContratacion.addActionListener(this);
    }

    private void Iniciar() {
        CargarTabla();
        MetodoBuscar();
        TomarDatosContratación();
        
        // Se inicializa estados para la ventana
        //pnlC.setSize(pnlC.getPreferredSize());
        pnlC.setVisible(true);
    }

    private void Limpiar() {
        pnlC.txtContratacion.setText("");
        pnlC.txaDescripcion.setText("");
        pnlC.txtFechaPublicacion.setText("");
        pnlC.txtFechaApertura.setText("");
        pnlC.txtInstitucion.setText("");
        pnlC.btgEstado.clearSelection();

        modC.setNumContratacion("");
        modC.setDescripcion("");
        modC.setFechaPublicacion("");
        modC.setFechaApertura("");
    }
    
    private void CargarTabla(){
        pnlC.tblContrataciones.setModel(consulta.CargarContrataciones());
        Buscar();
    }
    
    private void MetodoBuscar() {
        pnlC.txtBuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                Buscar();
            }
        });
    }
    
    private void Buscar() {
        TableRowSorter modeloOrdenado = new TableRowSorter<TableModel>(pnlC.tblContrataciones.getModel());
        pnlC.tblContrataciones.setRowSorter(modeloOrdenado);
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + pnlC.txtBuscar.getText(),
                pnlC.cmbBusqueda.getSelectedIndex()));
    }
    
    private void Insertar() {
        Limpiar();
        int i;
        String Portapapeles = getPortapapeles();

        try {
            for (i = 0; i < Portapapeles.length(); i++) {
                if (Portapapeles.charAt(i) != '[') {
                    if (Character.isLetter(Portapapeles.charAt(i)) && !Character.isDigit(Portapapeles.charAt(i + 3)) || Character.isSpaceChar(Portapapeles.charAt(i))) {
                        modC.setInstitución(modC.getInstitución() + Portapapeles.charAt(i));
                    }else{
                        modC.setNumContratacion(modC.getNumContratacion() + Portapapeles.charAt(i));
                    }
                } else {
                    break;
                }
            }

            for (i = i; i < Portapapeles.length(); i++) {
                if (!(Portapapeles.charAt(i) == '/')) {
                    modC.setDescripcion(modC.getDescripcion() + Portapapeles.charAt(i));
                } else {
                    if (Character.isLetter(Portapapeles.charAt(i + 1))) {
                    } else {
                        modC.setDescripcion(modC.getDescripcion().substring(0, modC.getDescripcion().length() - 2));
                        break;
                    }

                }
            }

            for (i = i - 2; i < Portapapeles.length(); i++) {
                if (!(Portapapeles.charAt(i) == ':')) {
                    modC.setFechaPublicacion(modC.getFechaPublicacion() + Portapapeles.charAt(i));
                } else {
                    modC.setFechaPublicacion(modC.getFechaPublicacion() + ":" + Portapapeles.charAt(i + 1) + Portapapeles.charAt(i + 2));
                    break;
                }
            }

            for (i = i + 3; i < Portapapeles.length(); i++) {
                if (!(Portapapeles.charAt(i) == ':')) {
                    modC.setFechaApertura(modC.getFechaApertura() + Portapapeles.charAt(i));
                } else {
                    modC.setFechaApertura(modC.getFechaApertura() + ":" + Portapapeles.charAt(i + 1) + Portapapeles.charAt(i + 2));
                    break;
                }
            }

            modC.setNumContratacion(modC.getNumContratacion().trim());
            modC.setDescripcion(modC.getDescripcion().trim());
            modC.setFechaPublicacion(modC.getFechaPublicacion().trim());
            modC.setFechaApertura(modC.getFechaApertura().trim());
            modC.setInstitución(modC.getInstitución().trim());

            pnlC.txtContratacion.setText(modC.getNumContratacion());
            pnlC.txaDescripcion.setText(modC.getDescripcion());
            pnlC.txtFechaPublicacion.setText(modC.getFechaPublicacion());
            pnlC.txtFechaApertura.setText(modC.getFechaApertura());
            pnlC.txtInstitucion.setText(modC.getInstitución());
            
            if(JOptionPane.showConfirmDialog(null, "¿Desea continuar con los datos copiados?", "Confirmar", JOptionPane.YES_NO_OPTION) 
                    == JOptionPane.YES_OPTION){
                if(consulta.IngresarContratacion(modC)){
                    JOptionPane.showMessageDialog(null, "Contratación ingresada");
                    CargarTabla();
                }else{
                    JOptionPane.showMessageDialog(null, "Hubo un error durante el proceso");
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Verifique que lo que haya copiado sea valido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void TomarDatosContratación(){
        pnlC.tblContrataciones.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount() == 2){
                    String contratación = String.valueOf(pnlC.tblContrataciones.getModel().getValueAt(pnlC.tblContrataciones.getSelectedRow(), 0));
                    Object[] datos = consulta.BuscarContratacion(contratación);
                    pnlC.txtContratacion.setText(contratación);
                    pnlC.txtInstitucion.setText(String.valueOf(datos[0]));
                    pnlC.txaDescripcion.setText(String.valueOf(datos[1]));
                    pnlC.txtFechaPublicacion.setText(String.valueOf(datos[2]));
                    pnlC.txtFechaApertura.setText(String.valueOf(datos[3]));
                    if(String.valueOf(datos[4]).equals("Enviada")){
                        pnlC.rbtEnviada.setSelected(true);
                    }else if(String.valueOf(datos[4]).equals("Descartada")){
                        pnlC.rbtDescartada.setSelected(true);
                    }else{
                        pnlC.btgEstado.clearSelection();
                    }
                }
            }
        });
    }
    
    private void ActualizarEstado(){
        if(!(pnlC.txtContratacion.getText().isEmpty()) && (pnlC.btgEstado.isSelected(pnlC.rbtDescartada.getModel()) 
                || pnlC.btgEstado.isSelected(pnlC.rbtEnviada.getModel()))){
            String estado = "";
            if(pnlC.btgEstado.isSelected(pnlC.rbtEnviada.getModel())){
                estado = "Enviada";
            }else{
                estado = "Descartada";
            }
            if(consulta.IngresarEstado(pnlC.txtContratacion.getText(), estado)){
                JOptionPane.showMessageDialog(null, "Se actualizo con exito la contratación!");
                CargarTabla();
            }else{
                JOptionPane.showMessageDialog(null, "Hubo un error durante el proceso");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una contratación y seleccione el estado que desea agregar");
        }
    }
    
    private String getPortapapeles() {
        // Metodo para obtener lo que tenga en el portapapeles
        String Portapapeles = "";
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable t = cb.getContents(this);

        // Construimos el DataFlavor correspondiente al String java
        try {
            DataFlavor dataFlavorStringJava = new DataFlavor("application/x-java-serialized-object; class=java.lang.String");

            // Y si el dato se puede conseguir como String java, lo sacamos por pantalla
            if (t.isDataFlavorSupported(dataFlavorStringJava)) {
                Portapapeles = (String) t.getTransferData(dataFlavorStringJava);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return Portapapeles;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Eventos para los botones
        //Evento que acciona el boton de insertar contratación
        if (e.getSource() == pnlC.btnInsertarContratacion) {
            Insertar();
        }

        //Evento para el boton de limpiar
        if (e.getSource() == pnlC.btnLimpiarContratacion) {
            Limpiar();
        }
        
        if(e.getSource() == pnlC.cmbBusqueda){
            Buscar();
        }
        
        if(e.getSource() == pnlC.btnModificarContratacion){
            ActualizarEstado();
        }
    }
}
