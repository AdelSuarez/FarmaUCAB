
package utils;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import validaciones.Validacion;


public class BuscadorTabla extends Validacion {
    public void buscadorTabla(
        components.TextField inputBuscar,
        List<String> nombres,
        javax.swing.JTable tabla,
        int index
    ) {
        if (validarInput(inputBuscar, "Buscar")) {
            if (!nombres.isEmpty()) {
                inputBuscar.setLabelText("Buscar");

                DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
                List<Integer> filasSeleccionadas = new ArrayList<>();
                for (int i = 0; i < modeloTabla.getRowCount(); i++) {
                    String nombreEnFila = (String) modeloTabla.getValueAt(i, index); // Ajusta la columna según tu modelo
                    for (String nombre : nombres) {
                        if (nombreEnFila.equals(nombre)) {
                            // Encontramos la fila, ahora la añadimos a la lista de filas seleccionadas
                            filasSeleccionadas.add(i);
                            break;
                        }
                    }
                }
                if (!filasSeleccionadas.isEmpty()) {
                    // La tabla permite la selección de múltiples filas
                    tabla.setRowSelectionAllowed(true);
                    tabla.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                    // Seleccionamos todas las filas que coinciden
                    for (int fila : filasSeleccionadas) {
                        tabla.addRowSelectionInterval(fila, fila);
                        tabla.scrollRectToVisible(tabla.getCellRect(fila, 0, true));
                    }
                }
                inputBuscar.setText("");
            } else {
                inputBuscar.setLabelText("Buscar (0 resultados)");
            }
        }
    }

    @Override
    public void mensaje(JLabel jlabel, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
