/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author @Sewwandi <your.name at your.org>
 */
public class RemoveCustomer {
     public static void removeCustomer(int custID) throws SQLException {
        String sql = "DELETE FROM customers WHERE cus_ID = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, custID);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("No Customer found with cakecode: " + custID);
            }
        } catch (SQLException e) {
 
            
        }
    }
}
