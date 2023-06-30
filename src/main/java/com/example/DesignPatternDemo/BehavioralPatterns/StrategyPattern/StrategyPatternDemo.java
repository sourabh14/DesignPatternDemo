package com.example.DesignPatternDemo.BehavioralPatterns.StrategyPattern;

import java.math.BigDecimal;

import com.example.DesignPatternDemo.BehavioralPatterns.StrategyPattern.BirdExample.Bird;
import com.example.DesignPatternDemo.BehavioralPatterns.StrategyPattern.BirdExample.FlyWithWings;
import com.example.DesignPatternDemo.BehavioralPatterns.StrategyPattern.BirdExample.NoFly;
import com.example.DesignPatternDemo.BehavioralPatterns.StrategyPattern.DiscountExample.Cart;
import com.example.DesignPatternDemo.BehavioralPatterns.StrategyPattern.DiscountExample.Discounter;

public class StrategyPatternDemo {
    public void execute() {
        System.out.println("\n---- StrategyPatternDemo.execute ----");

        /*
            Intro:
                 Strategy pattern lets you define a family of algorithms, put each of them into a separate class, and
                 make their objects interchangeable.

                 Strategy pattern is also known as Policy Pattern. We define multiple algorithms and let client
                 application pass the algorithm to be used as a parameter.

                 One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter.
                 Based on the different implementations of Comparator interfaces, the Objects are getting sorted in
                 different ways.

                 The Strategy pattern suggests that you take a class that does something specific in a lot of different
                 ways and extract all of these algorithms (or behaviour) into separate classes called strategies.
                 The original class, called context, must have a field for storing a reference to one of the strategies.
                 The context delegates the work to a linked strategy object instead of executing it on its own.

            Components:
                - Context : maintains a reference to one of the concrete strategies and communicates with this object
                    only via the strategy interface.
                - Strategy : interface is common to all concrete strategies. It declares a method the context uses to
                    execute a strategy.

                 https://www.freecodecamp.org/news/the-strategy-pattern-explained-using-java-bc30542204e0/

            Example:
                We have bird class. Some birds can fly (vulture, parrot) and some cannot (ostrich, kiwi).

                Option 1: We can create fly() method in bird so that all birds can inherit this. The birds which cannot
                fly, can override this method to implement different behaviour. This is not a clean method.

                Option 2: We can create a flyable interface and birds which can fly implement this behaviour. However,
                we cannot reuse this. Every bird that can fly must implement same behaviour, this leads to code
                duplication.

                Solution: Instead of creating a fly() method, we create FlyBehaviour interface, then we create concrete
                implementation FlyWithWings, NoFly.
         */

        Bird parrot = new Bird("Parrot", "Forest", new FlyWithWings());
        parrot.performFly();

        Bird ostrich = new Bird("Ostrich", "Forest", new NoFly());
        ostrich.performFly();

        /*
                The context isn’t responsible for selecting an appropriate algorithm for the job. Instead, the client
                passes the desired strategy to the context. In fact, the context doesn’t know much about strategies. It
                works with all strategies through the same generic interface, which only exposes a single method for triggering the algorithm encapsulated within the selected strategy.

            Usage:
                - Use the Strategy pattern when you want to use different variants of an algorithm within an object and be
                    able to switch from one algorithm to another during runtime.

                - Use the Strategy when you have a lot of similar classes that only differ in the way they execute some
                    behavior.

                - Use the pattern to isolate the business logic of a class from the implementation details of algorithms
                    that may not be as important in the context of that logic.

                - Use the pattern when your class has a massive conditional operator that switches between different
                    variants of the same algorithm.

             Strategy pattern using lambdas:
                 It can be little pain to have to create a concrete class for each strategy. Instead,
                 we can use lambdas expressions. Lambda expressions can be stored in variables if the variable's type is an
                 interface which has only one method. The lambda expression should have the same number of parameters and the
                 same return type as that method.
         */

        Discounter diwaliDiscounter = (amount) -> amount.multiply(BigDecimal.valueOf(0.10));
        Discounter newYearDiscounter = (amount) -> amount.multiply(BigDecimal.valueOf(0.20));

        Cart cart = new Cart(BigDecimal.valueOf(30.50), diwaliDiscounter);
        System.out.println("Cart 1, amount: " + cart.getTotalAmount() + ", discount: " + cart.applyDiscount());

        Cart cart2 = new Cart(BigDecimal.valueOf(45.50), newYearDiscounter);
        System.out.println("Cart 1, amount: " + cart2.getTotalAmount() + ", discount: " + cart2.applyDiscount());

    }
}
