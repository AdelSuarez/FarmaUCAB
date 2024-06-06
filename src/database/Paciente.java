package database;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Paciente extends DataBase {

    public boolean nuevoPaciente(String nombre, String apellido, String cedula, String telefono, String DE, String genero, int edad, String descripcion) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);
            String sqlInsert = "INSERT INTO Pacientes (NOMBRE, APELLIDO, CEDULA, TELEFONO, DE, GENERO, EDAD, DESCRIPCION) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setString(3, cedula);
            preparedStatement.setString(4, telefono);
            preparedStatement.setString(5, DE);
            preparedStatement.setString(6, genero);
            preparedStatement.setInt(7, edad);
            preparedStatement.setString(8, descripcion);

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

    public void mostrarPacientes(JTable table) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlConsulta = "SELECT * FROM Pacientes ORDER BY NOMBRE";

            statement = (Statement) conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sqlConsulta);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Cedula");
            model.addColumn("Nombre");
            model.addColumn("Edad");
            model.addColumn("Genero");
            model.addColumn("Telefono");
            table.setModel(model);

            String[] datos = new String[6];
            while (resultado.next()) {
                // No entiendo el orden, consegui la secuencia tanteando
                datos[0] = resultado.getString(4);
                datos[1] = resultado.getString(2) + " " + resultado.getString(3);
                datos[2] = resultado.getString(8);
                datos[3] = resultado.getString(7);
                datos[4] = resultado.getString(5);
                model.addRow(datos);
            }

            resultado.close();
            statement.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage() + " error al mostrar los datos de la tabla 11111");
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

    public boolean eliminarPaciente(String cedula) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlDelete = "DELETE FROM Pacientes WHERE CEDULA = ?";

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

    public String buscarPaciente(String nombre) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT NOMBRE, APELLIDO FROM Pacientes WHERE NOMBRE LIKE ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, "%" + nombre + "%"); // Agrega comodines para buscar por coincidencia de palabras

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String nombrePaciente = resultado.getString("NOMBRE") + " " + resultado.getString("APELLIDO");
                preparedStatement.close();
                return nombrePaciente;
            } else {
                // No se encontró ningún paciente con ese nombre
                preparedStatement.close();
                return "No se encontró ningún paciente con ese nombre.";
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Registra el error para depuración
            return "Error al buscar el paciente.";
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

    public String[] buscar(String cedula) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT * FROM Pacientes WHERE CEDULA = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, cedula);

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String id = resultado.getString("ID");
                String nombre = resultado.getString("NOMBRE");
                String apellido = resultado.getString("APELLIDO");
                int edad = resultado.getInt("EDAD");
                String cedulaP = resultado.getString("CEDULA");
                String DE = resultado.getString("DE");
                String genero = resultado.getString("GENERO");
                String telefono = resultado.getString("TELEFONO");
                String descripcion = resultado.getString("DESCRIPCION");

                preparedStatement.close();

                // Crear un arreglo con los datos del paciente
                String[] datosPaciente = {id, nombre, apellido, String.valueOf(edad), genero, telefono, cedulaP, DE, descripcion};
                return datosPaciente;
            } else {
                // No se encontró ningún paciente con esa cédula
                preparedStatement.close();
                return null;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al buscar el paciente.");
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

    public boolean editarPaciente(String id, String nuevoNombre, String nuevoApellido, String nuevoCedula, String nuevoTelefono, String nuevoDE, String nuevoGenero, int nuevaEdad, String nuevaDescripcion) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);

            String sqlUpdate = "UPDATE Pacientes SET NOMBRE = ?, APELLIDO = ?, CEDULA = ?, TELEFONO = ?, DE = ?, GENERO = ?, EDAD = ?, DESCRIPCION = ? WHERE ID = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlUpdate);
            preparedStatement.setString(1, nuevoNombre);
            preparedStatement.setString(2, nuevoApellido);
            preparedStatement.setString(3, nuevoCedula);
            preparedStatement.setString(4, nuevoTelefono);
            preparedStatement.setString(5, nuevoDE);
            preparedStatement.setString(6, nuevoGenero);
            preparedStatement.setInt(7, nuevaEdad);
            preparedStatement.setString(8, nuevaDescripcion);
            preparedStatement.setString(9, id);

            int filasActualizadas = preparedStatement.executeUpdate();
            if (filasActualizadas > 0) {
                conexion.commit(); // Confirmar la transacción
                System.out.println("Paciente actualizado correctamente.");
                return true;
            } else {
                System.out.println("Error al actualizar el paciente.");
                return false;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al editar el paciente.");
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
