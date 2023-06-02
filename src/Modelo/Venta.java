/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class Venta extends Instrumento_Accesorio{
    
    private int id;
    private String nombre_cli;
    private String correo_cli;
    private double valorTotal;
    private String fecha;

    public Venta(int id,String nombre_cli,String correo_cli,String nombre, String marca_modelo, int cantidad,double valorTotal, String fecha) {
        
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
