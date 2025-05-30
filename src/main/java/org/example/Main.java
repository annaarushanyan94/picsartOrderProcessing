package org.example;

import org.example.models.Customer;
import org.example.models.ExpressOrder;
import org.example.models.InternationalOrder;
import org.example.models.Order;

public class Main {
    public static void main(String[] args) {
        //InternationalOrder order = new InternationalOrder("John Smith", "1500.0");
        ExpressOrder order = new ExpressOrder( "John Smite",  1500.0);
        order.printSummary();

        Customer customer = new Customer("John Smith");

        Order order1 = new ExpressOrder("John Smith", 1500.0);
        Order order2 = new InternationalOrder("John Smith", 2500.0);

        customer.addOrder(order1);
        customer.addOrder(order2);

for (Order ord : customer.getOrders()) {
    order.printSummary();
}
    }
}