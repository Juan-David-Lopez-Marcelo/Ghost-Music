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

/**
 *
 * @author Usuario
 */
public class Welcome_Controller {
    
    private InventarioListView inventarioView;
    private Welcome welcome;
    Admin admin;
    public Welcome_Controller(Welcome welcome,InventarioListView inventarioView, Admin admin){
        
        this.welcome = welcome;
        this.inventarioView = inventarioView;
        this.admin = admin;
        
        welcome.setVisible(true);
        
        welcome.ingresar((ActionEvent e) -> {
        
        welcome.validar(){
            
        }
        admin.setNombre(welcome.getUser());

        String a;
        a= admin.getNombre();
        //admin.setClave(welcome.getPassword());
        if(a=="a"){//&&admin.getClave()=="ABC123"){
            
            welcome.setVisible(false);
            inventarioView.setVisible(true);
        }/*else{
            exit(0);
        }*/
            
        });
    }
}
