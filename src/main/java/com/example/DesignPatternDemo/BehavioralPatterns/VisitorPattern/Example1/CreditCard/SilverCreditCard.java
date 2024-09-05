package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.CreditCard;

import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.Offer.OfferVisitor;

public class SilverCreditCard implements CreditCard {
    @Override
    public String getName() {
        return "SilverCreditCard";
    }

    @Override
    public void accept(OfferVisitor offer) {
        offer.visitSilverCreditCard(this);
    }
}
