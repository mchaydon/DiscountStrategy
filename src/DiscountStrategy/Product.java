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
public class Product {
    private String productId;
    private String name;
    private int quantity;
    private double cost;
    private DiscountStrategy discount;

    
    //Constructor requires product ID, name, and cost
    public Product(String productId, String name, double cost, DiscountStrategy discount) {
        this.productId = productId;
        this.name = name;
        this.cost = cost;
        this.discount = discount;
    }

    //Getters and Setters
    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        this.productId = productId;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final double getCost() {
        return cost;
    }

    public final void setCost(double cost) {
        this.cost = cost;
    }

    public final double getDiscount() {
        return discount.getDiscountAmount(quantity, cost);
    }

    public final void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    public final int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
