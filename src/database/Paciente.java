
package database;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Paciente extends DataBase{
    public boolean nuevoPaciente(String nombre, String apellido, String cedula, String telefono, String genero, int edad, String descripcion) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);
            String sqlInsert = "INSERT INTO Pacientes (NOMBRE, APELLIDO, CEDULA, TELEFONO, GENERO, EDAD, DESCRIPCION) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setString(3, cedula);
            preparedStatement.setString(4, telefono);
            preparedStatement.setString(5, genero);
            preparedStatement.setInt(6, edad);
            preparedStatement.setString(7, descripcion);

            int filasInsertadas = preparedStatement.executeUpdate();
            if (filasInsertadas > 0) {
                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int idGenerado = generatedKeys.getInt(1);
                        System.out.println("ID generado: " + idGenerado);
                    }
                }
                conexion.commit(); // Confirmar la transacción
                System.out.println("Paciente insertado correctamente.");
                return true;
            } else {
                System.out.println("Error al insertar el paciente.");
                return false;
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage() + "insertar");
            return false;
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }
    
    public void mostrarPacientes(String nombreTabla, JTable table){
         try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlConsulta = "SELECT * FROM " + nombreTabla;

            statement = (Statement) conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sqlConsulta);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Cedula");
            model.addColumn("Nombre");
            model.addColumn("Edad");
            model.addColumn("Genero");
            model.addColumn("Telefono");
            table.setModel(model);
            
            String [] datos = new String[6];
            while (resultado.next()) {
                datos[0] = resultado.getString(4);
                datos[1] = resultado.getString(2)+ " " + resultado.getString(3);
                datos[2] = resultado.getString(7);
                datos[3] = resultado.getString(6);
                datos[4] = resultado.getString(5);
                model.addRow(datos);
            }

            resultado.close();
            statement.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage() + " error al mostrar los datos de la tabla");
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }
    public boolean eliminarPaciente(String nombreTabla, String cedula) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlDelete = "DELETE FROM " + nombreTabla + " WHERE CEDULA = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlDelete);
            preparedStatement.setString(1, cedula);

            int filasEliminadas = preparedStatement.executeUpdate();
            if (filasEliminadas > 0) {
                preparedStatement.close();
                return true;
            } else {
                preparedStatement.close();
                return false;
            }

        } catch (ClassNotFoundException | SQLException e) {
            return false;
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
