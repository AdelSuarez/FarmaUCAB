package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.dataBase.ConsultaDB;
import model.dataBase.InsumoDB;
import model.dataBase.RellenarComboBox;
import validaciones.ValidacionConsulta;
import views.Dashboard;
import views.viewsGestion.GestionConsulta;
import views.ViewConsulta;
import javax.swing.DefaultListModel;

public class ControllerConsulta implements ActionListener {

    private Dashboard dashboard;
    private GestionConsulta viewGestionConsulta;
    private ViewConsulta viewConsulta;
    private ConsultaDB consulta = new ConsultaDB();
    private ValidacionConsulta validacionesConsulta = new ValidacionConsulta();
    private RellenarComboBox rellenarComboBox = new RellenarComboBox();
    private ArrayList arrayinsumos = new ArrayList();
    private ArrayList arraycantidad = new ArrayList();
    private DefaultListModel modelo = new DefaultListModel();
    private String dato;

    public ControllerConsulta(Dashboard dashboard, ViewConsulta viewConsulta, String dato) {
        this.dashboard = dashboard;
        this.viewConsulta = viewConsulta;
        this.dato = dato;

        this.viewConsulta.btnGuardarConsulta.addActionListener(this);
        this.viewConsulta.btnAñadir.addActionListener(this);
        this.viewConsulta.btnQuitar.addActionListener(this);
        this.viewConsulta.btnMostrarConsulta.addActionListener(this);

        viewConsulta.fechaActual.setText(fechaActual());
        rellenarComboBox.RellenarCombox("Insumos", "NOMBRE", viewConsulta.insumosDelPaciente);
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

    private void mostrarView() {
        dashboard.refrescarViewConsulta();
//
//        dashboard.initView(dashboard.getViewConsulta());
//        viewConsulta.mensajeDeGuardado.setVisible(false);
//        new ControllerGestionConsulta(dashboard, viewGestionConsulta).cargarTabla();
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
            nuevaCantidadInsumo = (insumo.buscarCantidad(idInsumo) - arrayCantidades.get(i));
            if (nuevaCantidadInsumo >= 0) {
                insumo.editar(datosInsumo[0], datosInsumo[1], nuevaCantidadInsumo, datosInsumo[3]);
            } else {
                insumo.editar(datosInsumo[0], datosInsumo[1], 0, datosInsumo[3]);
            }
        }
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

//    public void guardarConsulta(String insumos) {
//        if (validacionesConsulta.datosValidados(viewConsulta.CIPaciente, viewConsulta.doctoraCargo)) {
//            if (!viewConsulta.CIPaciente.getText().equals("")
//                    && !viewConsulta.doctoraCargo.getText().equals("")) {
//                modificarCantidadesInsumos(arrayinsumos, arraycantidad);
//                if (consulta.nuevaConsulta(viewConsulta.fechaActual.getText(),
//                        viewConsulta.CIPaciente.getText().trim(),
//                        viewConsulta.doctoraCargo.getText().trim(),
//                        insumos)) {
//
//                    viewConsulta.mensajeDeGuardado.setText("Consulta guardada con exito");
//                    viewConsulta.mensajeDeGuardado.setVisible(true);
//
//                    limpiarInput();
//                    viewConsulta.repaint();
//                    arrayinsumos.clear();
//                    arraycantidad.clear();
//                    DefaultListModel model = (DefaultListModel) viewConsulta.ListaDeInsumos.getModel();
//                    model.removeAllElements();
//                }
//            }
//        }
//        viewConsulta.repaint();
//    }

    private void limpiarInput() {
//        viewConsulta.CIPaciente.setText("");
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
        } else if (e.getSource() == viewConsulta.btnGuardarConsulta) {
            modificarCantidadesInsumos(arrayinsumos, arraycantidad);
            String insumos = arrayListAString(arrayinsumos, arraycantidad);
//            guardarConsulta(insumos);
        }
    }

}
