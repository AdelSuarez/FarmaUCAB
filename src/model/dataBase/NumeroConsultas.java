package model.dataBase;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;


public class NumeroConsultas extends DataBase implements OperationsDataBase {
    public boolean editarConsultasDia(String fecha,String consultasDelDia) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);

            String sqlUpdate = "UPDATE ConsultasMensuales SET CONSULTAS = ? WHERE DIA = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlUpdate);
            preparedStatement.setString(2,fecha);
            preparedStatement.setString(1, consultasDelDia);

            int filasActualizadas = preparedStatement.executeUpdate();
            if (filasActualizadas > 0) {
                conexion.commit(); // Confirmar la transacción
                System.out.println("actualizado correctamente.");
                return true;
            } else {
                System.out.println("Error al actualizar.");
                return false;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            NumeroConsultas numero=new NumeroConsultas();
            numero.nuevo("1");
            //numero.nuevo("nuevo");
            throw new RuntimeException("Error al editar.");
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
    
    public String consultasDia(String numero){
        return String.valueOf(Integer.parseInt(numero)+1);
    }
    
    public boolean nuevo(String nuevo) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);

            String sqlInsert = "INSERT INTO ConsultasMensuales (DIA,CONSULTAS) VALUES (?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(2, nuevo);
            preparedStatement.setString(1, String.valueOf(LocalDate.now()));
            

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
    
    public String buscarConsultasDia(String dia) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT CONSULTAS FROM ConsultasMensuales WHERE DIA LIKE ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, dia);

            ResultSet resultado = preparedStatement.executeQuery();
            
            if (resultado.next()) {
                String numero = resultado.getString("CONSULTAS");
                preparedStatement.close();
                return numero;
            }
            else{
               NumeroConsultas numero=new NumeroConsultas();
                numero.nuevo("0"); 
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Registra el error para depuración
            NumeroConsultas numero=new NumeroConsultas();
            numero.nuevo("0");
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
    
    public void agregarUnaConsulta(String fecha){
        NumeroConsultas numeroConsultas=new NumeroConsultas();
        int numero=Integer.parseInt(numeroConsultas.buscarConsultasDia(String.valueOf(LocalDate.now())));
        numero++;
        numeroConsultas.editarConsultasDia(fecha, String.valueOf(numero));
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
