/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author FrankS
 */
public class Conexion {

public Connection get_connection(){
    
        Connection conexion = null;
        
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app?serverTimezone=UTC","root","");
            if (conexion!= null) {
                System.out.println("Conexion exitosa");
            }
        } catch (SQLException e) {
                System.out.println(e);
        }
        return conexion;
    }
}
