package Controlador;

import Consultas.*;
import Modelo.*;
import Vista.Frames.*;
import Vista.JDialogs.AgregarArticulo;
import Vista.JDialogs.AgregarCuentaBanco;
import Vista.Paneles.*;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase para las acciones que ejecutan los botones en la ventana del Menu
 * Principal
 *
 * @author
 */
public class Ctrl_MenuPrincipal implements ActionListener {

    private MenuPrincipal frameMenu;
    private Mod_Usuario modEmpleado;

    /**
     * Constructor de la clase Ctrl_MenuPrincipal. Le asgina valores a variables
     * privadas, inicializa objetos y le añade eventos a los botones
     *
     * @param viewMenu Recibe un objeto de tipo MenuPrincipal que es el JFrame
     * del menu
     * @param modEmp Recibe un objeto de tipo mod_Usuario donde están las
     * variables del usuario
     */
    public Ctrl_MenuPrincipal(MenuPrincipal viewMenu, Mod_Usuario modEmp) {
        this.frameMenu = viewMenu;
        this.modEmpleado = modEmp;

        Iniciar();

        frameMenu.btnUsuario.addActionListener(this);
        frameMenu.btnIngresarContr.addActionListener(this);
        frameMenu.btnTimbre.addActionListener(this);
        frameMenu.btnAdjudicaciones.addActionListener(this);
        frameMenu.btnPorComprar.addActionListener(this);
        frameMenu.btnFacturas.addActionListener(this);
        frameMenu.btnRenta.addActionListener(this);
        frameMenu.btnProveedores.addActionListener(this);
        frameMenu.btnSalir.addActionListener(this);
    }

    /**
     * Inicializa estados para la venta además de cargar los paneles al JFrame
     */
    private void Iniciar() {
        frameMenu.setTitle("GyR Sistema Menú");
        frameMenu.setExtendedState(MAXIMIZED_BOTH);
        frameMenu.setLocationRelativeTo(null);

        if(!modEmpleado.getPermisos()[0]){
            frameMenu.IngrsarContr.setVisible(false);
        }
        
        if(!modEmpleado.getPermisos()[1]){
            frameMenu.Adjudicaciones.setVisible(false);
        }
        
        if(!modEmpleado.getPermisos()[2]){
            frameMenu.Timbres.setVisible(false);
        }
        
        if(!modEmpleado.getPermisos()[3]){
            frameMenu.PorComprar.setVisible(false);
        }
        
        if(!modEmpleado.getPermisos()[4]){
            frameMenu.Facturas.setVisible(false);
        }
        
        if(!modEmpleado.getPermisos()[5]){
            frameMenu.Renta.setVisible(false);
        }
        
        if(!modEmpleado.getPermisos()[6]){
            frameMenu.Proveedores.setVisible(false);
        }
        
        frameMenu.setVisible(true);
        
        VentanaContratacion();
    }

    /**
     * Metodo que elimina todo del panel base para poder cargar otro panel
     */
    private void ResetearPanel() {
        frameMenu.pnl_prin.removeAll();
        frameMenu.pnl_prin.repaint();
        frameMenu.pnl_prin.revalidate();
    }

    /**
     * Metodo que carga la venta principal que es la de ingresar contrataciones
     */
    private void VentanaContratacion() {
        Mod_IngresarContr model = new Mod_IngresarContr();
        Pn_IngresarContr view = new Pn_IngresarContr();
        Consultas_Contrataciones consultas = new Consultas_Contrataciones();

        ResetearPanel();
        view.setSize(frameMenu.pnl_prin.getSize());
        Ctrl_IngresarContr controlador = new Ctrl_IngresarContr(view, model, consultas);

        frameMenu.pnl_prin.add(view);
    }

    /**
     * Metodo que carga la ventana facturas al inicio si el usuario es contador
     */
    private void VentanaFacturas() {
        Pnl_4 panel4 = new Pnl_4();
        Consultas_Facturas consultas = new Consultas_Facturas();
        
        panel4.setSize(frameMenu.pnl_prin.getSize());
        ResetearPanel();
        Ctrl_Facturas facturas = new Ctrl_Facturas(panel4, consultas);

        frameMenu.pnl_prin.add(panel4);
    }

    /**
     * Metodo abstracto de la clase ActionListener, le aplica los eventos a los
     * botones
     *
     * @param e Evento por ser procesado
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frameMenu.btnUsuario) {
            Usuario us = new Usuario();
            Mod_Usuario modUs = new Mod_Usuario();
            Consultas_Usuario consultas = new Consultas_Usuario();

            Ctrl_Usuario CtrlUs = new Ctrl_Usuario(modUs, us, consultas);
        }

        if (e.getSource() == frameMenu.btnIngresarContr) {
            VentanaContratacion();
        }

        if (e.getSource() == frameMenu.btnTimbre) {
            Pnl_1 panel1 = new Pnl_1();
            Consultas_TimbresGarantiasMuestras consultas = new Consultas_TimbresGarantiasMuestras();
            
            ResetearPanel();
            panel1.setSize(frameMenu.pnl_prin.getSize());
            Ctrl_TimbresGarantiasMuestras timbre = new Ctrl_TimbresGarantiasMuestras(panel1, consultas);

            frameMenu.pnl_prin.add(panel1);
        }

        if (e.getSource() == frameMenu.btnAdjudicaciones) {
            Pnl_2 panel2 = new Pnl_2();
            Consultas_Adjudicaciones consultas = new Consultas_Adjudicaciones();
            
            ResetearPanel();
            panel2.setSize(frameMenu.pnl_prin.getSize());
            Ctrl_Adjudicaciones adjudicaciones = new Ctrl_Adjudicaciones(panel2, consultas, modEmpleado);

            frameMenu.pnl_prin.add(panel2);
        }

        if (e.getSource() == frameMenu.btnPorComprar) {
            Pnl_3 panel3 = new Pnl_3();
            Consultas_PorComprar consultas = new Consultas_PorComprar();

            ResetearPanel();
            panel3.setSize(frameMenu.pnl_prin.getSize());
            Ctrl_PorComprar porComprar = new Ctrl_PorComprar(panel3, consultas, modEmpleado);

            frameMenu.pnl_prin.add(panel3);
        }

        if(e.getSource() == frameMenu.btnFacturas){
            VentanaFacturas();
        }
        
        if (e.getSource() == frameMenu.btnRenta) {
            Pnl_5 panel5 = new Pnl_5();

            panel5.setSize(frameMenu.pnl_prin.getSize());
            ResetearPanel();
            Ctrl_Renta renta = new Ctrl_Renta(panel5);

            frameMenu.pnl_prin.add(panel5);
        }

        if (e.getSource() == frameMenu.btnProveedores) {
            Pnl_Proveedor panelProveedor = new Pnl_Proveedor();
            Consultas_Proveedores consultas = new Consultas_Proveedores();
            AgregarArticulo ar = new AgregarArticulo(frameMenu, true);
            AgregarCuentaBanco acb = new AgregarCuentaBanco(frameMenu, true);
            
            panelProveedor.setSize(frameMenu.pnl_prin.getSize());
            ResetearPanel();
            Ctrl_Proveedores proveedor = new Ctrl_Proveedores(panelProveedor, consultas, acb, ar);

            frameMenu.pnl_prin.add(panelProveedor);
        }

        if (e.getSource() == frameMenu.btnSalir) {
            System.exit(0);
        }

    }
}
