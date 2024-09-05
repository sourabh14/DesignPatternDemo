package com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern;

import com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern.CoolingSystem.Button;
import com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern.CoolingSystem.Fan;
import com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern.CoolingSystem.PowerSupply;

import com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern.CoolingSystemMediator.*;

public class MediatorPatternDemo {
    public void execute() {
        System.out.println("\n---- MediatorPatternDemo.execute ----");

        /*
            Intro:
                Mediator pattern lets you reduce chaotic dependencies between objects. The pattern restricts
                direct communications between the objects and forces them to collaborate only via a mediator object.

                If the objects interact with each other directly, the system components are tightly-coupled with each
                other that makes higher maintainability cost and not hard to extend. Mediator pattern focuses on
                providing a mediator between objects for communication and help in implementing loose-coupling between objects.

                This is achieved by creating a mediator object that takes care of the interaction between dependent
                objects. Consequently, all the communication goes through the mediator.

            Example:
                Imagine we're building a simple cooling system that consists of a fan, a power supply, and a button.
                Pressing the button will either turn on or turn off the fan. Before we turn the fan on, we need to turn on
                the power. Similarly, we have to turn off the power right after the fan is turned off.



         */

        PowerSupply powerSupply = new PowerSupply();
        Fan fan = new Fan(powerSupply);
        Button button = new Button(fan);

        button.press();
        System.out.println("");
        button.press();
        System.out.println("");

        powerSupply.start();
        System.out.println("");
        button.press();
        System.out.println("");

        /*
            Problem:
                Everything seems to work fine. But notice how Button, Fan, and PowerSupplier classes are tightly coupled.
                The Button operates directly on the Fan and the Fan interacts with PowerSupplier.

                It would be hard to reuse the Button class in other modules. Also, if we need to add a second power supply
                into our system, then we would have to modify the Fan class' logic.
         */

        Mediator mediator = new MediatorImpl();

        NewPowerSupply powerSupply1 = new NewPowerSupply(mediator);
        NewFan fan1 = new NewFan(mediator);
        NewButton button1 = new NewButton(mediator);

        mediator.addPowerSupply(powerSupply1);
        mediator.addFan(fan1);
        mediator.addButton(button1);

        System.out.println("After mediator pattern--\n");
        button1.press();
        System.out.println("");
        button1.press();
        System.out.println("");

        powerSupply1.start();
        System.out.println("");
        button1.press();
        System.out.println("");

        /*
                Now that we've implemented the Mediator Pattern, none of the Button, Fan, or PowerSupplier classes
                communicate directly. They only have a single reference to the Mediator.

                If we need to add a second power supply in the future, all we have to do is to update Mediator's logic;
                Button and Fan classes remain untouched.

            Usage:
                - Use the Mediator pattern when it’s hard to change some classes because they are tightly
                    coupled to a bunch of other classes. The Mediator Pattern is a good choice if we have to deal with
                    a set of objects that are tightly coupled and hard to maintain.

                -  Use the pattern when you can’t reuse a component in a different program because it’s too dependent
                    on other components.

                - Use the Mediator when you find yourself creating tons of com- ponent subclasses just to reuse some
                    basic behavior in various contexts.
         */
    }
}
