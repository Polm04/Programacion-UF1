/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uf6.categprodui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pomo6989
 */
public class DBconnect {
    
    static final String DRIVER = "com.mysql.cj.jdbc.Driver";//donde esta el driver
    static final String PROTOCOL = "jdbc:mysql:";//tipos de protocolo
    static final String HOST = "127.0.0.1";//direccion donde esta la base de datos
    static final String BD_NAME = "storedb";//que base de datos quieres conectarte
    static final String USER = "storeusr";//usuario que utilizas
    static final String PASSWORD = "storepsw";//la contraseña

    public static void loadDriver() throws ClassNotFoundException {
        //getConnectionProperties(); better if connection properties are read from a configuration file
        Class.forName(DRIVER);
    }
    
    /**
     * gets and returns a connection to database
     *
     * @return connection
     * @throws java.sql.SQLException
     */
    public static Connection getConnection() throws SQLException {
        final String BD_URL = String.format("%s//%s/%s", PROTOCOL, HOST, BD_NAME);
        Connection conn;
        conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
        return conn;
    }
}
