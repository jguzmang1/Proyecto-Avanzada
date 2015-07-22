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
public class Usuario {
    
    private String idusuario;
    private String codigo;
    private String nombre;
    private String correo;

    public Usuario() {
    }
     public Usuario (ResultSet rs) {
        try {
            idusuario = rs.getString("idusuario");
            codigo = rs.getString("codigo");
            nombre = rs.getString("nombre");
            correo = rs.getString("correo");
        } catch (Exception e) {
        }
    } 

    public Usuario(String idusuario, String codigo, String nombre, String correo) {
        this.idusuario = idusuario;
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
