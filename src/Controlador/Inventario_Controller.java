/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Instrumento_Accesorio;
import Modelo.Inventario;
import Vista.InventarioListView;
import Vista.Proveedores_Tabla;
import Vista.Ventas_Formulario;
import Vista.Ventas_Tabla;
import java.awt.event.ActionEvent;
import static java.lang.System.exit;

/**
 *
 * @author Usuario
 */
public class Inventario_Controller {
    private InventarioListView inventarioView;
    private Inventario inventarioModel;
    private Instrumento_Accesorio inst;
    private Ventas_Tabla ventasTbl;
    private Proveedores_Tabla proveedoresTbl;
    
    public Inventario_Controller(InventarioListView inventarioView, Inventario inventarioModel,Instrumento_Accesorio inst,Ventas_Tabla ventasTbl, Proveedores_Tabla proveedoresTbl) {
        this.inventarioView = inventarioView;
        this.inventarioModel = inventarioModel;
        this.inst = inst;
        this.ventasTbl = ventasTbl;
        this.proveedoresTbl = proveedoresTbl;
        
        inventarioView.setVisible(true);
        
        inventarioView.cambiarVentas((ActionEvent e) -> { 
            inventarioView.setVisible(false);
            ventasTbl.setVisible(true);
        });
        
        inventarioView.cambiarProveedores((ActionEvent e) -> { 
            inventarioView.setVisible(false);
            proveedoresTbl.setVisible(true);
        });
        
        inventarioView.salir((ActionEvent e) -> { 
            exit(0);
        });
    }
}
