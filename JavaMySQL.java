/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger Mendez
 */
public class JavaMySQL {  
    private static MySQLManager mysql;
    public static void main(String[] args) {
       mysql = new MySQLManager();
       mysql.conectar();
    }
}
