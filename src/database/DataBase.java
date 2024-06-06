package database;

import java.sql.*;

// Colocar todo en ingles para mantener estandar para el repositorio
// optimizar el codigo y evitar el codigo repetido
public class DataBase {

    protected Connection conexion = null;
    protected Statement statement = null;
    private final String sqlCreateTablaEmpleados = "CREATE TABLE IF NOT EXISTS Empleados "
            + "(ID INTEGER PRIMARY KEY   NOT NULL,"
            + " NOMBRE           TEXT    NOT NULL, "
            + " APELLIDO         TEXT    NOT NULL, "
            + " TELEFONO         TEXT    NOT NULL, "
            + " CORREO           TEXT    NOT NULL UNIQUE, "
            + " USUARIO          TEXT    NOT NULL UNIQUE, "
            + " ADMIN            BOOLEAN NOT NULL, "
            + " PASSWORD         TEXT    NOT NULL )";
    private final String sqlCreateTablaPacientes = "CREATE TABLE IF NOT EXISTS Pacientes "
            + "(ID INTEGER PRIMARY KEY   NOT NULL,"
            + " NOMBRE           TEXT    NOT NULL, "
            + " APELLIDO         TEXT    NOT NULL, "
            + " CEDULA           TEXT    NOT NULL UNIQUE, "
            + " TELEFONO         TEXT    NOT NULL, "
            + " DE               TEXT    NOT NULL, "
            + " GENERO           TEXT    NOT NULL, "
            + " EDAD             INT     NOT NULL, "
            + " DESCRIPCION      TEXT  NOT NULL) ";
    protected final String ORG = "org.sqlite.JDBC";
    protected final String DIRECCIONDB = "jdbc:sqlite:./DataBase.db";

    // Funciones
    public String getSqlCreateTablaEmpleados() {
        return sqlCreateTablaEmpleados;
    }

    public String getSqlCreateTablaPacientes() {
        return sqlCreateTablaPacientes;
    }

    public void createDB() {
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

    public void createTabla(String sqlTabla) {
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

    public boolean isEmptyTabla(String nameTabla) {
        // Verifica si la tabla contiene algun elemento
        boolean isEmpty = true;
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            DatabaseMetaData metaData = conexion.getMetaData();
            ResultSet tablas = metaData.getTables(null, null, nameTabla, null);

            if (tablas.next()) {
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

}
