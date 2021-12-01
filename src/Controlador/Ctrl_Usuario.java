
package Controlador;

import Modelo.Mod_Usuario;
import Vista.Frames.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ctrl_Usuario implements ActionListener{

    private Mod_Usuario modEmpleado;
    private Usuario frameUsuario;
   
    public Ctrl_Usuario(Mod_Usuario mod, Usuario view){
        this.modEmpleado = mod;
        this.frameUsuario = view;
        
        Iniciar();
        
        frameUsuario.btnSalir.addActionListener(this);
    }
    
    private void Iniciar(){
        frameUsuario.setTitle("Perfil del Usuario: " + modEmpleado.getNombreEmpleado());
        frameUsuario.setLocationRelativeTo(null);
        frameUsuario.setVisible(true);
        
        frameUsuario.txtUsuario.setText(modEmpleado.getUsuario());
        frameUsuario.txtNombre.setText(modEmpleado.getNombreEmpleado());
        frameUsuario.txtNivelAdm.setText(modEmpleado.getNivelAdm());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frameUsuario.btnSalir){
            frameUsuario.setVisible(false);
        }
    }
}
