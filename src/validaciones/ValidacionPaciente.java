package validaciones;

import javax.swing.JLabel;
import style.MyColor;

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
        if (validarInput(inputCedula, "Cedula")) {
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
            validarCaracteresInput(inputTelefono, "Telefono", getREGEXNUMERO(), contadorInput);

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
    
    private boolean validarEdad(components.TextField inputEdad){
        int edad = Integer.parseInt(inputEdad.getText().trim());
        if ( edad >= 1 && edad < 100 ){
            inputEdad.setLabelText("Edad");
            inputEdad.setLineColor(new MyColor().getAZUL());
            return true;
        }
        inputEdad.setLabelText("Edad (Fuera de rango)");
        inputEdad.setLineColor(new MyColor().getRED());
        return false;
    }

    @Override
    public void mensaje(JLabel jlabel, String mensaje) {
        jlabel.setText(mensaje);
        jlabel.setVisible(true);
    }

}
