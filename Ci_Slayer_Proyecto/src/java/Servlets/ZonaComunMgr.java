/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Modelo.ZonaComun;
import java.sql.Connection;
import java.util.ArrayList;



/**
 *
 * @author JuanPablo
 */
public class ZonaComunMgr {
    
  ArrayList zonascomunes = new ArrayList();
    ZonaComun zonacomun = null;

    public ZonaComunMgr() {
    }
    
     public ArrayList getZonasComunes() {
        return zonascomunes;
    }
      public void setZonasComunes(ArrayList zonascomunes) {
        this.zonascomunes = zonascomunes;
    }
      public ZonaComun getZonaComun() {
        return zonacomun;
    }
    public void setZonaComun(ZonaComun zonacomun) {
        this.zonacomun = zonacomun;
    }  
    
}
