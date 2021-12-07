
package Controlador;

import Vista.Paneles.Pnl_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ctrl_Adjudicaciones implements ActionListener{
    
    private Pnl_2 panelAdjudicaiones;
    
    public Ctrl_Adjudicaciones(Pnl_2 viewPnl_2){
        this.panelAdjudicaiones = viewPnl_2;
        
        Iniciar();
        
        panelAdjudicaiones.btnLimpiarAdjudicada.addActionListener(this);
        panelAdjudicaiones.btnLimpiarEntregada.addActionListener(this);
        panelAdjudicaiones.btnLimpiarOrden.addActionListener(this);
    }
    
    private void Iniciar(){
        panelAdjudicaiones.setVisible(true);
    }
    
    public void Limpiar(){
//        panelAdjudicaiones.btgEmpresa.clearSelection();
//        panelAdjudicaiones.btgEmpresaEnt.clearSelection();
//        panelAdjudicaiones.btgEstado.clearSelection();
//        panelAdjudicaiones.btgTipo.clearSelection();
//        panelAdjudicaiones.jdcFechaEntregada.setCalendar(null);
//        panelAdjudicaiones.jdcLimiteOrden.setCalendar(null);
//        panelAdjudicaiones.txaObservacionAdjudicada.setText("");
//        panelAdjudicaiones.txaObservacionesEntregada.setText("");
//        panelAdjudicaiones.txaObservacionesOrden.setText("");
//        panelAdjudicaiones.txtContratacionAdjudicada.setText("");
//        panelAdjudicaiones.txtContratacionEntregada.setText("");
//        panelAdjudicaiones.txtContratacionOrden.setText("");
//        panelAdjudicaiones.txtDescripcionAdjudicada.setText("");
//        panelAdjudicaiones.txtDescripcionEntregada.setText("");
//        panelAdjudicaiones.txtDescripcionOrden.setText("");
//        panelAdjudicaiones.txtEncargadoAdjudicada.setText("");
//        panelAdjudicaiones.txtEncargadoEntregada.setText("");
//        panelAdjudicaiones.txtEncargadoOrden.setText("");
//        panelAdjudicaiones.txtEntregaEntregada.setText("");
//        panelAdjudicaiones.txtEntregaOrden.setText("");
//        panelAdjudicaiones.txtEntregaAdjudicada.setText("");
//        panelAdjudicaiones.txtLugarEntOrden.setText("");
//        panelAdjudicaiones.txtLugarEntregada.setText("");
//        panelAdjudicaiones.txtInstitución.setText("");
//        panelAdjudicaiones.txtNumeroOrden.setText("");
//        panelAdjudicaiones.txtVigenciaContrato.setText("");
//        panelAdjudicaiones.cmbModalidadAdjudicada.setSelectedIndex(0);
//        panelAdjudicaiones.cmbModalidadAdjudicada1.setSelectedIndex(0);
//        panelAdjudicaiones.cmbModalidadEntregada.setSelectedIndex(0);
//        panelAdjudicaiones.cmbOrdenEntregada.setSelectedIndex(0);
//        panelAdjudicaiones.cmbOrden_Orden.setSelectedIndex(0);
//        panelAdjudicaiones.cmbOrdenarAdjudicaciones.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == panelAdjudicaiones.btnLimpiarAdjudicada || e.getSource() == panelAdjudicaiones.btnLimpiarEntregada
                || e.getSource() == panelAdjudicaiones.btnLimpiarOrden){
            Limpiar();
        }
    }
    
}
