package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.dataBase.EmpleadoDB;
import validaciones.ValidacionesEmpleado;
import views.Dashboard;
import views.ViewEmpleado;
import views.viewsGestion.GestionEmpleado;

public class ControllerEmpleado implements ActionListener {

    private Dashboard dashBoard;
    private ViewEmpleado viewEmpleado;
    private EmpleadoDB empleado = new EmpleadoDB();
    private GestionEmpleado viewGestionEmpleado;
    private ValidacionesEmpleado validacionesEmpleado = new ValidacionesEmpleado();

    public ControllerEmpleado(Dashboard dashboard, ViewEmpleado viewEmpleado) {
        this.dashBoard = dashboard;
        this.viewEmpleado = viewEmpleado;
        this.viewEmpleado.mensajeSeleccion.setVisible(false);
        this.viewEmpleado.btnNuevoEmpleado.addActionListener(this);
        this.viewEmpleado.btnBorrarEmpleado.addActionListener(this);
        this.viewEmpleado.btnEditarEmpleado.addActionListener(this);
        this.viewEmpleado.btnBuscarEmpleado.addActionListener(this);
    }

    private void NuevoEmpleado() {
        this.viewGestionEmpleado = new GestionEmpleado(dashBoard, viewEmpleado, "Nuevo");
        dashBoard.initView(viewGestionEmpleado);
        this.viewEmpleado.tablaEmpleados.setVisible(true);
    }

    private void borrarEmpleado() {
        int filaSeleccionada = viewEmpleado.tablaEmpleados.getSelectedRow();
        viewEmpleado.mensajeSeleccion.setVisible(false);
        if (filaSeleccionada != -1) { // Verifica si se ha seleccionado una fila
            String usuario = viewEmpleado.tablaEmpleados.getValueAt(filaSeleccionada, 3).toString();
            dialog.DialogEliminarEmpleado dialog = new dialog.DialogEliminarEmpleado(usuario, viewEmpleado, dashBoard);
            dialog.setVisible(true);
        } else {
            viewEmpleado.mensajeSeleccion.setVisible(true);
        }
        viewEmpleado.repaint();

    }

    private void editarEmpleado() {
        int filaSeleccionada = viewEmpleado.tablaEmpleados.getSelectedRow();

        viewEmpleado.mensajeSeleccion.setVisible(false);
        if (filaSeleccionada != -1) {
            String usuario = viewEmpleado.tablaEmpleados.getValueAt(filaSeleccionada, 3).toString();
            this.viewGestionEmpleado = new GestionEmpleado(dashBoard, viewEmpleado, usuario);
            dashBoard.initView(viewGestionEmpleado);
        } else {
            viewEmpleado.mensajeSeleccion.setVisible(true);
        }
        viewEmpleado.repaint();

    }

    private void buscarEmpleado() {
        viewEmpleado.mensajeSeleccion.setVisible(false);
        validacionesEmpleado.buscador(viewEmpleado.inputBuscarEmpleado,
                empleado.buscardorEmpleado(viewEmpleado.inputBuscarEmpleado.getText().trim()),
                viewEmpleado.tablaEmpleados, 0);
        viewEmpleado.repaint();
    }

    public void cargarTabla() {
        if (!empleado.isEmptyTabla("Empleados")) {
            empleado.mostrarEmpleado(viewEmpleado.tablaEmpleados);
            configuracionesTabla();
        }
    }

    private void configuracionesTabla() {

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        viewEmpleado.tablaEmpleados.getColumnModel().getColumn(0).setPreferredWidth(250);
        viewEmpleado.tablaEmpleados.getColumnModel().getColumn(0).setResizable(false);
        viewEmpleado.tablaEmpleados.getColumnModel().getColumn(1).setPreferredWidth(200);
        viewEmpleado.tablaEmpleados.getColumnModel().getColumn(1).setResizable(false);
        viewEmpleado.tablaEmpleados.getColumnModel().getColumn(2).setPreferredWidth(120);
        viewEmpleado.tablaEmpleados.getColumnModel().getColumn(2).setResizable(false);
        viewEmpleado.tablaEmpleados.getColumnModel().getColumn(3).setPreferredWidth(120);
        viewEmpleado.tablaEmpleados.getColumnModel().getColumn(3).setResizable(false);
        viewEmpleado.tablaEmpleados.getColumnModel().getColumn(4).setPreferredWidth(120);
        viewEmpleado.tablaEmpleados.getColumnModel().getColumn(4).setResizable(false);
        viewEmpleado.tablaEmpleados.getColumnModel().getColumn(5).setPreferredWidth(50);
        viewEmpleado.tablaEmpleados.getColumnModel().getColumn(5).setResizable(false);
        viewEmpleado.tablaEmpleados.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerRenderer.setBackground(new Color(240, 240, 240)); // Cambia el color aquí

        // Asigna el renderizador personalizado a la cabecera
        viewEmpleado.tablaEmpleados.getTableHeader().setDefaultRenderer(headerRenderer);
        viewEmpleado.tablaEmpleados.setDefaultEditor(Object.class, null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewEmpleado.btnNuevoEmpleado) {
            NuevoEmpleado();
        } else if (e.getSource() == viewEmpleado.btnBorrarEmpleado) {
            borrarEmpleado();
        } else if (e.getSource() == viewEmpleado.btnEditarEmpleado) {
            editarEmpleado();
        } else if (e.getSource() == viewEmpleado.btnBuscarEmpleado) {
            buscarEmpleado();
        }
    }

}
