package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.Main;
import views.Login;
import model.dataBase.DataBase;
import model.dataBase.EmpleadoDB;
import style.MyColor;
import validaciones.ValidacionLogin;

public class ControllerLogin implements ActionListener {

    private Main main;
    private Login login;
    private EmpleadoDB empleado = new EmpleadoDB();
    private ValidacionLogin validacionLogin = new ValidacionLogin();

    public ControllerLogin(Main main, Login login) {
        this.main = main;
        this.login = login;
        login.textoMensaje.setVisible(false);
        login.mesajeInicioSesion.setVisible(false);
        login.btnInicioSesion.addActionListener(this);
        login.btnRegistrar.addActionListener(this);
    }

    public void tipoLogin() {
        if (new DataBase().isEmptyTabla("Empleados")) {
            login.PanelAdmin.setVisible(true);
            login.PanelInicioSesion.setVisible(false);
        } else {
            login.PanelInicioSesion.setVisible(true);
            login.PanelAdmin.setVisible(false);

        }
    }

    private void IniciarSesion() {
        login.mesajeInicioSesion.setVisible(false);

        if (validacionLogin.ceroCamposVaciosInicioSesion(login.inputUsuarioSesion, login.inputPasswordUsuario) == 2) {
            if (empleado.inicioEmpleado(login.inputUsuarioSesion.getText().trim(), login.inputPasswordUsuario.getText().trim())) {
                
                String[] datosEmpleado = empleado.buscar(login.inputUsuarioSesion.getText().trim());
                
                if (empleado.validarEmpleadoAdmin(login.inputUsuarioSesion.getText().trim())) {
                    limpiarInput();
                    main.initView(main.viewAdmin(true, datosEmpleado));

                } else {
                    limpiarInput();
                    main.initView(main.viewAdmin(false, datosEmpleado));
                }

            } else {
                login.inputUsuarioSesion.setLineColor(new MyColor().getRED());
                login.inputPasswordUsuario.setLineColor(new MyColor().getRED());
                login.mesajeInicioSesion.setVisible(true);
            }
        }
        login.repaint();
    }

    private void registrarUsuarioAdmin() {
        if (validacionLogin.ceroCamposVaciosRegistro(login.inputNombre, login.inputApellido, login.inputTelefono, login.inputCorreo, login.inputUsuarioRegistro, login.inputPassword, login.inputRepetirPassword)
                && validacionLogin.verificacionPassword(login.textoMensaje, login.inputPassword, login.inputRepetirPassword)) {
            empleado.nuevo(
                    login.inputNombre.getText().trim(),
                    login.inputApellido.getText().trim(),
                    login.inputTelefono.getText().trim(),
                    login.inputCorreo.getText().trim(),
                    login.inputUsuarioRegistro.getText().trim(),
                    true,
                    login.inputPassword.getText().trim());
            String[] datosEmpleado = {"0", login.inputNombre.getText().trim(), login.inputApellido.getText().trim()};
            main.initView(main.viewAdmin(true, datosEmpleado));

        } else {
            validacionLogin.verificacionPassword(login.textoMensaje, login.inputPassword, login.inputRepetirPassword);
        }
        login.repaint();
    }

    private void limpiarInput() {
        login.inputUsuarioSesion.setText("");
        login.inputPasswordUsuario.setText("");
        login.mesajeInicioSesion.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.btnInicioSesion) {
            IniciarSesion();
        } else if (e.getSource() == login.btnRegistrar) {
            registrarUsuarioAdmin();
        }

    }

}
