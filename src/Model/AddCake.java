/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author @Sewwandi <your.name at your.org>
 */
public class AddCake {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/cakedb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";


    public void addCake(int cakeCode, String cakeName, String weight, String description, String price) throws SQLException {
        String query = "INSERT INTO cakes (cakename,cakecode, weight, description, price) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            
            

            statement.setInt(2, cakeCode);
            statement.setString(1, cakeName);
            statement.setString(4, description);
            statement.setString(5, price);
            statement.setString(3, weight);
            
                statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Error adding account: " + e.getMessage());
        }
    }
}
