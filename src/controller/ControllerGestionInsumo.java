package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.Dashboard;
import views.ViewInsumo;
import views.viewsGestion.GestionInsumo;
import java.util.Calendar;
import model.dataBase.InsumoDB;
import validaciones.ValidacionInsumo;

public class ControllerGestionInsumo implements ActionListener {

    private Dashboard dashboard;
    private ViewInsumo viewInsumo;
    private GestionInsumo viewGestionInsumo;
    private InsumoDB insumo = new InsumoDB();
    private ValidacionInsumo validacionesInsumo = new ValidacionInsumo();

    private String dato;
    private String[] datos;

    public ControllerGestionInsumo(Dashboard dashboard, ViewInsumo viewInsumo, GestionInsumo viewGestionInsumo, String dato) {
        this.dashboard = dashboard;
        this.viewInsumo = viewInsumo;
        this.viewGestionInsumo = viewGestionInsumo;
        this.dato = dato;

        this.viewGestionInsumo.btnGuardarInsumo.addActionListener(this);
        this.viewGestionInsumo.btnRegresar.addActionListener(this);
        this.viewGestionInsumo.activarBlister.addActionListener(this);
        obtenerFecha();
        seleccionVentana();
        habilitarBlister();
    }

    private void regresarView() {
        dashboard.refrescarViewInsumo();
        dashboard.initView(dashboard.getViewInsumo());
        viewGestionInsumo.mensajeGuardado.setVisible(false);
        new ControllerInsumo(dashboard, viewInsumo).cargarTabla();
        viewGestionInsumo.repaint();
    }

    private void guardarAccion() {
        if (dato.equals("Nuevo")) {
            guardarInsumo();
        } else {
            editarInsumo();
        }
        viewGestionInsumo.repaint();
    }

    private void guardarInsumo() {
        if (validacionesInsumo.datosValidados(viewGestionInsumo.nombreInsumo,
                viewGestionInsumo.StockInsumo,
                viewGestionInsumo.cantidadBlister,
                viewGestionInsumo.activarBlister)) {
            
            if (insumo.nuevo(
                    viewGestionInsumo.nombreInsumo.getText().trim(),
                    (int) viewGestionInsumo.StockInsumo.getValue(), // Realiza un casting a int
                    viewGestionInsumo.descripcionInsumo.getText().trim(),
                    (viewGestionInsumo.activarBlister.isSelected()) ? (Integer)viewGestionInsumo.cantidadBlister.getValue() : 0,
                    obtenerFecha())) {
                viewGestionInsumo.mensajeGuardado.setVisible(true);
                limpiarInput();
            }

        }
    }

    private void editarInsumo() {
        if (validacionesInsumo.datosValidados(viewGestionInsumo.nombreInsumo, 
                viewGestionInsumo.StockInsumo,
                viewGestionInsumo.cantidadBlister,
                viewGestionInsumo.activarBlister)) {
            if (insumo.editar(dato,
                    viewGestionInsumo.nombreInsumo.getText().trim(),
                    (int) viewGestionInsumo.StockInsumo.getValue(),
                    viewGestionInsumo.descripcionInsumo.getText().trim())) {
                viewGestionInsumo.mensajeGuardado.setVisible(true);
                limpiarInput();
            }
        }
    }

    private String obtenerFecha() {
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DATE);
        int mes = calendario.get(Calendar.MONTH) + 1; // Sumamos 1 porque los meses en Calendar van de 0 a 11
        int annio = calendario.get(Calendar.YEAR);
        String fechaActual = dia + "/" + mes + "/" + annio;
        viewGestionInsumo.Fecha.setText(fechaActual);
        return fechaActual;
    }

    private void limpiarInput() {
        viewGestionInsumo.nombreInsumo.setText("");
        viewGestionInsumo.descripcionInsumo.setText("");
        viewGestionInsumo.StockInsumo.setValue(0);
    }

    private void seleccionVentana() {
        if (dato.equals("Nuevo")) {
            viewGestionInsumo.tituloPrincipal.setText("Nuevo Insumo");
        } else {
            viewGestionInsumo.tituloPrincipal.setText("Editar Insumo");
            this.datos = insumo.buscarInsumo(dato);
            viewGestionInsumo.nombreInsumo.setText(datos[1]);
            viewGestionInsumo.StockInsumo.setValue(Integer.valueOf(datos[2]));
            viewGestionInsumo.descripcionInsumo.setText(datos[3]);
        }

    }

    private void habilitarBlister() {
        if (viewGestionInsumo.activarBlister.isSelected()) {
            viewGestionInsumo.cantidadBlister.setEnabled(true);
        } else {
            if ((Integer)viewGestionInsumo.cantidadBlister.getValue() != 0){
                viewGestionInsumo.cantidadBlister.setLabelText("Cant. del blister");
                viewGestionInsumo.cantidadBlister.setValue(0);
            }

            viewGestionInsumo.cantidadBlister.setEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewGestionInsumo.btnRegresar) {
            regresarView();
        } else if (e.getSource() == viewGestionInsumo.btnGuardarInsumo) {
            guardarAccion();
        } else if (e.getSource() == viewGestionInsumo.activarBlister) {
            habilitarBlister();
        }
    }

}
