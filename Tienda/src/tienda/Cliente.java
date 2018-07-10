/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author ESFOT
 */
public class Cliente {
    String nombre;
    String cedula;
    String nombreFruta;
    double precio;

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Cliente(String nombre, String cedula, String nombreFruta, double precio) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.nombreFruta = nombreFruta;
        this.precio = precio;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", cedula=" + cedula + ", nombreFruta=" + nombreFruta + ", precio=" + precio + '}';
    }
    
    
            
}
