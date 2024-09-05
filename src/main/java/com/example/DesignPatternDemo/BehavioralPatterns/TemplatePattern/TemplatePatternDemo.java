package com.example.DesignPatternDemo.BehavioralPatterns.TemplatePattern;

public class TemplatePatternDemo {
    public void execute() {
        System.out.println("\n---- TemplatePatternDemo.execute ----");
        /*
            Intro:
                Template pattern defines the skeleton of an algorithm in the superclass but lets subclasses override
                specific steps of the algorithm without changing its structure.

                The Template Method pattern suggests that you break down an algorithm into a series of steps, turn these
                steps into methods, and put a series of calls to these methods inside a single “template method.”
                The steps may either be abstract, or have some default implementation. To use the algorithm, the client
                is supposed to provide its own subclass, implement all abstract steps, and override some of the optional
                ones if needed (but not the template method itself).

            Usage:
                - Use the Template Method pattern when you want to let clients extend only particular steps of an
                algorithm, but not the whole algorithm or its structure.

                - Use the pattern when you have several classes that contain almost identical algorithms with some minor
                differences. As a result, you might need to modify both classes when the algorithm changes.

            Template Methods in Java Core Libraries:
                This pattern is widely used in the Java core libraries, for example by java.util.AbstractList, or
                java.util.AbstractSet.
                For instance, Abstract List provides a skeletal implementation of the List interface.
         */

        Game game = new Cricket();
        game.play();

        Game game2 = new Football();
        game2.play();
    }
}
