package com.example.DesignPatternDemo.BehavioralPatterns.StrategyPattern.DiscountExample;

import java.math.BigDecimal;

public interface Discounter {
    BigDecimal applyDiscount(BigDecimal amount);
}
