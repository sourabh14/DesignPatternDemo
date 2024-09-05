package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.Offer;

import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.CreditCard.BronzeCreditCard;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.CreditCard.GoldCreditCard;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.CreditCard.SilverCreditCard;

// Visitor class
public interface OfferVisitor {
    void visitGoldCreditCard(GoldCreditCard goldCreditCard);
    void visitSilverCreditCard(SilverCreditCard silverCreditCard);
    void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard);
}
