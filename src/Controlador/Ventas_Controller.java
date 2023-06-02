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
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ventas_Controller {
    Ventas_Tabla ventas;
    InventarioListView inventarioView;
    Ventas_Formulario formulario;
    Ventas_Dao ventaDao;
    Venta ventaModel;
    
    public Ventas_Controller(Ventas_Tabla ventas,InventarioListView inventarioView,Ventas_Formulario formulario, Venta ventaModel) throws SQLException{
        this.ventas = ventas;
        this.inventarioView = inventarioView;
        this.formulario = formulario;
        this.ventaModel = ventaModel;
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
            ventaDao.deleteById(ventas.leerRegistro());
            ventas.limpiarTabla();
            try {
                mostrarDatos();
            } catch (SQLException ex) {
                Logger.getLogger(Ventas_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        formulario.cambiarTablaVenta((ActionEvent e) -> { 
            ventas.setVisible(true);
            formulario.setVisible(false);
        });
        formulario.crearVenta((ActionEvent e) -> { 
            
            ventaModel.setId(formulario.getTxtfId());
            ventaModel.setNombre_cli(formulario.getTxtfNombre());
            ventaModel.setCorreo_cli(formulario.getTxtfCorreo());
            ventaModel.setNombre(formulario.getTxtfInstrumento());
            ventaModel.setMarca_modelo(formulario.getTxtfMarca());
            ventaModel.setCantidad(formulario.getTxtfCantidad());
            ventaModel.setValorTotal(formulario.getTxtfTotal());
            ventaModel.setFecha(formulario.getTxtfFecha());
            
            ventaDao.create(ventaModel);
            ventaDao.update(ventaModel);
            ventas.llenarTabla(ventaModel);
            
            formulario.setVisible(false);
            ventas.setVisible(true);
            
            

        });
      
    }
    void mostrarDatos() throws SQLException{
        ArrayList<Venta> venta = ventaDao.findAll();
 
        ventas.mostrarDatos(venta);
       
    }

}
