package Controlador;

import Vista.Frames.Login;
import Modelo.Mod_Usuario;
import Vista.Frames.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Consultas.Consultas_Usuario;

/**
 * Clase para las acciones que ejecutan los motones en la ventana Login
 *
 * @author
 */
public class Ctrl_Login implements ActionListener {

    private Login frameLogin;
    private Mod_Usuario modEmpleado;
    private MenuPrincipal mp;
    private Consultas_Usuario consultasUs;

    /**
     * Constructor de la clase Ctrl_Login. Le asgina valores a variables
     * privadas, inicializa objetos y le añade eventos a los botones
     *
     * @param viewLogin Recibe un objeto de tipo Login que es la vista donde se
     * interactua
     * @param modLogin Recibe un objeto de tipo modUsuarios que es donde están las
     * variables almacenadas
     * @param consultas Recibe un objeto de tipo Consultas_Usuario para poder
     * hacer las consultas a la base de datos
     */
    public Ctrl_Login(Login viewLogin, Mod_Usuario modLogin, Consultas_Usuario consultas) {
        this.frameLogin = viewLogin;
        this.modEmpleado = modLogin;
        this.consultasUs = consultas;

        Iniciar();

        frameLogin.btnIngresar.addActionListener(this);
        frameLogin.btnSalir.addActionListener(this);
    }

    /**
     * Metodo que inicia la ventana del login
     */
    private void Iniciar() {
        frameLogin.setTitle("GyR Grupo Asesor Login");
        frameLogin.setVisible(true);
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setResizable(false);
        frameLogin.txtUsuario.setFocusable(true);
        frameLogin.txtUsuario.setToolTipText("Usuario");
        frameLogin.txtPassword.setToolTipText("Contraseña");
    }

    /**
     * Metodo abstracto de la clase ActionListener, le aplica los eventos a los
     * botones
     *
     * @param e Evento por ser procesado
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frameLogin.btnIngresar) {
            Ingresar();
        }

        if (e.getSource() == frameLogin.btnSalir) {
            System.exit(0);
        }
    }

    /**
     * Metodo para ingresar al sistema, en este se hace consultas a la base de
     * datos con los datos ingresados para comprobar si son validos
     */
    private void Ingresar() {
        modEmpleado.setUsuario(frameLogin.txtUsuario.getText());
        modEmpleado.setContrasena(new String(frameLogin.txtPassword.getPassword()));

        if (!modEmpleado.getUsuario().isEmpty() || !modEmpleado.getContrasena().isEmpty()) {

            if (consultasUs.InicioSesion(modEmpleado)) {

                if (consultasUs.DatosUsuario(modEmpleado)) {
                    mp = new MenuPrincipal();

                    Ctrl_MenuPrincipal Ctrl_mp = new Ctrl_MenuPrincipal(mp, modEmpleado);
                    frameLogin.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Hubo un error al traer los datos del sistema.\nPorfavor de reiniciar el sistema");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Nombre de Usuario o Contraseña incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Algún campo está vacío.");
        }
    }
}
