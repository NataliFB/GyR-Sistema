
package Controlador;

import Vista.JDialogs.VentanaPersonalizado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
public class Ctrl_VentanaPersonalizada implements ActionListener{

    private VentanaPersonalizado vp;
    private boolean permisos[];
    
    public Ctrl_VentanaPersonalizada(VentanaPersonalizado vp) {
        this.vp = vp;
    
        vp.btnAceptar.addActionListener(this);
        vp.btnSalir.addActionListener(this);
        
        Iniciar();
    }
    
    private void Iniciar(){
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);
    }
    
    public boolean[] getPermisos() {
        return permisos;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vp.btnAceptar){
            permisos = new boolean[9];
            
            if(vp.cbxIngresarContratacion.isSelected()){
                permisos[0] = true;
            }else{
                permisos[0] = false;
            }
            
            if(vp.cbxAdj.isSelected()){
                permisos[1] = true;
            }else{
                permisos[1] = false;
            }
            
            if(vp.cbxTimbres.isSelected()){
                permisos[2] = true;
            }else{
                permisos[2] = false;
            }
            
            if(vp.cbxPorComprar.isSelected()){
                permisos[3] = true;
            }else{
                permisos[3] = false;
            }
            
            if(vp.cbxFacturas.isSelected()){
                permisos[4] = true;
            }else{
                permisos[4] = false;
            }
            
            if(vp.cbxRenta.isSelected()){
                permisos[5] = true;
            }else{
                permisos[5] = false;
            }
            
            if(vp.cbxProveedores.isSelected()){
                permisos[6] = true;
            }else{
                permisos[6] = false;
            }
            
            if(vp.cbxAccesoEmpleados.isSelected()){
                permisos[7] = true;
            }else{
                permisos[7] = false;
            }
            
            if(vp.cbxAccesoContrataciones.isSelected()){
                permisos[8] = true;
            }else{
                permisos[8] = false;
            }
            
            vp.setVisible(false);
        }
        
        if(e.getSource() == vp.btnSalir){
            vp.setVisible(false);
        }
    }
    
}
