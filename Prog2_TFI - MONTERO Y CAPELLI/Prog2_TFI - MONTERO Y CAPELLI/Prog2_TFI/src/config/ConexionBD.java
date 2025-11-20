/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;
/**
 *
 * @author Rama Montero
 */
public class ConexionBD {

    private static final String PROPERTIES_FILE = "/config/db.properties";

    public static Connection getConnection() {
        Connection conn = null;

        try {
            // Cargar driver (NECESARIO EN NETBEANS)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Cargar archivo properties
            Properties props = new Properties();
            InputStream input = ConexionBD.class.getResourceAsStream(PROPERTIES_FILE);
            props.load(input);

            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String password = props.getProperty("db.password");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully to tfi_bdi");

        } catch (Exception e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }

        return conn;
    }
}