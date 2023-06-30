package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Offer;

import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.CreditCard.BronzeCreditCard;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.CreditCard.GoldCreditCard;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.CreditCard.SilverCreditCard;

public class GroceryOfferVisitor implements OfferVisitor {
    @Override
    public void visitGoldCreditCard(GoldCreditCard goldCreditCard) {
        System.out.println("Gold credit card for groceries cashback offer - 5%");
    }

    @Override
    public void visitSilverCreditCard(SilverCreditCard silverCreditCard) {
        System.out.println("Silver credit card for groceries cashback offer - 2%");
    }

    @Override
    public void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard) {
        System.out.println("Bronze credit card for groceries cashback offer - 1%");
    }
}
