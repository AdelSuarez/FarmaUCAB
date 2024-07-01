package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.Dashboard;

import views.ViewEstadistica;


public class ControllerEstadistica implements ActionListener {
    private Dashboard dashboard;
    private ViewEstadistica viewEstadistica;
    private String dato;
    
    public ControllerEstadistica(Dashboard dashboard, ViewEstadistica viewEstadistica) {
        this.dashboard = dashboard;
        this.viewEstadistica = viewEstadistica;
        this.viewEstadistica.impConsultasPdf.addActionListener(this);
        this.viewEstadistica.impPacientesPdf.addActionListener(this);
        this.viewEstadistica.impInsumosPdf.addActionListener(this);
        this.viewEstadistica.impEstadisticasPdf.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewEstadistica.impConsultasPdf) {
            dialog.DialogGuardarNombrePDF dialog = new dialog.DialogGuardarNombrePDF("Consulta",1);
            dialog.setVisible(true);
        } else if (e.getSource() == viewEstadistica.impPacientesPdf) {
            dialog.DialogGuardarNombrePDF dialog = new dialog.DialogGuardarNombrePDF("Paciente",2);
            dialog.setVisible(true);
        } else if (e.getSource() == viewEstadistica.impInsumosPdf) {
            dialog.DialogGuardarNombrePDF dialog = new dialog.DialogGuardarNombrePDF("Insumo",3);
            dialog.setVisible(true);
        } else if (e.getSource() == viewEstadistica.impEstadisticasPdf) {
            dialog.DialogGuardarNombrePDF dialog = new dialog.DialogGuardarNombrePDF("Estadistica",4);
            dialog.setVisible(true);
        }
    }
    
}
