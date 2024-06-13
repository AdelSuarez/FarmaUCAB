package model.dataBase;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InsumoDB extends DataBase implements OperationsDataBase {

    public boolean nuevo(String nombre, int stock, String descripcion, String fecha) {
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
            model.addColumn("Stock");
            model.addColumn("Fecha Ingreso");

            table.setModel(model);

            String[] datos = new String[4];
            while (resultado.next()) {

                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(4);
                datos[3] = resultado.getString(3);
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

    public String buscardorInsumo(String nombre) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT NOMBRE FROM Insumos WHERE UPPER(NOMBRE) LIKE UPPER(?)";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, "%" + nombre + "%"); // Agrega comodines para buscar por coincidencia de palabras

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String nombreInsumo = resultado.getString("NOMBRE");
                preparedStatement.close();
                return nombreInsumo;
            } else {
                // No se encontró ningún insumo con ese nombre
                preparedStatement.close();
                return "";
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Registra el error para depuración
            return "Error al buscar el insumo.";
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

    public String buscarIdInsumo(String nombre) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT ID FROM Insumos WHERE NOMBRE LIKE ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, nombre);

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
                int cantidad = resultado.getInt("STOCK");
                String descripcion = resultado.getString("DESCRIPCION");

                preparedStatement.close();

                String[] datosPaciente = {identificacion, nombreInsumo, String.valueOf(cantidad), descripcion};
                return datosPaciente;
            } else {
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

    public int buscarCantidad(String id) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT * FROM Insumos WHERE id = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, id);

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                int cantidad = resultado.getInt("STOCK");

                preparedStatement.close();
                return cantidad;
            } else {
                preparedStatement.close();
                return 0;
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

    public boolean editar(String id, String nuevoNombre, int nuevoStock, String nuevaDescripcion) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);

            String sqlUpdate = "UPDATE Insumos SET NOMBRE = ?, STOCK = ?, DESCRIPCION = ? WHERE ID = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlUpdate);
            preparedStatement.setString(1, nuevoNombre);
            preparedStatement.setInt(2, nuevoStock);
            preparedStatement.setString(3, nuevaDescripcion);
            preparedStatement.setString(4, id);

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

    public boolean eliminar(String id) {
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

    @Override
    public void nuevo() {
    }

    @Override
    public void editar() {
    }

    @Override
    public void eliminar() {
    }

    @Override
    public void buscar() {
    }
}
