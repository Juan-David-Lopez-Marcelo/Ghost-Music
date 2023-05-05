/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Instrumento_Accesorio {
    
    private String nombre;
    private String marca_modelo;
    private double precio;

    public Instrumento_Accesorio(String nombre, String marca_modelo, double precio) {
        this.nombre = nombre;
        this.marca_modelo = marca_modelo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca_modelo() {
        return marca_modelo;
    }

    public void setMarca_modelo(String marca_modelo) {
        this.marca_modelo = marca_modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
