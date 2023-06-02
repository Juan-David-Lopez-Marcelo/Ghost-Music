/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoInterfaces;

import Modelo.Inventario;
import java.util.ArrayList;

public interface Inventario_Interface {
    
    public void update(Inventario inv);
    public void create(Inventario inv);
    public void deleteById(int id);
    public Inventario findById(int id);
    public ArrayList<Inventario> findAll();
    
}
