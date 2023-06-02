/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ghost.music;

import Controlador.Inventario_Controller;
import Controlador.Material_Controller;
import Controlador.Ventas_Controller;
import Controlador.Welcome_Controller;
import DataBase.Connector;
import Modelo.Admin;
import Modelo.Instrumento_Accesorio;
import Modelo.Inventario;
import Vista.InventarioListView;
import Vista.Material_Formulario;
import Vista.Material_Tabla;
import Vista.Ventas_Formulario;
import Vista.Ventas_Tabla;
import Vista.Welcome;
import java.sql.SQLException;


public class GhostMusic {
    public static void main(String[] args) throws SQLException {
        String nombre = null;
        String correo = null;
        String nombAd = null;
        char[] clave = null;
        Admin admin = new Admin(nombAd,clave);
        Welcome welcome = new Welcome();
        InventarioListView inventarioView = new InventarioListView();
        Inventario inventarioModel = null;
        Instrumento_Accesorio inst = null;
        Ventas_Tabla ventasTbl = new Ventas_Tabla();
        Ventas_Formulario ventasFml = new Ventas_Formulario();
        Material_Tabla proveedoresTbl = new Material_Tabla();
        Material_Formulario proveedoresFml = new Material_Formulario();

        
        Welcome_Controller wel_Controller = new Welcome_Controller(welcome,inventarioView,admin);
        Inventario_Controller inv_Controller = new Inventario_Controller(inventarioView,inventarioModel,inst,ventasTbl, proveedoresTbl);
        Ventas_Controller vent_Controller = new Ventas_Controller(ventasTbl,inventarioView, ventasFml);
        Material_Controller prov_Controller = new Material_Controller(proveedoresTbl,inventarioView,proveedoresFml);
        
        
    }    
}
