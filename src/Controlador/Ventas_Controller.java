/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.InventarioListView;
import Vista.Ventas_Formulario;
import Vista.Ventas_Tabla;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventas_Controller {
    private Ventas_Tabla ventas;
    private InventarioListView inventarioView;
    private Ventas_Formulario formulario;
    
    public Ventas_Controller(Ventas_Tabla ventas,InventarioListView inventarioView,Ventas_Formulario formulario){
        this.ventas = ventas;
        this.inventarioView = inventarioView;
        this.formulario = formulario;
        ventas.cambiarInventario((ActionEvent e) -> { 
            ventas.setVisible(false);
            inventarioView.setVisible(true);  
        });
        ventas.cambiarFormulario((ActionEvent e) -> { 
            ventas.setVisible(false);
            formulario.setVisible(true);
        });
        ventas.eliminarVenta((ActionEvent e) -> { 
            //Proceso para eliminar venta
        });
        formulario.cambiarTablaVenta((ActionEvent e) -> { 
            ventas.setVisible(true);
            formulario.setVisible(false);
        });
        formulario.crearVenta((ActionEvent e) -> { 
            //Proceso para crear venta
            //cliente.setNombre(formulario.getTxtfNombre());
            //System.out.println(cliente.getNombre());
        });
      
    }

}
