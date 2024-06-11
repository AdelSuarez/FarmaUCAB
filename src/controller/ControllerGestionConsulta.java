package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import model.dataBase.ConsultaDB;
import model.dataBase.InsumoDB;
import model.dataBase.RellenarComboBox;
import validaciones.ValidacionConsulta;
import views.Dashboard;
import views.ViewConsulta;
import views.viewsGestion.GestionConsulta;
import javax.swing.DefaultListModel;

public class ControllerGestionConsulta implements ActionListener{
private Dashboard dashboard;
    private ViewConsulta viewConsulta;
    private GestionConsulta viewGestionConsulta;
    private ConsultaDB consulta = new ConsultaDB();
    private ValidacionConsulta validacionesConsulta = new ValidacionConsulta();
    RellenarComboBox rellenarComboBox = new RellenarComboBox();
    ArrayList arrayinsumos = new ArrayList();
    ArrayList arraycantidad = new ArrayList();
    DefaultListModel modelo = new DefaultListModel();
    private String dato;
    
    public ControllerGestionConsulta(Dashboard dashboard, ViewConsulta viewConsulta, GestionConsulta viewGestionConsulta, String dato){
        this.dashboard = dashboard;
        this.viewConsulta = viewConsulta;
        this.viewGestionConsulta = viewGestionConsulta;
        this.dato = dato;
        
        this.viewGestionConsulta.btnGuardarConsulta.addActionListener(this);
        this.viewGestionConsulta.botonAñadir.addActionListener(this);
        this.viewGestionConsulta.botonQuitar.addActionListener(this);
        this.viewGestionConsulta.botonMostrarConsulta.addActionListener(this);
        viewGestionConsulta.fechaActual.setText(fechaActual());
        rellenarComboBox.RellenarCombox("Insumos" ,"NOMBRE" ,viewGestionConsulta.insumosDelPaciente);
        viewGestionConsulta.ListaDeInsumos.setModel(modelo);
    }
    
    public void AñadirInsumo(){ 
        if(validacionesConsulta.validarCantidad(viewGestionConsulta.Cantidad)){ 
            DefaultListModel modelo = (DefaultListModel) viewGestionConsulta.ListaDeInsumos.getModel();
            arrayinsumos.add(viewGestionConsulta.insumosDelPaciente.getSelectedItem().toString());
            arraycantidad.add(Integer.valueOf(viewGestionConsulta.Cantidad.getText()));
            modelo.addElement(viewGestionConsulta.insumosDelPaciente.getSelectedItem().toString() + "x" + viewGestionConsulta.Cantidad.getText());
        }  
        viewGestionConsulta.repaint();
    }  
    
    public void QuitarInsumo(){ 
        DefaultListModel modelo = (DefaultListModel) viewGestionConsulta.ListaDeInsumos.getModel();
        arrayinsumos.remove(viewGestionConsulta.ListaDeInsumos.getSelectedIndex());
        arraycantidad.remove(viewGestionConsulta.ListaDeInsumos.getSelectedIndex());
        modelo.remove(viewGestionConsulta.ListaDeInsumos.getSelectedIndex());
    } 
        
    private void mostrarView(){
        dashboard.refrescarViewConsulta();
        dashboard.initView(dashboard.getViewConsulta());
        viewGestionConsulta.mensajeDeGuardado.setVisible(false);
        new ControllerConsulta(dashboard, viewConsulta).cargarTabla();
        viewGestionConsulta.repaint();
    }
    
    public void modificarCantidadesInsumos(ArrayList<String> arrayInsumos,ArrayList<Integer> arrayCantidades){
        String[] datosInsumo;
        String idInsumo;
        int nuevaCantidadInsumo;
        InsumoDB insumo=new InsumoDB();
        for(int i=0;i<=arrayInsumos.size()-1;i++){
            idInsumo=insumo.buscarIdInsumo(arrayInsumos.get(i));
            datosInsumo=insumo.buscarInsumo(idInsumo);
            nuevaCantidadInsumo=(insumo.buscarCantidad(idInsumo)-arrayCantidades.get(i));
            if(nuevaCantidadInsumo>=0){
                insumo.editar(datosInsumo[0], datosInsumo[1], nuevaCantidadInsumo,datosInsumo[3]);
            } else{
                insumo.editar(datosInsumo[0], datosInsumo[1],0,datosInsumo[3]);
            }
        }
    }
    
    public String arrayListAString(ArrayList<String> arrayInsumos,ArrayList<Integer> arrayCantidades){
        String insumos="";
        if(!arrayInsumos.isEmpty()){
            while(!arrayInsumos.isEmpty()){
                insumos=insumos+arrayInsumos.get(0)+"x"+String.valueOf(arrayCantidades.get(0))+" ";
                arrayInsumos.remove(0);
                arrayCantidades.remove(0);
            }
        }
        return insumos;
    }
    
    public void guardarConsulta(String insumos) {
        if (validacionesConsulta.datosValidados(viewGestionConsulta.CIPaciente, viewGestionConsulta.doctoraCargo)) {
            if(!viewGestionConsulta.CIPaciente.getText().equals("") && 
               !viewGestionConsulta.doctoraCargo.getText().equals("")){
                modificarCantidadesInsumos(arrayinsumos, arraycantidad);
                if (consulta.nuevaConsulta(viewGestionConsulta.fechaActual.getText(),
                    viewGestionConsulta.CIPaciente.getText().trim(),
                    viewGestionConsulta.doctoraCargo.getText().trim(),
                    insumos)) {
                    
                    viewGestionConsulta.mensajeDeGuardado.setText("Consulta guardada con exito");
                    viewGestionConsulta.mensajeDeGuardado.setVisible(true);
                    
                    limpiarInput();
                    viewGestionConsulta.repaint();
                    arrayinsumos.clear();
                    arraycantidad.clear();
                    DefaultListModel model= (DefaultListModel) viewGestionConsulta.ListaDeInsumos.getModel();
                    model.removeAllElements();
                }
            }    
        }
        viewGestionConsulta.repaint();
    }
    
    private void limpiarInput() {
        viewGestionConsulta.CIPaciente.setText("");
        viewGestionConsulta.doctoraCargo.setText("");
        viewGestionConsulta.Cantidad.setText("");
    }
    
    public static String fechaActual(){

        Date fecha=new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        
        return formatoFecha.format(fecha);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewGestionConsulta.botonMostrarConsulta){
            mostrarView();
        } else if (e.getSource() == viewGestionConsulta.botonAñadir){
            AñadirInsumo();    
        } else if (e.getSource() == viewGestionConsulta.botonQuitar){
            QuitarInsumo();
        } else if (e.getSource() == viewGestionConsulta.btnGuardarConsulta){
            modificarCantidadesInsumos(arrayinsumos,arraycantidad);
            String insumos=arrayListAString(arrayinsumos,arraycantidad);
            guardarConsulta(insumos);
        }
    }
    
}
