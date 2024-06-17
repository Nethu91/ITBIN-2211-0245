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

public class RemoveCake {
    public static void removeCake(int cakeCode) throws SQLException {
        String sql = "DELETE FROM cakes WHERE cakecode = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, cakeCode);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("No cake found with cakecode: " + cakeCode);
            }
        } catch (SQLException e) {
            throw new SQLException("Error removing cake: " + e.getMessage(), e);
        }
    }
}
