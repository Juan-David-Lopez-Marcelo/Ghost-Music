/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoInterfaces;

import Modelo.Venta;
import java.util.ArrayList;

public interface Ventas_Interface {
    public void update(Venta venta);
    public void create(Venta venta);
    public void deleteById(int id);
    public Venta findById(int id);
    public ArrayList<Venta> findAll();

}
