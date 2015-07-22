/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author JuanPablo
 */
public class BDManager {
    private static String BD = "ci_slayer_basedatos";
    private static String URL = "jdbc:mysql://localhost:2186/" + BD;
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USER = "root";
    private static String PASSWORD = "Umek/2186";

    public BDManager() {
    }
    
    protected void addObject(ArrayList v, ResultSet rs){
        
    }
    protected ArrayList executeQuery(String s){
        ArrayList v = new ArrayList();
        try {
            Class.forName(DRIVER);
            System.out.println("\nEstableciendo conexion ...");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            if (con == null) {
                System.out.println("DataBase conection not working");
                return v;
            }
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(s);
            while (rs.next()) {                
                addObject(v, rs);
            }
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("-------ERROR--------");
            System.out.println("SQL : " + s);
            System.out.println("Exception : " + e.getMessage());
        } catch (SQLException e){
            System.out.println("-------ERROR--------");
            System.out.println("SQL : " + s);
            System.out.println("Exception : " + e.getMessage());
        }
        return v;
    }
    protected void execute(String s){
        try {
            Class.forName(DRIVER);
            System.out.println("\nEstableciendo conexion ...");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            if (con == null) {
                System.out.println("DataBase conection not working");
                return;
            }
            Statement stm = con.createStatement();
            stm.execute(s);
            con.close();
        } catch (Exception e){
            System.out.println("-------ERROR--------");
            System.out.println("SQL : " + s);
            System.out.println("Exception : " + e.getMessage());
        }
    }
    
}
