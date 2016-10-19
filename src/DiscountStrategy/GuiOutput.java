/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscountStrategy;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Mike
 */
public class GuiOutput implements ReceiptOutputStrategy {
    private double totalSaleAmount;
    private double totalDiscountAmount;
    private String receiptText = ""; 
    DecimalFormat formatter = new DecimalFormat("#0.00");

    @Override
    public final void generateReceiptBody(Customer customer, LineItem[] lineitems) {
        receiptText += "\t            Kohl's\n  ---------------------------------------------------------------------------  \n\n  Customer: " + customer.getFirstName() + " " + customer.getLastName() + "\n\n";
        for (LineItem l : lineitems){
            receiptText += "  " + l.getProduct().getName() + "\t\tQty: " + l.getProduct().getQuantity() + "     " + l.getProduct().getProductId() + "\t" + formatter.format((l.getProduct().getCost() * l.getProduct().getQuantity()) - l.getProduct().getDiscount()) + "\n" +
                    "    Item cost: " + formatter.format(l.getProduct().getCost()) + "\t     You save: " + formatter.format(l.getProduct().getDiscount()) + "\n\n";
            
//            System.out.printf("%s\t%.2f\t%.2f\n", l.getProduct().getName(), l.getProduct().getCost(), l.getProduct().getDiscount());
            totalSaleAmount += l.getProduct().getCost() * l.getProduct().getQuantity();
            totalDiscountAmount += l.getProduct().getDiscount();            
        }
        
        receiptText += "\t\t            Subtotal: " + formatter.format(totalSaleAmount) + "\n\t\t           Discount: " + formatter.format(totalDiscountAmount) + 
                "-\n\t\t                  Total: " + formatter.format(totalSaleAmount - totalDiscountAmount) + "\n\n  ---------------------------------------------------------------------------  \n" +
                "                     Thank you for shopping at Kohl's!\n" ;
    }

    @Override
    public final void outputReceipt() {
        JOptionPane.showMessageDialog(null, new JTextArea(receiptText));
    }

    public void outputError(String exceptionMessage) {
        JOptionPane.showMessageDialog(null, exceptionMessage);
    }
}
