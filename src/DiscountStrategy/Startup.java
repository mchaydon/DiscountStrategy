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
        DatabaseStrategy db = new ArrayDatabase(); 
        Register register = new Register();
        
        register.startNewTransaction("C100", db);
        register.addProductToTransaction("101", 40);
        register.addProductToTransaction("J22", 2);
        register.addProductToTransaction("B71", 1);
        register.endCurrentTransaction(new ConsoleOuput());
        register.endCurrentTransaction(new GuiOutput());
        
        register.startNewTransaction("C101", db);
        register.addProductToTransaction("101", 1);
        register.addProductToTransaction("J22", 22);
        register.addProductToTransaction("R32", 5);
        register.addProductToTransaction("B71", 7);
        register.endCurrentTransaction(new ConsoleOuput());
        register.endCurrentTransaction(new GuiOutput());
    }
    
}
