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
public class Customer {
    private String lastName;
    private String firstName;
    private String customerNumber;

    public Customer(String lastName, String firstName, String customerNumber) {
        setLastName(lastName);
        setFirstName(firstName);
        setCustomerNumber(customerNumber);
    }
    
    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        //Needs validation
        this.lastName = lastName;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        //Needs validation
        this.firstName = firstName;
    }

    public final String getCustomerNumber() {
        return customerNumber;
    }

    public final void setCustomerNumber(String customerNumber) {
        //Needs validation
        this.customerNumber = customerNumber;
    }
    
    
}
