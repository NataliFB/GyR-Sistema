
package Controlador;

import Vista.Frames.MenuPrincipal;
import static java.awt.Frame.MAXIMIZED_BOTH;

public class Ctrl_MenuPrincipal {
    
    private MenuPrincipal frameMenu;
    
    public Ctrl_MenuPrincipal(MenuPrincipal viewMenu){
        this.frameMenu = viewMenu;
        
        Iniciar();
    }
    
    private void Iniciar(){
        frameMenu.setExtendedState(MAXIMIZED_BOTH);
        frameMenu.setLocationRelativeTo(null);
        
        frameMenu.setVisible(true);
    }
    
}
