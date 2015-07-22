/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;


import BD.ReservaBD;
import Modelo.Reserva;
import Modelo.Usuario;
import Modelo.ZonaComun;
import java.util.ArrayList;

/**
 *
 * @author JuanPablo
 */
public class ReservaMgr {
    
    ArrayList reservas = new ArrayList();
    Reserva reserva = null;

    public ReservaMgr() {
    }
public ArrayList getReservas() {
        return reservas;
    }

    public void setreservas(ArrayList reservas) {
        this.reservas = reservas;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    public void agregarReserva(String id,String fechaReserva, String horaReserva,Usuario usuario, ZonaComun zonaComun ){
        Reserva reserva = new Reserva(id, fechaReserva, horaReserva, usuario, zonaComun);
        ReservaBD.mgr.save(reserva, Boolean.TRUE);
    }
    
    public ArrayList consultarReservas(){
        reservas = ReservaBD.mgr.getReservas();
        return reservas;
    }
    
    public Reserva getReserva(String id){
        reserva = ReservaBD.mgr.getItem(id);
        return reserva;
    }
    
    public void eliminarReserva(Reserva reserva){
        
        ReservaBD.mgr.delete(reserva);
    }
    
    public void modificarReserva(Reserva reserva){
        
        ReservaBD.mgr.save(reserva, Boolean.FALSE);
    }
    
    public void buscarReserva(String valor){
        reserva =  ReservaBD.mgr.getReserva(valor);
    }
    
    public ArrayList buscarReservas(String campo, String valor){
        return ReservaBD.mgr.consultarReservas(campo, valor);
    }

    
    
  }