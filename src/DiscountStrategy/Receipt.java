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
    ReceiptOutputStrategy receiptOutput;
    PersistenceStrategy database;
    
    public Receipt(){
        ConsoleOuput console = new ConsoleOuput();
        receiptOutput = console;
        
        receiptOutput.outputReceipt();
    }
}
