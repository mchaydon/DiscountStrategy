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
    private static final double ZERO = 0.00;

    public QuantityDiscount(double discountRate, int minimumQuantity) {
        setDiscountRate(discountRate);
        setMinimumQuantity(minimumQuantity);
    }
    

    @Override
    public final double getDiscountAmount(int quantity, double unitCost) {
        if (unitCost <= 0 || quantity <= -0){
            throw new IllegalArgumentException();
        }
        if (quantity >= minimumQuantity){
            return unitCost * quantity * discountRate;
        } else {
            return ZERO;
        }
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        //Needs Validation
        this.discountRate = discountRate;
    }

    public final int getMinimumQuantity() {
        return minimumQuantity;
    }

    public final void setMinimumQuantity(int minimumQuantity) {
        //Needs Validation
        this.minimumQuantity = minimumQuantity;
    }
    
    
}
