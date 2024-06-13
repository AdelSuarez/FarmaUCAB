package controller;

import dialog.DialogCerrarSesion;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import main.Main;
import style.MyColor;
import views.Dashboard;
import views.viewsGestion.GestionConsulta;
import views.ViewEmpleado;
import views.ViewInsumo;
import views.ViewPaciente;
import views.ViewConsulta;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ControllerDashBoard implements ActionListener {

    private ViewPaciente viewPaciente;
    private GestionConsulta viewGestionConsulta;
    private ViewInsumo viewInsumo;
    private ViewEmpleado viewEmpleado;
    private ViewConsulta viewConsulta;
    private String nombre;

    private Main main;
    private Dashboard dashboard;

    public ControllerDashBoard(Main main, Dashboard dashboard, boolean admin, String[] datosUsuario) {
        this.main = main;
        this.dashboard = dashboard;
        this.nombre = datosUsuario[1] + " " + datosUsuario[2];
        this.viewPaciente = new ViewPaciente(dashboard);
        this.viewInsumo = new ViewInsumo(dashboard);
        this.viewEmpleado = new ViewEmpleado(dashboard);
        this.viewConsulta = new ViewConsulta(dashboard);

//        dashboard.adminActivo.setVisible(admin);
//        dashboard.adminActivo.setVisible(admin);
        dashboard.btnEmpleado.setVisible(admin);
        dashboard.NombreEmpleado.setText(nombre);
        
        // selecciona el boton de la view  que se muestra al iniciar la app
        dashboard.btnConsulta.setColor(new MyColor().getBTNSELECTCOLOR());

        this.dashboard.btnCerrarSesion.addActionListener(this);
        this.dashboard.btnConsulta.addActionListener(this);
        this.dashboard.btnEmpleado.addActionListener(this);
        this.dashboard.btnInsumo.addActionListener(this);
        this.dashboard.btnPaciente.addActionListener(this);

        iniciadorVentana(viewConsulta);
        tagAdmin(admin);
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

    public GestionConsulta getViewConsulta() {
        return viewGestionConsulta;
    }

    private void cerraSesion() {
        dialog.DialogCerrarSesion dialog = new DialogCerrarSesion(main);
        dialog.setVisible(true);
    }

    private void activarViewInsumo() {
//        this.viewInsumo = new ViewInsumo(dashboard);
        dashboard.btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnInsumo.setColor(new MyColor().getBTNSELECTCOLOR());
//        dashboard.btnInsumo.setForeground(new MyColor().getAZUL());
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
//        this.viewConsulta = new ViewConsulta(dashboard, viewGestionConsulta);
        dashboard.btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        dashboard.btnConsulta.setColor(new MyColor().getBTNSELECTCOLOR());
        dashboard.btnEmpleado.setColor(new MyColor().getBTNBGDASHBOAR());
        iniciadorVentana(viewConsulta);
    }
    
    public void horaTurno(){
       try { 
            URL url = new URL("http://worldtimeapi.org/api/timezone/America/Caracas");
            URLConnection conn = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuilder result = new StringBuilder();
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
            br.close();
            
            String datetime = result.toString().split("\"datetime\":\"")[1].split("\"")[0];
            String hora = datetime.substring(11, 19); // 
            int horaDelDia = Integer.parseInt(hora.split(":")[0]);
             if (horaDelDia >= 6 && horaDelDia < 12) {
                dashboard.containerTurno.setBackground(new MyColor().getAZUL());
                dashboard.titleTurno.setText("Mañana");
            } else if (horaDelDia >= 12 && horaDelDia < 18) {
                dashboard.containerTurno.setBackground(new MyColor().getVERDE());
                dashboard.titleTurno.setText("Tarde");
            } else {
                dashboard.containerTurno.setBackground(new MyColor().getRED());
                dashboard.titleTurno.setText("Noche");
            }
            // Aquí deberías analizar la respuesta JSON para extraer la hora
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void tagAdmin(boolean esAdmin){
        if(esAdmin){
            dashboard.tag.setBackground(new MyColor().getVERDE());
            dashboard.estatus.setText("Admin");
        } else {
            dashboard.tag.setBackground(new MyColor().getAZUL());
            dashboard.estatus.setText("Usuario");
        }
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
