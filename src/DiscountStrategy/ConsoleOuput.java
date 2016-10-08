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
public class ConsoleOuput implements ReceiptOutputStrategy{
    private double totalSaleAmount = 0;
    private double totalDiscountAmount = 0;

    @Override
    public final void outputHeading(Customer customer) {
        System.out.printf("%s %s Thank you for shopping at Kohls!\n", customer.getFirstName(), customer.getLastName());
        System.out.println("-------------------------------------------");
        System.out.printf("Product\t\tCost\n");
    }

    @Override
    public final void outputLineItems(LineItem[] lineitems) {
        for (LineItem l : lineitems){
            System.out.printf("%s\t%.2f\t%.2f\n", l.getProduct().getName(), l.getProduct().getCost(), l.getProduct().getDiscount());
            totalSaleAmount += l.getProduct().getCost() * l.getProduct().getQuantity();
            totalDiscountAmount += l.getProduct().getDiscount();
            
            System.out.printf("%.2f\t%.2f\n", totalSaleAmount, totalDiscountAmount);
            
        }
    }

    

}
