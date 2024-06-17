/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AddCake;
import Model.RemoveCake;
import java.sql.SQLException;

/**
 *
 * @author @Sewwandi <your.name at your.org>
 */
public class CakeController {
    public static void addCake(int cakeCode, String cakeName, String weight, String description, String price) 
            throws SQLException {
        AddCake addCake = new AddCake();
        addCake.addCake(cakeCode, cakeName, weight, description, price);

}
    public void removeCake(int cakeCode) throws SQLException {
        RemoveCake.removeCake(cakeCode);
    }
}
