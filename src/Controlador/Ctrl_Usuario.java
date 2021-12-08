package Controlador;

import Consultas.Consultas_Usuario;
import Modelo.Mod_Usuario;
import Vista.Frames.Usuario;
import Vista.JDialogs.Empleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 * Clase para las acciones que ejecutan los botones en la ventana del Usuario en
 * sesión
 *
 * @author
 */
public class Ctrl_Usuario implements ActionListener {

    private Mod_Usuario modEmpleado;
    private Usuario frameUsuario;
    private Consultas_Usuario consultas;

    /**
     * Constructor de la clase Ctrl_Usuario. Le asgina valores a variables
     * privadas, inicializa objetos y le añade eventos a los botones
     *
     * @param mod Recibe un objeto de tipo modUsuarios que es donde están las
     * variables almacenadas
     * @param view Recibe un objeto de tipo Usuario que es la ventana donde se
     * muestrans los distintos botones para interactuar
     * @param consultas Recibe un objeto de tipo Consultas_Usuario para poder
     * hacer consultas a la base de datos
     */
    public Ctrl_Usuario(Mod_Usuario mod, Usuario view, Consultas_Usuario consultas) {
        this.modEmpleado = mod;
        this.frameUsuario = view;
        this.consultas = consultas;

        Iniciar();

        frameUsuario.btnSalir.addActionListener(this);
        frameUsuario.btnCambiar.addActionListener(this);
        frameUsuario.btnEmpleados.addActionListener(this);
    }

    /**
     * Metodo que incializa la ventana
     */
    private void Iniciar() {
        if (!modEmpleado.getNivelAdm().equals("Administrador")) {
            frameUsuario.btnEmpleados.setVisible(false);
        }
        if (modEmpleado.getNivelAdm().equals("Contador")) {
            frameUsuario.PanelTablas.setVisible(false);
            frameUsuario.setSize(667, 300);
        }

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

    /**
     * Metodo abstracto de la clase ActionListener, le aplica los eventos a los
     * botones
     *
     * @param e Evento por ser procesado
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frameUsuario.btnSalir) {
            frameUsuario.setVisible(false);
        }

        if (e.getSource() == frameUsuario.btnCambiar) {
            JPasswordField pf = new JPasswordField();
            int a = JOptionPane.showConfirmDialog(null, pf, "Nueva contraseña", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (a == JOptionPane.OK_OPTION) {
                modEmpleado.setContrasena(new String(pf.getPassword()));
                if (consultas.ActualizarContrasena(modEmpleado)) {
                    JOptionPane.showMessageDialog(null, "Contraseña actualizada con exito!");
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error al actualizar la contraseña");
                }
            }
        }

        if (e.getSource() == frameUsuario.btnEmpleados) {
            Empleados emp = new Empleados(frameUsuario, true);
            emp.setLocationRelativeTo(null);

            Ctrl_Empleados ctrl_Emp = new Ctrl_Empleados(modEmpleado, emp, consultas);
        }
    }
}
