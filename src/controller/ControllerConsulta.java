package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.dataBase.ConsultaDB;
import model.dataBase.RellenarComboBox;
import validaciones.ValidacionConsulta;
import views.Dashboard;
import views.viewsGestion.GestionConsulta;
import views.ViewConsulta;
import javax.swing.DefaultListModel;
import model.dataBase.InsumoDB;
import views.ViewPaciente;
import views.viewsGestion.GestionPaciente;
import model.dataBase.NumeroConsultas;

public class ControllerConsulta implements ActionListener {

    private Dashboard dashboard;
    private GestionConsulta viewGestionConsulta;
    private ViewConsulta viewConsulta;
    private ViewPaciente viewPaciente;
    private ConsultaDB consulta = new ConsultaDB();
    private ValidacionConsulta validacionesConsulta = new ValidacionConsulta();
    private RellenarComboBox rellenarComboBox = new RellenarComboBox();
    private ArrayList arrayinsumos = new ArrayList();
    private ArrayList arraycantidad = new ArrayList();
    private DefaultListModel modelo = new DefaultListModel();
    private String dato;
    private GestionPaciente viewGestionPaciente;

    public ControllerConsulta(Dashboard dashboard, ViewConsulta viewConsulta, String dato) {
        this.dashboard = dashboard;
        this.viewConsulta = viewConsulta;
        this.dato = dato;

        this.viewConsulta.btnGuardarConsulta.addActionListener(this);
        this.viewConsulta.btnAñadir.addActionListener(this);
        this.viewConsulta.btnQuitar.addActionListener(this);
        this.viewConsulta.btnMostrarConsulta.addActionListener(this);
        this.viewConsulta.btnNuevoPaciente.addActionListener(this);

        viewConsulta.fechaActual.setText(fechaActual());
        rellenarComboBox.RellenarComboxInsumo("Insumos", "NOMBRE", views.ViewConsulta.insumosDelPaciente);
        rellenarComboBox.RellenarComboxPaciente("Pacientes", "CEDULA", views.ViewConsulta.Pacientes);
        viewConsulta.ListaDeInsumos.setModel(modelo);
    }

    public void AñadirInsumo() {
        if (validacionesConsulta.validarCantidad(viewConsulta.CantidadInsumo)) {
            DefaultListModel modelo = (DefaultListModel) viewConsulta.ListaDeInsumos.getModel();
            arrayinsumos.add(viewConsulta.insumosDelPaciente.getSelectedItem().toString());
            arraycantidad.add(Integer.valueOf(viewConsulta.CantidadInsumo.getText()));
            modelo.addElement(viewConsulta.insumosDelPaciente.getSelectedItem().toString() + " x " + viewConsulta.CantidadInsumo.getText());
        }
        viewConsulta.repaint();
    }

    public void QuitarInsumo() {
        DefaultListModel modelo = (DefaultListModel) viewConsulta.ListaDeInsumos.getModel();
        arrayinsumos.remove(viewConsulta.ListaDeInsumos.getSelectedIndex());
        arraycantidad.remove(viewConsulta.ListaDeInsumos.getSelectedIndex());
        modelo.remove(viewConsulta.ListaDeInsumos.getSelectedIndex());
    }
    
    private void NuevoPaciente() {
        this.viewGestionPaciente = new GestionPaciente(dashboard, viewPaciente, "Nuevo");
        dashboard.initView(viewGestionPaciente);
        //new ControllerPaciente(viewPaciente, dashboard).cargarTabla();
        viewGestionPaciente.repaint();
    }

    private void mostrarView() {
        dashboard.refrescarViewConsulta();
        dashboard.initView(dashboard.getViewConsulta());
        viewConsulta.mensajeDeGuardado.setVisible(false);
        this.viewGestionConsulta = new GestionConsulta(dashboard);
        dashboard.initView(viewGestionConsulta);
        viewConsulta.repaint();
    }

    public void modificarCantidadesInsumos(ArrayList<String> arrayInsumos, ArrayList<Integer> arrayCantidades) {
        String[] datosInsumo;
        String idInsumo;
        int nuevaCantidadInsumo;
        InsumoDB insumo = new InsumoDB();
        for (int i = 0; i <= arrayInsumos.size() - 1; i++) {
            idInsumo = insumo.buscarIdInsumo(arrayInsumos.get(i));
            datosInsumo = insumo.buscarInsumo(idInsumo);
            int cantidadGastada= arrayCantidades.get(i);
            int[] arrayConsumo=insumo.obtenerArrayConsumoMensual(insumo.buscarConsumoMensual(idInsumo));
            System.out.println(arrayConsumo[5]);
            insumo.actualizarConsumoDelDia(arrayConsumo, idInsumo, cantidadGastada);
            nuevaCantidadInsumo = (insumo.buscarCantidad(idInsumo) - cantidadGastada);
            if (nuevaCantidadInsumo >= 0) {
                insumo.editar(datosInsumo[0], datosInsumo[1], nuevaCantidadInsumo,Integer.parseInt(datosInsumo[3]), datosInsumo[4]);
            } else {
                insumo.editar(datosInsumo[0], datosInsumo[1], 0,Integer.parseInt(datosInsumo[3]), datosInsumo[4]);
            }
        }
        dashboard.refrescarViewInsumo();
        new ControllerInsumo(dashboard, dashboard.viewInsumo).cargarTabla();
    }

    public String arrayListAString(ArrayList<String> arrayInsumos, ArrayList<Integer> arrayCantidades) {
        String insumos = "";
        if (!arrayInsumos.isEmpty()) {
            while (!arrayInsumos.isEmpty()) {
                insumos = insumos + arrayInsumos.get(0) + "x" + String.valueOf(arrayCantidades.get(0)) + " ";
                arrayInsumos.remove(0);
                arrayCantidades.remove(0);
            }
        }
        return insumos;
    }

    public void guardarConsulta(String insumos) {
        if (validacionesConsulta.datosValidados(views.ViewConsulta.Pacientes, viewConsulta.doctoraCargo)) {
            if (!views.ViewConsulta.Pacientes.getSelectedItem().toString().equals("")
                    && !viewConsulta.doctoraCargo.getText().equals("")) {
                modificarCantidadesInsumos(arrayinsumos, arraycantidad);
                if (consulta.nuevaConsulta(viewConsulta.fechaActual.getText(),
                        views.ViewConsulta.Pacientes.getSelectedItem().toString(),
                        viewConsulta.doctoraCargo.getText().trim(),
                        insumos)) {

                    viewConsulta.mensajeDeGuardado.setText("Consulta guardada con exito");
                    viewConsulta.mensajeDeGuardado.setVisible(true);

                    limpiarInput();
                    viewConsulta.repaint();
                    arrayinsumos.clear();
                    arraycantidad.clear();
                    DefaultListModel model = (DefaultListModel) viewConsulta.ListaDeInsumos.getModel();
                    model.removeAllElements();
                }
            }
        }
        viewConsulta.repaint();
    }

    private void limpiarInput() {
        viewConsulta.doctoraCargo.setText("");
        viewConsulta.CantidadInsumo.setText("");
    }

    public static String fechaActual() {

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");

        return formatoFecha.format(fecha);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewConsulta.btnMostrarConsulta) {
            mostrarView();
        } else if (e.getSource() == viewConsulta.btnAñadir) {
            AñadirInsumo();
        } else if (e.getSource() == viewConsulta.btnQuitar) {
            QuitarInsumo();
        } else if (e.getSource() == viewConsulta.btnNuevoPaciente) {
            NuevoPaciente();
        }else if (e.getSource() == viewConsulta.btnGuardarConsulta) {
            modificarCantidadesInsumos(arrayinsumos, arraycantidad);
            String insumos = arrayListAString(arrayinsumos, arraycantidad);
            guardarConsulta(insumos);
        }
    }

}
