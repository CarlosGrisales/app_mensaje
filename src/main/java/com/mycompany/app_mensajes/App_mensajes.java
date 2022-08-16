/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.app_mensajes;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author SSSA
 */
public class App_mensajes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int opcion = 0;
        
        do{
            System.out.println("--------------");
            System.out.println("Menu de mensajes");
            System.out.println("1. crear mensaje");
            System.out.println("2. listar mensaje");
            System.out.println("3. borrar mensaje");
            System.out.println("4. Editar mensaje");
            System.out.println("5. salir");
            
            //leer comentario
            opcion = sc.nextInt();
           
            
  
           switch (opcion) {
            case 1:
                System.out.println("1. crear mensaje");
                MensajesService.crearMensaje();
                break;
                
            case 2:
                System.out.println("2. listar mensaje");
                MensajesService.listaMensajes();
                break;
                
            case 3:
                System.out.println("3. Borrar mensaje");
                MensajesService.borrarMensaje();
                break;
                
            case 4: 
                System.out.println("4. Editar mensajes");
                MensajesService.editarMensaje();
                       
                
            default: 
                System.out.println("Saliste del menu");
        }
            
        
        }while(opcion!= 5);
        


     

    }
}
