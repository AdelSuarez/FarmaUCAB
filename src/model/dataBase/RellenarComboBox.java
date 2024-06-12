
package model.dataBase;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;

public class RellenarComboBox extends DataBase {
    private InsumoDB insumo = new InsumoDB();

    public void RellenarCombox(String tabla, String valor, JComboBox combo){
        String sql = "select * from " + tabla;  
        if (!insumo.isEmptyTabla("Insumos")) {

            try {
                conexion = DriverManager.getConnection(DIRECCIONDB);
                statement = (Statement) conexion.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    combo.addItem(rs.getString(valor));      
                }
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
}

