/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import BD.UsuarioBD;
import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author JuanPablo
 */
public class UsuarioMgr {
    
    ArrayList usuarios = new ArrayList();
    Usuario usuario = null;

    public UsuarioMgr() {
    }
    
public ArrayList getUsuarios() {
        return usuarios;
    }

    public void setusuarios(ArrayList usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void agregarUsuario(String id,String codigo, String nombre,String correo){
        Usuario usuario = new Usuario(id, codigo , nombre, correo);
        UsuarioBD.mgr.save(usuario, Boolean.TRUE);
    }
    
    public ArrayList consultarUsuarios(){
        usuarios = UsuarioBD.mgr.getUsuarios();
        return usuarios;
    }
    
    public Usuario getUsuario(String id){
        usuario = UsuarioBD.mgr.getItem(id);
        return usuario;
    }
    
    public void eliminarUsuario(Usuario usuario){
        
        UsuarioBD.mgr.delete(usuario);
    }
    
    public void modificarUsuario(Usuario usuario){
        
        UsuarioBD.mgr.save(usuario, Boolean.FALSE);
    }
    
    public void buscarUsuario(String valor){
        usuario =  UsuarioBD.mgr.getUsuario(valor);
    }
    
    public ArrayList buscarUsuarios(String campo, String valor){
        return UsuarioBD.mgr.consultarUsuarios(campo, valor);
    }

    
    
  }