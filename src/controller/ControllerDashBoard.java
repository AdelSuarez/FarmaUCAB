package controller;

import dialog.DialogCerrarSesion;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import main.Main;
import style.MyColor;
import views.Dashboard;
import views.ViewConsulta;
import views.ViewEmpleado;
import views.ViewInsumo;
import views.ViewPaciente;
import views.viewsGestion.GestionConsulta;

public class ControllerDashBoard implements ActionListener {

    private ViewPaciente viewPaciente;
    private ViewConsulta viewConsulta;
    private ViewInsumo viewInsumo;
    private ViewEmpleado viewEmpleado;
    private GestionConsulta gestionConsulta;

    private Main main;
    private Dashboard dashboard;

    public ControllerDashBoard(Main main, Dashboard dashboard, boolean admin) {
        this.main = main;
        this.dashboard = dashboard;
        this.viewPaciente = new ViewPaciente(dashboard);
        this.viewInsumo = new ViewInsumo(dashboard);
        this.viewEmpleado = new ViewEmpleado(dashboard);
        this.viewConsulta = new ViewConsulta(dashboard);
        this.gestionConsulta= new GestionConsulta(dashboard,viewConsulta);

        dashboard.adminActivo.setVisible(admin);
        dashboard.btnEmpleado.setVisible(admin);
        dashboard.btnPaciente.setColor(new MyColor().getBTNSELECTCOLOR());

        this.dashboard.btnCerrarSesion.addActionListener(this);
        this.dashboard.btnConsulta.addActionListener(this);
        this.dashboard.btnEmpleado.addActionListener(this);
        this.dashboard.btnInsumo.addActionListener(this);
        this.dashboard.btnPaciente.addActionListener(this);

        iniciadorVentana(viewPaciente);
    }

    public void iniciadorVentana(JPanel view) {
        dashboard.Content.removeAll();
        dashboard.Content.add(view, BorderLayout.CENTER);
        dashboard.Content.revalidate();
        dashboard.Content.repaint();
    }

    public ViewPaciente getViewPaciente() {
        return viewPaciente;
    }

    public ViewEmpleado getViewEmpleado() {
        return viewEmpleado;
    }

    public ViewInsumo getViewInsumo() {
        return viewInsumo;
    }
    
    public ViewConsulta getViewConsulta() {
        return viewConsulta;
    }

    private void cerraSesion() {
        dialog.DialogCerrarSesion dialog = new DialogCerrarSesion(main);
        dialog.setVisible(true);
    }

    private void activarViewInsumo() {
        this.viewInsumo = new ViewInsumo(dashboard);
        dashboard.btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnInsumo.setColor(new MyColor().getBTNSELECTCOLOR());
        dashboard.btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnEmpleado.setColor(new MyColor().getBTNBGDASHBOAR());
        iniciadorVentana(viewInsumo);
    }

    private void activarViewPaciente() {
        dashboard.btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnPaciente.setColor(new MyColor().getBTNSELECTCOLOR());
        dashboard.btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnEmpleado.setColor(new MyColor().getBTNBGDASHBOAR());
        iniciadorVentana(viewPaciente);
    }

    private void activarViewEmpleado() {
        dashboard.btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnEmpleado.setColor(new MyColor().getBTNSELECTCOLOR());
        iniciadorVentana(viewEmpleado);
    }

    private void activarViewConsulta() {
        this.gestionConsulta= new GestionConsulta(dashboard,viewConsulta);
        dashboard.btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnConsulta.setColor(new MyColor().getBTNSELECTCOLOR());
        dashboard.btnEmpleado.setColor(new MyColor().getBTNBGDASHBOAR());
        iniciadorVentana(gestionConsulta);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dashboard.btnInsumo) {
            activarViewInsumo();
        } else if (e.getSource() == dashboard.btnCerrarSesion) {
            cerraSesion();
        } else if (e.getSource() == dashboard.btnPaciente) {
            activarViewPaciente();
        } else if (e.getSource() == dashboard.btnEmpleado) {
            activarViewEmpleado();
        } else if (e.getSource() == dashboard.btnConsulta) {
            activarViewConsulta();
        }

    }

}
