package model.dataBase;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.util.ArrayList;

public class InsumoDB extends DataBase implements OperationsDataBase {
    public String nuevoGastoMensual(){
        String texto="";
        for(int i=0;i<31;i++){
            texto=texto+"0,";
        }
        return texto;
    }

    public boolean nuevo(String nombre, int stock, String descripcion, int cantidadBlister ,String fecha) {
        try {
            InsumoDB insumo=new InsumoDB();
            int cantidadStock;
            if(cantidadBlister!=0){
                cantidadStock=stock*cantidadBlister;
            } else{
                cantidadStock=stock;
            }
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);

            String sqlInsert = "INSERT INTO Insumos (NOMBRE, FECHA, STOCK, CANTIDADBLISTER ,DESCRIPCION,GASTOMENSUAL,ULTIMACONSULTA,ULTIMAPOS) VALUES (?, ?, ?, ?,?,?,?,?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, fecha); // Utiliza la fecha proporcionada
            preparedStatement.setInt(3, cantidadStock);
            preparedStatement.setInt(4, cantidadBlister);
            preparedStatement.setString(5, descripcion);
            preparedStatement.setString(6, insumo.nuevoGastoMensual());
            preparedStatement.setString(7, String.valueOf(LocalDate.now()));
            preparedStatement.setInt(8, 0);
            

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
            model.addColumn("Cant.");
            model.addColumn("Blisters llenos");
            model.addColumn("Fecha Ingreso");

            table.setModel(model);

            String[] datos = new String[5];           
            while (resultado.next()) {
                int blisterTotal=1;
                if(!"0".equals(resultado.getString(5))){
                    blisterTotal = Integer.parseInt(resultado.getString(4))/ Integer.parseInt(resultado.getString(5));
                }
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(4);
                datos[3] = (resultado.getString(5).equals("0"))? "-" : String.valueOf(blisterTotal);
                datos[4] = resultado.getString(3);
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

    public List<String> buscadorInsumoTabla(String nombre) {
        System.out.println(nombre);
        List<String> nombresCoincidentes = new ArrayList<>();
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT NOMBRE FROM Insumos WHERE UPPER(NOMBRE) LIKE UPPER(?)";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, nombre + "%");

            ResultSet resultado = preparedStatement.executeQuery();
            while (resultado.next()) {
                String nombreInsumo = resultado.getString("NOMBRE");
                nombresCoincidentes.add(nombreInsumo);
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
        return nombresCoincidentes;
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
                int cantidadBlister = resultado.getInt("CANTIDADBLISTER");
                String descripcion = resultado.getString("DESCRIPCION");

                preparedStatement.close();

                String[] datosPaciente = {identificacion, nombreInsumo, String.valueOf(cantidad), String.valueOf(cantidadBlister) ,descripcion};
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

    public boolean editar(String id, String nuevoNombre, int nuevoStock, int nuevaCantidadBlister,String nuevaDescripcion) {
        try {
            int cantidadStock;
            if(nuevaCantidadBlister!=0){
                cantidadStock=nuevoStock*nuevaCantidadBlister;
            } else{
                cantidadStock=nuevoStock;
            }
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);

            String sqlUpdate = "UPDATE Insumos SET NOMBRE = ?, STOCK = ?, CANTIDADBLISTER = ?,DESCRIPCION = ? WHERE ID = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlUpdate);
            preparedStatement.setString(1, nuevoNombre);
            preparedStatement.setInt(2, cantidadStock);
            preparedStatement.setInt(3, nuevaCantidadBlister);
            preparedStatement.setString(4, nuevaDescripcion);
            preparedStatement.setString(5, id);

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
    
    public String nuevoConsumoMensual(int[] consumo){
        String consumoMensual="";
        for(int i=0;i<31;i++){
            consumoMensual=consumoMensual+String.valueOf(consumo[i]) + ",";
        }
        return consumoMensual;
    }
    
    public int[] obtenerArrayConsumoMensual(String consumoMensual){
        int[] consumo=new int[31];
        String numero="";
        int pos=0;
        for(int i=0;i<consumoMensual.length();i++){
            if(consumoMensual.charAt(i)!=','){
                numero=numero+String.valueOf(consumoMensual.charAt(i));
            }else{
                consumo[pos]=Integer.parseInt(numero);
                pos++;
                numero="";
            }
        }
        return consumo;
    }
    
    public String buscarConsumoMensual(String id){
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT * FROM Insumos WHERE id = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, id);

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String cantidad = resultado.getString("GASTOMENSUAL");

                preparedStatement.close();
                return cantidad;
            } else {
                preparedStatement.close();
                return "";
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
    
    public String buscarUltimaConsulta(String id){
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT * FROM Insumos WHERE id = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, id);

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String cantidad = resultado.getString("ULTIMACONSULTA");

                preparedStatement.close();
                return cantidad;
            } else {
                preparedStatement.close();
                return "";
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
    
    public String buscarUltimaPos(String id){
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT * FROM Insumos WHERE id = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, id);

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String cantidad = resultado.getString("ULTIMAPOS");

                preparedStatement.close();
                return cantidad;
            } else {
                preparedStatement.close();
                return "";
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
    
    public boolean editarUltimaConsulta(String id) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);

            String sqlUpdate = "UPDATE Insumos SET ULTIMACONSULTA = ? WHERE ID = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlUpdate);
            preparedStatement.setString(1,String.valueOf(LocalDate.now()));
            preparedStatement.setString(2, id);

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
    
    public boolean editarUltimaPos(String id,int ultimaPos) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);

            String sqlUpdate = "UPDATE Insumos SET ULTIMAPOS = ? WHERE ID = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlUpdate);
            preparedStatement.setInt(1,ultimaPos);
            preparedStatement.setString(2, id);

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
    
    public boolean editarArrayConsumo(String id,String gastoMensual) {
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);

            String sqlUpdate = "UPDATE Insumos SET GASTOMENSUAL = ? WHERE ID = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlUpdate);
            preparedStatement.setString(1,gastoMensual);
            preparedStatement.setString(2, id);

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
    
    public int devolverPosAAvanzar(String ultimaConsulta){
        LocalDate ultima=LocalDate.parse(ultimaConsulta);
        LocalDate ahora=LocalDate.now();
        if(ultima.getYear()!=ahora.getYear()){
            return 32;
        }
        if((ahora.getDayOfYear()-ultima.getDayOfYear())>31){
            return 32;
        }
        else{
            return (ahora.getDayOfYear()-ultima.getDayOfYear());
        }       
    }
    
    public void actualizarArrayConsumo(int[] arrayConsumo,String id,int ultimaPos,String ultimaConsulta){
        InsumoDB insumo=new InsumoDB();
        int posicion=ultimaPos;
        for(int i=insumo.devolverPosAAvanzar(ultimaConsulta);i>0;i--){
            posicion++;
            if(posicion>=31){
                posicion=0;
            }
            arrayConsumo[posicion]=0;
        }
        insumo.editarArrayConsumo(id, insumo.nuevoConsumoMensual(arrayConsumo));
        insumo.editarUltimaPos(id, posicion);
    }
    
    public void actualizarConsumoDelDia(int[] arrayConsumo,String id,int consumo){
        InsumoDB insumo=new InsumoDB();
        int posicion=Integer.parseInt(insumo.buscarUltimaPos(id));
        arrayConsumo[posicion]=arrayConsumo[posicion]+consumo;
        System.out.println(posicion);
        System.out.println(consumo);
        insumo.editarArrayConsumo(id, insumo.nuevoConsumoMensual(arrayConsumo));  
    }
    
    public void actualizarInsumos(){
        try {
            Class.forName(ORG);
            InsumoDB insumo=new InsumoDB();
            conexion = DriverManager.getConnection(DIRECCIONDB);
            conexion.setAutoCommit(false);
            int[] arrayGasto;
            ArrayList<Integer> ultimaPos=new ArrayList();
            ArrayList<String> ultimaConsulta=new ArrayList();
            ArrayList<String> id=new ArrayList();
            String sqlSearch = "SELECT * FROM Insumos";
            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSearch);


            ResultSet resultados = preparedStatement.executeQuery();
            while(resultados.next()){
                id.add(resultados.getString("ID"));
                ultimaConsulta.add(resultados.getString("ULTIMACONSULTA"));
                ultimaPos.add(resultados.getInt("ULTIMAPOS"));
            }
            conexion.close();
            for(int i=0;i<ultimaPos.size();i++){
                arrayGasto=insumo.obtenerArrayConsumoMensual(insumo.buscarConsumoMensual(id.get(0)));
                insumo.actualizarArrayConsumo(arrayGasto, id.get(0),ultimaPos.get(0),ultimaConsulta.get(0));
                insumo.editarUltimaConsulta(id.get(0));
                id.remove(0);
                ultimaPos.remove(0);
                ultimaConsulta.remove(0);
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
    
    public int calcularUsoSemanal(String id){
        InsumoDB insumo=new InsumoDB();
        int gastoSemanal=0;
        int ultimaPos=Integer.parseInt(insumo.buscarUltimaPos(id));
        int[] array=insumo.obtenerArrayConsumoMensual(insumo.buscarConsumoMensual(id));
        for(int i=7;i>0;i--){
            gastoSemanal=array[ultimaPos];
            ultimaPos--;
            if(ultimaPos<0){
                ultimaPos=30;
            }
        }  
        return gastoSemanal;
    }
    
    public int calcularUsoMensual(String id){
        InsumoDB insumo=new InsumoDB();
        int gastoMensual=0;
        int[] array=insumo.obtenerArrayConsumoMensual(insumo.buscarConsumoMensual(id));
        for(int i=0;i<31;i++){
            gastoMensual=array[i];
        }  
        return gastoMensual;
    }
    
    public int usoDiario(String id){
        InsumoDB insumo=new InsumoDB();
        int[] array=insumo.obtenerArrayConsumoMensual(insumo.buscarConsumoMensual(id));
        int ultimaPos=Integer.parseInt(insumo.buscarUltimaPos(id));
        return array[ultimaPos];
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
