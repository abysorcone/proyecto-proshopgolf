/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author BITS AMERICAS
 */
public class Conexion {

    private String url, driver, pass, user, db;
    private Connection connection = null;

    public Conexion() {
        driver = "com.mysql.jdbc.Driver";
        pass = "";
        db = "proshopgolf";
        user = "root";
        url = "jdbc:mysql://localhost:3306/" + db;

        try {
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("------------CONEXON: Conexion exitosa");
        } catch (Exception e) {
            System.out.println("------------CONEXON: Se presentó un error en la conexion por: " + e.toString());
        }
    }
    
    public Connection openConnection(){
        Connection conexion = connection;
        if(conexion != null){
            return connection;
        }else{
            return 
        }
    }

    public Connection closeConnection(){
        try{
        connection.close();
        connection = null;    
        }catch(Exception e){
            System.out.println("------------CONEXON: no se pude cerrar la conexion porque: "+e.toString());
        }
        return  connection;
    }
    
    public static void main(String[] args) {
        new Conexion();
    }

}
