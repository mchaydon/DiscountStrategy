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
    private Product product;
    private DatabaseStrategy db;
    private LineItem[] lineItems = new LineItem[0];
    private ReceiptOutputStrategy output;
    
    
    //Accept customer number and database when creating receipt
    public Receipt(String customerNumber, DatabaseStrategy db) {
        this.db = db;
        customer = db.findCustomerById(customerNumber);
    }

    //adding a product to the sale requires a product ID and quantity, will require a discount type later
    public final void AddProductToSale(String productId, int quantity){
        product = db.findProductById(productId);
        LineItem item = new LineItem(product, quantity);     
        AddProductToArray(lineItems, item);
    }  
    
    public final void AddProductToArray(LineItem[] array, LineItem item){
        LineItem[] tempArray = new LineItem[array.length + 1];
        System.arraycopy(array, 0, tempArray, 0, array.length);
        tempArray[tempArray.length - 1] = item;
        array = tempArray;
        lineItems = array;
    }
    
    //this method will pass all the info to the output method
    public final void endSale(ReceiptOutputStrategy output){
        output.outputHeading(customer);
        output.outputLineItems(lineItems);
    }

}
