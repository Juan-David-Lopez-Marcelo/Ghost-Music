/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoInterfaces;

import Modelo.Cliente;
import Modelo.Instrumento_Accesorio;
import Modelo.Venta;
import java.util.ArrayList;

public interface Ventas_Interface {
    public void update(Venta venta, Instrumento_Accesorio ins,Cliente cli);
    public void create(Venta venta, Instrumento_Accesorio ins,Cliente cli);
    public void deleteById(int id);
    public Venta findById(int id);
    public ArrayList<Venta> findAll();
    public ArrayList<Instrumento_Accesorio> findAll2();  
    public ArrayList<Cliente> findAll3(); 
}
