/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger Mendez
 */
import java.sql.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


public class Metodos_sql {
    
    public static MySQLManager conexion = new MySQLManager();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String alumno, String apellido, String email, String nombre, String telefono){
        int resultado = 0;
        Connection conexion = null;
        
        String sentencia_guardar = ("INSERT INTO contact_list(alumno,apellido,email,nombre,telefono)VALUES(?,?,?,?,?)");
        try{
            conexion = MySQLManager.conectar();
             sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
             sentencia_preparada.setString(1, nombre);
             sentencia_preparada.setString(2, apellido);
             sentencia_preparada.setString(3, email);
             sentencia_preparada.setString(4, nombre);
             sentencia_preparada.setString(5, telefono);
            
             
             resultado = sentencia_preparada.executeUpdate();
             sentencia_preparada.close();
             conexion.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return resultado;   
    }
    
    public static String buscarAlumno(String nombre){
        String busqueda_alumno = null;
        Connection conexion = null;
        try{
            conexion = MySQLManager.conectar();
            String sentencia_buscar=("SELECT alumno, apellido FROM contact_list where nombre= '" +nombre+ "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            
            if(resultado.next()){
               String alumno = resultado.getString("alumno");
               String apellido = resultado.getString("apellido");
               busqueda_alumno = (nombre +" "+ apellido);
            }
            conexion.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return busqueda_alumno;
    }
     public static String buscarUsuario(String name, String password){
        String busqueda_usuario = null;
        Connection conexion = null;
        try{
            conexion = MySQLManager.conectar();
            String sentencia_buscar_usuario = ("SELECT alumno, name, password FROM usuario where nombre = '"+name+"' && password = '"+password+"'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
            resultado = sentencia_preparada.executeQuery();
            
            if(resultado.next()){
                busqueda_usuario = "Usuario encontrado";
            }else {
                busqueda_usuario = "Usuario no encontrado";
            }
            conexion.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return busqueda_usuario;
     }
    
}
