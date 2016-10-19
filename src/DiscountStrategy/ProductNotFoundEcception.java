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
public class ProductNotFoundEcception extends Exception{
    private static String message = "Sorry product not found in database. Please try again:";

    public ProductNotFoundEcception() {
        super(message);
    }

    public ProductNotFoundEcception(String message) {
        super(ProductNotFoundEcception.message);
    }

    public ProductNotFoundEcception(String message, Throwable cause) {
        super(ProductNotFoundEcception.message, cause);
    }

    public ProductNotFoundEcception(Throwable cause) {
        super(cause);
    }

    public ProductNotFoundEcception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(ProductNotFoundEcception.message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
