package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.CreditCard;

import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Offer.OfferVisitor;

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
