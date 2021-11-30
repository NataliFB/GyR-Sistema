
package main;
import Vista.Frames.Login;
import Vista.Frames.MenuPrincipal;
import Modelo.Mod_Login;
import Controlador.Ctrl_Login;

public class main {
    
    public static void main(String[] args) {
        
        Login view = new Login();
        Mod_Login mod = new Mod_Login();
        
        Ctrl_Login Login = new Ctrl_Login(view, mod);
        
    }
    
}