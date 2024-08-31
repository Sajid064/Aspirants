/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SAJID
 */
public class Jconnection {
    Connection c=null;
    public static Connection CC() {
       try{
    //Connection c=DriverManager.getConnection("jdbc:sqlite:Database.db");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost/java_project","root","");
    System.out.println("Connected");

    return c;
       }
       catch(Exception e){
           e.printStackTrace();
               System.out.println("Not Connected");

           return null;
       }
    
    }
   
}
