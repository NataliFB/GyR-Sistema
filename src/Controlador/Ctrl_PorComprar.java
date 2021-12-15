package Controlador;

import Vista.Paneles.Pnl_3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class Ctrl_PorComprar implements ActionListener{

    private Pnl_3 panelPorComprar;

    public Ctrl_PorComprar(Pnl_3 viewPnl_3) {
        this.panelPorComprar = viewPnl_3;

        Iniciar();
        
        //panelPorComprar.btnLimpiar.addActionListener(this);
    }
    
    private void Iniciar() {
        panelPorComprar.setVisible(true);
    }
    
    private void Limpiar() {
//        panelPorComprar.txaObservacionesDemanda.setText("");
//        panelPorComprar.txtCedula.setText("");
//        panelPorComprar.txtCosto.setText("");
//        panelPorComprar.txtMontoOfertado.setText("");
//        panelPorComprar.txtNumeroContrato.setText("");
//        panelPorComprar.txtObjeto.setText("");
//        panelPorComprar.txtProveedorFan.setText("");
//        panelPorComprar.txtProveedorReal.setText("");
//        panelPorComprar.cmbOrdenDemanda.setSelectedIndex(0);
//
//        DefaultTableModel temp = (DefaultTableModel) panelPorComprar.tblBancosCuentas.getModel();
//        int filas = panelPorComprar.tblBancosCuentas.getRowCount();
//
//        for (int a = 0; filas > a; a++) {
//            temp.removeRow(0);
//        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == panelPorComprar.btnLimpiar){
//            Limpiar();
//        }
    }

}
