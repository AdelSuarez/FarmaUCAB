
package model.clases;
import model.dataBase.PacienteDB;
import model.clases.Persona;

public class Paciente extends Persona {
    private String genero;
    private int edad;
    private String dependencia;
    private String descripcion;
    private PacienteDB dataBasePaciente = new PacienteDB();
    
    public Paciente(String nombre,String apellido,String telefono, String cedula ,String genero, int edad, String descripcion){
        super(nombre,apellido,telefono, cedula);
        this.genero = genero;
        this.edad = edad;
        this.dependencia = dependencia;
        this.descripcion = descripcion;
    }
    
    public void nuevoPaciente(){
        dataBasePaciente.nuevo(getNombre(), getApellido(), getCedula(),getTelefono(), dependencia, genero, edad, descripcion);
    }
}
