/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author JuanPablo
 */
public class Teatro implements ZonaComun {
    
    private String nombre;
    private int capacidad;
    private boolean estado;
    private String tipo = "Teatro";

    public Teatro() {
    }

    public Teatro(String nombre, int capacidad, boolean estado, String tipo) {
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
 
    public String toString(){
    
        return "Salon{"+"nombre=" + nombre + ", capacidad=" + capacidad + ", estado="+ estado + ", tipo="+ tipo +'}';
    }   

    @Override
    public Salon getSalon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Teatro getTeatro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Laboratorio getLaboratorio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
}
