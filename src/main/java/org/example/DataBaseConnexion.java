package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnexion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sqltuto";
        String user = "root";
        String password = "bordeaux@33170";


        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
        }
      catch (Exception e) {
            e.printStackTrace();


        }
    }
}
