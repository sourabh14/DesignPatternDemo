package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.CreditCard;

import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.Offer.OfferVisitor;

// Element class
public interface CreditCard {
    String getName();
    void accept(OfferVisitor offer);
}
