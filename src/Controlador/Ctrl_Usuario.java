
package Controlador;

import Consultas.Consultas_Usuario;
import Modelo.Mod_Usuario;
import Vista.Frames.Usuario;
import Vista.JDialogs.Empleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Ctrl_Usuario implements ActionListener{

    private Mod_Usuario modEmpleado;
    private Usuario frameUsuario;
    private Consultas_Usuario consultas;
    
    public Ctrl_Usuario(Mod_Usuario mod, Usuario view, Consultas_Usuario consultas){
        this.modEmpleado = mod;
        this.frameUsuario = view;
        this.consultas = consultas;
        
        Iniciar();
        
        frameUsuario.btnSalir.addActionListener(this);
        frameUsuario.btnCambiar.addActionListener(this);
        frameUsuario.btnEmpleados.addActionListener(this);
    }
    
    private void Iniciar(){
        frameUsuario.setTitle("Perfil del Usuario: " + modEmpleado.getNombreEmpleado());
        frameUsuario.setLocationRelativeTo(null);
        frameUsuario.setVisible(true);
        
        frameUsuario.txtUsuario.setEditable(false);
        frameUsuario.txtColor.setEditable(false);
        frameUsuario.txtNivelAdmin.setEditable(false);
        
        frameUsuario.lblNombre.setText(modEmpleado.getNombreEmpleado());
        frameUsuario.txtColor.setText(modEmpleado.getColor());
        frameUsuario.txtUsuario.setText(modEmpleado.getUsuario());
        frameUsuario.txtNivelAdmin.setText(modEmpleado.getNivelAdm());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frameUsuario.btnSalir){
            frameUsuario.setVisible(false);
        }
        
        if(e.getSource() == frameUsuario.btnCambiar){
            JPasswordField pf = new JPasswordField();
            int a = JOptionPane.showConfirmDialog(null, pf , "Nueva contraseña" , JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if(a == JOptionPane.OK_OPTION){
                modEmpleado.setContrasena(new String(pf.getPassword()));
                consultas.ActualizarContrasena(modEmpleado);
                JOptionPane.showMessageDialog(null, "Contraseña actualizada con exito!");
            }
        }
        
        if(e.getSource() == frameUsuario.btnEmpleados){
            Empleados emp = new Empleados(frameUsuario, false);
            emp.setLocationRelativeTo(null);
            
            Ctrl_Empleados ctrl_Emp = new Ctrl_Empleados(modEmpleado, emp, consultas);
        }
    }
}
