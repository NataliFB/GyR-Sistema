
package Controlador;

import Vista.Frames.Login;
import Modelo.Mod_Usuario;
import Vista.Frames.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Consultas.Consultas_Usuario;

/**
 *
 * @author Aaron
 */
public class Ctrl_Login implements ActionListener{
    
    private Login frameLogin;
    private Mod_Usuario modEmpleado;
    private MenuPrincipal mp;
    private Consultas_Usuario consultasUs;
    
    public Ctrl_Login(Login viewLogin, Mod_Usuario modLogin, Consultas_Usuario consultas){
        this.frameLogin = viewLogin;
        this.modEmpleado = modLogin;
        this.consultasUs = consultas;
        
        Iniciar();
        
        frameLogin.btnIngresar.addActionListener(this);
        frameLogin.btnSalir.addActionListener(this);
    }
    
    private void Iniciar(){
        frameLogin.setTitle("GyR Grupo Asesor Login");
        frameLogin.setVisible(true);
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setResizable(false);
        frameLogin.txtUsuario.setFocusable(true);
        frameLogin.txtUsuario.setToolTipText("Usuario");
        frameLogin.txtPassword.setToolTipText("Contraseña");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frameLogin.btnIngresar){
            Ingresar();
        }
        
        if(e.getSource() == frameLogin.btnSalir){
            System.exit(0);
        }
    }
    
    public void Ingresar(){
        modEmpleado.setUsuario(frameLogin.txtUsuario.getText());
        modEmpleado.setContrasena(new String(frameLogin.txtPassword.getPassword()));
        
        if (!modEmpleado.getUsuario().isEmpty() || !modEmpleado.getContrasena().isEmpty()){
            
            if(consultasUs.InicioSesion(modEmpleado)){
                
                consultasUs.DatosEmpleado(modEmpleado);
                
                mp = new MenuPrincipal();
                
                Ctrl_MenuPrincipal Ctrl_mp = new Ctrl_MenuPrincipal(mp);
                frameLogin.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Nombre de Usuario o Contraseña incorrectos");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Algún campo está vacío."); 
        }
    }
}
