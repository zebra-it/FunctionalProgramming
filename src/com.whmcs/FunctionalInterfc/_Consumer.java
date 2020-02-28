package com.whmcs.FunctionalInterfc;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Maria", "999-845-600"));
        greetCustomerConsumer.accept(new Customer("John", "700-805-401"));
        greetCustomerConsumerV2.accept(new Customer("Luke", "555-555-001"), true);
        greetCustomerConsumerV2.accept(new Customer("Julie", "445-255-101"), false);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName
                + ", thanks for registration phone number "
                + customer.customerPhoneNumber);
    }

    // do not return any value
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName
                    + ", thanks for registration phone number: "
                    + customer.customerPhoneNumber);
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName
                    + ", thanks for registration phone number: "
                    + (showPhoneNumber ? customer.customerPhoneNumber:"number is hidden"));

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }
}
