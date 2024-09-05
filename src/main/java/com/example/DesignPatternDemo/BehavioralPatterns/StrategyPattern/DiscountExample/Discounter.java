package com.example.DesignPatternDemo.BehavioralPatterns.StrategyPattern.DiscountExample;

import java.math.BigDecimal;

@FunctionalInterface
public interface Discounter {
    BigDecimal applyDiscount(BigDecimal amount);
}
