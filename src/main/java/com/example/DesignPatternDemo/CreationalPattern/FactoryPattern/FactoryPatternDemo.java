package com.example.DesignPatternDemo.CreationalPattern.FactoryPattern;

public class FactoryPatternDemo {
    /*
        Intro:
            - Factory Method is a creational design pattern that provides an interface for creating objects in a superclass,
            but allows subclasses to alter the type of objects that will be created.
            - This pattern is useful when we want to create objects without exposing the instantiation logic to the client.

        Implementation:
            - The Factory Method pattern suggests that you replace direct object construction calls (using the new operator)
                with calls to a special factory method.
            - Don’t worry: the objects are still created via the new operator, but it’s being called from within the
                factory method. Objects returned by a factory method are often referred to as products.
            - The client code doesn’t see a difference between the actual products returned by various subclasses.
                The client treats all the products as abstract Shape. The client knows that all shape objects are
                supposed to have the draw method, but exactly how it works isn’t important to the client.
            - The factory method pattern loosens the coupling code by separating our Product‘s construction code from
                the code that uses this Product. This design makes it easy to extract the Product construction
                independently from the rest of the application.
            - Besides, it allows the introduction of new products without breaking existing code.
            - Factory pattern follows SRP and OCP.

        Applicability:
           - Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects
            your code should work with.
           - Use the Factory Method when you want to provide users of your library or framework with a way to
            extend its internal components.
           - Use the Factory Method when you want to save system resources by reusing existing objects instead
            of rebuilding them each time.

        Use in java:
            - getInstance() method of java.util.Calendar, NumberFormat, and ResourceBundle uses factory method design pattern
            - All the wrapper classes like Integer, Boolean etc, in Java uses this pattern to evaluate the values using valueOf() method.
     */

    public void execute() {
        System.out.println("--Factory pattern demo--");
        // Take input of shape type
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a shape: ");
//        String shapeType = scanner.nextLine();

        String shapeType = "square";


        // Create shape based on type
        // ***** If a new shape is added then the client code (FactoryPatternDemo.java) won't change ******
        // Object creation logic is now
        Shape shape = new ShapeFactory().createShape(shapeType);

        // Draw the shape
        shape.draw();
        System.out.println("\n");
    }
}
