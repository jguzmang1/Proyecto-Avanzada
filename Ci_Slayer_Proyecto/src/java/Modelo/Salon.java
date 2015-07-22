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
public class Salon implements ZonaComun{
    
    private String numero;
    private int capacidad;
    private String estado;
    private String tipo = "Salon";

    public Salon() {
        
        this.estado = "Disponible";
  
    }

    public Salon(String numero, int capacidad, String estado, String tipo){
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = estado;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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
    
        return "Salon{"+"numero=" + numero + ", capacidad=" + capacidad + ", estado="+ estado +'}';
    }

    @Override
    public Salon getSalon() {
        return ( this );
    }

    @Override
    public Teatro getTeatro() {
        return ( null );
    }

    @Override
    public Laboratorio getLaboratorio() {
        return ( null );
    }
  
}
