package Colores;

import java.awt.*;
import javax.swing.*;
import javax.swing.colorchooser.*;

public class ColorChooserPanel extends JPanel {
    static JFrame frame;
    JColorChooser chooser;
    private String RGB;
    
    JButton btnAceptar;
    JButton btnSalir;
    
    public ColorChooserPanel() {
        JPanel PanelOpciones = new JPanel();
        
        PanelOpciones.setLayout(new BoxLayout(PanelOpciones, BoxLayout.PAGE_AXIS));
        
        JPanel panelAceptar = new JPanel();
        btnAceptar = new JButton("Aceptar");
        
        panelAceptar.add(btnAceptar);
        
        JPanel panelSalir = new JPanel();
        btnSalir = new JButton("Salir");
        
        panelSalir.add(btnSalir);
        
        PanelOpciones.add(panelAceptar);
        PanelOpciones.add(panelSalir);
        
        chooser = new JColorChooser();
        AbstractColorChooserPanel[] panels = chooser.getChooserPanels();

        for (AbstractColorChooserPanel panel : panels) {
            if ("Swatches".equals(panel.getDisplayName())) {
                add(panel);
                add(PanelOpciones);
            }
        }
    }

    public void createAndShowGUI() {       
        frame = new JFrame("ColorChooserPanel");
        frame.add(new ColorChooserPanel());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible( true );
    }
    

    public void ColorChooser() {
        EventQueue.invokeLater(() -> createAndShowGUI());
    }

}
