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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatabaseStrategy db = new FakeDatabase(); 
        Register register = new Register();
        register.startNewTransaction("C200", db);
        register.addProductToSale("101", 2);
        register.endCurrentTransaction();
    }
    
}
