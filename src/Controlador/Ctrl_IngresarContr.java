package Controlador;

import Modelo.Mod_IngresarContr;
import Vista.Paneles.Pn_IngresarContr;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import Vista.Frames.MenuPrincipal;

public class Ctrl_IngresarContr implements ActionListener {

    private Pn_IngresarContr pnlC;
    private Mod_IngresarContr modC;

    public Ctrl_IngresarContr(Pn_IngresarContr viewContratacion, Mod_IngresarContr modContratacion) {
        this.pnlC = viewContratacion;
        this.modC = modContratacion;

        Iniciar();

        //Se añade los eventos a los botones
        this.pnlC.btnInsertarContratacion.addActionListener(this);
        this.pnlC.btnLimpiarContratacion.addActionListener(this);
    }

    private void Iniciar() {
        // Se inicializa estados para la ventana
        pnlC.setSize(pnlC.getPreferredSize());
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
    }

    private void Limpiar() {
        pnlC.txaContratacion.setText("");
        pnlC.txaDescripcion.setText("");
        pnlC.txtFechaPublicacion.setText("");
        pnlC.txtFechaApertura.setText("");

        modC.setNumContratacion("");
        modC.setDescripcion("");
        modC.setFechaPublicacion("");
        modC.setFechaApertura("");
    }

    private void Insertar() {
        Limpiar();
        int i;
        String Portapapeles = getPortapapeles();

        for (i = 0; i < Portapapeles.length(); i++) {
            if (Portapapeles.charAt(i) != '[') {
                modC.setNumContratacion(modC.getNumContratacion() + Portapapeles.charAt(i));
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

        pnlC.txaContratacion.setText(modC.getNumContratacion());
        pnlC.txaDescripcion.setText(modC.getDescripcion());
        pnlC.txtFechaPublicacion.setText(modC.getFechaPublicacion());
        pnlC.txtFechaApertura.setText(modC.getFechaApertura());
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

}