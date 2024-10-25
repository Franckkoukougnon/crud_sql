package org.example;

import java.sql.*;

public class Crud_sql {

    public void inserInto(String name, String email) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "bordeaux@33170";
        String query = "INSERT INTO User (name, email) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setString(2, email);
           int rowInserted = statement.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("A new user has been inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void getAllUsers() {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "bordeaux@33170";
        String query = "SELECT * FROM User";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.printf("ID: %d, Name: %s, Email: %s%n", id, name, email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateUserEmail(int id, String newEmail) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "bordeaux@33170";
        String query = "UPDATE User SET email = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, newEmail);
            stmt.setInt(2, id);
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Email mis à jour avec succès !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateUserName(int id, String newName) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "bordeaux@33170";
        String query = "UPDATE User SET name = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, newName);
            stmt.setInt(2, id);
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Nom mis à jour avec succès !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "bordeaux@33170";
        String query = "DELETE FROM User WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Utilisateur supprimé avec succès !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}

