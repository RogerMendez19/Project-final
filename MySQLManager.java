/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger Mendez
 */
import java.sql.*;
public class MySQLManager {
    public static String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
    public static String USER = "root";
    public static String CLAVE = "@RogerM1911";
    
    public static Connection conectar(){

        Connection conexion = null;
        try {
            conexion = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("Conexion establecida");
        } catch (SQLException e) {
            System.out.println("No Conectado");
            System.out.println("Error: " + e.getMessage());
        }
        return conexion;
    }
    
    public int ReUsuario(){
        int res = 0;
        try{
           
            }catch(Exception e){
                
            }
        return res;
        
    }
}
