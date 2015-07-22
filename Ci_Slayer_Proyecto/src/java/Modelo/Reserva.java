/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;

/**
 *
 * @author JuanPablo
 */
public class Reserva {
    
    private String id;
    private String fechaReserva;
    private String horaReserva;
    private Usuario usuario;
    private ZonaComun zonacomun;

    public Reserva() {
    }
    public Reserva(ResultSet rs) {
        try {
            id = rs.getString("id");
            fechaReserva = rs.getString("fechaReserva");
            horaReserva = rs.getString("horaReserva");
        } catch (Exception e) {
        }
    }

    public Reserva(String id, String fechaReserva, String horaReserva, Usuario usuario, ZonaComun zonacomun) {
        this.id = id;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.usuario = usuario;
        this.zonacomun = zonacomun;
    }

    public String getid() {
        return id;
    }

    public void id(String id) {
        this.id = id;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(String horaReserva) {
        this.horaReserva = horaReserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ZonaComun getZonacomun() {
        return zonacomun;
    }

    public void setZonacomun(ZonaComun zonacomun) {
        this.zonacomun = zonacomun;
    }
    
}
