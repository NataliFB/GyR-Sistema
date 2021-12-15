
package Controlador;

import Vista.Frames.MenuPrincipal;
import Vista.JDialogs.AgregarArticulo;
import Vista.JDialogs.AgregarCuentaBanco;
import Vista.Paneles.Pnl_Proveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ctrl_Proveedores implements ActionListener{

    private Pnl_Proveedor panelProveedor;
    
    public Ctrl_Proveedores(Pnl_Proveedor viewProveedor){
        this.panelProveedor = viewProveedor;
    
        Iniciar();
        
        panelProveedor.btnLimpiarProveedores.addActionListener(this);
        panelProveedor.btnAgregarCuentaBanco.addActionListener(this);
        panelProveedor.btnAgregarArt.addActionListener(this);
    }
    
    private void Iniciar(){
        panelProveedor.setVisible(true);
    }
    
    private void Limpiar(){
        panelProveedor.txaObservacionProv.setText("");
        panelProveedor.txtCedProv1.setText("");
        panelProveedor.txtCelProv.setText("");
        panelProveedor.txtContProv.setText("");
        panelProveedor.txtCorreoProv.setText("");
        panelProveedor.txtProvFantasia.setText("");
        panelProveedor.txtProvReal.setText("");
        panelProveedor.txtTelProv.setText("");
        panelProveedor.txtUbicacionProv.setText("");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == panelProveedor.btnLimpiarProveedores){
            Limpiar();
        }
        
        if(e.getSource() == panelProveedor.btnAgregarArt){
            MenuPrincipal mp = new MenuPrincipal();
            AgregarArticulo addArt = new AgregarArticulo(mp, true);
            addArt.setLocationRelativeTo(mp);
            addArt.setVisible(true);
        }
        
        if(e.getSource() == panelProveedor.btnAgregarCuentaBanco){
            MenuPrincipal mp = new MenuPrincipal();
            AgregarCuentaBanco addCB = new AgregarCuentaBanco(mp, true);
            addCB.setLocationRelativeTo(mp);
            addCB.setVisible(true);
        }
    }
    
}
