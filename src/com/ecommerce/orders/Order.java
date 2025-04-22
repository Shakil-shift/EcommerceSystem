package com.ecommerce.orders;

import com.ecommerce.Customer;
import com.ecommerce.Product;
import java.util.ArrayList;

public class Order {
    private String orderID;
    private Customer customer;
    private ArrayList<Product> products;
    private double orderTotal;

    // Constructor
    public Order(String orderID, Customer customer) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = customer.getShoppingCart();
        this.orderTotal = customer.calculateTotal();
    }

    // Getters and Setters
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    // Method to generate order summary
    public void generateOrderSummary() {
        System.out.println("Order ID: " + orderID + "\nCustomer: " + customer.getName());
        System.out.println("Ordered Products:");
        for (Product product : products) {
            product.displayProductDetails();
        }
        System.out.println("Total Order Amount: $" + orderTotal);
    }
}