package org.example.models;

public class InternationalOrder extends Order implements Deliverable {
    public InternationalOrder(String customerName, double price) {
        super(customerName,price);
    }
    @Override
    public double calculateDeliveryPrice(){
        return getPrice() * 0.2;
    }

    @Override
    public void printSummary(){
        super.printSummary();
        System.out.println("Type: International Order. Delivery Price $" +  calculateDeliveryPrice());
    }
}
