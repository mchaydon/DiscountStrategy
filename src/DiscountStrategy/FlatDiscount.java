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
    private double discountAmount;

    public FlatDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }
    
    @Override
    public void calculateDiscount() {
        
    }

    @Override
    public double getDiscountAmount() {
        return discountAmount;
    }

}
