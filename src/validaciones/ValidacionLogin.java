package validaciones;

import javax.swing.*;
import style.MyColor;

public class ValidacionLogin extends Validacion {

    public boolean verificacionPassword(JLabel jlabel, components.PasswordField inputPassword, components.PasswordField inputRepetirPassword) {
        // Activa el JLabel que muestra si las dos contraseñas son iguales
        if (inputPassword.getText().trim().equals(inputRepetirPassword.getText().trim()) && !inputPassword.getText().equals("") && !inputRepetirPassword.getText().equals("")) {
            jlabel.setVisible(false);
//            estanIguales = true;
            inputPassword.setLineColor(new MyColor().getAZUL());
            inputRepetirPassword.setLineColor(new MyColor().getAZUL());
            return true;

        } else {
            inputPassword.setLineColor(new MyColor().getREDPRIMARIO());
            inputRepetirPassword.setLineColor(new MyColor().getREDPRIMARIO());
            if (!inputPassword.getText().equals("") && !inputRepetirPassword.getText().equals("")) {
                mensaje(jlabel, "Las contraseñas no coinciden!");
            }
            return false;

        }
    }

    public int ceroCamposVaciosInicioSesion(components.TextField inputUsuario, components.PasswordField inputPassword) {
        int contador = 0;
        if (validarInput(inputUsuario, "Usuario")) {
            contador++;
        }
        if (validarInputPassword(inputPassword, "Contraseña")) {
            contador++;
            inputPassword.setLineColor(new MyColor().getAZUL());

        } else {
            inputPassword.setLineColor(new MyColor().getREDPRIMARIO());

        }

        return contador;

    }

    public boolean ceroCamposVaciosRegistro(
            components.TextField inputNombre,
            components.TextField inputApellido,
            components.TextField inputTelefono,
            components.TextField inputCorreo,
            components.TextField inputUsuarioRegistro,
            components.PasswordField inputPassword,
            components.PasswordField inputRepetirPassword) {
//        boolean estanVacios = false;
        // se usa un array para que se se guarde los cambios que se realizan a la variable con las otras funciones
        int[] contadorInput = {0};

        if (validarInput(inputNombre, "Nombre")) {
            validarCaracteresInput(inputNombre, "Nombre", getREGEXNOMBRE(), contadorInput);

        }
        if (validarInput(inputApellido, "Apellido")) {
            validarCaracteresInput(inputApellido, "Apellido", getREGEXNOMBRE(), contadorInput);

        }

        if (validarInput(inputTelefono, "Telefono") && validarCantidadDigitos(inputTelefono, "Telefono", 11)) {
            validarCaracteresInput(inputTelefono, "Telefono", getREGEXNUMERO(), contadorInput);

        }

        if (validarInput(inputCorreo, "Correo")) {
            validarCaracteresInput(inputCorreo, "Correo", getREGEXCORREO(), contadorInput);

        }
        if (validarInput(inputUsuarioRegistro, "Usuario") && longitudUsuario(inputUsuarioRegistro, "Usuario")) {
            contadorInput[0]++;
        }
        if (validarInputPassword(inputPassword, "Contraseña") && longitudPasswordCorrecta(inputPassword, "Contraseña")) {
            contadorInput[0]++;
        }

        if (validarInputPassword(inputRepetirPassword, "Confirmar contraseña") && longitudPasswordCorrecta(inputRepetirPassword, "Confirmar contraseña")) {
            contadorInput[0]++;
        }
        return (contadorInput[0] == 7) ? true : false;

    }
    


    @Override
    public void mensaje(JLabel jlabel, String mensaje) {
        jlabel.setText(mensaje);
        jlabel.setVisible(true);
    }
}
