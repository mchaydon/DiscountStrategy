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

    @Override
    public void outputHeading(Customer customer) {
        System.out.printf("%s %s Thank you for shopping at Kohls!\n", customer.getFirstName(), customer.getLastName());
        System.out.println("-------------------------------------------");
        System.out.printf("Product\t\tCost\n");
    }

    @Override
    public void outputLineItems(LineItem[] lineitems) {
        for (LineItem l : lineitems){
            System.out.printf(l.getProduct().getName() + "\t" + l.getProduct().getCost() + "\n");
        }
    }

    

}
