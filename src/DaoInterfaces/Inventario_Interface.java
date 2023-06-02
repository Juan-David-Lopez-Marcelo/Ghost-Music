/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoInterfaces;

import Modelo.Inventario;
import Modelo.Instrumento_Accesorio;
import java.util.ArrayList;

public interface Inventario_Interface {
    public void update(Inventario inv, Instrumento_Accesorio ins);
    public void create(Inventario inv, Instrumento_Accesorio ins);
    public void deleteById(int id);
    public Inventario findById(int id);
    public ArrayList<Inventario> findAll();
    public ArrayList<Instrumento_Accesorio> findAll2();  
}
