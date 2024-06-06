package database;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Empleado extends DataBase {

    public void nuevoEmpleado(String nombre, String apellido, String telefono, String correo, String usuario, boolean admin, String password) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);
            String sqlInsert = "INSERT INTO Empleados (nombre, apellido, telefono, correo, usuario, admin, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setString(3, telefono);
            preparedStatement.setString(4, correo);
            preparedStatement.setString(5, usuario);
            preparedStatement.setBoolean(6, admin);
            preparedStatement.setString(7, password);

            int filasInsertadas = preparedStatement.executeUpdate();
            if (filasInsertadas > 0) {
                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int idGenerado = generatedKeys.getInt(1);
                        System.out.println("ID generado: " + idGenerado);
                    }
                }
                conexion.commit(); // Confirmar la transacción
                System.out.println("Empleado insertado correctamente.");
            } else {
                System.out.println("Error al insertar el empleado.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage() + "insertar");
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

    public boolean inicioEmpleado(String user, String password) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlConsulta = "SELECT * FROM Empleados WHERE USUARIO = ?";

            PreparedStatement ps = conexion.prepareStatement(sqlConsulta);
            ps.setString(1, user);
            ResultSet resultados = ps.executeQuery();
            if (resultados.next()) {
                if (password.equals(resultados.getString("PASSWORD"))) {
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println("Usuario no encontrado en la tabla Empleados");
            }

            resultados.close();
            ps.close();

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

        return false;
    }

    public boolean validarEmpleadoAdmin(String user) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlConsulta = "SELECT * FROM Empleados WHERE USUARIO = ?";

            PreparedStatement ps = conexion.prepareStatement(sqlConsulta);
            ps.setString(1, user);
            ResultSet resultados = ps.executeQuery();
            if (resultados.next()) {
                return resultados.getBoolean("ADMIN");
            } else {
                System.out.println("Usuario no encontrado en la tabla Empleados");
            }

            resultados.close();
            ps.close();

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

        return false;
    }

    public void mostrarEmpleado(JTable table) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlConsulta = "SELECT * FROM Empleados ORDER BY NOMBRE";

            statement = (Statement) conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sqlConsulta);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nombre");
            model.addColumn("Correo");
            model.addColumn("Telefono");
            model.addColumn("Usuario");
            model.addColumn("Contraseña");
            model.addColumn("Admin");
            table.setModel(model);

            String[] datos = new String[6];
            while (resultado.next()) {
                // No entiendo el orden, consegui la secuencia tanteando
                datos[0] = resultado.getString(2) + " " + resultado.getString(3);
                datos[1] = resultado.getString(5);
                datos[2] = resultado.getString(4);
                datos[3] = resultado.getString(6);
                datos[4] = resultado.getString(8);
                if (resultado.getBoolean(7)) {
                    datos[5] = "Activo";
                } else {
                    datos[5] = "-";

                }

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
    
    
    
    public boolean eliminarEmpleado(String usuario) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlDelete = "DELETE FROM Empleados WHERE USUARIO = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlDelete);
            preparedStatement.setString(1, usuario);

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
    
    public String buscarEmpleado(String nombre) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT NOMBRE, APELLIDO FROM Empleados WHERE UPPER(NOMBRE) LIKE UPPER(?)";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, "%" + nombre + "%"); // Agrega comodines para buscar por coincidencia de palabras

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String nombreEmpleado = resultado.getString("NOMBRE") + " " + resultado.getString("APELLIDO");
                preparedStatement.close();
                return nombreEmpleado;
            } else {
                // No se encontró ningún empleado con ese nombre
                preparedStatement.close();
                return "No se encontró ningún empleado con ese nombre.";
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Registra el error para depuración
            return "Error al buscar el empleado.";
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
    
    public String[] buscar(String usuario) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT * FROM Empleados WHERE USUARIO = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, usuario);

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String id = resultado.getString("ID");
                String nombre = resultado.getString("NOMBRE");
                String apellido = resultado.getString("APELLIDO");
                String telefono = resultado.getString("TELEFONO");
                String correo = resultado.getString("CORREO");
                String usuarioE = resultado.getString("USUARIO");
                boolean admin = resultado.getBoolean("ADMIN");
                String password = resultado.getString("PASSWORD");

                preparedStatement.close();

                // Crear un arreglo con los datos del empleado
                String[] datosEmpleado = {id, nombre, apellido, telefono, correo, usuarioE, password, String.valueOf(admin)};
                return datosEmpleado;
            } else {
                // No se encontró ningún empleado con ese usuario
                preparedStatement.close();
                return null;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al buscar el empleado.");
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
    
    public boolean editarEmpleado(String id, String nuevoNombre, String nuevoApellido, String nuevoTelefono, String nuevoCorreo, String nuevoUsuario, boolean nuevoAdmin, String nuevaPassword) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);

            String sqlUpdate = "UPDATE Empleados SET NOMBRE = ?, APELLIDO = ?, TELEFONO = ?, CORREO = ?, USUARIO = ?, ADMIN = ?, PASSWORD = ? WHERE ID = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlUpdate);
            preparedStatement.setString(1, nuevoNombre);
            preparedStatement.setString(2, nuevoApellido);
            preparedStatement.setString(3, nuevoTelefono);
            preparedStatement.setString(4, nuevoCorreo);
            preparedStatement.setString(5, nuevoUsuario);
            preparedStatement.setBoolean(6, nuevoAdmin);
            preparedStatement.setString(7, nuevaPassword);
            preparedStatement.setString(8, id);

            int filasActualizadas = preparedStatement.executeUpdate();
            if (filasActualizadas > 0) {
                conexion.commit(); // Confirmar la transacción
                System.out.println("Empleado actualizado correctamente.");
                return true;
            } else {
                System.out.println("Error al actualizar el empleado.");
                return false;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al editar el empleado.");
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
