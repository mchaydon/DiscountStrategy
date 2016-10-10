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
    private double discountAmount;

    public LineItem(Product product) {
        this.product = product;
        setQuantity(product.getQuantity());
        setDiscountAmount(product.getDiscount());
    }

    public final Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        //Needs validation
        this.quantity = quantity;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        //Needs validation
        this.discountAmount = discountAmount;
    }
    
    
}
