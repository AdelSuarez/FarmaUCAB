package model.dataBase;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.dataBase.NumeroConsultas;

public class ConsultaDB extends DataBase {

    public boolean nuevaConsulta(String fecha, String paciente, String doctor, String insumo) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);
            String sqlInsert = "INSERT INTO Consultas (FECHA,CIPACIENTE,DOCTOR,INSUMO) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, fecha);
            preparedStatement.setString(2, paciente);
            preparedStatement.setString(3, doctor);
            preparedStatement.setString(4, insumo);

            int filasInsertadas = preparedStatement.executeUpdate();
            if (filasInsertadas > 0) {
                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int idGenerado = generatedKeys.getInt(1);
                        System.out.println("ID generado: " + idGenerado);
                    }
                }
                conexion.commit(); // Confirmar la transacción
                NumeroConsultas numeroConsultas=new NumeroConsultas();
                numeroConsultas.agregarUnaConsulta(String.valueOf(LocalDate.now()));
                System.out.println("Consulta insertada correctamente.");
                return true;
            } else {
                System.out.println("Error al insertar la Consulta.");
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

    public void mostrarConsulta(JTable table) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlConsulta = "SELECT * FROM Consultas ORDER BY FECHA";

            statement = (Statement) conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sqlConsulta);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("FECHA");
            model.addColumn("CIPACIENTE");
            model.addColumn("DOCTOR");
            model.addColumn("INSUMO");
            table.setModel(model);

            String[] datos = new String[5];
            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                model.addRow(datos);
            }

            resultado.close();
            statement.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage() + " error al mostrar los datos de la tabla Consultas");
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

    public List<String> buscadorConsultaTabla(String cedula) {
        System.out.println(cedula);
        List<String> resultadosCoincidentes = new ArrayList<>();
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT CIPACIENTE FROM Consultas WHERE UPPER(CIPACIENTE) LIKE UPPER(?)";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, "%" + cedula + "%");

            ResultSet resultado = preparedStatement.executeQuery();
            while (resultado.next()) {
                String Cedula = resultado.getString("CIPACIENTE");
                
                resultadosCoincidentes.add(Cedula);
            }
            preparedStatement.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Registra el error para depuración
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return resultadosCoincidentes;
    }
    
    public String buscarConsulta(String CI) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT * FROM Consultas WHERE CIPACIENTE LIKE ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, "%" + CI + "%");

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String paciente = resultado.getString("CIPACIENTE");

                preparedStatement.close();

                // Crear un arreglo con los datos del paciente
                return paciente;
            } else {
                // No se encontró ningún paciente con esa cédula
                preparedStatement.close();
                return null;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al buscar la consulta.");
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

    public boolean eliminarConsulta(String id) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlDelete = "DELETE FROM Consultas WHERE ID = ?";

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
    
    public void mostrarConsultaPorCI(JTable table) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlConsulta = "SELECT * FROM Consultas ORDER BY CIPACIENTE";

            statement = (Statement) conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sqlConsulta);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("FECHA");
            model.addColumn("CIPACIENTE");
            model.addColumn("DOCTOR");
            model.addColumn("INSUMO");
            table.setModel(model);

            String[] datos = new String[5];
            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                model.addRow(datos);
            }

            resultado.close();
            statement.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage() + " error al mostrar los datos de la tabla Consultas");
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
