package org.example.models;

import java.util.ArrayList;

public class Customer {

    private String firstName ;
    private String lastName ;
    private String email ;
    private String phone ;
    private String address ;

    public Customer ( String firstName, String lastName, String email, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void  printSummary (){
        System.out.println("Customer: " + firstName + " " + lastName + " " + email + " " + phone + " " + address);
    }
    /*private String name;
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
    }*/


}//
