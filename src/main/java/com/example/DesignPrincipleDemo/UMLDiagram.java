package com.example.DesignPrincipleDemo;

public class UMLDiagram {
    /*
    UML Class Diagram
            ![](class-diagram.png)

        Relations between objects
            Association
                - type of relationship in which one object uses or interacts with another
                - In general, you use an association to represent something like a field in a class.
                - In UML diagrams the association relationship is shown by a simple arrow drawn from an object
                    and pointing to the object it uses.
                ![](association.png)

            Dependency
                - a dependency exists between two classes if changes to the definition of one class result in
                    modifications in another class
                - a weaker variant of association
                - Dependency typically (but not always) implies that an object accepts another object as a method
                    parameter, instantiates, or uses another object.
                - Shown by dashed line pointing to the object it depends
            ![](dependency.png)

            Composition
                - Composition is a “whole-part” relationship between two objects, one of which is composed of one or
                    more instances of the other.
                - the component can only exist as a part of the container.
                - shown by a line with a filled diamond at the container end and an arrow at the end pointing
                    toward the component.
            ![](composition.png)

            Aggregation
                - is a less strict variant of composition, where one object merely contains a reference to another.
                - The container doesn’t control the life cycle of the component. The component can exist without the container
                - empty diamond at the arrow’s base.
            ![](aggregation.png)
     */
}
