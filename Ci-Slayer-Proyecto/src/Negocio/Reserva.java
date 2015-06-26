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
public class Reserva {
    
    private int numero;
    private String fechaReserva;
    private String horaReserva;
    private Usuario usuario;
    private ZonaComun zonacomun;

    public Reserva(int numero, String fechaReserva, String horaReserva, Usuario usuario, ZonaComun zonacomun) {
        this.numero = numero;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.usuario = usuario;
        this.zonacomun = zonacomun;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
