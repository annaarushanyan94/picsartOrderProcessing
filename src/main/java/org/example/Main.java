package org.example;

import org.example.models.Customer;
import org.example.models.ExpressOrder;
import org.example.models.InternationalOrder;
import org.example.models.Order;

public class Main {
    public static void main(String[] args) {


        Customer customer1 = new Customer("John ", "Smith", "johnsmith.com", "+37400",
                "5 Azatutyun, Yerevan, Armenia");
        Customer customer2 = new Customer("Aram ", "Aramyan", "aramjan@gmail.com",
                "+37477",
                "5 Azatutyun, Yerevan, Armenia");
        Customer customer = new Customer("Aleqs ", "Aleqsanyan", "smithGmail.com",
                "+39999", "5 Azatutyun, Yerevan, Armenia");


        Order order1 = new ExpressOrder(customer, 1500.0);
        Order order2 = new ExpressOrder(customer, 1500.0);
        Order order3 = new InternationalOrder(customer, 1500.0);

        customer.printSummary();
        //order.getCustomer().printSummary();
        //order.printSummary();
        Order[] orders = new Order[3];
        orders[0] = order1;
        orders[1] = order2;
        orders[2] = order3;

        for (Order order : orders) {
            order.getCustomer().printSummary();
            order.printSummary();
            System.out.println("...............");
        }

        int ExpressOrdercount = 0;
        for (Order order : orders) {
            if (order instanceof ExpressOrder) {
                ExpressOrdercount++;
            }
        }
        System.out.println("Total express order: " + ExpressOrdercount);

        int InternationalOrderCount = 0;
        for (Order order : orders) {
            if (order instanceof  InternationalOrder) {
                InternationalOrderCount++;
            }
        }
        System.out.println("Total international order: " + InternationalOrderCount);
        System.out.println("Total international order: " + InternationalOrderCount);
        System.out.println("Total international order: " + InternationalOrderCount);
    }
}