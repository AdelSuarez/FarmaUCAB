
package validaciones;

import javax.swing.JLabel;

public class ValidacionConsulta extends Validacion{

    public boolean datosValidados(
            components.Combobox combobox,
            components.TextField doctoraCargo
        ){
        int[] contadorInput = {0};
        if (!validarComboBox(combobox).equals("")) {
            contadorInput[0]++;
        }
        if(validarInput(doctoraCargo, "Doctor / Enfermera")){
            validarCaracteresInput(doctoraCargo, "Doctor / Enfermera", getREGEXNOMBRE(), contadorInput);
        }
        if(contadorInput[0] == 2){
            return true;
        } else {
            return false;
        } 
    }
    public boolean validarCantidad(
            components.TextField Cantidad
        ){
        int[] contadorInput = {0};
        if(validarInput(Cantidad, "Cantidad")){
            validarCaracteresInput(Cantidad, "Cantidad", getREGEXNUMERO(), contadorInput);
        }
        if(contadorInput[0] == 1){
            return true;
        } else {
            return false;
        } 
    }
    
    private String validarComboBox(components.Combobox combobox) {
        try {
            String cedula = combobox.getSelectedItem().toString();
            return cedula;
        } catch (Exception e) {
            combobox.setLabeText("Paciente (No seleccionado)");
        }
        return "";
    }
    
    @Override
    public void mensaje(JLabel jlabel, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
