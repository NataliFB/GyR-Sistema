package Controlador;

import Modelo.Mod_IngresarContr;
import Modelo.Mod_Usuario;
import Vista.Frames.MenuPrincipal;
import Vista.Frames.Usuario;
import Vista.Paneles.Pn_IngresarContr;
import Vista.Paneles.Pnl_1;
import Vista.Paneles.Pnl_2;
import Vista.Paneles.Pnl_3;
import Vista.Paneles.Pnl_4;
import Vista.Paneles.Pnl_5;
import Vista.Paneles.Pnl_Proveedor;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ctrl_MenuPrincipal implements ActionListener {

    private MenuPrincipal frameMenu;

    public Ctrl_MenuPrincipal(MenuPrincipal viewMenu) {
        this.frameMenu = viewMenu;

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

    private void Iniciar() {
        frameMenu.setTitle("GyR Sistema Menú");
        frameMenu.setExtendedState(MAXIMIZED_BOTH);
        frameMenu.setLocationRelativeTo(null);
        VentanaContratacion();

        frameMenu.setVisible(true);
    }

    private void ResetearPanel() {
        frameMenu.pnl_prin.removeAll();
        frameMenu.pnl_prin.repaint();
        frameMenu.pnl_prin.revalidate();
    }

    public void VentanaContratacion() {
        Mod_IngresarContr model = new Mod_IngresarContr();
        Pn_IngresarContr view = new Pn_IngresarContr();

        ResetearPanel();
        Ctrl_IngresarContr controlador = new Ctrl_IngresarContr(view, model);

        frameMenu.pnl_prin.add(view);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frameMenu.btnUsuario) {
            Usuario us = new Usuario();
            Mod_Usuario modUs = new Mod_Usuario();

            Ctrl_Usuario CtrlUs = new Ctrl_Usuario(modUs, us);
        }

        if (e.getSource() == frameMenu.btnIngresarContr) {
            VentanaContratacion();
        }

        if (e.getSource() == frameMenu.btnTimbre) {
            Pnl_1 panel1 = new Pnl_1();

            ResetearPanel();
            Ctrl_TimbresGarantiasMuestras timbre = new Ctrl_TimbresGarantiasMuestras(panel1);

            frameMenu.pnl_prin.add(panel1);
        }

        if (e.getSource() == frameMenu.btnAdjudicaciones) {
            Pnl_2 panel2 = new Pnl_2();

            ResetearPanel();
            Ctrl_Adjudicaciones adjudicaciones = new Ctrl_Adjudicaciones(panel2);

            frameMenu.pnl_prin.add(panel2);
        }

        if (e.getSource() == frameMenu.btnPorComprar) {
            Pnl_3 panel3 = new Pnl_3();

            ResetearPanel();
            Ctrl_PorComprar porComprar = new Ctrl_PorComprar(panel3);

            frameMenu.pnl_prin.add(panel3);
        }

        if (e.getSource() == frameMenu.btnFacturas) {
            Pnl_4 panel4 = new Pnl_4();

            ResetearPanel();
            Ctrl_Facturas facturas = new Ctrl_Facturas(panel4);

            frameMenu.pnl_prin.add(panel4);
        }

        if (e.getSource() == frameMenu.btnRenta) {
            Pnl_5 panel5 = new Pnl_5();

            ResetearPanel();
            Ctrl_Renta renta = new Ctrl_Renta(panel5);

            frameMenu.pnl_prin.add(panel5);
        }

        if (e.getSource() == frameMenu.btnProveedores) {
            Pnl_Proveedor panelProveedor = new Pnl_Proveedor();

            ResetearPanel();
            Ctrl_Proveedores proveedor = new Ctrl_Proveedores(panelProveedor);

            frameMenu.pnl_prin.add(panelProveedor);
        }

        if (e.getSource() == frameMenu.btnSalir) {
            System.exit(0);
        }

    }
}
