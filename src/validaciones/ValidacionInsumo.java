
package validaciones;

import javax.swing.JLabel;

public class ValidacionInsumo extends Validacion{

    public boolean datosValidados(
            components.TextField nombreInsumo,
            components.Spinner stockInsumo,
            components.Spinner cantidadBlister,
            components.JCheckBoxCustom bliesterActivo
        ){
        int[] contadorInput = {0};
        if(validarInput(nombreInsumo, "Nombre")){
            validarCaracteresInput(nombreInsumo, "nombre", getREGEXNOMBRE(), contadorInput);
        }
        if (validarCantidad(stockInsumo, "Cant.") && cantidadValida(stockInsumo, "Cant.")){
            contadorInput[0]++;
        }
        
        if (bliesterActivo.isSelected()){
            if (validarCantidad(cantidadBlister, "Cant.") && cantidadValida(cantidadBlister, "Cant.")){
                cantidadBlister.setLabelText("Cant. del blister");
                contadorInput[0]++;
            }
        } else{
            contadorInput[0]++;
        }
        
        
        if(contadorInput[0] == 3){
            return true;
        } else {
            return false;
        }
    }
    
    private boolean validarCantidad(components.Spinner inputCantidad, String texto){
        if(inputCantidad.getValue().equals(0)){
            inputCantidad.setLabelText(texto + " (Campo vacío)");
            return false;
        } else {
            inputCantidad.setLabelText(texto);
            return true;
        }
    }
    
    private boolean cantidadValida(components.Spinner inputCantidad, String texto){
        if((Integer) inputCantidad.getValue() < 0){
            inputCantidad.setLabelText(texto + " (Cantidad negativa)");
            return false;
        } else {
            inputCantidad.setLabelText(texto);
            return true;
        }
    }
    
    
    @Override
    public void mensaje(JLabel jlabel, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
