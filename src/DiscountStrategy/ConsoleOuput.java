/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountStrategy;

import java.text.DecimalFormat;

/**
 *
 * @author Mike
 */
public class ConsoleOuput implements ReceiptOutputStrategy{
    private double totalSaleAmount = 0;
    private double totalDiscountAmount = 0;
    private String receiptText = ""; 
    DecimalFormat formatter = new DecimalFormat("#0.00");

    @Override
    public final void generateReceiptBody(Customer customer, LineItem[] lineitems) {
        receiptText += "\t\t     Kohl's\n-----------------------------------------------\n\nCustomer: " + customer.getFirstName() + " " + customer.getLastName() + "\n\n";
        for (LineItem l : lineitems){
            receiptText += l.getProduct().getName() + "\t\tQty: " + l.getProduct().getQuantity() + "\t\t" + l.getProduct().getProductId() + "\t" + formatter.format((l.getProduct().getCost() * l.getProduct().getQuantity()) - l.getProduct().getDiscount()) + "\n" +
                    "    Item cost: " + formatter.format(l.getProduct().getCost()) + "\t    You save: " + formatter.format(l.getProduct().getDiscount()) + "\n\n";
            totalSaleAmount += l.getProduct().getCost() * l.getProduct().getQuantity();
            totalDiscountAmount += l.getProduct().getDiscount();            
        }
        
        receiptText += "\t\t\t      Subtotal: " + formatter.format(totalSaleAmount) + "\n\t\t\t      Discount: " + formatter.format(totalDiscountAmount) + 
                "-\n\t\t\t\t Total: " + formatter.format(totalSaleAmount - totalDiscountAmount) + "\n\n-----------------------------------------------\n" +
                "\tThank you for shopping at Kohl's!\n" ;
    }

    @Override
    public void outputReceipt() {
        System.out.println(receiptText);
    }

    

}
