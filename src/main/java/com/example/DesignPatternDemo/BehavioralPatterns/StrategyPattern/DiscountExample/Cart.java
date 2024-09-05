package com.example.DesignPatternDemo.BehavioralPatterns.StrategyPattern.DiscountExample;

import java.math.BigDecimal;

public class Cart {
    private BigDecimal totalAmount;
    private Discounter discounter;

    public Cart(BigDecimal totalAmount, Discounter discounter) {
        this.totalAmount = totalAmount;
        this.discounter = discounter;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public BigDecimal applyDiscount() {
        return discounter.applyDiscount(totalAmount);
    }
}
