package org.example.models;

public class Order {
    protected Customer customer;
    protected  double price;
    public Order(String customName){
        this.customer= customer;
        this.price = 0;
    }
    public Order(Customer customer, double price) {
        this.customer = customer;
        this.price = price;
    }
    public void printSummary (){
        System.out.println("Customer: " + customer + " Price: AMD" + price);
    }
    public double getPrice() {
        return this.price;
    }
    public void  setPrice(double price){
        this.price = price;
    }
    public Customer getCustomer(){
        return customer;

    }
    public void setCustomer(Customer customer){
        this.customer = customer ;
    }

}
