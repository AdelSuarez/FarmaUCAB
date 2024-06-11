package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.dataBase.PacienteDB;
import validaciones.ValidacionPaciente;
import views.Dashboard;
import views.ViewPaciente;
import views.viewsGestion.GestionPaciente;

public class ControllerGestionPaciente implements ActionListener {
    
    private Dashboard dashboard;
    private ViewPaciente viewPaciente;
    private GestionPaciente viewGestionPaciente;
    private ValidacionPaciente validacionPaciente = new ValidacionPaciente();
    private PacienteDB paciente = new PacienteDB();
    
    private String[] datosPaciente;
    private String id;
    private String dato;
    
    public ControllerGestionPaciente(Dashboard dashboard, ViewPaciente viewPaciente, GestionPaciente viewGestionPaciente, String dato) {
        this.dashboard = dashboard;
        this.viewPaciente = viewPaciente;
        this.viewGestionPaciente = viewGestionPaciente;
        
        this.dato = dato;
        
        this.viewGestionPaciente.mensajeGuardado.setVisible(true);
        this.viewGestionPaciente.btnRegresar.addActionListener(this);
        this.viewGestionPaciente.btnGuardarPaciente.addActionListener(this);
        seleccionVentana(dato);
    }
    
    private void regresarView() {
        dashboard.refrescarViewPacientes();
        dashboard.initView(dashboard.getViewPaciente());
        viewGestionPaciente.mensajeGuardado.setVisible(false);
        new ControllerPaciente(viewPaciente, dashboard).cargarTabla();
        viewGestionPaciente.repaint();
    }
    
    private void guardarAccion() {
        if (dato.equals("Nuevo")) {
            guardarPaciete();
            
        } else {
            editarPaciente();
        }
    }
    
    private void guardarPaciete() {
        if (validacionPaciente.datosValidados(
                viewGestionPaciente.nombrePaciente,
                viewGestionPaciente.apellidoPaciente,
                viewGestionPaciente.cedulaPaciente,
                viewGestionPaciente.edadPaciente,
                viewGestionPaciente.telefonoPaciente,
                viewGestionPaciente.DEPaciente,
                viewGestionPaciente.generoPaciente)) {
            if (paciente.nuevo(viewGestionPaciente.nombrePaciente.getText().trim(),
                    viewGestionPaciente.apellidoPaciente.getText().trim(),
                    viewGestionPaciente.cedulaPaciente.getText().trim(),
                    viewGestionPaciente.telefonoPaciente.getText().trim(),
                    viewGestionPaciente.DEPaciente.getText().trim(),
                    viewGestionPaciente.generoPaciente.getSelectedItem().toString(),
                    Integer.parseInt(viewGestionPaciente.edadPaciente.getText().trim()),
                    viewGestionPaciente.descripcionPaciente.getText().trim())) {
                validacionPaciente.mensaje(viewGestionPaciente.mensajeGuardado, "Paciente guardado");
                limpiarInput();
                viewGestionPaciente.repaint();
            }
        }
        viewGestionPaciente.repaint();
    }
    
    private void editarPaciente() {
        if (validacionPaciente.datosValidados(
                viewGestionPaciente.nombrePaciente,
                viewGestionPaciente.apellidoPaciente,
                viewGestionPaciente.cedulaPaciente,
                viewGestionPaciente.edadPaciente,
                viewGestionPaciente.telefonoPaciente,
                viewGestionPaciente.DEPaciente,
                viewGestionPaciente.generoPaciente)) {
            if (paciente.editar(id,
                    viewGestionPaciente.nombrePaciente.getText().trim(),
                    viewGestionPaciente.apellidoPaciente.getText().trim(),
                    viewGestionPaciente.cedulaPaciente.getText().trim(),
                    viewGestionPaciente.telefonoPaciente.getText().trim(),
                    viewGestionPaciente.DEPaciente.getText().trim(),
                    viewGestionPaciente.generoPaciente.getSelectedItem().toString(),
                    Integer.parseInt(viewGestionPaciente.edadPaciente.getText().trim()),
                    viewGestionPaciente.descripcionPaciente.getText().trim())) {
                validacionPaciente.mensaje(viewGestionPaciente.mensajeGuardado, "Editado con exito");
                limpiarInput();
                viewGestionPaciente.repaint();
            }
            
        }
    }
    
    private void seleccionVentana(String dato) {
        if (dato.equals("Nuevo")) {
            viewGestionPaciente.tituloPrincipal.setText("Nuevo Paciente");
            
        } else {
            viewGestionPaciente.tituloPrincipal.setText("Editar Paciente");
            this.datosPaciente = paciente.buscar(dato);
            this.id = datosPaciente[0];
            viewGestionPaciente.nombrePaciente.setText(datosPaciente[1]);
            viewGestionPaciente.apellidoPaciente.setText(datosPaciente[2]);
            viewGestionPaciente.edadPaciente.setText(datosPaciente[3]);
            viewGestionPaciente.telefonoPaciente.setText(datosPaciente[5]);
            viewGestionPaciente.cedulaPaciente.setText(datosPaciente[6]);
            viewGestionPaciente.DEPaciente.setText(datosPaciente[7]);
            System.out.println(datosPaciente[4]);
            if (datosPaciente[4].equals("Masculino")) {
                viewGestionPaciente.generoPaciente.setSelectedIndex(0);
            } else {
                viewGestionPaciente.generoPaciente.setSelectedIndex(1);
                
            }
            viewGestionPaciente.descripcionPaciente.setText(datosPaciente[8]);
            
        }
    }
    
    private void limpiarInput() {
        viewGestionPaciente.nombrePaciente.setText("");
        viewGestionPaciente.apellidoPaciente.setText("");
        viewGestionPaciente.cedulaPaciente.setText("");
        viewGestionPaciente.telefonoPaciente.setText("");
        viewGestionPaciente.edadPaciente.setText("");
        viewGestionPaciente.DEPaciente.setText("");
        viewGestionPaciente.descripcionPaciente.setText("");
        viewGestionPaciente.generoPaciente.setSelectedIndex(-1);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewGestionPaciente.btnRegresar) {
            regresarView();
        } else if (e.getSource() == viewGestionPaciente.btnGuardarPaciente) {
            guardarAccion();
        }
    }
    
}
