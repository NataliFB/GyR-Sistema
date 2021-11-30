
package Controlador;

import Vista.Frames.Login;
import Modelo.Mod_Login;
import Vista.Frames.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron
 */
public class Ctrl_Login implements ActionListener{
    
    private Login frameLogin;
    private Mod_Login modLogin;
    private MenuPrincipal mp;
    
    public Ctrl_Login(Login viewLogin, Mod_Login modLogin){
        this.frameLogin = viewLogin;
        this.modLogin = modLogin;
        
        Iniciar();
        
        frameLogin.btnIngresar.addActionListener(this);
        frameLogin.btnSalir.addActionListener(this);
    }
    
    private void Iniciar(){
        frameLogin.setVisible(true);
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setResizable(false);
        frameLogin.txtUsuario.setFocusable(true);
        frameLogin.txtUsuario.setToolTipText("Usuario");
        frameLogin.txtPassword.setToolTipText("Contraseña");
        
        mp = new MenuPrincipal();
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
        String user = frameLogin.txtUsuario.getText();
        String pw = new String(frameLogin.txtPassword.getPassword());

        if (user.isEmpty() || pw.isEmpty()){
            JOptionPane.showMessageDialog(null,"Algún campo está vacío.");
        }
        else{
            if (user.equals("User") && pw.equals("123")){
                modLogin.setUsuario(user);
                modLogin.setContrasena(pw);
                
                Ctrl_MenuPrincipal Ctrl_mp = new Ctrl_MenuPrincipal(mp);
                
                frameLogin.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos.");
            }
        }
    }
    
}
