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
public class AddOrder {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/cakedb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";


    public void addOrder(int orderID, String custName, int totAmmount, String orderDate) throws SQLException {
        String query = "INSERT INTO orders (order_Date,order_ID , total_Ammount, cus_Name) VALUES (?, ?, ?, ?)";
        
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setString(1,orderDate);
            statement.setInt(2, orderID);
            statement.setInt(3, totAmmount);
            statement.setString(4, custName);

           
            
                statement.executeUpdate();
        } catch (SQLException e) {
            
        }
    }

   
        
}
