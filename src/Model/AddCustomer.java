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
public class AddCustomer {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/cakedb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";


    public void addCustomer(int cusTP, String cusName, String cusMail, String cusAdress, int custID) throws SQLException {
        String query = "INSERT INTO customers (cus_Name, cus_TP, cus_Email, cus_Adress,cus_ID) VALUES (?, ?, ?, ?,?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setInt(5,custID);
            statement.setInt(2, cusTP);
            statement.setString(1, cusName);
            statement.setString(3, cusMail);
            statement.setString(4, cusAdress);
           
            
                statement.executeUpdate();
        } catch (SQLException e) {
            
        }
    }

    public void addCustomer(int orderID, String custName, int totAmmount, String ordeDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
