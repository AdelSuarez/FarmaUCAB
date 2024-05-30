
package database;
import java.sql.*;
// Colocar todo en ingles para mantener estandar para el repositorio
// optimizar el codigo y evitar el codigo repetido

public class DataBase {
    private Connection conexion = null;
    private Statement statement = null;
    private final String sqlCreateTablaEmpleados = "CREATE TABLE IF NOT EXISTS Empleados " +
                                   "(ID INTEGER PRIMARY KEY     NOT NULL," +
                                   " NOMBRE           TEXT    NOT NULL, " + 
                                   " APELLIDO            TEXT     NOT NULL, " + 
                                   " TELEFONO            TEXT     NOT NULL, " + 
                                   " CORREO            TEXT     NOT NULL UNIQUE, " + 
                                   " USUARIO            TEXT     NOT NULL UNIQUE, " + 
                                   " ADMIN            BOOLEAN     NOT NULL, " + 
                                   " PASSWORD       TEXT NOT NULL )"; 
    private final String ORG = "org.sqlite.JDBC";
    private final String DIRECCIONDB = "jdbc:sqlite:./DataBase.db"; 
    
    
    // Funciones
    
    public String getSqlCreateTablaEmpleados() {
        return sqlCreateTablaEmpleados;
    }

    public void createDB(){
        // Crea la base de datos, si no existe
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
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
    
    public void insertEmpleado(String nombre, String apellido, String telefono, String correo, String usuario, boolean admin, String password) {
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
    
    public void createTabla(String sqlTabla ){
        // Crea cual tabla en la base de datos
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            statement = (Statement) conexion.createStatement();
            statement.executeUpdate(sqlTabla);
            statement.close(); 

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
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
    
   
    
    public void viewTabla(String nombreTabla){
         try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlConsulta = "SELECT * FROM " + nombreTabla;

            statement = (Statement) conexion.createStatement();
            ResultSet resultados = statement.executeQuery(sqlConsulta);

            ResultSetMetaData rsmd = resultados.getMetaData();
            int numColumnas = rsmd.getColumnCount();
            
            System.out.println("la tabla tiene: " + rsmd);
            while (resultados.next()) {
                for (int i = 1; i <= numColumnas; i++) {
                    String columnaValor = resultados.getString(i);
                    System.out.print(columnaValor + " ");
                }
                System.out.println();
            }

            resultados.close();
            statement.close();

            System.out.println("Los datos de la tabla '" + nombreTabla + "' se han mostrado exitosamente.");
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
    
    public boolean isEmptyTabla(String nameTabla) {
        // Verifica si la tabla contiene algun elemento
        boolean isEmpty = true;
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            DatabaseMetaData metaData = conexion.getMetaData();
            ResultSet tablas = metaData.getTables(null, null, nameTabla, null);
            
            if(tablas.next()){
                String sqlConsulta = "SELECT EXISTS(SELECT 1 FROM " + nameTabla + " LIMIT 1)";

                statement = (Statement) conexion.createStatement();
                try (ResultSet resultados = statement.executeQuery(sqlConsulta)) {
                    if (resultados.next()) {
                        int existe = resultados.getInt(1);
                        if (existe == 1) {
                            isEmpty = false;
                        }
                    }
                }   
                statement.close();

            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage() + " error al verificar si la tabla está vacía");
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return isEmpty;
    }

    
    public boolean buscarUser(String nombreTabla, String user, String password){
         try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlConsulta = "SELECT * FROM " + nombreTabla + " WHERE USUARIO = ?";

            PreparedStatement ps = conexion.prepareStatement(sqlConsulta);
            ps.setString(1, user);
            ResultSet resultados = ps.executeQuery();
            if (resultados.next()) {
                
                  if (password.equals(resultados.getString("PASSWORD"))){
                      return true;
                  } else {
                      return false;
                  }
            } else {
                System.out.println("Usuario no encontrado en la tabla " + nombreTabla);
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
         
//        return (null);
        return false;

    }

}
