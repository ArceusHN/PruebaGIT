/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Omar Fer
 */
public class Conexion {
    
    String url = "jdbc:sqlserver://LAPTOP-NCA3A1E7\\SQLEXPRESS:1433;databaseName=EjerciciosBasicos";
    String user = "ROmar";
    String password ="eduardo01";
    Connection con;
    
    public Conexion(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, user, password);
        }
        catch(Exception e){
            System.out.println("ERROR CONEXION" + e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
}
