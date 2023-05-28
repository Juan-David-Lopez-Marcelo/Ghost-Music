/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Instrumento_Accesorio;
import Modelo.Inventario;
import Vista.InventarioListView;
import Vista.Ventas_Formulario;
import java.awt.event.ActionEvent;

/**
 *
 * @author Usuario
 */
public class Inventario_Controller {
    private InventarioListView inventarioView;
    private Inventario inventarioModel;
    private Instrumento_Accesorio inst;
    private Ventas_Formulario ventas;
    
    public Inventario_Controller(InventarioListView inventarioView, Inventario inventarioModel,Instrumento_Accesorio inst,Ventas_Formulario ventas) {
        this.inventarioView = inventarioView;
        this.inventarioModel = inventarioModel;
        this.inst = inst;
        this.ventas = ventas;
        
        inventarioView.setVisible(true);
        
        inventarioView.cambiarVentas((ActionEvent e) -> { 
            inventarioView.setVisible(false);
            ventas.setVisible(true);
        });
    }
}
