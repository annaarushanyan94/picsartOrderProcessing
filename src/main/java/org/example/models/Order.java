package org.example.models;

public class Order implements Comparable<Order> {
    protected Customer customer;
    protected double price;

    // Վարկած՝ Default constructor (հեռացրու եթե պետք չէ)
    public Order() {
        this.customer = null;
        this.price = 0;
    }

    public Order(Customer customer, double price) {
        if (customer == null || customer.getFirstName() == null || customer.getFirstName().isEmpty()) {
            throw new IllegalArgumentException("Customer's first name cannot be null or empty");
        }
        this.customer = customer;
        this.price = price;
    }

    public void printSummary() {
        System.out.println("Customer: " + customer + " | Price: AMD " + price);
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return customer + " | Price: AMD " + price;
    }

    @Override
    public int compareTo(Order o) {
        return Double.compare(this.price, o.price);
    }
}