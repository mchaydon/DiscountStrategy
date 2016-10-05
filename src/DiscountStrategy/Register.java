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
public class Register {
    private Receipt receipt;
    
    public final void startNewTransaction(String customerNumber, DatabaseStrategy db){
        receipt = new Receipt(customerNumber, db);
    }
    
    public final void addProductToSale(String id, int quantity){
        
    }
    
    public final void endCurrentTransaction(){
        
    }
    

    
}
