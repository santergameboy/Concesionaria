package com.santer.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conector {
    private static Connection connection = null;

    public static Connection getConnection(){
        if (connection!=null){
            return connection;
        }else {
            try {
                Properties properties = new Properties();
                properties.load(new FileInputStream("bd.properties"));

                String driver = properties.getProperty("driver");
                String url = properties.getProperty("url");
                String user = properties.getProperty("user");
                String password = properties.getProperty("password");

                Class.forName(driver);

                connection = DriverManager.getConnection(url,user,password);
            } catch (IOException e) {
                System.out.println("ERROR EN EL ARCHIVO DE PROPIEDADES"+ e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("ERROR AL CARGAR EL DRIVER"+e.getMessage());
            } catch (SQLException e) {
                System.out.println("ERRORE EN LA CONEXION DE LA BD"+ e.getMessage());
            }
        }
        return connection;
    }
}