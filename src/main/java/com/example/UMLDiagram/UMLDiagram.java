package com.example.UMLDiagram;

public class UMLDiagram {
    /*
    UML Class Diagram
            ![](class-diagram.png)

        Relations between objects - 6 types
            Association - Dependency
            Composition - Aggregation
            Inheritance - Implementation

            Association
            -----------
                - type of relationship in which one object uses or interacts with another
                - In general, you use an association to represent something like a field in a class. Reference to instance.
                - Solid line with arrow pointing towards the object it uses.
                - Driver is associated with cars - driver class will have a car field

                    Driver                                              Car
                    - cars : Car[]
                    + addCar : (car: Car)

                ![](association.png)


            Dependency
            -----------
                - a dependency exists between two classes if changes to the definition of one class result in
                    modifications in another class
                - a weaker variant of association
                - Dependency typically (but not always) implies that an object accepts another object as a method
                    parameter, instantiates, or uses another object.
                - Dashed line with arrow pointing to the object it depends
                -  Car ------> Oil
                Car                                                 Oil
                + beforeRun(oil: Oil)                               - type
                                                                    + add()
            ![](dependency.png)


            Composition
            -----------
                - Composition is a “whole-part” relationship between two objects, one of which is composed of one or
                    more instances of the other.
                - the component can only exist as a part of the container
                - Solid line with filled diamond pointing towards container
                - University <>------ Department
            ![](composition.png)


            Aggregation
            -------------
                - is a less strict variant of composition, where one object merely contains a reference to another.
                - The container doesn’t control the life cycle of the component.
                - The component can exist without the container
                - Solid line with empty diamond pointing towards Container.
                - University <>-------- Professor
            ![](aggregation.png)


            Inheritance
            -----------
                - Inheritance is also called generalization and is used to describe the relationship between
                    parent and child classes.
                - A parent class is also called a base class, and a subclass is also called a derived class.
                - is-a relationship
                - Solid line with triangle pointing towards base class
                - Car -------|> Vehicle


            Implementation
            --------------
                - used to specify the relationship between interfaces and implementation classes .
                - implements relationship
                - Dashed line with triangle pointing towards Interface/Abstract class
                - Car -------|>


            --------------------------------------------------------------

            Draw.IO class diagram
            ---------------------
            https://newdevsguide.com/2023/04/08/mermaid-class-diagrams/
            Arrange -> Insert -> Advanced -> Mermaid

            -- solid link
            .. dashed link

            <|-- inheritance (is-a)             Eg: Dog class inherits from the Animal class,
            ..|> implements  (implements)       Eg: Bird class implements the Flyable interface,

            *-- composition (has-a | part cannot exist without whole)   Eg: University has departments
            o-- aggregation (has-a | part can exis)                     Eg: Department has Teachers.

            --> association (uses-a )           Eg: Library and a Student are associated with each other.
            ..> dependency                      Eg: Order class depends on PaymentService class.






            classDiagram
                class Vehicle {

                }

classDiagram
    class GameObject {
        -String Name
        -int PosX
        -int PosY
        +Despawn() void
    }
    class DamageableObject {
        +int MaxHealth
        -int Health
        +IsDead() bool
        +TakeDamage(int damage) void
        +OnKilled() void
    }
    GameObject <|-- DamageableObject





     */
}
