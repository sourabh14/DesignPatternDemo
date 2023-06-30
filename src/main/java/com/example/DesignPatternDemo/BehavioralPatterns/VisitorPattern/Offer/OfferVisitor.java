package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Offer;

import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.CreditCard.BronzeCreditCard;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.CreditCard.GoldCreditCard;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.CreditCard.SilverCreditCard;

// Visitor class
public interface OfferVisitor {
    void visitGoldCreditCard(GoldCreditCard goldCreditCard);
    void visitSilverCreditCard(SilverCreditCard silverCreditCard);
    void visitBronzeCreditCard(BronzeCreditCard bronzeCreditCard);
}
