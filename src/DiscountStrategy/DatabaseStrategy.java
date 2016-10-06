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
public interface DatabaseStrategy {
    public abstract Customer findCustomerById(String customerNumber);
    
    public abstract Product findProductById(String productId);
}
