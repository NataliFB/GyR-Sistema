package Controlador;

import Modelo.ModIngresarContr;
import Vista.Paneles.Pn_IngresarContr;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.io.IOException;
import Vista.Frames.MenuPrincipal;

/**
 *
 * @author Aaron
 */
public class CtrlIngresarContr implements ActionListener {

    private Pn_IngresarContr pnlC;
    private ModIngresarContr modC;
    private MenuPrincipal frame;

    public CtrlIngresarContr(Pn_IngresarContr pnlContratacion, ModIngresarContr modContratacion) {
        this.pnlC = pnlContratacion;
        this.modC = modContratacion;
        this.pnlC.btnIngresar.addActionListener(this);
        this.pnlC.btnLimpiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pnlC.btnIngresar) {
            int i;
            String Portapapeles = getPortapapeles();

            for (i = 0; i < Portapapeles.length(); i++) {
                if (Portapapeles.charAt(i) != '[') {
                    modC.setNumContratacion(modC.getNumContratacion() + Portapapeles.charAt(i));
                } else {
                    break;
//                    if (Character.isLetter(Portapapeles.charAt(i + 1))) {
//                    } else {
//                        break;
//                    }
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

            for (i = i + 3; i < Portapapeles.length(); i++) {
                modC.setEstadoConcurso(modC.getEstadoConcurso() + Portapapeles.charAt(i));
            }

            modC.setNumContratacion(modC.getNumContratacion().trim());
            modC.setDescripcion(modC.getDescripcion().trim());
            modC.setFechaPublicacion(modC.getFechaPublicacion().trim());
            modC.setFechaApertura(modC.getFechaApertura().trim());
            modC.setEstadoConcurso(modC.getEstadoConcurso().trim());

            pnlC.txaContratacion.setText(modC.getNumContratacion());
            pnlC.txaDescripcion.setText(modC.getDescripcion());
            pnlC.txtFechaPublicacion.setText(modC.getFechaPublicacion());
            pnlC.txtFechaApertura.setText(modC.getFechaApertura());
            pnlC.txtEstadoConcurso.setText(modC.getEstadoConcurso());

        }

        if (e.getSource() == pnlC.btnLimpiar) {
            Limpiar();
        }
    }

    private void Limpiar() {
        pnlC.txaContratacion.setText("");
        pnlC.txaDescripcion.setText("");
        pnlC.txtFechaPublicacion.setText("");
        pnlC.txtFechaApertura.setText("");
        pnlC.txtEstadoConcurso.setText("");

        modC.setNumContratacion("");
        modC.setDescripcion("");
        modC.setFechaPublicacion("");
        modC.setFechaApertura("");
        modC.setEstadoConcurso("");
    }

    private String getPortapapeles() {
        String Portapapeles = "";
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable t = cb.getContents(this);

        // Construimos el DataFlavor correspondiente al String java
        try {
            DataFlavor dataFlavorStringJava = new DataFlavor("application/x-java-serialized-object; class=java.lang.String");

            // Y si el dato se puede conseguir como String java, lo sacamos por pantalla
            if (t.isDataFlavorSupported(dataFlavorStringJava)) {
                Portapapeles = (String) t.getTransferData(dataFlavorStringJava);
                System.out.println(Portapapeles);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return Portapapeles;
    }

}
