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
public class LineItem {
    private Product product;
    private int quantity; 

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public final Product getProduct() {
        return product;
    }
    
}
