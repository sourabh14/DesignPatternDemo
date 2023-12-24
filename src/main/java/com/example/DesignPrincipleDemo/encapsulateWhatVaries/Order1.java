package com.example.DesignPrincipleDemo.encapsulateWhatVaries;

import java.util.List;

public class Order1 {
    List<OrderItem> orderItems;
    String country;
    String state;

    public Order1(List<OrderItem> orderItems, String country, String state) {
        this.orderItems = orderItems;
        this.country = country;
        this.state = state;
    }

    public double getOrderTotal() {
        double total = 0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.getPrice() * orderItem.getQuantity();
        }

        // Apply tax (This is code is subject to change)
//        if (country.equals("US")) {
//            total += total * 0.07;
//        } else if (country.equals("EU")) {
//            total += total * 0.20;
//        }

        // Extract it to separate method
        total = total * getTaxRate();

        return total;
    }

    public double getTaxRate() {
        if (country.equals("US")) {
            return 0.07;
        } else if (country.equals("EU")) {
            return 0.20;
        }
        return 1.0;
    }
}
