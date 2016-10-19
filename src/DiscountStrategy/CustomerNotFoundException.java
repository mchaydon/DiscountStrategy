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
public class CustomerNotFoundException extends Exception{
    private static String message = "Sorry customer not found in database. Please try again:";
    
    public CustomerNotFoundException() {
        super(message);
    }

    public CustomerNotFoundException(String message) {
        super(CustomerNotFoundException.message);
    }

    public CustomerNotFoundException(String message, Throwable cause) {
        super(CustomerNotFoundException.message, cause);
    }

    public CustomerNotFoundException(Throwable cause) {
        super(cause);
    }

    public CustomerNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(CustomerNotFoundException.message, cause, enableSuppression, writableStackTrace);
    }
    
}
