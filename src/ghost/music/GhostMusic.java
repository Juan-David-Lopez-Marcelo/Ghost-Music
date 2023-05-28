/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ghost.music;

import Controlador.Inventario_Controller;
import DataBase.Connector;
import Modelo.Instrumento_Accesorio;
import Modelo.Inventario;
import Vista.InventarioListView;
import Vista.Ventas_Formulario;

/**
 *
 * @author Usuario
 */
public class GhostMusic {
    public static void main(String[] args) {
        InventarioListView inventarioView = new InventarioListView();
        Inventario inventarioModel = null;
        Instrumento_Accesorio inst = null;
        Ventas_Formulario ventas = new Ventas_Formulario();
    
        Inventario_Controller controller = new Inventario_Controller(inventarioView,inventarioModel,inst,ventas);
    
    
    }
    
    /*public static void main(String[] args) {
       Connector connection=new Connector();
    }*/
    
}
