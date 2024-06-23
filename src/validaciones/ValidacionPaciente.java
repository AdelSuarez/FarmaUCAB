package validaciones;

import javax.swing.JLabel;
import style.MyColor;
import model.dataBase.DataBase;

public class ValidacionPaciente extends Validacion {

    public boolean datosValidados(
            components.TextField inputNombre,
            components.TextField inputApellido,
            components.TextField inputCedula,
            components.TextField inputEdad,
            components.TextField inputTelefono,
            components.TextField inputDE,
            components.Combobox combobox
    ) {
        int[] contadorInput = {0};

        if (validarInput(inputNombre, "Nombre")) {
            validarCaracteresInput(inputNombre, "Nombre", getREGEXNOMBRE(), contadorInput);
        }
        if (validarInput(inputApellido, "Apellido")) {
            validarCaracteresInput(inputApellido, "Apellido", getREGEXNOMBRE(), contadorInput);
        }
        if (validarInput(inputCedula, "Cedula") && validarCantidadDigitos(inputCedula, "Cedula", 6) && cedulaRepetida(inputCedula, "Cedula")) {
            validarCaracteresInput(inputCedula, "Cedula", getREGEXNUMERO(), contadorInput);
        }
        if (validarInput(inputEdad, "Edad")) {
            if (validarEdad(inputEdad)){
                validarCaracteresInput(inputEdad, "Edad", getREGEXNUMERO(), contadorInput);

            }
        }

        validarCaracteresInput(inputDE, "Dependencia/Escuela", getREGEXNOMBRE(), contadorInput);
        if (inputTelefono.getText().equals("")){
            contadorInput[0]++;
        } else {
            if (validarCantidadDigitos(inputTelefono, "Telefono", 11)){
                validarCaracteresInput(inputTelefono, "Telefono", getREGEXNUMERO(), contadorInput);
            }

        }

        if (!validarComboBox(combobox).equals("")) {
            contadorInput[0]++;
        }
        if (contadorInput[0] == 7) {
            return true;
        } else {
            return false;

        }
    }

    private String validarComboBox(components.Combobox combobox) {
        try {
            String genero = combobox.getSelectedItem().toString();
            return genero;
        } catch (Exception e) {
            combobox.setLabeText("Genero (No seleccionado)");
        }
        return "";
    }
    
    private boolean cedulaRepetida(components.TextField inputCedula, String texto){
        if (new DataBase().buscarDatoRepetida(inputCedula.getText().trim(), "SELECT COUNT(*) AS total FROM Pacientes WHERE UPPER(CEDULA) = UPPER(?)")){
            inputCedula.setLineColor(new MyColor().getREDPRIMARIO());
            inputCedula.setLabelText(texto + " (Cédula repetida)");
            return false;
        } else {
            inputCedula.setLineColor(new MyColor().getAZUL());
            inputCedula.setLabelText(texto);
            return true;
        }
                       
    }
    
    private boolean validarEdad(components.TextField inputEdad){
        int edad = Integer.parseInt(inputEdad.getText().trim());
        if ( edad >= 1 && edad < 100 ){
            inputEdad.setLabelText("Edad");
            inputEdad.setLineColor(new MyColor().getAZUL());
            return true;
        }
        inputEdad.setLabelText("Edad (Fuera de rango)");
        inputEdad.setLineColor(new MyColor().getREDPRIMARIO());
        return false;
    }

    @Override
    public void mensaje(JLabel jlabel, String mensaje) {
        jlabel.setText(mensaje);
        jlabel.setVisible(true);
    }

}
