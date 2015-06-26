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
public class Universidad {
    
    private static Universidad universidad;
    private String nombre;
    private String direccion;
    private String telefono;
    
    public Universidad() {
        nombre="Universidad central";
        telefono=" 3239868 ";
        direccion=" Carrera 5 No 21-32 Bogota Colombia";
    }
    public static Universidad getUniversidad() {
        return universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    public static Universidad getInstance(){
        if(universidad==null)
           universidad= new Universidad();
        return universidad;
    }
    private static class UniversidadHolder {
        
        private static final Universidad INSTANCE = new Universidad();
    }

   
 
}
