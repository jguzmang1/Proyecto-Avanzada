/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Vista;

/**
 *
 * @author JuanPablo
 */
public class FactoryTipoZonaComun {

    public FactoryTipoZonaComun() {
    }
    
    public String getTipoZonaComun(){
            return (Vista.tipoZonaComun);
    }
    public ZonaComun getZonaComun(){
            ZonaComun zonacomun = null;
                if(getTipoZonaComun().equals("Salon")){
                   
                    zonacomun = new Salon();
        }
        if(getTipoZonaComun().equals("Teatro")){
                    
            zonacomun = new Teatro();
        }
        if(getTipoZonaComun().equals("Laboratorio")){
                   
            zonacomun = new Laboratorio();
        }
                return zonacomun;
    }
 
}
