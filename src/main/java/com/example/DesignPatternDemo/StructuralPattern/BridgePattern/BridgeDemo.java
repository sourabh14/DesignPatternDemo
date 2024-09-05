package com.example.DesignPatternDemo.StructuralPattern.BridgePattern;

public class BridgeDemo {

    public void execute() {
        System.out.println("\n--Bridge pattern demo--");

        // https://springframework.guru/gang-of-four-design-patterns/bridge-pattern/

        /*
            Intro:
                Bridge is a structural design pattern that lets you split a large class or a set of closely related
                classes into two separate hierarchies—abstraction and implementation—which can be developed independently
                of each other

                The Bridge pattern is an application of the old advice, “prefer composition over inheritance”.
                It becomes handy when you must subclass different times in ways that are orthogonal with one another.

            Example:
               We have Shape (Circle, Square) and colour (Blue, Red)
               Our application paints the shapes with colours.

               Class hierarchy:
                                Shape                   <-- Abstraction
                             /         \
                      Circle            Square          <-- Abstraction
                      /  \              /   \
             RedCircle BlueCircle RedSquare BlueSquare  <-- Implementation
               |            |       |           |
               paint()
               - "Painting circle with red colour"


           Problems with this approach:
               1. Adding new shapes and colours will grow the class hierarchy exponentially
               2. Our design relies on inheritance and one inherent disadvantage is that it breaks encapsulation.
                    If we want to change paint style then we need to update the abstraction part to make the paint
                    functionality available to clients.
                3. If we want to reuse only the implementation (painting objects) part in some other application,
                    we will have to take along the abstraction part as extra baggage.


            Solution:
                The Bridge pattern splits a large class into two separate inheritance hierarchies one for the implementations
                and one for the abstractions. These hierarchies are then connected to each other via object composition,
                forming a bridge-like structure

                Participants of the bridge pattern:
                    Abstraction (Shape): Is the interface implemented as an abstract class that clients communicate with.
                    RefinedAbstraction (Circle and Square): Are classes that implement or extend Abstraction.
                    Implementor (Painter): Is the interface of the implementation class hierarchy.
                    ConcreteImplementor(RedPainter and BluePainter): Are concrete subclasses that implements Implementor.

            Class diagram:
                                        Bridge
                        Shape <>----------------------> Painter
                        /   \           has-a           /   \
                    Circle  Square              RedPainter  BluePainter


         */


        // Draw Circle with blue colour
        Circle circle = new Circle(new BluePainter());
        circle.draw();

        // Draw Square with red colour
        Square square = new Square(new RedPainter());
        square.draw();

    }
}
