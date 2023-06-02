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
        
        /*String a = (String)admin.getClave();
        if(validar()){
            if(admin.getClave()=="abc"){
                
            }
            
        }*/
        
        welcome.setVisible(false);
        inventarioView.setVisible(true);
            
        });
       
    }
    
        public boolean validar(){
        boolean s = true;
        String ms ="Falta:\n";
        
        if(admin.getNombre().length()<=0){
            s=false;
            ms=ms+" El nombre\n";
        }
        
        /*if(admin.getClave().length()<=0){
            s=false;
            ms=ms+" La clave\n";
        }*/
      
        if(!s){
            System.out.println("Falta: "+ms);
       
        }
        return s;
     }
    }

