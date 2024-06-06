package validaciones;

import javax.swing.JLabel;

public class ValidacionesEmpleado extends Validacion {

    public boolean datosValidados(
            components.TextField nombreEmpleado,
            components.TextField apellidoEmpleado,
            components.TextField telefonoEmpleado,
            components.TextField correoEmpleado,
            components.TextField usuarioEmpleado,
            components.PasswordField passwordEmpleado) {
        int[] contadorInput = {0};

        if (validarInput(nombreEmpleado, "Nombre")) {
            validarCaracteresInput(nombreEmpleado, "Nombre", getREGEXNOMBRE(), contadorInput);
        }
        if (validarInput(apellidoEmpleado, "Apellido")) {
            validarCaracteresInput(apellidoEmpleado, "Apellido", getREGEXNOMBRE(), contadorInput);
        }
        if (validarInput(telefonoEmpleado, "Telefono")) {
            validarCaracteresInput(telefonoEmpleado, "Telefono", getREGEXNUMERO(), contadorInput);
        }
        if (validarInput(correoEmpleado, "Correo")) {
            validarCaracteresInput(correoEmpleado, "Correo", getREGEXCORREO(), contadorInput);
        }
        if (validarInput(usuarioEmpleado, "Usuario")) {
            contadorInput[0]++;
        }
        if (validarInputPassword(passwordEmpleado, "Contraseña")) {
            contadorInput[0]++;
        }
        if (contadorInput[0] == 6) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void mensaje(JLabel jlabel, String mensaje) {
        jlabel.setText(mensaje);
        jlabel.setVisible(true);
    }

}
