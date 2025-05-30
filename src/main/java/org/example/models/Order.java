package org.example.models;

public class Order {
    private String customerName;
    private double price;
    public Order(String customName){
        this.customerName=customName;
        this.price = 0;
    }
    public Order(String customName, double price) {
        this.customerName = customName;
        this.price = price;
    }
    public void printSummary (){
        System.out.println("Customer: " + customerName + " Price: AMD" + price);
    }
    public double getPrice() {
        return this.price;
    }
    public void  setPrice(double price){
        this.price = price;
    }
    public String getCustomerName(){
        return customerName;

    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

}//
