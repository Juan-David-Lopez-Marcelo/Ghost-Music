/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoInterfaces;

import Modelo.Material;
import java.util.ArrayList;


public interface Material_Interface {
    
    public void update(Material mat);
    public void create(Material mat);
    public void deleteById(int id);
    public Material findById(int id);
    public ArrayList<Material> findAll();

}
