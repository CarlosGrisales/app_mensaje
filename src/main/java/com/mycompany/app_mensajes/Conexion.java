/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app_mensajes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SSSA
 */
class Conexion {
    public Connection get_connection(){
        Connection conection = null;
        
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensaje_app","root","");
            if (conection != null){
                System.out.println("Conexion Exitosa");
            }
        }catch(SQLException e){
        System.out.println(e);}
        return conection;
    }
    
}
