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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Material_Controller {
    Material_Tabla material;
    InventarioListView inventarioView;
    Material_Formulario formulario;
    Material matModel;
    Material_Dao matDao;
    
    public Material_Controller(Material_Tabla material,InventarioListView inventarioView,Material_Formulario formulario,Material matModel) throws SQLException{
        this.material = material;
        this.inventarioView = inventarioView;
        this.formulario = formulario;
        this.matModel = matModel;
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
            matDao.deleteById(material.leerRegistro());
            material.limpiarTabla();
            try {
                mostrarDatos();
            } catch (SQLException ex) {
                Logger.getLogger(Ventas_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        formulario.cambiarTablaProveedor((ActionEvent e) -> { 
            material.setVisible(true);
            formulario.setVisible(false);
        });
        formulario.añadirMat((ActionEvent e) -> { 
            matModel.setId(formulario.getTxtfId());
            matModel.setNombre_prov(formulario.getTxtfNombre());
            matModel.setCorreo_prov(formulario.getTxtfCorreo());
            matModel.setNombre(formulario.getTxtfInstrumento());
            matModel.setMarca_modelo(formulario.getTxtfMarca());
            matModel.setCantidad(formulario.getTxtfCantidad());
            matModel.setValorTotal(formulario.getTxtfValor());
            matModel.setFecha(formulario.getTxtfFecha());
            
            matDao.create(matModel);
            matDao.update(matModel);
            material.llenarTabla(matModel);
            
            formulario.setVisible(false);
            material.setVisible(true);
        });
        
    }
    void mostrarDatos() throws SQLException{
        ArrayList<Material> mats = matDao.findAll();
 
        material.mostrarDatos(mats);

    }
}
