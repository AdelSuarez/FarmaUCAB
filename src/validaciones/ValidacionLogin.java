
package validaciones;

import javax.swing.*;
import style.MyColor;

public class ValidacionLogin {
    private final String AVISOVACIO = " (Campo vacío)";
    private final String AVISOCARACTERES = " (Caracteres invalidos)";
    private final String REGEXNOMBRE = "^[A-Za-z ]*$";
    private final String REGEXCORREO = "[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
    private final String REGEXNUMERO = "^[0-9]+$";
    
    private void mensaje(JLabel jlabel, String mensaje){
        jlabel.setText(mensaje);
        jlabel.setVisible(true);
//        this.repaint();
    }    
    public boolean verificacionPassword(JLabel jlabel, components.PasswordField inputPassword, components.PasswordField inputRepetirPassword){
        boolean estanIguales = false;
        // Activa el JLabel que muestra si las dos contraseñas son iguales
        if (inputPassword.getText().trim().equals(inputRepetirPassword.getText().trim())){
            jlabel.setVisible(false);
            estanIguales = true;
            inputPassword.setLineColor(new MyColor().getAZUL());
            inputRepetirPassword.setLineColor(new MyColor().getAZUL());


        } else {
            inputPassword.setLineColor(new MyColor().getRED());
            inputRepetirPassword.setLineColor(new MyColor().getRED());
            mensaje(jlabel,"Las contraseñas no coinciden!");
        }
        return estanIguales;
    }
    
    public boolean ceroCamposVacios(
            components.TextField inputNombre, 
            components.TextField inputApellido, 
            components.TextField inputTelefono, 
            components.TextField inputCorreo,
            components.TextField inputUsuarioRegistro,
            components.PasswordField inputPassword,
            components.PasswordField inputRepetirPassword){
        boolean estanVacios = false;
        // se usa un array para que se se guarde los cambios que se realizan a la variable con las otras funciones
        int[] contadorInput = {0};
        
        
        if (validarInput(inputNombre, "Nombre")){
            validarCaracteresInput(inputNombre, "Nombre", REGEXNOMBRE, contadorInput);
            
        }
        if (validarInput(inputApellido, "Apellido")) {
            validarCaracteresInput(inputApellido, "Apellido", REGEXNOMBRE, contadorInput);
            
        }
        
        if (validarInput(inputTelefono, "Telefono")){
            validarCaracteresInput(inputTelefono, "Telefono", REGEXNUMERO, contadorInput);
             
        }
        
        if (validarInput(inputCorreo, "Correo")){
            validarCaracteresInput(inputCorreo, "Correo", REGEXCORREO, contadorInput);
            
        }
        if (validarInput(inputUsuarioRegistro, "Usuario")){
            contadorInput[0]++;
        }
        
        validarInputPassword(inputPassword, "Contraseña", contadorInput);
        validarInputPassword(inputRepetirPassword, "Confirmar contraseña", contadorInput);
        System.out.println(contadorInput[0]);
        
        if(contadorInput[0] == 7){
            estanVacios = true;
        }
        return estanVacios;
    }
    
    private void validarCaracteresInput(components.TextField textfiel, String texto, String regex, int[] contador){
        // Valida cualquier input segun la entrada del input, segun la regex que se le pase por parametro 

        if (textfiel.getText().matches(regex)){
            textfiel.setLineColor(new MyColor().getAZUL());
            textfiel.setLabelText(texto);
            contador[0]++;


        } else {
            textfiel.setLineColor(new MyColor().getRED());
            textfiel.setLabelText(texto + AVISOCARACTERES);
        }
        
    }
     
    
    // Verificadores de campos vacios
    private boolean validarInput(components.TextField textfiel, String texto){
        boolean estaVacio = false;
        if(textfiel.getText().equals("")){
            textfiel.setLineColor(new MyColor().getRED());
            textfiel.setLabelText(texto + AVISOVACIO);
        } else {
            textfiel.setLineColor(new MyColor().getAZUL());
            textfiel.setLabelText(texto);
            estaVacio = true;
        }
        return estaVacio;
    }
    
    private void validarInputPassword(components.PasswordField textfielpassword, String Texto, int[] contador){
        if(textfielpassword.getText().equals("")){
            System.out.println("Vacio");
            textfielpassword.setLineColor(new MyColor().getRED());
            textfielpassword.setLabelText(Texto + AVISOVACIO);
        } else {
            textfielpassword.setLineColor(new MyColor().getAZUL());
            textfielpassword.setLabelText(Texto);
            contador[0]++;
        }
    }
}
