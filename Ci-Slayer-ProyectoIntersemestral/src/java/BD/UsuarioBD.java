/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Modelo.Usuario;
import Services.BDManager;
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
    protected void addObject(ArrayList v, ResultSet rs){
        v.add(new Usuario(rs));
    }
    public void save(Usuario usuario,Boolean valor){
        if(valor){
            mgr.execute("insert into usuario(codigo,nombre,correo) values('"+
                    usuario.getCodigo()+"','"+
                    usuario.getNombre()+"','"+
                    usuario.getCorreo()+"','");
        }else{
            mgr.execute("update usuario set nombre = '"+usuario.getNombre()+"',"
                    + "correo = '"+usuario.getCorreo()+"',"
                    + "where codigo = '"+usuario.getCodigo()+"'");
        }
    }
     public Usuario getUsuario(String codigo){
        ArrayList h = executeQuery("select * from usuario where codigo = '"+codigo+"' ");
        if(h.size() > 0){
            return (Usuario) h.get(0);
        }
        Usuario usuario = null;
        return usuario;
    }
     public ArrayList getUsuarios() {
        ArrayList e = executeQuery("select id,codigo,nombre,correo from usuario");
        return e;
    }
    
    
}
