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
public class ZeroQuantityException extends Exception{
    private static String message = "Quantity of Zero, item will not be added to the receipt.";

    public ZeroQuantityException() {
        super(message);
    }

    public ZeroQuantityException(String message) {
        super(ZeroQuantityException.message);
    }

    public ZeroQuantityException(String message, Throwable cause) {
        super(ZeroQuantityException.message, cause);
    }

    public ZeroQuantityException(Throwable cause) {
        super(cause);
    }

    public ZeroQuantityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(ZeroQuantityException.message, cause, enableSuppression, writableStackTrace);
    }
    
}
