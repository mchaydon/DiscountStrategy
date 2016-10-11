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
public class PercentDiscount implements DiscountStrategy {
    private double discountRate;

    public PercentDiscount(double discountRate) {
        setDiscountRate(discountRate);
    }
    
    @Override
    public final double getDiscountAmount(int quantity, double unitCost) {
        return unitCost * quantity * discountRate;
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        //Needs Validation
        this.discountRate = discountRate;
    }

    
}
