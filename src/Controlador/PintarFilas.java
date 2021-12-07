package Controlador;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class PintarFilas extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        Color color = null;

        if (value instanceof String) {
            String Dato = String.valueOf(table.getValueAt(row, 7));
            String CadenaHex = Dato;
            String aux = "";
            for (int i = 0; i < CadenaHex.length(); i++) {
                if (CadenaHex.charAt(i) != '#') {
                    aux += CadenaHex.charAt(i);
                }
            }

            int hex = Integer.parseInt(aux, 16);
            int r = (hex & 0xFF0000) >> 16;
            int g = (hex & 0xFF00) >> 8;
            int b = (hex & 0xFF);
            color = new Color(r, g, b);
        }
        if (esOscuro(color)) {
            setForeground(Color.WHITE);
        }else{
            setForeground(Color.BLACK);
        }
        
        setBackground(color);

        return this;
    }

    public boolean esOscuro(Color color) {
        double tonoColor = 1 - (0.299 * color.getRed() + 0.587 * color.getGreen()+ 0.114 * color.getBlue()) / 255;
        if (tonoColor < 0.5) {
            return false;
        }else {
            return true;
        }
    }
}
