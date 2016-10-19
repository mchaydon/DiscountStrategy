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
    
    public Receipt(){
        
    }
    
    //Accept customer number and database when creating receipt
    public Receipt(String customerNumber, DatabaseStrategy db) throws CustomerNotFoundException{
        this.db = db;
        customer = db.findCustomerById(customerNumber);
        if (customer == null) {
            throw new CustomerNotFoundException();
        }
    }

    //adding a product to the sale requires a product ID and quantity, will require a discount type later
    public final void AddProductToSale(String productId, int quantity) throws ProductNotFoundEcception, ZeroQuantityException{
        product = db.findProductById(productId);
        if (product == null){
            throw new ProductNotFoundEcception();
        } else if (quantity == 0){
            throw new ZeroQuantityException();
        } else {            
        product.setQuantity(quantity);
        LineItem item = new LineItem(product);     
        AddProductToArray(lineItems, item);
        }
    }  
    
    public final void AddProductToArray(LineItem[] array, LineItem item){
        LineItem[] tempArray = new LineItem[array.length + 1];
        System.arraycopy(array, 0, tempArray, 0, array.length);
        tempArray[tempArray.length - 1] = item;
        array = tempArray;
        lineItems = array;
    }
    
    //this method will pass all the info to the output method
    public final void EndSale(ReceiptOutputStrategy output){
        output.generateReceiptBody(customer, lineItems);
        output.outputReceipt();
    }

    public final void ThrowError(String exceptionMessage){
        GuiOutput errorOutput = new GuiOutput();
        errorOutput.outputError(exceptionMessage);
    }
}
