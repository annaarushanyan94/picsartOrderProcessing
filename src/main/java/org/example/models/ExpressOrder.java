package org.example.models;

public class ExpressOrder extends Order implements Deliverable{
    public ExpressOrder (Customer customer, double price){
        super(customer,price);
    }


    @Override
    public double calculateDeliveryPrice(){
        return 0; }


    @Override
        public void printSummary(){
            super.printSummary();
            System.out.println("Type: International Order. Delivery Price $" +  calculateDeliveryPrice());
        }

}