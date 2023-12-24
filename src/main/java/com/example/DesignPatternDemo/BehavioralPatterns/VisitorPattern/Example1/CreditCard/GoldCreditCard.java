package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.CreditCard;

import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.Offer.OfferVisitor;

public class GoldCreditCard implements CreditCard {
    @Override
    public String getName() {
        return "GoldCreditCard";
    }

    @Override
    public void accept(OfferVisitor offer) {
        offer.visitGoldCreditCard(this);
    }
}
