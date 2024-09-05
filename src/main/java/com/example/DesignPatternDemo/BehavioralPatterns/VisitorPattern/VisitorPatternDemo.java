package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern;

import java.util.ArrayList;
import java.util.List;

import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.CreditCard.GoldCreditCard;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.CreditCard.SilverCreditCard;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.Offer.GroceryOfferVisitor;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example1.Offer.MovieTicketOfferVisitor;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example2.Bank;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example2.Client;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example2.InsuranceMessagingVisitor;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example2.Resident;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example2.Visitor;

public class VisitorPatternDemo {
    public void execute() {
        System.out.println("\n---- VisitorPatternDemo.execute ----");
        /*
            Intro:
                Visitor pattern lets you separate algorithms from the objects on which they operate.

                The Visitor pattern suggests that you place the new behavior into a separate class called visitor,
                instead of trying to integrate it into existing classes. The original object that had to perform
                the behavior is now passed to one of the visitor’s methods as an argument, providing the method access
                to all necessary data contained within the object.

            Components:
                Visitor - The dynamic operations that we want to add. The visitor interface declares a set of visit()
                    methods that take concrete elements as arguments.
                Element - Element interface declares an accept() method that takes the Visitor interface as an argument.


            Example: https://www.youtube.com/watch?v=TeZqKnC2gvA
                We have 3 types of credit cards - Gold, silver and bronze. Each card offers different
                cashback offers on different scenarios. For example while purchasing groceries, gold card
                offers 5% cashbac, silver offers 2% and bronze offers 1%. Similarly, for purchasing movie
                tickets, offers are (3%, 1.5% and 0.5%) respectively.

                How do we calculate cashback for an offer for a given credit card?

                Option 1: We can write methods in credit card class to calculate for every offer. For eg in
                    gold card class, we can write computeCashback(GroceryOffer offer) and computeCashback(MovieTicketOffer offer)

                    However we dont want to tightly couple offers with credit cards as they are two totally unrelated things.
                    And as the offers grow, this will require lot of changes.

                    Visitor pattern solves the problem, of how can we have generic concrete implementation of cards,
                    and dynamically add offers to the class.
         */

        GroceryOfferVisitor groceryOfferVisitor = new GroceryOfferVisitor();
        MovieTicketOfferVisitor movieTicketOfferVisitor = new MovieTicketOfferVisitor();

        GoldCreditCard goldCreditCard = new GoldCreditCard();
        SilverCreditCard silverCreditCard = new SilverCreditCard();

        goldCreditCard.accept(groceryOfferVisitor);
        silverCreditCard.accept(movieTicketOfferVisitor);

        /*
            You might ask, why don’t we use method overloading? That’s when you give all methods the same name, even if
            they sup- port different sets of parameters. Unfortunately, even assum- ing that our programming language
            supports it at all (as Java and C# do), it won’t help us. Since the exact class of a node object is unknown
            in advance, the overloading mechanism won’t be able to determine the correct method to execute. It’ll default
            to the method that takes an object of the base Node class.

            However, the Visitor pattern addresses this problem. It uses a technique called Double Dispatch, which helps
            to execute the proper method on an object without cumbersome condition- als. Instead of letting the client
            select a proper version of the method to call, how about we delegate this choice to objects we’re passing to
            the visitor as an argument?

            Since the objects know their own classes, they’ll be able to pick a proper method on the visitor less
            awkwardly. They “accept” a visitor and tell it what visiting method should be executed.

            Usage:
                - Use the Visitor when you need to perform an operation on all elements of a complex object structure
                (for example, an object tree).

                - Use the Visitor to clean up the business logic of auxiliary behaviors. The pattern lets you make the
                primary classes of your app more focused on their main jobs by extracting all other behaviors into a
                set of visitor classes.

                - Use the pattern when a behavior makes sense only in some classes of a class hierarchy, but not in others.
                You can extract this behavior into a separate visitor class and implement only those visiting methods
                that accept objects of relevant classes, leaving the rest empty. In our example, if movie tickets offer
                doesn't applies to bronze card, then we can avoid using that visitor for that card.
         */

        // Example 2:

        /*
            You are working for an insurance company, and the company has many type of clients -
            resident, bank, company, restaurants.
            To represent these clients, you created separate classes for them.

            A new requirement comes: you have to add messaging functionality where, based on the type of client
            a mail will be sent. For eg: Residents are sent medical insurance ad. If it is a bank, theft
            insurance ad is sent. etc.

            You decided to add sendMail method to the client class and override it in each subclasses.

            Problem:
                - This violates single responsibility and open/closed principle.
                - Now these classes contain actual functionality that may break the code and they are open for modification
                - What we need is to extract these behaviors outside of client class
         */

        Client resident = new Resident("Test resident", "23");
        Client bank = new Bank("HDFC Mungeli branch");

        List<Client> clientList = new ArrayList<>();
        clientList.add(resident);
        clientList.add(bank);

        Visitor insuranceMessagingVisitor = new InsuranceMessagingVisitor();
        insuranceMessagingVisitor.sendInsuranceMails(clientList);
    }
}
