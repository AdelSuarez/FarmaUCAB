package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.dataBase.EmpleadoDB;
import validaciones.ValidacionesEmpleado;
import views.Dashboard;
import views.ViewEmpleado;
import views.viewsGestion.GestionEmpleado;

public class ControllerGestionEmpleado implements ActionListener {

    private Dashboard dashboard;
    private GestionEmpleado viewGestionEmpleado;
    private ViewEmpleado viewEmpleado;

    private String dato;
    private String[] datosEmpleado;
    private String idEmpleado;

    private EmpleadoDB empleado = new EmpleadoDB();
    private ValidacionesEmpleado valicacionEmpleado = new ValidacionesEmpleado();

    public ControllerGestionEmpleado(Dashboard dashboard, ViewEmpleado viewEmpleado, GestionEmpleado viewGestionEmpleado, String dato) {
        this.dashboard = dashboard;
        this.viewEmpleado = viewEmpleado;
        this.viewGestionEmpleado = viewGestionEmpleado;
        this.dato = dato;

        this.viewGestionEmpleado.btnRegresar.addActionListener(this);
        this.viewGestionEmpleado.btnGuardarEmpleado.addActionListener(this);

        this.viewGestionEmpleado.mensajeGuardado.setVisible(false);
        seleccionVentana();

    }

    private void regresarView() {
        dashboard.refrescarViewEmpleado();
        new ControllerEmpleado(dashboard, viewEmpleado).cargarTabla();
        dashboard.initView(dashboard.getViewEmpleado());
        viewEmpleado.repaint();

    }

    private void guardarAccion() {
        if (dato.equals("Nuevo")) {
            guardarEmpleado();
        } else {
            editarEmpleado();
        }
        new ControllerEmpleado(dashboard, viewEmpleado).cargarTabla();
        viewEmpleado.repaint();
        viewGestionEmpleado.repaint();
    }

    private void guardarEmpleado() {
        if (valicacionEmpleado.datosValidados(
                viewGestionEmpleado.nombreEmpleado,
                viewGestionEmpleado.apellidoEmpleado,
                viewGestionEmpleado.telefonoEmpleado,
                viewGestionEmpleado.CorreoEmpleado,
                viewGestionEmpleado.usuarioEmpleado,
                viewGestionEmpleado.passwordField1) && empleado.buscarUsuarioRepetido(
                        viewGestionEmpleado.usuarioEmpleado.getText().trim(),
                        viewGestionEmpleado.mensajeGuardado,
                        viewGestionEmpleado.usuarioEmpleado,
                        "Usuario")) {
            empleado.nuevo(
                    viewGestionEmpleado.nombreEmpleado.getText().trim(),
                    viewGestionEmpleado.apellidoEmpleado.getText().trim(),
                    viewGestionEmpleado.telefonoEmpleado.getText().trim(),
                    viewGestionEmpleado.CorreoEmpleado.getText().trim(),
                    viewGestionEmpleado.usuarioEmpleado.getText().trim(),
                    viewGestionEmpleado.esAdmin.isSelected(),
                    viewGestionEmpleado.passwordField1.getText().trim());
            valicacionEmpleado.mensaje(viewGestionEmpleado.mensajeGuardado, "Empleado Guardado");
            limpiarInput();
        }
    }

    private void editarEmpleado() {
        if (valicacionEmpleado.datosValidados(
                viewGestionEmpleado.nombreEmpleado,
                viewGestionEmpleado.apellidoEmpleado,
                viewGestionEmpleado.telefonoEmpleado,
                viewGestionEmpleado.CorreoEmpleado,
                viewGestionEmpleado.usuarioEmpleado,
                viewGestionEmpleado.passwordField1)) {
            empleado.editar(idEmpleado,
                    viewGestionEmpleado.nombreEmpleado.getText().trim(),
                    viewGestionEmpleado.apellidoEmpleado.getText().trim(),
                    viewGestionEmpleado.telefonoEmpleado.getText().trim(),
                    viewGestionEmpleado.CorreoEmpleado.getText().trim(),
                    viewGestionEmpleado.usuarioEmpleado.getText().trim(),
                    viewGestionEmpleado.esAdmin.isSelected(),
                    viewGestionEmpleado.passwordField1.getText().trim());
            valicacionEmpleado.mensaje(viewGestionEmpleado.mensajeGuardado, "Editado con exito");
            limpiarInput();

        }
    }

    private void seleccionVentana() {
        if (dato.equals("Nuevo")) {
            viewGestionEmpleado.tituloPrincipal.setText("Nuevo Empleado");
        } else {
            viewGestionEmpleado.tituloPrincipal.setText("Editar Empleado");
            this.datosEmpleado = empleado.buscar(dato);
            this.idEmpleado = datosEmpleado[0];
            viewGestionEmpleado.nombreEmpleado.setText(datosEmpleado[1]);
            viewGestionEmpleado.apellidoEmpleado.setText(datosEmpleado[2]);
            viewGestionEmpleado.telefonoEmpleado.setText(datosEmpleado[3]);
            viewGestionEmpleado.CorreoEmpleado.setText(datosEmpleado[4]);
            viewGestionEmpleado.usuarioEmpleado.setText(datosEmpleado[5]);
            viewGestionEmpleado.passwordField1.setText(datosEmpleado[6]);
            viewGestionEmpleado.esAdmin.setSelected(Boolean.valueOf(datosEmpleado[7]));
        }

    }

    private void limpiarInput() {
        viewGestionEmpleado.nombreEmpleado.setText("");
        viewGestionEmpleado.apellidoEmpleado.setText("");
        viewGestionEmpleado.telefonoEmpleado.setText("");
        viewGestionEmpleado.CorreoEmpleado.setText("");
        viewGestionEmpleado.usuarioEmpleado.setText("");
        viewGestionEmpleado.passwordField1.setText("");
        viewGestionEmpleado.esAdmin.setSelected(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == viewGestionEmpleado.btnRegresar) {
            regresarView();
        } else if (e.getSource() == viewGestionEmpleado.btnGuardarEmpleado) {
            guardarAccion();
        }
    }

}
