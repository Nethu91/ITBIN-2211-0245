/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AddOrder;
import Model.RemoveCustomer;
import java.sql.SQLException;

/**
 *
 * @author @Sewwandi <your.name at your.org>
 */
public class OrderController {
    public static void addOrder(int orderID, String custName, int totAmmount, String orderDate) 
            throws SQLException {
        AddOrder addOrder = new AddOrder();
        addOrder.addOrder(orderID, custName, totAmmount, orderDate);
}
    public void removeOrder(int orderID) throws SQLException {
        RemoveCustomer.removeCustomer(orderID);
    }
}
