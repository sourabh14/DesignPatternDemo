package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.CreditCard;

import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Offer.OfferVisitor;

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
