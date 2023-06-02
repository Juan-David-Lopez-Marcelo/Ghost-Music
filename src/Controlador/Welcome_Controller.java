/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Admin;
import Vista.InventarioListView;
import Vista.Welcome;
import java.awt.event.ActionEvent;
import static java.lang.System.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Welcome_Controller {
    
    InventarioListView inventarioView;
    Welcome welcome;
    Admin admin;
    public Welcome_Controller(Welcome welcome,InventarioListView inventarioView, Admin admin){
        
        this.welcome = welcome;
        this.inventarioView = inventarioView;
        this.admin = admin;
        
        welcome.setVisible(true);
        
        welcome.ingresar((ActionEvent e) -> {
    
        admin.setNombre(welcome.getUser());
        admin.setClave(welcome.getContraseña());
        
        if(welcome.validar()){
            if(admin.getClave().equals("abc")){
                welcome.setVisible(false);
                inventarioView.setVisible(true);
            }else{
                System.out.println("Contraseña incorrecta");
            }   
        }    
        });      
    }      
    }

