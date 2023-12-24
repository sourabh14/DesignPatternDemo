package com.example.DesignPrincipleDemo.encapsulateWhatVaries;

import java.util.List;

public class Order2 {
    List<OrderItem> orderItems;
    String country;
    String state;
    TaxCalculator taxCalculator;    // Delegate all tax-related work to a special object that does just that

    public double getOrderTotal() {
        double total = 0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.getPrice() * orderItem.getQuantity();
        }

        total = total * taxCalculator.getTaxRate(country);

        return total;
    }
}
