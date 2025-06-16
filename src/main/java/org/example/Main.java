package org.example;

import org.example.models.Customer;
import org.example.models.ExpressOrder;
import org.example.models.InternationalOrder;
import org.example.models.Order;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        try {
            Customer customer1 = new Customer("John", "Smith", "johnsmith.com", "+37400",
                    "5 Azatutyun, Yerevan, Armenia");
            Customer customer2 = new Customer("Aram", "Aramyan", "aramjan@gmail.com",
                    "+37477", "5 Azatutyun, Yerevan, Armenia");
            Customer customer = new Customer("Aleqs", "Aleqsanyan", "smithGmail.com",
                    "+39999", "5 Azatutyun, Yerevan, Armenia");

            Order order1 = new ExpressOrder(customer1, 1500.0);
            Order order2 = new ExpressOrder(customer2, 1800.0);
            Order order3 = new InternationalOrder(customer, 1700.0);

            ArrayList<Order> orders = new ArrayList<>();
            orders.add(order1);
            orders.add(order2);
            orders.add(order3);

            System.out.println("Before Sorting:");
            for (Order order : orders) {
                order.printSummary();
            }

            Collections.sort(orders); // Սա աշխատում է, եթե Order implements Comparable<Order>

            System.out.println("\nAfter Sorting:");
            for (Order order : orders) {
                order.printSummary();
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Սխալ տվյալներ: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Սպասվողից դուրս սխալ: " + e.getMessage());
        }
    }
}


        //Collections.sort(orders);

        /* public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Anna", "Grigoryan", 555111, "Yerevan"));
        customers.add(new Customer("Anna", "Grigoryan", 555111, "Gyumri"));
        customers.add(new Customer("Aram", "Grigoryan", 555222, "Yerevan"));
        customers.add(new Customer("Anna", "Hakobyan", 555333, "Vanadzor"));

        Collections.sort(customers); // կամ customers.sort(null);

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}*/


        /*Order[] orders = new Order[3];
        orders[0] = order1;
        orders[1] = order2;
        orders[2] = order3;*/

        /*for (Order order : orders) {
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
        System.out.println("Total international order: " + InternationalOrderCount);*/