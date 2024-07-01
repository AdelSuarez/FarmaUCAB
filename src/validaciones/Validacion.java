package validaciones;

import javax.swing.JLabel;
import style.MyColor;

public abstract class Validacion {

    private final String AVISOVACIO = " (Campo vacío)";
    private final String AVISOLONGITUD = " (Cantidad de carateres minima)";
    private final String AVISOCARACTERES = " (Caracteres invalidos)";
    private final String REGEXNOMBRE = "^[A-Za-z ]*$";
    private final String REGEXCORREO = "[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
    private final String REGEXNUMERO = "^[0-9 ]+$";
    private final String REGEXARCHIVO = "^[a-zA-Z0-9_-]+$";

    public String getREGEXNOMBRE() {
        return REGEXNOMBRE;
    }

    public String getREGEXCORREO() {
        return REGEXCORREO;
    }

    public String getREGEXNUMERO() {
        return REGEXNUMERO;
    }
    
    public String getREGEXARCHIVO() {
        return REGEXARCHIVO;
    }

    public abstract void mensaje(JLabel jlabel, String mensaje);

    public boolean validarInputPassword(components.PasswordField textfielpassword, String Texto) {
        if (textfielpassword.getText().equals("")) {
            textfielpassword.setLabelText(Texto + AVISOVACIO);
            return false;
        } else {
            textfielpassword.setLabelText(Texto);
            return true;
        }

    }
    
    public boolean longitudPasswordCorrecta(components.PasswordField textfielpassword, String Texto) {
        if (textfielpassword.getText().length() >= 4) {
            textfielpassword.setLabelText(Texto);
            return true;
        } else {
            textfielpassword.setLabelText(Texto + " (Mas de 4 caracteres)");
            return false;
        }

    }
    
    public boolean longitudUsuario(components.TextField usuario, String Texto) {
        if (usuario.getText().length() >= 4) {
            usuario.setLabelText(Texto);
            usuario.setLineColor(new MyColor().getAZUL());
            return true;
        } else {
            usuario.setLabelText(Texto + " (Mas de 4 caracteres)");
            usuario.setLineColor(new MyColor().getREDPRIMARIO());
            return false;
        }

    }
    
    public boolean validarCantidadDigitos(components.TextField textfiel, String texto, int cantidad) {
        if (textfiel.getText().length() < cantidad) {
            textfiel.setLineColor(new MyColor().getREDPRIMARIO());
            textfiel.setLabelText(texto + AVISOLONGITUD);
            return false;
        } else {
            textfiel.setLineColor(new MyColor().getAZUL());
            textfiel.setLabelText(texto);
            return true;
        }
    }
//         Verificadores de campos vacios
    public boolean validarInput(components.TextField textfiel, String texto) {
        if (textfiel.getText().equals("")) {
            textfiel.setLineColor(new MyColor().getREDPRIMARIO());
            textfiel.setLabelText(texto + AVISOVACIO);
            return false;
        } else {
            textfiel.setLineColor(new MyColor().getAZUL());
            textfiel.setLabelText(texto);
            return true;
        }
    }

    public void validarCaracteresInput(components.TextField textfiel, String texto, String regex, int[] contador) {
        // Valida cualquier input segun la entrada del input, segun la regex que se le pase por parametro 

        if (textfiel.getText().matches(regex)) {
            textfiel.setLineColor(new MyColor().getAZUL());
            textfiel.setLabelText(texto);
            contador[0]++;

        } else {
            textfiel.setLineColor(new MyColor().getREDPRIMARIO());
            textfiel.setLabelText(texto + AVISOCARACTERES);
        }

    }

    public String primeraLetraMayuscula(String texto){
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }
    
    public String primeraLetraPalabraMayuscula(String texto){
        String[] palabras = texto.split(" ");
        for(int i = 0; i < palabras.length; i++){
            palabras[i] = primeraLetraMayuscula(palabras[i]);
        }
        String palabrasEnMayuscula = String.join(" ", palabras);
        return palabrasEnMayuscula;
                
    }
    
}
