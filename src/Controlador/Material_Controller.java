/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dao.Material_Dao;
import Modelo.Material;
import Vista.InventarioListView;
import Vista.Material_Formulario;
import Vista.Material_Tabla;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Material_Controller {
    Material_Tabla material;
    InventarioListView inventarioView;
    Material_Formulario formulario;
    Material_Dao matDao;
    
    public Material_Controller(Material_Tabla material,InventarioListView inventarioView,Material_Formulario formulario) throws SQLException{
        this.material = material;
        this.inventarioView = inventarioView;
        this.formulario = formulario;
        this.matDao = new Material_Dao();
        
        mostrarDatos();
        
        material.cambiarInventario((ActionEvent e) -> { 
            material.setVisible(false);
            inventarioView.setVisible(true);  
        });
        material.cambiarFormulario((ActionEvent e) -> { 
            material.setVisible(false);
            formulario.setVisible(true);
        });
        material.eliminarMaterial((ActionEvent e) -> { 
            //Proceso para eliminar material
        });
        formulario.cambiarTablaProveedor((ActionEvent e) -> { 
            material.setVisible(true);
            formulario.setVisible(false);
        });
        formulario.añadirMat((ActionEvent e) -> { 
            //Proceso para añadir material
        });
        
    }
    void mostrarDatos() throws SQLException{
        ArrayList<Material> mats = matDao.findAll();
 
        material.mostrarDatos(mats);
        //ClientsHandler handler = new ClientsHandler();
        //ArrayList<ClientsModel> models = handler.getAllClients(); 
        //this.view.mostrarDatos(models);
    }
}
