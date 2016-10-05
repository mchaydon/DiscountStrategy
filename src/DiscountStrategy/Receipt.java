/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountStrategy;

/**
 *
 * @author Mike
 */
public class Receipt {
    private Customer customer; 
    private DatabaseStrategy db;

    
    public Receipt(String customerNumber, DatabaseStrategy db) {
        customer = findCustomerById(customerNumber);
        this.db = db;
    }

    public final Customer findCustomerById(String customerNumber){ 
        return db.findCustomerById(customerNumber);
    }
}
