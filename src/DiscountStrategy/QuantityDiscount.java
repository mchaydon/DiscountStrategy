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
public class QuantityDiscount implements DiscountStrategy { 
    private double discountRate;
    private int minimumQuantity;
    private final double ZERO = 0.00;

    public QuantityDiscount(double discountRate, int minimumQuantity) {
        this.discountRate = discountRate;
        this.minimumQuantity = minimumQuantity;
    }
    

    @Override
    public final double getDiscountAmount(int quantity, double unitCost) {
        if (quantity >= minimumQuantity){
            return unitCost * quantity * discountRate;
        } else {
            return ZERO;
        }
    }
}
