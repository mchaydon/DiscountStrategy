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
    private Receipt receipt = new Receipt();
    
    public final void startNewTransaction(String customerNumber, DatabaseStrategy db){
        try {
        receipt = new Receipt(customerNumber, db);
        } catch (CustomerNotFoundException cnfe){
            receipt.throwError(cnfe.getMessage());
            customerNumber = JOptionPane.showInputDialog(null, "Customer ID:");
            startNewTransaction(customerNumber, db);
        }
    }
    
    public final void addProductToTransaction(String id, int quantity){
        try {
        receipt.AddProductToSale(id, quantity);
        } catch (ZeroQuantityException zqe){
            receipt.throwError(zqe.getMessage());
        } catch (ProductNotFoundEcception pnfe){
            receipt.throwError(pnfe.getMessage());
            id = JOptionPane.showInputDialog(null, "Product ID:");
            addProductToTransaction(id, quantity);
        }
    }
    
    public final void endCurrentTransaction(ReceiptOutputStrategy output){
        receipt.endSale(output);
    }
    

    
}
