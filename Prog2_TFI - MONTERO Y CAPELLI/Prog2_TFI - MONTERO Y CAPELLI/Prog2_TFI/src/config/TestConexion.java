/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import config.ConexionBD;
import java.sql.Connection;
/**
 *
 * @author Rama Montero
 */
public class TestConexion {
    public static void main(String[] args) {
        Connection conn = ConexionBD.getConnection();
    }
}
