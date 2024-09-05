package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.CreditCard;

import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.Offer.OfferVisitor;

public class BronzeCreditCard implements CreditCard {
    @Override
    public String getName() {
        return "BronzeCreditCard";
    }

    @Override
    public void accept(OfferVisitor offer) {
        offer.visitBronzeCreditCard(this);
    }
}
