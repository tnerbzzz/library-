/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brent_application;

/**
 *
 * @author brent
 */import java.sql.*;
public class Conn {
    private static final String URL = "jdbc:mysql://localhost:3306/signup";
    private static final String USERNAME = "brent";
    private static final String PASSWORD = "brent@123456";
     public static Connection getCon() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Error connecting to database: " + e.getMessage());
        }
    }
}      
       
        
      