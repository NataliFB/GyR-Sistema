package Controlador;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Clase para pintar las filas de las tablas en las ventanas con tablas
 *
 * @author
 */
public class PintarFilas extends DefaultTableCellRenderer {

    /**
     * Metodo abstracto proveniente de la clase DefaultTableCellRender para
     * poder modificar las celas de las tablas
     *
     * @param table Recibe la tabla a la cual se va a aplicar
     * @param value Recibe el valor que contenga alguna celda en especifico
     * @param isSelected Recibe si la celda está seleccionada
     * @param hasFocus Recibe si la celda está enfocada
     * @param row Recibe la fila seleccionada
     * @param column Recibe la columna selecciona
     * @return Devuelve el mismpo metodo para aplicarle el diseño o cambios
     * correspondientes
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        Color color = null;

        String Dato = String.valueOf(table.getValueAt(row, table.getColumnCount() - 1));
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
        
        if (esOscuro(color)) {
            setForeground(Color.WHITE);
        } else {
            setForeground(Color.BLACK);
        }

        setBackground(color);

        return this;
    }

    //Este es un metodo para saber si un color es oscuro o claro
    private boolean esOscuro(Color color) {
        double tonoColor = 1 - (0.299 * color.getRed() + 0.587 * color.getGreen() + 0.114 * color.getBlue()) / 255;
        if (tonoColor < 0.5) {
            return false;
        } else {
            return true;
        }
    }
}
