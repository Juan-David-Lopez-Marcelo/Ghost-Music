/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.InventarioListView;
import Vista.Proveedores_Formulario;
import Vista.Proveedores_Tabla;
import java.awt.event.ActionEvent;

/**
 *
 * @author Usuario
 */
public class Proveedores_Controller {
    private Proveedores_Tabla proveedores;
    private InventarioListView inventarioView;
    private Proveedores_Formulario formulario;
    
    public Proveedores_Controller(Proveedores_Tabla proveedores,InventarioListView inventarioView,Proveedores_Formulario formulario){
        this.proveedores = proveedores;
        this.inventarioView = inventarioView;
        this.formulario = formulario;
        proveedores.cambiarInventario((ActionEvent e) -> { 
            proveedores.setVisible(false);
            inventarioView.setVisible(true);  
        });
        proveedores.cambiarFormulario((ActionEvent e) -> { 
            proveedores.setVisible(false);
            formulario.setVisible(true);
        });
        proveedores.eliminarMaterial((ActionEvent e) -> { 
            //Proceso para eliminar material
        });
        formulario.cambiarTablaProveedor((ActionEvent e) -> { 
            proveedores.setVisible(true);
            formulario.setVisible(false);
        });
        formulario.añadirMat((ActionEvent e) -> { 
            //Proceso para añadir material
        });
        
    }
}
