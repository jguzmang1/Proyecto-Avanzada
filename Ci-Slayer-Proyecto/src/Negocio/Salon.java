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
public class Salon implements ZonaComun{
    
    private String numero;
    private int capacidad;
    private boolean estado;
    private String tipo = "Salon";

    public Salon() {
        
        
    }

    public Salon(String numero, int capacidad, boolean estado, String tipo){
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
    
        return "Salon{"+"numero=" + numero + ", capacidad=" + capacidad + ", estado="+ estado + ", tipo="+ tipo +'}';
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
