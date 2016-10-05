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
    private double discountPercent;
    private double discountTotal;
    
    @Override
    public final void setDiscountAmount(double discountAmount){
        this.discountPercent = discountPercent / 100;
    }
    
    @Override
    public final double calculateDiscount(double itemCost, int quantity) {
        this.discountTotal = (itemCost * discountPercent) * quantity;
        return discountTotal;
    }
}
