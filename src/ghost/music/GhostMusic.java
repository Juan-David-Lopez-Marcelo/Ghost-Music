/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ghost.music;

import Controlador.Inventario_Controller;
import Controlador.Proveedores_Controller;
import Controlador.Ventas_Controller;
import DataBase.Connector;
import Modelo.Instrumento_Accesorio;
import Modelo.Inventario;
import Vista.InventarioListView;
import Vista.Proveedores_Formulario;
import Vista.Proveedores_Tabla;
import Vista.Ventas_Formulario;
import Vista.Ventas_Tabla;

/**
 *
 * @author Usuario
 */
public class GhostMusic {
    public static void main(String[] args) {
        InventarioListView inventarioView = new InventarioListView();
        Inventario inventarioModel = null;
        Instrumento_Accesorio inst = null;
        Ventas_Tabla ventasTbl = new Ventas_Tabla();
        Ventas_Formulario ventasFml = new Ventas_Formulario();
        Proveedores_Tabla proveedoresTbl = new Proveedores_Tabla();
        Proveedores_Formulario proveedoresFml = new Proveedores_Formulario();
    
        Inventario_Controller inv_Controller = new Inventario_Controller(inventarioView,inventarioModel,inst,ventasTbl, proveedoresTbl);
        Ventas_Controller vent_Controller = new Ventas_Controller(ventasTbl,inventarioView, ventasFml);
        Proveedores_Controller prov_Controller = new Proveedores_Controller(proveedoresTbl,inventarioView,proveedoresFml);
       
    }    
}
