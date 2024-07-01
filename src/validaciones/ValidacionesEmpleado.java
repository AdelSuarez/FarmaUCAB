package validaciones;

import javax.swing.JLabel;
import model.dataBase.DataBase;
import style.MyColor;

public class ValidacionesEmpleado extends Validacion {

    public boolean datosValidados(
            components.TextField nombreEmpleado,
            components.TextField apellidoEmpleado,
            components.TextField telefonoEmpleado,
            components.TextField correoEmpleado,
            components.TextField usuarioEmpleado,
            components.PasswordField passwordEmpleado,
            String tipoAcccion){
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
        if (tipoAcccion.equals("Nuevo")){
            if (validarInput(usuarioEmpleado, "Usuario") && usuarioRepetida(usuarioEmpleado, "Usuario")  && longitudUsuario(usuarioEmpleado, "Usuario")) {
                contadorInput[0]++;
            }
        } else {
            if (validarInput(usuarioEmpleado, "Usuario") && longitudUsuario(usuarioEmpleado, "Usuario")) {
                contadorInput[0]++;
            }
        }

        if (validarInputPassword(passwordEmpleado, "Contraseña") && longitudPasswordCorrecta(passwordEmpleado, "Contraseña")) {
            contadorInput[0]++;
        }
        
        return (contadorInput[0] == 6) ? true : false;

    }
    
    private boolean usuarioRepetida(components.TextField usuarioEmpleado, String texto){
        if (new DataBase().buscarDatoRepetida(usuarioEmpleado.getText().trim(), "SELECT COUNT(*) AS total FROM Empleados WHERE USUARIO = ?")){
            usuarioEmpleado.setLineColor(new MyColor().getREDPRIMARIO());
            usuarioEmpleado.setLabelText(texto + " (Usuario repetida)");
            return false;
        } else {
            usuarioEmpleado.setLineColor(new MyColor().getAZUL());
            usuarioEmpleado.setLabelText(texto);
            return true;
        }
                       
    }

    @Override
    public void mensaje(JLabel jlabel, String mensaje) {
        jlabel.setText(mensaje);
        jlabel.setVisible(true);
    }

}
