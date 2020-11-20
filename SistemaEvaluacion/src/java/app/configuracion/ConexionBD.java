/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.configuracion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Christian
 */
public class ConexionBD {
    Connection con;
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/evaluacion";
    String user = "root";
    String pass = "";
    
    public Connection getConnection(){
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,pass);
        }catch(ClassNotFoundException | SQLException e){
            
        }
        return con;
    }
}
