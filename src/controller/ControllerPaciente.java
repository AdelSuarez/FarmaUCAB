package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.dataBase.PacienteDB;
import utils.BuscadorTabla;
import validaciones.ValidacionPaciente;
import views.ViewPaciente;
import views.Dashboard;
import views.viewsGestion.GestionPaciente;

public class ControllerPaciente implements ActionListener {

    private PacienteDB paciente = new PacienteDB();
    private ViewPaciente viewPaciente;
    private Dashboard dashboard;
    private GestionPaciente viewGestionPaciente;
    private ValidacionPaciente validacionPaciente = new ValidacionPaciente();

    public ControllerPaciente(ViewPaciente viewPaciente, Dashboard dashboard) {
        this.viewPaciente = viewPaciente;
        this.dashboard = dashboard;
        this.viewPaciente.btnNuevoPaciente.addActionListener(this);
        this.viewPaciente.btnBorrarPaciente.addActionListener(this);
        this.viewPaciente.btnEditarPaciente.addActionListener(this);
        this.viewPaciente.btnBuscarPaciente.addActionListener(this);
    }

    private void nuevoPaciente() {
        this.viewGestionPaciente = new GestionPaciente(dashboard, viewPaciente, "Nuevo");
        dashboard.initView(viewGestionPaciente);
        this.viewPaciente.tablaPacientes.setVisible(false);
        viewPaciente.repaint();
    }

    private void borrarPaciente() {
        int filaSeleccionada = viewPaciente.tablaPacientes.getSelectedRow();
        viewPaciente.mensajeSeleccion.setVisible(false);

        if (filaSeleccionada != -1) {
            String cedula = viewPaciente.tablaPacientes.getValueAt(filaSeleccionada, 0).toString();
            dialog.DialogEliminarPaciente dialog = new dialog.DialogEliminarPaciente(cedula, viewPaciente, dashboard);
            dialog.setVisible(true);
            ContarPacientes();
        } else {
            viewPaciente.mensajeSeleccion.setVisible(true);
        }
        viewPaciente.repaint();
        

    }

    private void editarPaciente() {
        int filaSeleccionada = viewPaciente.tablaPacientes.getSelectedRow();
        viewPaciente.mensajeSeleccion.setVisible(false);

        if (filaSeleccionada != -1) {
            String cedula = viewPaciente.tablaPacientes.getValueAt(filaSeleccionada, 0).toString();
            this.viewGestionPaciente = new GestionPaciente(dashboard, viewPaciente, cedula);
            dashboard.initView(viewGestionPaciente);
        } else {
            viewPaciente.mensajeSeleccion.setVisible(true);
        }
        viewPaciente.repaint();
    }

    public void cargarTabla() {
        if (!paciente.isEmptyTabla("Pacientes")) {
            paciente.mostrarPacientes(viewPaciente.tablaPacientes);
            configuracionTabla();
            viewPaciente.repaint();
        }
        ContarPacientes();
    }

    private void buscarPaciente() {
        viewPaciente.mensajeSeleccion.setVisible(false);
        new BuscadorTabla().buscadorTabla(viewPaciente.inputBuscarPaciente,
                paciente.buscadorPacienteTabla(viewPaciente.inputBuscarPaciente.getText().trim()),
                viewPaciente.tablaPacientes,
                0);
        viewPaciente.repaint();
    }

    private void configuracionTabla() {
        // Configuraciones de la jtable
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        viewPaciente.tablaPacientes.getColumnModel().getColumn(0).setPreferredWidth(100);
        viewPaciente.tablaPacientes.getColumnModel().getColumn(0).setResizable(false);
        viewPaciente.tablaPacientes.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        viewPaciente.tablaPacientes.getColumnModel().getColumn(1).setPreferredWidth(250);
        viewPaciente.tablaPacientes.getColumnModel().getColumn(1).setResizable(false);
        viewPaciente.tablaPacientes.getColumnModel().getColumn(2).setPreferredWidth(40);
        viewPaciente.tablaPacientes.getColumnModel().getColumn(2).setResizable(false);
        viewPaciente.tablaPacientes.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        viewPaciente.tablaPacientes.getColumnModel().getColumn(3).setPreferredWidth(100);
        viewPaciente.tablaPacientes.getColumnModel().getColumn(3).setResizable(false);
        viewPaciente.tablaPacientes.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        viewPaciente.tablaPacientes.getColumnModel().getColumn(4).setPreferredWidth(100);
        viewPaciente.tablaPacientes.getColumnModel().getColumn(4).setResizable(false);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerRenderer.setBackground(new Color(240, 240, 240)); // Cambia el color aquí

        // Asigna el renderizador personalizado a la cabecera
        viewPaciente.tablaPacientes.getTableHeader().setDefaultRenderer(headerRenderer);
        viewPaciente.tablaPacientes.setDefaultEditor(Object.class, null);
    }

    public void ContarPacientes() {
        int filas = viewPaciente.tablaPacientes.getRowCount();
        if (!paciente.isEmptyTabla("Pacientes")) {
            viewPaciente.numPacientes.setText("Pacientes Registrados: " + filas);
        } else {
            viewPaciente.numPacientes.setText("Pacientes Registrados: 0");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewPaciente.btnNuevoPaciente) {
            nuevoPaciente();
        } else if (e.getSource() == viewPaciente.btnBorrarPaciente) {
            borrarPaciente();
        } else if (e.getSource() == viewPaciente.btnEditarPaciente) {
            editarPaciente();
        } else if (e.getSource() == viewPaciente.btnBuscarPaciente) {
            buscarPaciente();
        }
    }

}
