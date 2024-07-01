package validaciones;

import javax.swing.JLabel;

public class ValidacionArchivo extends Validacion{

    public boolean datosValidados(
            components.TextField nombreArchivo
        ){
        int[] contadorInput = {0};
        if (validarInput(nombreArchivo, "Nombre del Archivo: ")) {
            validarCaracteresInput(nombreArchivo, "Nombre del Archivo: ", getREGEXARCHIVO(), contadorInput);
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
