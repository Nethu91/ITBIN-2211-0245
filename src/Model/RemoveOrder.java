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
public class RemoveOrder {
    public static void removeOrder(int orderID) throws SQLException {
        String sql = "DELETE FROM orders WHERE order_ID = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, orderID);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("No Customer found with cakecode: " + orderID);
            }
        } catch (SQLException e) {
 
            
        }
    }
}
