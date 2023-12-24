package com.example.DesignPrincipleDemo;

public class DesignPrinciples {
    /*
        Features of a good design:
            - Re-usability:
                - Cost and time are two most imp factor for software product
                - Code reuse reduces dev cost
                - The more flexible the code, higher the re-usability
            - Extensibility
            - Maintainability
            - Easy, Not complex

        Flexibility vs Complexity
            - Factors that reduce flexibility of code
                * Tight coupling bw components
                * Dependencies on concrete classes instead of interfaces
                * hardcoded operations
            - Using design patterns we can increase flexibility and reuse of code.
            - Trade-off is that this sometimes makes components more complex

        Design Principles:
            1. Encapsulate what varies:
                - Identify the aspects of your application that vary and separate them from what stays the same.
                - The main goal of this principle is to minimize the effect caused by changes.
                - Isolate the parts of the program that vary in independent modules, protecting the rest of the code
                    from adverse effects. As a result, you spend less time getting the program back into working shape,
                    implementing and testing the changes.
            2. Program to an interface, not an implementation
                - Depend on interfaces, not concrete classes
                - Collaboration bw two classes
                    * Determine what exactly one object needs from the other: which method does it execute?
                    * Describe these methods in a new interface or abstract class.
                    * Make the class that is a dependency implement this interface.
                    * Now make the second class dependent on this interface rather than on the concrete class.
            3. Favor composition over inheritance
                - Extending a class to several dimensions, may lead to combinatorial explosion of subclasses
                - Also there is lot of duplicate code bw subclasses
                - Eg Transport can have engine (Electric/Combustion) and driver (autopilot/manual)
         */

    public void execute() {

    }
}
