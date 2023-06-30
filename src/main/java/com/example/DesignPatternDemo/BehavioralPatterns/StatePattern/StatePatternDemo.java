package com.example.DesignPatternDemo.BehavioralPatterns.StatePattern;

public class StatePatternDemo {
    public void execute() {
        System.out.println("\n---- StatePatternDemo.execute ----");

        /*
            Intro:
                State pattern lets an object alter its behavior when its internal state changes. It appears as if
                the object changed its class.

            Problem:
                The main idea is that, at any given moment, there’s a finite number of states which a program can be in.
                Within any unique state, the program behaves differently, and the program can be switched from one state
                to another instantaneously. How- ever, depending on a current state, the program may or may not switch
                to certain other states. These switching rules, called transitions, are also finite and predetermined.

                State machines are usually implemented with lots of condi- tional operators ( if or switch ) that select
                the appropriate behavior depending on the current state of the object. Usually, this “state” is just a
                set of values of the object’s fields.

                The biggest weakness of a state machine based on condition- als reveals itself once we start adding
                more and more states and state-dependent behaviors to the Document class. Most methods will contain
                monstrous conditionals that pick the proper behavior of a method according to the current state. Code
                like this is very difficult to maintain because any change to the transition logic may require changing
                state conditionals in every method.

            Solution:
                The State pattern suggests that you create new classes for all possible states of an object and extract
                all state-specific behaviors into these classes.

                Instead of implementing all behaviors on its own, the original object, called context, stores a
                reference to one of the state objects that represents its current state, and delegates all the
                state-related work to that object.

                To transition the context into another state, replace the active state object with another object that
                represents that new state.

            Example:
                Imagine we have a package which is sent to a post office, the package itself can be ordered,
                then delivered to a post office and finally received by a client. Now, depending on the actual state,
                we want to print its delivery status.

                Ordered -> Delivered -> Received

                The simplest approach would be to add some boolean flags and apply simple if/else statements within
                each of our methods in the class. That won't complicate it much in a simple scenario. However, it
                might complicate and pollute our code when we'll get more states to process which will result in
                even more if/else statements.
         */

        Package pkg = new Package(1, "mypkg");
        pkg.printPackage();

        pkg.nextState();
        pkg.printPackage();

        pkg.nextState();
        pkg.printPackage();

        pkg.nextState();
        pkg.printPackage();

        pkg.prevState();
        pkg.printPackage();

        /*
            Usage:
                - Use the State pattern when you have an object that behaves differently depending on its current
                state, the number of states is enormous, and the state-specific code changes frequently.

                - Use the pattern when you have a class polluted with massive conditionals that alter how the class
                behaves according to the current values of the class’s fields.

                -  Use State when you have a lot of duplicate code across similar states and transitions of a
                condition-based state machine.

         */
    }
}
