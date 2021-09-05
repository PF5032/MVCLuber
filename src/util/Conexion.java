package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    //creo el metodo para tener la conexion con la db
    public static Connection getConnection(){
        //definimos la conexion como nula
        Connection conexion = null;
        try{
            conexion = DriverManager.getConnection(
                    Properties.dbURL, 
                    Properties.username,
                    Properties.password
            );
            if(conexion != null){
                System.out.println("*** conexion exitosa ***");
                //JOptionPane.showMessageDialog(null, "Conexion exitosa.");
                return conexion;
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return conexion;
    }
    
}
