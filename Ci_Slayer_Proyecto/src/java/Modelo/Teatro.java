/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JuanPablo
 */
public class Teatro implements ZonaComun {
    
    private String nombre;
    private int capacidad;
    private String estado;
    private String tipo = "Teatro";

    public Teatro() {
    }

    public Teatro(String nombre, int capacidad, String estado, String tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estado = estado;
        this.tipo = "Teatro";       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String isEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
 
    public String toString(){
    
        return "Salon{"+"nombre=" + nombre + ", capacidad=" + capacidad + ", estado="+ estado +'}';
    }   

    @Override
    public Salon getSalon() {
        return ( null );
    }

    @Override
    public Teatro getTeatro() {
        return ( this );
    }
    @Override
    public Laboratorio getLaboratorio() {
        return ( null );
    }
    
     
}
