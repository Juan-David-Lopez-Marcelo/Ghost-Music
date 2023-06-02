/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoInterfaces;

import Modelo.Instrumento_Accesorio;
import Modelo.Material;
import Modelo.Proveedor;
import java.util.ArrayList;


public interface Proveedores_Interface {
    public void update(Proveedor prov, Instrumento_Accesorio ins,Material mat);
    public void create(Proveedor prov, Instrumento_Accesorio ins,Material mat);
    public void deleteById(int id);
    public Proveedor findById(int id);
    public ArrayList<Proveedor> findAll();
    public ArrayList<Instrumento_Accesorio> findAll2();  
    public ArrayList<Material> findAll3(); 
}
