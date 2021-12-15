
package Controlador;

import Vista.Paneles.Pnl_4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ctrl_Facturas implements ActionListener{

    private Pnl_4 panelFacturas;
    
    public Ctrl_Facturas(Pnl_4 viewPnl_4){
        this.panelFacturas = viewPnl_4;
        
        Iniciar();
        
        panelFacturas.btnLimpiarFacturas.addActionListener(this);
    }
    
    private void Iniciar(){
        panelFacturas.setVisible(true);
    }
    
    private void Limpiar(){
        panelFacturas.jdcCanceladoFacturas.setCalendar(null);
        panelFacturas.jdcFechaFacturas.setCalendar(null);
        panelFacturas.txtBancoFacturas.setText("");
        panelFacturas.txtContratacionFacturas.setText("");
        panelFacturas.txtDescripcionFacturas.setText("");
        panelFacturas.txtEstadoFacturas.setText("");
        panelFacturas.txtInstCedidaFacturas.setText("");
        panelFacturas.txtInstitucionFacturas.setText("");
        panelFacturas.txtMontoFacturas.setText("");
        panelFacturas.txtObservacionFacturas.setText("");
        panelFacturas.txtRentaFacturas.setText("");
        panelFacturas.txtTransferenciaFacturas.setText("");
        panelFacturas.btgMetodo.clearSelection();
        panelFacturas.btgMoneda.clearSelection();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == panelFacturas.btnLimpiarFacturas){
            Limpiar();
        }
    }
    
}
