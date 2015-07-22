/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Modelo.ZonaComun;
import Servicio.BDManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author JuanPablo
 */
public class ZonaComunBD extends BDManager {
    
    public static ZonaComunBD instance; 
    public static ZonaComunBD mgr = new ZonaComunBD();

    public ZonaComunBD() {
        super();
    }
    public static ZonaComunBD getInstance(){
    
        if(null == instance){
        
            instance = new ZonaComunBD();    
        }
        return instance;
    }
 }
