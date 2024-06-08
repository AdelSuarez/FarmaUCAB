
package validaciones;

import javax.swing.JLabel;

public class ValidacionInsumo extends Validacion{

    public boolean datosValidados(
            components.TextField nombreInsumo,
            components.Spinner StockInsumo
        ){
        int[] contadorInput = {0};
        if(validarInput(nombreInsumo, "Nombre")){
            validarCaracteresInput(nombreInsumo, "nombre", getREGEXNOMBRE(), contadorInput);
        }
        if(StockInsumo.getValue().equals(0)){
            StockInsumo.setLabelText("Stock (Campo vacío)");
        } else {
            StockInsumo.setLabelText("Stock");
            contadorInput[0]++;
        }
        
        if(contadorInput[0] == 2){
            return true;
        } else {
            return false;
        }
    }
    
    
    @Override
    public void mensaje(JLabel jlabel, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
