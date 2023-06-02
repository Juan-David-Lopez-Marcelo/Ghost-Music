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
import Modelo.Material;
import Modelo.Venta;
import Vista.InventarioListView;
import Vista.Material_Formulario;
import Vista.Material_Tabla;
import Vista.Ventas_Formulario;
import Vista.Ventas_Tabla;
import Vista.Welcome;
import java.sql.SQLException;


public class GhostMusic {
    public static void main(String[] args) throws SQLException {
        //Atributos admin
        String nombAdm = null ;
        char[] clave = null ;
        Admin admin = new Admin(nombAdm,clave);
        //Atributos venta
        int id = 0,cantidad = 0;
        String nombre_cli = null,correo_cli = null,nombre = null,marca_modelo = null,fecha = null;
        double valorTotal = 0;
        Venta venta = new Venta(id,nombre_cli,correo_cli, nombre,marca_modelo,cantidad,valorTotal,fecha);
        //Atributos material
        int id1 = 0,cantidad1 = 0;
        String nombre_prov = null,correo_prov = null,nombre1 = null,marca_modelo1 = null,fecha1 = null;
        double valorTotal1 = 0;
        Material material = new Material(id1,nombre_prov,correo_prov, nombre1,marca_modelo1,cantidad1,valorTotal1,fecha1);
        //Creacion de modelos y vistas
        Welcome welcome = new Welcome();
        InventarioListView inventarioView = new InventarioListView();
        Inventario inventarioModel = null;
        Instrumento_Accesorio inst = null;
        Ventas_Tabla ventasTbl = new Ventas_Tabla();
        Ventas_Formulario ventasFml = new Ventas_Formulario();
        Material_Tabla proveedoresTbl = new Material_Tabla();
        Material_Formulario proveedoresFml = new Material_Formulario();

        //Creacion de controllers
        Welcome_Controller wel_Controller = new Welcome_Controller(welcome,inventarioView,admin);
        Inventario_Controller inv_Controller = new Inventario_Controller(inventarioView,inventarioModel,inst,ventasTbl, proveedoresTbl);
        Ventas_Controller vent_Controller = new Ventas_Controller(ventasTbl,inventarioView, ventasFml,venta);
        Material_Controller prov_Controller = new Material_Controller(proveedoresTbl,inventarioView,proveedoresFml,material);
        
        
    }    
}
