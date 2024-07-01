package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.dataBase.InsumoDB;
import validaciones.ValidacionInsumo;
import views.Dashboard;
import views.ViewInsumo;
import views.viewsGestion.GestionInsumo;
import utils.BuscadorTabla;

public class ControllerInsumo implements ActionListener {

    private Dashboard dashboard;
    private ViewInsumo viewInsumo;
    private InsumoDB insumo = new model.dataBase.InsumoDB();
    private ValidacionInsumo validacionInsumo = new ValidacionInsumo();

    private GestionInsumo viewGestionInsumo;

    public ControllerInsumo(Dashboard dashboard, ViewInsumo viewInsumo) {
        this.dashboard = dashboard;
        this.viewInsumo = viewInsumo;
        this.viewInsumo.mensajeSeleccion.setVisible(false);
        this.viewInsumo.btnNuevoInsumo.addActionListener(this);
        this.viewInsumo.btnBorrarInsumo.addActionListener(this);
        this.viewInsumo.btnEditarInsumo.addActionListener(this);
        this.viewInsumo.btnBuscarInsumo.addActionListener(this);
    }

    private void nuevoInsumo() {
        this.viewGestionInsumo = new GestionInsumo(dashboard, viewInsumo, "Nuevo");
        dashboard.initView(viewGestionInsumo);
        this.viewInsumo.tablaInsumos.setVisible(true);
    }

    private void borrarInsumo() {
        int filaSeleccionada = viewInsumo.tablaInsumos.getSelectedRow();
        viewInsumo.mensajeSeleccion.setVisible(false);
        if (filaSeleccionada != -1) { // Verifica si se ha seleccionado una fila
            String id = viewInsumo.tablaInsumos.getValueAt(filaSeleccionada, 0).toString();
            dialog.DialogEliminarInsumo dialog = new dialog.DialogEliminarInsumo(id, viewInsumo, dashboard);
            dialog.setVisible(true);
        } else {
            viewInsumo.mensajeSeleccion.setVisible(true);
        }
        viewInsumo.repaint();
    }

    private void editarInsumo() {
        int filaSeleccionada = viewInsumo.tablaInsumos.getSelectedRow();
        viewInsumo.mensajeSeleccion.setVisible(false);

        if (filaSeleccionada != -1) { // Verifica si se ha seleccionado una fila
            String id = viewInsumo.tablaInsumos.getValueAt(filaSeleccionada, 0).toString();
            this.viewGestionInsumo = new GestionInsumo(dashboard, viewInsumo, id);
            dashboard.initView(viewGestionInsumo);
        } else {
            viewInsumo.mensajeSeleccion.setVisible(true);
        }
        viewInsumo.repaint();
    }

    private void buscarInsumo() {
        viewInsumo.mensajeSeleccion.setVisible(false);
        new BuscadorTabla().buscadorTabla(viewInsumo.inputBuscarInsumo,
                insumo.buscadorInsumoTabla(viewInsumo.inputBuscarInsumo.getText().trim()),
                viewInsumo.tablaInsumos,
                1);
        viewInsumo.repaint();
    }

    public void cargarTabla() {
        if (!insumo.isEmptyTabla("Insumos")) {
            try {
                insumo.mostrarInsumos(viewInsumo.tablaInsumos);
                configuracionesTabla();
            } catch (Exception e) {
            }
        }
    }
    

    private void configuracionesTabla() {
        // COnfiguraciones de la jtable
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        viewInsumo.tablaInsumos.getColumnModel().getColumn(0).setPreferredWidth(50);
        viewInsumo.tablaInsumos.getColumnModel().getColumn(0).setResizable(false);
        viewInsumo.tablaInsumos.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        viewInsumo.tablaInsumos.getColumnModel().getColumn(1).setPreferredWidth(250);
        viewInsumo.tablaInsumos.getColumnModel().getColumn(1).setResizable(false);
        viewInsumo.tablaInsumos.getColumnModel().getColumn(2).setPreferredWidth(40);
        viewInsumo.tablaInsumos.getColumnModel().getColumn(2).setResizable(false);
        viewInsumo.tablaInsumos.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        viewInsumo.tablaInsumos.getColumnModel().getColumn(3).setPreferredWidth(50);
        viewInsumo.tablaInsumos.getColumnModel().getColumn(3).setResizable(false);
        viewInsumo.tablaInsumos.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        viewInsumo.tablaInsumos.getColumnModel().getColumn(4).setPreferredWidth(100);
        viewInsumo.tablaInsumos.getColumnModel().getColumn(4).setResizable(false);
        viewInsumo.tablaInsumos.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerRenderer.setBackground(new Color(240, 240, 240)); // Cambia el color aquí

        // Asigna el renderizador personalizado a la cabecera
        viewInsumo.tablaInsumos.getTableHeader().setDefaultRenderer(headerRenderer);
        viewInsumo.tablaInsumos.setDefaultEditor(Object.class, null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewInsumo.btnNuevoInsumo) {
            nuevoInsumo();
        } else if (e.getSource() == viewInsumo.btnBorrarInsumo) {
            borrarInsumo();
        } else if (e.getSource() == viewInsumo.btnEditarInsumo) {
            editarInsumo();
        } else if (e.getSource() == viewInsumo.btnBuscarInsumo) {
            buscarInsumo();
        }
    }

}
