package Controlador;

import javax.swing.*;
import database.Insumo;
//
//public class DAO {
//
//    //estado "nuevo" es para crear, cualquier otro para editar
//    public void guardarInsumo(JTextField nombreInsumo, JTextField cantidadInsumo, String estado, JLabel textoGuardado, String id) {
//        Insumo insumo = new Insumo();
//        if (estado.equals("nuevo")) {
//            if (!nombreInsumo.getText().equals("") && !cantidadInsumo.getText().equals("")) {
//                if (insumo.nuevoInsumo(nombreInsumo.getText().trim(), Integer.parseInt(cantidadInsumo.getText().trim()))) {
//                    textoGuardado.setText("Insumo guardado con exito");
//                    textoGuardado.setVisible(true);
//                    nombreInsumo.setText("");
//                    cantidadInsumo.setText("");
//                }
//            }
//
//        } else {
//            if (!nombreInsumo.getText().equals("") && !cantidadInsumo.getText().equals("")) {
//                String datosInsumo[] = insumo.buscarInsumo(id);
//                if (insumo.editarInsumo(datosInsumo[0], nombreInsumo.getText(), Integer.valueOf(cantidadInsumo.getText()))) {
//                    textoGuardado.setText("Insumo editado con exito");
//                    nombreInsumo.setText("");
//                    cantidadInsumo.setText("");
//                }
//
//            }
//        }
//
//    }
//
//    public void configuracionesTabla(JTable tabla, int columnas) {
//        for (int i = 0; i <= columnas; i++) {
//            tabla.getColumnModel().getColumn(i).setPreferredWidth(100);
//            tabla.getColumnModel().getColumn(i).setResizable(false);
//        }
//    }
//
//    public String[] buscarInsumo(String id) {
//        Insumo insumo = new Insumo();
//        return insumo.buscarInsumo(id);
//    }
//}
