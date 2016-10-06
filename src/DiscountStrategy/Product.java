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
    private double cost;

    
    //Constructor requires product ID, name, and cost
    public Product(String productId, String name, double cost) {
        this.productId = productId;
        this.name = name;
        this.cost = cost;
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
}
