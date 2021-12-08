
package main;

import Vista.Frames.Login;
import Modelo.Mod_Usuario;
import Controlador.Ctrl_Login;
import Consultas.Consultas_Usuario;

/**
 * Clase main del sistema
 * @author
 */

public class main {
    /**
     * Metodo main que crea los objetos para inicar sesión
     * @param args 
     */
    public static void main(String[] args) {
        
        Login view = new Login();
        Mod_Usuario mod = new Mod_Usuario();
        Consultas_Usuario consultas = new Consultas_Usuario();
        
        Ctrl_Login Login = new Ctrl_Login(view, mod, consultas);
        
    }
    
}