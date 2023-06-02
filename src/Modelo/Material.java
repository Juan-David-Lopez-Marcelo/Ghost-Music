/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Material extends Instrumento_Accesorio{
    
    private int id;
    private String nombre_prov;
    private String correo_prov;
    private double valorTotal;
    private LocalDate fecha;

    public Material(String nombre, String marca_modelo, int cantidad,String nombre_prov,String correo_prov, double valorTotal, LocalDate fecha) {
        super(nombre,marca_modelo,cantidad);
        this.id = id;
        this.nombre_prov = nombre_prov;
        this.correo_prov = correo_prov;
        this.valorTotal = valorTotal;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_prov() {
        return nombre_prov;
    }

    public void setNombre_prov(String nombre_prov) {
        this.nombre_prov = nombre_prov;
    }

    public String getCorreo_prov() {
        return correo_prov;
    }

    public void setCorreo_prov(String correo_prov) {
        this.correo_prov = correo_prov;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    
    
}
