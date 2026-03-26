package com.example.DesignPrincipleDemo;

public class DesignPrinciples {
    /*
        Features of a good design (M-REM):
            - Modular : divides the system into well-defined, independent modules
            - Re-usability:
                - Cost and time are two most imp factor for software product
                - Code reuse reduces dev cost
                - The more flexible the code, higher the re-usability
            - Extensibility : flexible enough to accommodate changes in requirements
            - Maintainability : design should be clear, well-documented, and structured

            - Simplicity : as simple as possible, avoiding unnecessary complexity.
            - Testability : design should facilitate easy and effective testing
            - Cohesion and Low Coupling

        Cohesion and Low Coupling:
            - Cohesion = how closely related the responsibilities inside a single module/class are
                - High cohesion means that a module or class has a well-defined purpose, with all its functions and
                    responsibilities closely related.
                - It leads to more understandable, maintainable, and reusable components.
                - Focused responsibility - Single responsibility principle
            - Coupling = how dependent one module/class is on another
                - Low coupling refers to minimizing dependencies between modules or classes.
                - When modules are loosely coupled, changes in one module have minimal impact on others, enhancing
                    maintainability and flexibility.
                - Minimal dependencies - Using interfaces (dependency injection) instead of concrete
            - Benefits of high cohesion and low coupling
                Easier to maintain
                Easier to test
                Easier to extend
                Changes in one module don’t break others

        Flexibility vs Complexity:
            Flexibility is ability of code to:
                - Adapt to changing requirements
                - Be extended without modifying existing code (Open/Closed Principle)
                - Support reuse across different use cases
            Factors that Reduce Flexibility
                - Tight Coupling: Components are highly dependent on each other. Changes in one class require changes
                    in others
                - Dependency on Concrete Classes - Using implementations instead of abstractions (interfaces/abstract
                    classes). Violates Dependency Inversion Principle
                - Hardcoded Logic / Operations: Fixed workflows, conditions, or values. Difficult to extend without
                    modifying code


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


            KISS principle
                - "Keep It Simple, Stupid,"
                - Design classes and methods to have a single, clear responsibility

            YAGNI principle
                - "You Aren't Gonna Need It,"
                - Focus on Current Requirements, Avoid Over-Engineering

            DRY principle
                - "Don't Repeat Yourself,
                - Avoid Redundant Code


        Trade-offs in software design:
            - Trade-offs in design = balancing competing factors instead of optimizing just one.
            - There is no “perfect design” — every decision improves something while making something else worse.
            - Whenever you design a system, you’re constantly balancing:
                - Simplicity vs Flexibility:
                    - Simple design is : Easy to understand, Fast to build, Hard to extend later
                    - Flexible design is : Easy to extend, More reusable, More complex
                    - Too simple → breaks when requirements grow. Too flexible → unnecessary complexity early
                - Abstraction vs Readability
                    - High Abstraction (Interfaces, factories, strategies everywhere) : Decoupled, Extensible code but
                        Hard to trace flow, Harder debugging, Hard for new developers
                - Performance vs Maintainability
                    - High performance approach (Caching everywhere, Optimized queries, Custom logic:
                        This is Fast but Hard to maintain
                    - Premature optimization is dangerous. Optimize only when there’s a proven bottleneck

         Which constraints to consider:
                - Good engineers don’t aim for: “Best design” They aim for: “Best design for current constraints”
                - Constraints include:
                    Time
                    Team size
                    Scale
                    Future requirements uncertainty





         */

    public void execute() {

    }
}
