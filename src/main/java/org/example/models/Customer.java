package org.example.models;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer (String name){
        this.name=name;
        this.orders=new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addOrder (Order order){
        orders.add(order);
    }
    public ArrayList<Order> getOrders(){
        return orders ;
    }
}//
