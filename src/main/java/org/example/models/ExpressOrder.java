package org.example.models;

public class ExpressOrder extends Order implements Deliverable{
    public ExpressOrder (String customerName, double price){
        super(customerName,price);
    }


    @Override
    public double calculateDeliveryPrice(){
        return 0;


    }
}