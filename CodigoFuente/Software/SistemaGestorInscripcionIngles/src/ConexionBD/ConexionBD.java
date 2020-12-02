package conexionBD;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.swing.JOptionPane;


public class ConexionBD {
    Connection conectar = null;
    
    public Connection conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
            
            JOptionPane.showMessageDialog(null, "Conexion Exitosa!");
            
        }catch(ClassNotFoundException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Error de Conexion!" + e.getMessage());
        }
        return conectar;
    }
}