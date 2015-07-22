/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Modelo.Usuario;
import Servicio.BDManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author JuanPablo
 */
  public class UsuarioBD extends BDManager{
    public static UsuarioBD mgr = new UsuarioBD();

    public UsuarioBD() {
    }

    @Override
    protected void addObject(ArrayList v, ResultSet rs) {
        v.add(new Usuario(rs));
    }
    
    public Usuario getItem(String id){
        ArrayList v = executeQuery("SELECT * FROM usuario WHERE id = " + id+ " ");
        if (v.size() > 0) {
            return (Usuario) v.get(0);
        }
        return new Usuario();
    }
    
    public Usuario getUsuario(String codigo){
        ArrayList v = executeQuery("SELECT * FROM usuario WHERE codigo = '" + codigo + "' ");
        if (v.size() > 0) {
            return (Usuario) v.get(0);
        }
        Usuario usuario = null;
        return usuario;
    }
    
    public void save(Usuario usuario, Boolean valor){
        if (valor) {
            mgr.execute("INSERT INTO usuario (id, codigo, nombre, correo) VALUES ('" + 
                        
                        usuario.getId() + "', '" +
                        usuario.getCodigo() + "', '" +
                        usuario.getNombre() + "', '" +
                        usuario.getCorreo() + "')"
                    );
        } else {
            mgr.execute("UPDATE usuario SET email = '" + usuario.getCorreo() + 
                        "', codigo = '" + usuario.getCodigo() +
                        "', nombre = '" + usuario.getNombre()+
                        "' WHERE idusuario = " + usuario.getId() + " "
            );
        }
    }
    
    public void delete(Usuario usuario){
        mgr.execute("DELETE FROM usuario WHERE id = " + usuario.getId() + " ");
    }
    
    public ArrayList<Usuario> getUsuarios(){
        ArrayList<Usuario> v = executeQuery("SELECT idusuario, codigo, nombre, correo FROM Usuario");
        return v;
    }
    
    public ArrayList consultarUsuarios(String campo, String valor){
        ArrayList v = executeQuery("SELECT * FROM usuario WHERE " + campo + " = " + valor + " ");
        return v;
    }
}
