/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ci.slayer.proyecto.CiSlayerProyecto;

/**
 *
 * @author JuanPablo
 */
public class FactoryTipoZonaComun {

    public FactoryTipoZonaComun() {
    }
    public String getTipoZonaComun(){
    
        return CiSlayerProyecto.tipoZonaComun;
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
