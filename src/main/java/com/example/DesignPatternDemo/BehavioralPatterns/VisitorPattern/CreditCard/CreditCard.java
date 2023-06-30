package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.CreditCard;

import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Offer.OfferVisitor;

// Element class
public interface CreditCard {
    String getName();
    void accept(OfferVisitor offer);
}
