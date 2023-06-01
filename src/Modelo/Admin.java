/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Admin extends Model {
    
    private char[] clave;
    
    public Admin(String nombre, char[] clave) {
        super(nombre);
        this.clave = clave;
    }

    public char[] getClave() {
        return clave;
    }

    public void setClave(char[] clave) {
        this.clave = clave;
    }

}
