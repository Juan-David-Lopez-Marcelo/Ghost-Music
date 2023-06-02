/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dao.Ventas_Dao;
import Modelo.Venta;
import Vista.InventarioListView;
import Vista.Ventas_Formulario;
import Vista.Ventas_Tabla;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class Ventas_Controller {
    Ventas_Tabla ventas;
    InventarioListView inventarioView;
    Ventas_Formulario formulario;
    Ventas_Dao ventaDao;
    
    public Ventas_Controller(Ventas_Tabla ventas,InventarioListView inventarioView,Ventas_Formulario formulario) throws SQLException{
        this.ventas = ventas;
        this.inventarioView = inventarioView;
        this.formulario = formulario;
        this.ventaDao = new Ventas_Dao();
        
        
        mostrarDatos();
        
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
    void mostrarDatos() throws SQLException{
        ArrayList<Venta> venta = ventaDao.findAll();
 
        ventas.mostrarDatos(venta);
        //ClientsHandler handler = new ClientsHandler();
        //ArrayList<ClientsModel> models = handler.getAllClients(); 
        //this.view.mostrarDatos(models);
    }

}
