package validaciones;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import style.MyColor;

public abstract class Validacion {

    private final String AVISOVACIO = " (Campo vacío)";
    private final String AVISOLONGITUD = " (Cantidad de carateres minima)";
    private final String AVISOCARACTERES = " (Caracteres invalidos)";
    private final String REGEXNOMBRE = "^[A-Za-z ]*$";
    private final String REGEXCORREO = "[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
    private final String REGEXNUMERO = "^[0-9 ]+$";

    public String getREGEXNOMBRE() {
        return REGEXNOMBRE;
    }

    public String getREGEXCORREO() {
        return REGEXCORREO;
    }

    public String getREGEXNUMERO() {
        return REGEXNUMERO;
    }

    public abstract void mensaje(JLabel jlabel, String mensaje);

    public boolean validarInputPassword(components.PasswordField textfielpassword, String Texto) {
//        boolean estaVacio = false;
        if (textfielpassword.getText().equals("")) {
            textfielpassword.setLabelText(Texto + AVISOVACIO);
            return false;
        } else {
            textfielpassword.setLabelText(Texto);
//            estaVacio = true;
            return true;
        }
//        return estaVacio;

    }
    public boolean validarCantidadDigitos(components.TextField textfiel, String texto, int cantidad) {
//        boolean estaVacio = false;
        if (textfiel.getText().length() < cantidad) {
            textfiel.setLineColor(new MyColor().getRED());
            textfiel.setLabelText(texto + AVISOLONGITUD);
            return false;
        } else {
            textfiel.setLineColor(new MyColor().getAZUL());
            textfiel.setLabelText(texto);
//            estaVacio = true;
            return true;
        }
//        return estaVacio;
    }
//         Verificadores de campos vacios
    public boolean validarInput(components.TextField textfiel, String texto) {
//        boolean estaVacio = false;
        if (textfiel.getText().equals("")) {
            textfiel.setLineColor(new MyColor().getRED());
            textfiel.setLabelText(texto + AVISOVACIO);
            return false;
        } else {
            textfiel.setLineColor(new MyColor().getAZUL());
            textfiel.setLabelText(texto);
//            estaVacio = true;
            return true;
        }
//        return estaVacio;
    }

    public void validarCaracteresInput(components.TextField textfiel, String texto, String regex, int[] contador) {
        // Valida cualquier input segun la entrada del input, segun la regex que se le pase por parametro 

        if (textfiel.getText().matches(regex)) {
            textfiel.setLineColor(new MyColor().getAZUL());
            textfiel.setLabelText(texto);
            contador[0]++;

        } else {
            textfiel.setLineColor(new MyColor().getRED());
            textfiel.setLabelText(texto + AVISOCARACTERES);
        }

    }

    public void buscador(
            components.TextField inputBuscar,
            String nombre,
            javax.swing.JTable tabla,
            int index
    ) {
        
        
        if (validarInput(inputBuscar, "Buscar")) {
            int filaSeleccionada = -1;
            String nombreEmpleado = nombre;
            if (!nombreEmpleado.equals("")) {
                inputBuscar.setLabelText("Buscar");

                DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
                for (int i = 0; i < modeloTabla.getRowCount(); i++) {
                    String nombreEnFila = (String) modeloTabla.getValueAt(i, index); // Ajusta la columna según tu modelo
                    if (nombreEnFila.equals(nombreEmpleado)) {
                        // Encontramos la fila, ahora enfocamos
                        tabla.setRowSelectionInterval(i, i);
                        tabla.scrollRectToVisible(tabla.getCellRect(i, 0, true));
                        break;
                    }
                }
                if (filaSeleccionada != -1) {
                    // La fila está seleccionada, puedes enfocarla en el JTable
                    tabla.setRowSelectionInterval(filaSeleccionada, filaSeleccionada);
                    tabla.scrollRectToVisible(tabla.getCellRect(filaSeleccionada, 0, true));

                }
                inputBuscar.setText("");
            } else {
                inputBuscar.setLabelText("Buscar (0 resultados)");
            }

        }
    }
    
}
