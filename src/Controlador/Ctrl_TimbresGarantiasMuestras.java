
package Controlador;

import Vista.Paneles.Pnl_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ctrl_TimbresGarantiasMuestras implements ActionListener{
    
    private Pnl_1 panelTimbres;
    
    public Ctrl_TimbresGarantiasMuestras(Pnl_1 viewPanel1){
        this.panelTimbres = viewPanel1;
        
        Iniciar();
        
        panelTimbres.btnLimpiarGarantias.addActionListener(this);
        panelTimbres.btnLimpiarTimbres.addActionListener(this);
        panelTimbres.btnLimpiarMuestras.addActionListener(this);
    }
    
    private void Iniciar(){
        panelTimbres.setSize(panelTimbres.getPreferredSize());
        panelTimbres.setVisible(true);
    }
    
    private void Limpiar(){
        panelTimbres.jdcPagoGarantias.setCalendar(null);
        panelTimbres.jdcDevolucionGarantias.setCalendar(null);
        panelTimbres.jdcEntregaMuestras.setCalendar(null);
        panelTimbres.jdcRetiroMuestras.setCalendar(null);
        panelTimbres.txaObservacionesGarantias.setText("");
        panelTimbres.txaObservacionesMuestras.setText("");
        panelTimbres.txaObservacionesTimbres.setText("");
        panelTimbres.txtCantidadMuestras.setText("");
        panelTimbres.txtContratacionGarantias.setText("");
        panelTimbres.txtContratacionMuestras.setText("");
        panelTimbres.txtContratacionTimbres.setText("");
        panelTimbres.txtEncargadoMuestras.setText("");
        panelTimbres.txtEncargadoTimbres.setText("");
        panelTimbres.txtEntregaGarantias.setText("");
        panelTimbres.txtEnvioGarantias.setText("");
        panelTimbres.txtEstadoGarantias.setText("");
        panelTimbres.txtEstadoMuestras.setText("");
        panelTimbres.txtEstadoTimbres.setText("");
        panelTimbres.txtInstitucionGarantias.setText("");
        panelTimbres.txtInstitucionMuestras.setText("");
        panelTimbres.txtInstitucionTimbres.setText("");
        panelTimbres.txtMontoGarantias.setText("");
        panelTimbres.txtMontoTimbres.setText("");
        panelTimbres.txtObjetoGarantias.setText("");
        panelTimbres.txtObjetoMuestras.setText("");
        panelTimbres.txtProductoTimbres.setText("");
        panelTimbres.txtTiempoGarantias.setText("");
        panelTimbres.txtEnvioTimbres.setText("");
        panelTimbres.cmbOrdenMuestras.setSelectedIndex(0);
        panelTimbres.cmbOrdenarGarantias.setSelectedIndex(0);
        panelTimbres.cmbOrdenarTimbres.setSelectedIndex(0);
        panelTimbres.cmbTipoGarantias.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == panelTimbres.btnLimpiarGarantias || e.getSource() == panelTimbres.btnLimpiarMuestras ||
                e.getSource() == panelTimbres.btnLimpiarTimbres){
            Limpiar();
        }
        
        
    }
    
}
