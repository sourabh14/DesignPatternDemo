package com.example;

public class Summary {
    /*
        Creational Patterns:
        ====================
            - provides object creation mechanisms.

        Factory :
            - provides an interface for creating objects in a superclass, but allows subclasses to alter the type of
                objects that will be created.
            - create objects without exposing the instantiation logic to the client.
            - Usage: when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
            - Eg: ShapeFactory createShape()

        Builder :
            - lets you construct complex object step by step.
            - Usage: creating objects with a large number of optional parameters or configurations
            - Eg: Employee class with several optional fields

        Prototype :
            - lets you copy existing objects without making your code dependent on their classes.
            - Usage: Some fields might be private and not accessible from outside
            - Eg: java.lang.Cloneable interface provides clone() method

        Singleton :
            - lets you ensure that a class has only one instance, while providing a global access point to this instance.
            - Eg: Database instance



    Structural Patterns:
    =====================
            - explain how to assemble objects and classes into larger structures, while keeping this structures flexible and efficient.

        Bridge:
            - allows you to separate the abstraction from the implementation, so that two can vary independently.
            - prefer composition over inheritance
            - Eg: Shape can have type and color: RedCircle, BlueCircle, RedSquare, BlueSquare etc..

        Adapter:
            - lets classes work together which have incompatible interfaces
            - converts the interface of one object so that another object can understand it
            - Eg: Webdriver has getElement and selectElement. Other browser firefox has findElement and clickElement

        Proxy:
            - Proxy means an object representing another object. It provides the control for accessing the original object.
            - operations like hiding the information of original object, on demand loading
            - Eg: on demand loading of an expensive object

        Facade:
            - provides a simplified interface to a library, a framework, or any other complex set of classes
            - Eg: DAO layer in application. We need few interaction of db layer.

        Decorator:
            - Add flexible additional responsibilities to an object dynamically
            - Uses composition instead of inheritance to extend the functionality
            - Eg CommandProcessor with method - receive(), execute(), respond(). Add TimerDecorator to it.

        Composite:
            - compose objects into tree structures and then work with these structures as if they were individual objects
            - treat individual objects and compositions of objects uniformly
            - Eg: Calculate size of a directory structure, containing files and directories.

        Flyweight :
            - lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects
            - Usage: when we need to create a large number of similar objects
            - Eg: Tree with attributes - Co-ordinates and TreeType (can be cached)



    Behavioural Patterns:
    =====================
        - concerned with algorithms and the assignment of responsibilities between objects.

        Strategy:
            - enables selecting an algorithm at runtime.
            - We define multiple algorithms and let client pplication pass the algorithm to be used as a parameter
            - Eg: Collections.sort(). Based on the different implementations of Comparator interfaces, the Objects are
                getting sorted in different ways. Collections.sort(col, Collections.reverseOrder());
            - Eg2: Applying different types of discount diwaliDiscount, newYearDiscount to Cart

        Chain of responsibility:
            - lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides
                either to process the request or to pass it to the next handler in the chain.
            - Eg: handling authentication requests

        Observer:
            - lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.
            - Eg: a news agency notifies channels when it receives news

        Command:
            - an object is used to encapsulate all information needed to perform an action or trigger an event at a later time.
            - Rather than directly executing any request with your business logic, you will convert your request into
                command and that command will be executed via business logic.
            - Usage: delay or queue a request’s execution, and support undo operations. Loose coupling bw request and response.
            - Eg: text editor, open, save, undo

        Mediator :
            - mediator pattern defines an object that encapsulates how a set of objects interact.
            - Mediator pattern lets you reduce chaotic dependencies between objects. The pattern restricts
                direct communications between the objects and forces them to collaborate only via a mediator object.
            - Eg: Power supply, fan, button

        Iterator :
            - lets you traverse elements of a collection sequentially without exposing its underlying representation (list, stack, tree, etc.).
            - java.util.Iterator interface methods
                    - hasNext(): - returns true if there are more elements left in the iteration.
                    - next() - returns next element in the traversal
                    - remove() - remove the last element returned by the iterator
            - Eg: all Collections have iterator

        Visitor :
            - separates the algorithms or behaviors from the objects on which they operate
            - The Visitor pattern suggests that you place the new behavior into a separate class called visitor,
                instead of trying to integrate it into existing classes. The original object that had to perform
                the behavior is now passed to one of the visitor’s methods as an argument, providing the method access
                to all necessary data contained within the object.
            - Eg: messaging functionality for insurance company clients based on their type

        Memento:
            - lets you save and restore the previous state of an object without revealing the details of its implementation.
            - This is done by saving the current state of the object as it changes state.
            - Eg: Article content - save, undo(revert) - methods: createMemento, restoreMemento

        Template:
            - defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the
                algorithm without changing its structure.
            - break down an algorithm into a series of steps, turn these steps into methods, and put a series of calls
                to these methods inside a single “template method.”
            - Eg: Sport game - Cricket, Football - all sport will follow steps initialize(); startPlay(); endPlay();

     */
}
