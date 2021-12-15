
package Controlador;

import Vista.Paneles.Pnl_5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ctrl_Renta implements ActionListener{

    private Pnl_5 panelRenta;
    
    public Ctrl_Renta(Pnl_5 viewPnl_5){
        this.panelRenta = viewPnl_5;
        
        Iniciar();
        
        panelRenta.btnLimpiarRenta.addActionListener(this);
    }
    
    private void Iniciar(){
        panelRenta.setVisible(true);
    }
    
    private void Limpíar(){
        panelRenta.jdcFechaRenta.setCalendar(null);
        panelRenta.txtCedulaRenta.setText("");
        panelRenta.txtContratacionRenta.setText("");
        panelRenta.txtDescripcionRenta.setText("");
        panelRenta.txtFacturaRenta.setText("");
        panelRenta.txtIVARenta.setText("");
        panelRenta.txtNacionalidadRenta.setText("");
        panelRenta.txtProveedorRenta.setText("");
        panelRenta.txtSubtotalRenta.setText("");
        panelRenta.txtTelefonoRenta.setText("");
        panelRenta.txtTotalRenta.setText("");
        panelRenta.txtrenta.setText("");
        panelRenta.cbmModalidadRenta.setSelectedIndex(0);
        panelRenta.btgMoneda.clearSelection();        
        panelRenta.btgTipo.clearSelection();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == panelRenta.btnLimpiarRenta){
            Limpíar();
        }
    }
    
}
