package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.Dashboard;

import views.ViewDatos;


public class ControllerDatos implements ActionListener {
    private Dashboard dashboard;
    private ViewDatos viewDatos;
    private String dato;
    
    public ControllerDatos(Dashboard dashboard, ViewDatos viewEstadistica) {
        this.dashboard = dashboard;
        this.viewDatos = viewEstadistica;
        this.viewDatos.impConsultasPdf.addActionListener(this);
        this.viewDatos.impPacientesPdf.addActionListener(this);
        this.viewDatos.impInsumosPdf.addActionListener(this);
        this.viewDatos.impUsoInsumosPdf.addActionListener(this);
        this.viewDatos.impConsultasMensualesPdf.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewDatos.impConsultasPdf) {
            dialog.DialogGuardarNombrePDF dialog = new dialog.DialogGuardarNombrePDF("Consulta",1);
            dialog.setVisible(true);
        } else if (e.getSource() == viewDatos.impPacientesPdf) {
            dialog.DialogGuardarNombrePDF dialog = new dialog.DialogGuardarNombrePDF("Paciente",2);
            dialog.setVisible(true);
        } else if (e.getSource() == viewDatos.impInsumosPdf) {
            dialog.DialogGuardarNombrePDF dialog = new dialog.DialogGuardarNombrePDF("Insumo",3);
            dialog.setVisible(true);
        } else if (e.getSource() == viewDatos.impUsoInsumosPdf) {
            dialog.DialogGuardarNombrePDF dialog = new dialog.DialogGuardarNombrePDF("Medicamentos_Usados",4);
            dialog.setVisible(true);
        }
        else if (e.getSource() == viewDatos.impConsultasMensualesPdf) {
            dialog.DialogGuardarNombrePDF dialog = new dialog.DialogGuardarNombrePDF("Consultas_Mensuales",5);
            dialog.setVisible(true);
        }
    }
    
}
