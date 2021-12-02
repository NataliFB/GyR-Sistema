
package Controlador;

import Consultas.Consultas_Usuario;
import Modelo.Mod_Usuario;
import Vista.JDialogs.Empleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ctrl_Empleados implements ActionListener{

    private Mod_Usuario ModUsuario;
    private Empleados FrameEmpleados;
    private Consultas_Usuario consultas;
    
    public Ctrl_Empleados(Mod_Usuario mod, Empleados view, Consultas_Usuario consultas){
        this.FrameEmpleados = view;
        this.ModUsuario = mod;
        this.consultas = consultas;
        
        Iniciar();
    }
    
    private void Iniciar(){
        FrameEmpleados.setTitle("Empleados");
        FrameEmpleados.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
