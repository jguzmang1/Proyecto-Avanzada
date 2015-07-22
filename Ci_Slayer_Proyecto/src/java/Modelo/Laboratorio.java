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
public class Laboratorio implements ZonaComun {
    
    private String numero;
    private int capacidad;
    private String estado;
    private String tipo = "Laboratorio";

    public Laboratorio() {
         this.estado = "Disponible";
         this.tipo = "Laboratorio";
    }

    public Laboratorio(String numero, int capacidad, String estado,String tipo ) {
        this.numero = numero;
        this.capacidad = capacidad;
       
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

    public String toString(){
    
        return "Laboratorio{"+"numero=" + numero + ", capacidad=" + capacidad + ", estado="+ estado +", tipo="+ tipo +'}';
    }     

    @Override
    public Salon getSalon() {
        return ( null );
    }

    @Override
    public Teatro getTeatro() {
        return ( null );
    }

    @Override
    public Laboratorio getLaboratorio() {
        return (this);
    }
}
