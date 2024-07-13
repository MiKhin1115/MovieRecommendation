/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieproject;

/**
 *
 * @author mi_khin_hanthar_soe
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DataBase {
    public Connection getConnected() {
        Connection con = null;
        try {
            // Load the SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");
            // Establish a connection to the database
            con = DriverManager.getConnection("jdbc:sqlite:users.db");

            if (con != null) {
                System.out.println("Database connection success ....");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return con;  // Make sure to return the connection if successful
    }
}