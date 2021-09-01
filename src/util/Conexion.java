/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lau
 */
public class Conexion {
    
    //creo el metodo para tener la conexion con la db
    public static Connection getConnection(){
        //definimos la conexion como nula
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(
                    Properties.dbURL, 
                    Properties.username,
                    Properties.password
            );
            if(conn != null){
                System.out.println("*** conexion exitosa ***");
                //JOptionPane.showMessageDialog(null, "Conexion exitosa.");
                return conn;
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return conn;
    }
    
}
