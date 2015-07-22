/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Modelo.Reserva;
import Servicio.BDManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author JuanPablo
 */
public class ReservaBD extends BDManager {
      public static ReservaBD mgr = new ReservaBD();

    public ReservaBD() {
    }
    
    @Override
    protected void addObject(ArrayList v, ResultSet rs) {
        v.add(new Reserva(rs));
    }
     public Reserva getItem(String id){
        ArrayList v = executeQuery("SELECT * FROM reserva WHERE id = " + id + " ");
        if (v.size() > 0) {
            return (Reserva) v.get(0);
        }
        return new Reserva();
    }
     
     public Reserva getReserva(String numero){
        ArrayList v = executeQuery("SELECT * FROM reserva WHERE numero = '" + numero + "' ");
        if (v.size() > 0) {
            return (Reserva) v.get(0);
        }
        Reserva reserva = null;
        return reserva;
    }
public void save(Reserva reserva, Boolean valor){
        if (valor) {
            mgr.execute("INSERT INTO reserva (id, fechaReserva, horaReserva, usuario, zonaComun) VALUES ('" + 
                        
                        reserva.getid() + "', '" +
                        reserva.getFechaReserva() + "', '" +
                        reserva.getHoraReserva() + "', '" +
                        reserva.getUsuario() + "')"+
                        reserva.getZonacomun() + "')"
                    );
        } else {
            mgr.execute("UPDATE reserva SET zonacomun = '" + reserva.getZonacomun() + 
                        "', fechaReserva = '" + reserva.getFechaReserva() +
                        "', horaRererva = '" + reserva.getHoraReserva() +
                        "', usuario = '" + reserva.getUsuario() +
                        "' WHERE id = " + reserva.getid() + " "
            );
        }
    }
    
    public void delete(Reserva reserva){
        mgr.execute("DELETE FROM reserva WHERE id = " + reserva.getid() + " ");
    }
    
    public ArrayList<Reserva> getReservas(){
        ArrayList<Reserva> v = executeQuery("SELECT id, fechaReserva, horaReserva, usuario, zonaComun FROM Reserva");
        return v;
    }
    
    public ArrayList consultarReservas(String campo, String valor){
        ArrayList v = executeQuery("SELECT * FROM reserva WHERE " + campo + " = " + valor + " ");
        return v;
    }
}
