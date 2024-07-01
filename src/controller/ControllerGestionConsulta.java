package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.dataBase.ConsultaDB;
import utils.BuscadorTabla;
import validaciones.ValidacionConsulta;
import views.Dashboard;
import views.viewsGestion.GestionConsulta;
import views.ViewConsulta;

public class ControllerGestionConsulta implements ActionListener {

    private Dashboard dashboard;
    private GestionConsulta viewGestionConsulta;
    private ConsultaDB consulta = new model.dataBase.ConsultaDB();
    private ValidacionConsulta validacionConsulta = new ValidacionConsulta();

    private ViewConsulta viewConsulta;

    public ControllerGestionConsulta(Dashboard dashboard, GestionConsulta viewGestionConsulta) {
        this.dashboard = dashboard;
        this.viewGestionConsulta = viewGestionConsulta;
        
        this.viewGestionConsulta.btnRegresar.addActionListener(this);
        this.viewGestionConsulta.btnBuscarConsulta.addActionListener(this);
        this.viewGestionConsulta.btnBorrarConsulta.addActionListener(this);
    }

    private void regresarView() {
        this.viewConsulta = new ViewConsulta(dashboard);
        dashboard.initView(viewConsulta);
    }

    private void borrarConsulta() {
        int filaSeleccionada = viewGestionConsulta.tablaConsulta.getSelectedRow();
        viewGestionConsulta.mensajeSeleccion.setVisible(false);
        if (filaSeleccionada != -1) { // Verifica si se ha seleccionado una fila
            String id = viewGestionConsulta.tablaConsulta.getValueAt(filaSeleccionada, 0).toString();
            dialog.DialogEliminarConsulta dialog = new dialog.DialogEliminarConsulta(id, viewGestionConsulta, dashboard);
            dialog.setVisible(true);
        } else {
            viewGestionConsulta.mensajeSeleccion.setVisible(true);
        }
        viewGestionConsulta.repaint();
    }

    private void buscarConsulta() {
        viewGestionConsulta.mensajeSeleccion.setVisible(false);
        consulta.mostrarConsultaPorCI(viewGestionConsulta.tablaConsulta);
        configuracionesTabla();
        new BuscadorTabla().buscadorTabla(viewGestionConsulta.inputBuscarConsulta,
                consulta.buscadorConsultaTabla(viewGestionConsulta.inputBuscarConsulta.getText().trim()),
                viewGestionConsulta.tablaConsulta,
                2);
                
        viewGestionConsulta.repaint();
    }

    public void cargarTabla() {
        if (!consulta.isEmptyTabla("Consultas")) {
            try {
                consulta.mostrarConsulta(viewGestionConsulta.tablaConsulta);
                configuracionesTabla();
            } catch (Exception e) {
            }
        }
    }

    private void configuracionesTabla() {
        // COnfiguraciones de la jtable

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        viewGestionConsulta.tablaConsulta.getColumnModel().getColumn(0).setPreferredWidth(40);
        viewGestionConsulta.tablaConsulta.getColumnModel().getColumn(0).setResizable(false);
        viewGestionConsulta.tablaConsulta.getColumnModel().getColumn(1).setPreferredWidth(60);
        viewGestionConsulta.tablaConsulta.getColumnModel().getColumn(1).setResizable(false);
        viewGestionConsulta.tablaConsulta.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        viewGestionConsulta.tablaConsulta.getColumnModel().getColumn(2).setPreferredWidth(100);
        viewGestionConsulta.tablaConsulta.getColumnModel().getColumn(2).setResizable(false);
        viewGestionConsulta.tablaConsulta.getColumnModel().getColumn(3).setPreferredWidth(250);
        viewGestionConsulta.tablaConsulta.getColumnModel().getColumn(3).setResizable(false);
        viewGestionConsulta.tablaConsulta.getColumnModel().getColumn(4).setPreferredWidth(300);
        viewGestionConsulta.tablaConsulta.getColumnModel().getColumn(4).setResizable(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerRenderer.setBackground(new Color(240, 240, 240)); // Cambia el color aquí
        viewGestionConsulta.tablaConsulta.setBackground(new Color(255, 255, 255));

        // Asigna el renderizador personalizado a la cabecera
        viewGestionConsulta.tablaConsulta.getTableHeader().setDefaultRenderer(headerRenderer);
        viewGestionConsulta.tablaConsulta.setDefaultEditor(Object.class, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewGestionConsulta.btnRegresar) {
            regresarView();
        } else if (e.getSource() == viewGestionConsulta.btnBorrarConsulta) {
            borrarConsulta();
        } else if (e.getSource() == viewGestionConsulta.btnBuscarConsulta) {
            buscarConsulta();
        }
    }

}
