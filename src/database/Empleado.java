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
}
