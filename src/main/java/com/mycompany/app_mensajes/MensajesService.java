/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app_mensajes;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author SSSA
 */
public class MensajesService {
    
    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("tu nombre");
        String nombre = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDao.crearMensajeDB(registro);
        
    }
    
    public static void listaMensajes(){
        MensajesDao.leerMensajeDB();
        
    }
    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el ID del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDao.borrarMensajeDB(id_mensaje);
        
        
    }
    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Indique el id del mensaje a editar");
        int id_mensaje = sc.nextInt();
        Mensajes actualizar = new Mensajes();
        actualizar.setId_mensaje(id_mensaje);
        actualizar.setMensaje(mensaje);
        MensajesDao.actualizarMensajeDB(actualizar);
        
        
    }
}

