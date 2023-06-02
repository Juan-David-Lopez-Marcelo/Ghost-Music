/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dao.Inventario_Dao;
import Modelo.Instrumento_Accesorio;
import Modelo.Inventario;
import Vista.InventarioListView;
import Vista.Material_Tabla;
import Vista.Ventas_Formulario;
import Vista.Ventas_Tabla;
import java.awt.event.ActionEvent;
import static java.lang.System.exit;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Inventario_Controller {
    InventarioListView inventarioView;
    Inventario inventarioModel;
    Instrumento_Accesorio inst;
    Ventas_Tabla ventasTbl;
    Material_Tabla proveedoresTbl;
    Inventario_Dao invDao;
    
    
    public Inventario_Controller(InventarioListView inventarioView, Inventario inventarioModel,Instrumento_Accesorio inst,Ventas_Tabla ventasTbl, Material_Tabla proveedoresTbl) throws SQLException {
        this.inventarioView = inventarioView;
        this.inventarioModel = inventarioModel;
        this.inst = inst;
        this.ventasTbl = ventasTbl;
        this.proveedoresTbl = proveedoresTbl;
        this.invDao = new Inventario_Dao();
        
        mostrarDatos();
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
    void mostrarDatos() throws SQLException{
        ArrayList<Inventario> invs = invDao.findAll();
 
        inventarioView.mostrarDatos(invs);
    }
}
