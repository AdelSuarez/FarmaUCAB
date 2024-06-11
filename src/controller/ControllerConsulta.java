package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.dataBase.ConsultaDB;
import validaciones.ValidacionConsulta;
import views.Dashboard;
import views.ViewConsulta;
import views.viewsGestion.GestionConsulta;

public class ControllerConsulta implements ActionListener {

    private Dashboard dashboard;
    private ViewConsulta viewConsulta;
    private ConsultaDB consulta = new model.dataBase.ConsultaDB();
    private ValidacionConsulta validacionConsulta = new ValidacionConsulta();

    private GestionConsulta  viewGestionConsulta;
    
    public ControllerConsulta(Dashboard dashboard, ViewConsulta viewConsulta) {
        this.dashboard = dashboard;
        this.viewConsulta = viewConsulta;
        this.viewConsulta.btnNuevaConsulta.addActionListener(this);
        this.viewConsulta.inputBuscarConsulta.addActionListener(this);
        this.viewConsulta.btnBorrarConsulta.addActionListener(this);
    }

    private void nuevaConsulta() {
        this.viewGestionConsulta = new GestionConsulta(dashboard, viewConsulta);
        dashboard.initView(viewGestionConsulta);
    }

    private void borrarConsulta() {
        int filaSeleccionada = viewConsulta.tablaConsulta.getSelectedRow();
        viewConsulta.mensajeSeleccion.setVisible(false);
        if (filaSeleccionada != -1) { // Verifica si se ha seleccionado una fila
            String id = viewConsulta.tablaConsulta.getValueAt(filaSeleccionada, 0).toString();
            dialog.DialogEliminarConsulta dialog = new dialog.DialogEliminarConsulta(id, viewConsulta,dashboard);
            dialog.setVisible(true);
        } else {
            viewConsulta.mensajeSeleccion.setVisible(true);
        }
        viewConsulta.repaint();
    }
    
    private void buscarConsulta() {
        viewConsulta.mensajeSeleccion.setVisible(false);
        validacionConsulta.buscador(viewConsulta.inputBuscarConsulta,
                viewConsulta.inputBuscarConsulta.getText().trim(),
                viewConsulta.tablaConsulta,
                2);
        viewConsulta.repaint();
    }
    
    public void cargarTabla() {
        if (!consulta.isEmptyTabla("Consultas")) {
            try {
                consulta.mostrarConsulta(viewConsulta.tablaConsulta);
                configuracionesTabla();
            } catch (Exception e) {
            }
        }
    }
    
    private void configuracionesTabla() {
        // COnfiguraciones de la jtable
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        viewConsulta.tablaConsulta.getColumnModel().getColumn(0).setPreferredWidth(100);
        viewConsulta.tablaConsulta.getColumnModel().getColumn(0).setResizable(false);
//        viewConsulta.tablaConsulta.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        viewConsulta.tablaConsulta.getColumnModel().getColumn(1).setPreferredWidth(100);
        viewConsulta.tablaConsulta.getColumnModel().getColumn(1).setResizable(false);
        viewConsulta.tablaConsulta.getColumnModel().getColumn(2).setPreferredWidth(100);
        viewConsulta.tablaConsulta.getColumnModel().getColumn(2).setResizable(false);
//        viewConsulta.tablaConsulta.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        viewConsulta.tablaConsulta.getColumnModel().getColumn(3).setPreferredWidth(100);
        viewConsulta.tablaConsulta.getColumnModel().getColumn(3).setResizable(false);
//        viewConsulta.tablaConsulta.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        viewConsulta.tablaConsulta.getColumnModel().getColumn(4).setPreferredWidth(100);
        viewConsulta.tablaConsulta.getColumnModel().getColumn(4).setResizable(false);
        viewConsulta.tablaConsulta.getColumnModel().getColumn(5).setPreferredWidth(100);
        viewConsulta.tablaConsulta.getColumnModel().getColumn(5).setResizable(false);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerRenderer.setBackground(new Color(240, 240, 240)); // Cambia el color aquí

        // Asigna el renderizador personalizado a la cabecera
        viewConsulta.tablaConsulta.getTableHeader().setDefaultRenderer(headerRenderer);
        viewConsulta.tablaConsulta.setDefaultEditor(Object.class, null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewConsulta.btnNuevaConsulta) {
            nuevaConsulta();
        } else if (e.getSource() == viewConsulta.btnBorrarConsulta) {
            borrarConsulta();
        } else if (e.getSource() == viewConsulta.btnBuscarConsulta) {
            System.out.println("hola consuta");
            buscarConsulta();
        }
    }
    
}
