
package validaciones;

import javax.swing.JLabel;

public class ValidacionPaciente  extends Validacion{
    private final String REGEXNOMBRE = getREGEXNOMBRE();
    private final String REGEXNUMERO = getREGEXNUMERO();
            
    public boolean ceroCamposVacios(
            components.TextField inputNombre, 
            components.TextField inputApellido, 
            components.TextField inputCedula,
            components.TextField inputEdad,
            components.TextField inputTelefono,
            components.TextField inputDE,
            components.Combobox combobox
    ){
        int[] contadorInput = {0};
        
        if (validarInput(inputNombre, "Nombre")){
            validarCaracteresInput(inputNombre, "Nombre", REGEXNOMBRE, contadorInput);
        } 
        if (validarInput(inputApellido, "Apellido")){
            validarCaracteresInput(inputApellido, "Apellido", REGEXNOMBRE, contadorInput);
        }
        if (validarInput(inputCedula, "Cedula")){
            validarCaracteresInput(inputCedula, "Cedula", REGEXNUMERO, contadorInput);
        }
        if (validarInput(inputEdad, "Edad")){
            validarCaracteresInput(inputEdad, "Edad", REGEXNUMERO, contadorInput);
        }
        
        validarCaracteresInput(inputDE, "Dependencia/Escuela",REGEXNOMBRE, contadorInput);
        validarCaracteresInput(inputTelefono, "Telefono", REGEXNUMERO, contadorInput);
        
        if(!validarComboBox(combobox).equals("")){
            contadorInput[0]++;
        }
        if(contadorInput[0] == 7){
            return true;
        } else {
            return false;

        }    
    }
    
    private String validarComboBox(components.Combobox combobox){
        try {
            String genero = combobox.getSelectedItem().toString();
            return genero;
        } catch (Exception e) {
            combobox.setLabeText("Genero (No seleccionado)");
        }
        return "";
    }
    
    @Override
    public void mensaje(JLabel jlabel, String mensaje){
        jlabel.setText(mensaje);
        jlabel.setVisible(true);
    } 
    
}
