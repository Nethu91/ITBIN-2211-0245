/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AddCustomer;
import Model.RemoveCustomer;
import java.sql.SQLException;

/**
 *
 * @author @Sewwandi <your.name at your.org>
 */
public class CustomerController {
    public static void addCustomer(int cusTP, String cusName, String cusMail, String cusAdress, int custID)
                 throws SQLException {
        AddCustomer addCustomer = new AddCustomer();
        addCustomer.addCustomer(cusTP, cusName, cusMail, cusAdress,custID);
}

    public void removeCustomer(int custID) throws SQLException {
        RemoveCustomer.removeCustomer(custID);
    }
}
