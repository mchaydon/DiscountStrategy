/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountStrategy;

import javax.swing.JOptionPane;

/**
 *
 * @author Mike
 */
public class Register {
    private Receipt receipt;
    
    public final void startNewTransaction(String customerNumber, DatabaseStrategy db){
        try {
        receipt = new Receipt(customerNumber, db);
        } catch (IllegalArgumentException iae){
            customerNumber = JOptionPane.showInputDialog(iae.getMessage());
            startNewTransaction(customerNumber, db);
        }
    }
    
    public final void addProductToTransaction(String id, int quantity){
        try {
        receipt.AddProductToSale(id, quantity);
        } catch (IllegalArgumentException iae){
            JOptionPane.showMessageDialog(null, iae.getMessage());
        }
    }
    
    public final void endCurrentTransaction(ReceiptOutputStrategy output){
        receipt.endSale(output);
    }
    

    
}
