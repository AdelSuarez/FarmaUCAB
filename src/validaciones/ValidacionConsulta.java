
package validaciones;

import javax.swing.JLabel;

public class ValidacionConsulta extends Validacion{

    public boolean datosValidados(
            components.TextField CIPaciente,
            components.TextField doctoraCargo
        ){
        int[] contadorInput = {0};
        if(validarCantidadDigitos(CIPaciente, "Cédula del paciente", 6) && validarInput(CIPaciente, "Cédula del paciente")){
            validarCaracteresInput(CIPaciente, "Cédula del paciente ", getREGEXNUMERO(), contadorInput);
        }
        if(validarInput(doctoraCargo, "Doctor a Cargo")){
            validarCaracteresInput(doctoraCargo, "Doctor a Cargo", getREGEXNOMBRE(), contadorInput);
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
    
    
    @Override
    public void mensaje(JLabel jlabel, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
