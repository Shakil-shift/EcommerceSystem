package com.ecommerce;

import java.util.ArrayList;

public class Customer {
    private String customerID;
    private String name;
    private ArrayList<Product> shoppingCart;

    // Constructor
    public Customer(String customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    // Getters and Setters
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getShoppingCart() {
        return shoppingCart;
    }

    // Method to add product to the shopping cart
    public void addToCart(Product product) {
        shoppingCart.add(product);
    }

    // Method to remove product from the shopping cart
    public void removeFromCart(Product product) {
        shoppingCart.remove(product);
    }

    // Method to calculate the total cost of products in the cart
    public double calculateTotal() {
        double total = 0;
        for (Product product : shoppingCart) {
            total += product.getPrice();
        }
        return total;
    }

    // Method to display shopping cart
    public void displayCart() {
        System.out.println("Shopping Cart for " + name + ":");
        for (Product product : shoppingCart) {
            product.displayProductDetails();
        }
    }
}
