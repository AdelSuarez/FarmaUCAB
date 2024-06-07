package database;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Insumo extends DataBase {

   public boolean nuevoInsumo(String nombre, int stock, String descripcion, String fecha) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);

            String sqlInsert = "INSERT INTO Insumos (NOMBRE, FECHA, STOCK, DESCRIPCION) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, fecha); // Utiliza la fecha proporcionada
            preparedStatement.setInt(3, stock);
            preparedStatement.setString(4, descripcion);

            int filasInsertadas = preparedStatement.executeUpdate();
            if (filasInsertadas > 0) {
                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int idGenerado = generatedKeys.getInt(1);
                        System.out.println("ID generado: " + idGenerado);
                    }
                }
                conexion.commit(); // Confirmar la transacción
                System.out.println("Insumo insertado correctamente.");
                return true;
            } else {
                System.out.println("Error al insertar el Insumo.");
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

    public void mostrarInsumos(JTable table) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlConsulta = "SELECT * FROM Insumos ORDER BY NOMBRE";

            statement = (Statement) conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sqlConsulta);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Cantidad");
            table.setModel(model);

            String[] datos = new String[4];
            while (resultado.next()) {
                // No entiendo el orden, consegui la secuencia tanteando
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                model.addRow(datos);
            }

            resultado.close();
            statement.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage() + " error al mostrar los datos de la tabla Insumos");
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

    public String buscarIdInsumo(String id) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT ID FROM Insumos WHERE ID LIKE ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, id);

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String identificador = resultado.getString("ID");
                preparedStatement.close();
                return identificador;
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
        return "-1";
    }

    public String[] buscarInsumo(String id) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT * FROM Insumos WHERE id = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, id);

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String identificacion = resultado.getString("ID");
                String nombreInsumo = resultado.getString("NOMBRE");
                int cantidad = resultado.getInt("CANTIDAD");

                preparedStatement.close();

                // Crear un arreglo con los datos del paciente
                String[] datosPaciente = {identificacion, nombreInsumo, String.valueOf(cantidad)};
                return datosPaciente;
            } else {
                // No se encontró ningún paciente con esa cédula
                preparedStatement.close();
                return null;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al buscar el insumo.");
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

    public boolean editarInsumo(String id, String nuevoNombre, int nuevaCantidad) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);

            String sqlUpdate = "UPDATE Insumos SET NOMBRE = ?, CANTIDAD = ? WHERE ID = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlUpdate);
            preparedStatement.setString(1, nuevoNombre);
            preparedStatement.setInt(2, nuevaCantidad);
            preparedStatement.setString(3, id);

            int filasActualizadas = preparedStatement.executeUpdate();
            if (filasActualizadas > 0) {
                conexion.commit(); // Confirmar la transacción
                System.out.println("Insumo actualizado correctamente.");
                return true;
            } else {
                System.out.println("Error al actualizar el insumo.");
                return false;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al editar el insumo.");
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

    public boolean eliminarInsumo(String id) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlDelete = "DELETE FROM Insumos WHERE ID = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlDelete);
            preparedStatement.setString(1, id);

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