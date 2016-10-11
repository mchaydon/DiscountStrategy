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
public class FlatDiscount implements DiscountStrategy{
    private double discountDollarAmount;

    public FlatDiscount(double discountDollarAmount) {
        this.discountDollarAmount = discountDollarAmount;
    }

    @Override
    public final double getDiscountAmount(int quantity, double unitCost) {
        return quantity * discountDollarAmount;
    }
    
}
