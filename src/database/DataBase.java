
package database;
import java.sql.*;
// Colocar todo en ingles para mantener estandar para el repositorio
// optimizar el codigo y evitar el codigo repetido

public class DataBase {
    private Connection conexion = null;
    private Statement statement = null;

    public void createDB(){
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:./DataBase.db");
            System.out.println("La base de datos ha sido creada exitosamente en la carpeta del proyecto.");
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
    
    // hacer que el codigo reciba varias tablas para crear diferentes tablas 
    public void createTabla( ){
         try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:./DataBase.db");

            String sqlTabla = "CREATE TABLE IF NOT EXISTS Empleados " +
                                   "(ID INT PRIMARY KEY     NOT NULL UNIQUE," +
                                   " NOMBRE           TEXT    NOT NULL, " + 
                                   " APELLIDO            TEXT     NOT NULL, " + 
                                   " TELEFONO            INT     NOT NULL, " + 
                                   " CORREO            TEXT     NOT NULL UNIQUE, " + 
                                   " USUARIO            TEXT     NOT NULL UNIQUE, " + 
                                    " ADMIN            BOOLEAM     NOT NULL, " + 
                                   " PASSWORD       CHAR(50)) "; 

            Statement sentencia = (Statement) conexion.createStatement();
            sentencia.executeUpdate(sqlTabla);
            sentencia.close();

            System.out.println("La tabla ha sido creada exitosamente en la base de datos.");
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
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:./DataBase.db");

            String sqlConsulta = "SELECT * FROM " + nombreTabla;

            Statement sentencia = (Statement) conexion.createStatement();
            ResultSet resultados = sentencia.executeQuery(sqlConsulta);

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
            sentencia.close();

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
        boolean isEmpty = true;
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:./DataBase.db");
            String sqlConsulta = "SELECT EXISTS(SELECT 1 FROM " + nameTabla + " LIMIT 1)";

            Statement sentencia = (Statement) conexion.createStatement();
            ResultSet resultados = sentencia.executeQuery(sqlConsulta);

            if (resultados.next()) {
                int existe = resultados.getInt(1);
                if (existe == 1) {
                    isEmpty = false;
                }
            }

            resultados.close();
            sentencia.close();
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
}
