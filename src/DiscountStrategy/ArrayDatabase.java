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
public class ArrayDatabase implements DatabaseStrategy {
    private Customer[] customers = {
        new Customer("Smith", "John", "C100"),
        new Customer("Doe", "Bob", "C101"),
        new Customer("Jones", "Sally", "C102")
    };
    
    private Product[] products = {
        new Product("101", "GameBoy", 79.99, new PercentDiscount(.25)),
        new Product("B71", "Shirt", 9.99, new NoDiscount()),
        new Product("J22", "Jeans", 54.99, new FlatDiscount(5.00)),
        new Product("R32", "Hoodie", 34.95, new QuantityDiscount(.25,5))
    };
    
    @Override
    public final Customer findCustomerById(String customerNumber){ 
        Customer customer = null;
        
        for (Customer c : customers){
            if (customerNumber.equalsIgnoreCase(c.getCustomerNumber())) {
                customer = c;
                break;
            }
        }
        return customer;
    }

    @Override
    public final Product findProductById(String productId) {
        Product product = null;
        
        for (Product p : products){
            if (productId.equalsIgnoreCase(p.getProductId())){
                product = p;
                break;
            }
        }
        return product;
    }
}
