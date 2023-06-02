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
public class Venta extends Instrumento_Accesorio{
    
    private int id;
    private String nombre_cli;
    private String correo_cli;
    private double valorTotal;
    private LocalDate fecha;

    public Venta(String nombre, String marca_modelo, int cantidad,String nombre_cli,String correo_cli,int id,double valorTotal, LocalDate fecha) {
        
        super(nombre,marca_modelo,cantidad);
        this.id = id;
        this.nombre_cli = nombre_cli;
        this.correo_cli = correo_cli;
        this.valorTotal = valorTotal;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getCorreo_cli() {
        return correo_cli;
    }

    public void setCorreo_cli(String correo_cli) {
        this.correo_cli = correo_cli;
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
