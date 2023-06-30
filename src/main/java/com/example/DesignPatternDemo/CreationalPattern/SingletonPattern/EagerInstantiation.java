package com.example.DesignPatternDemo.CreationalPattern.SingletonPattern;

public class EagerInstantiation {

    private static EagerInstantiation obj = new EagerInstantiation();

    private EagerInstantiation() {}

    public static EagerInstantiation getInstance() {
        return obj;
    }

    /* Here we have created instance of singleton in static initializer.
        JVM executes static initializer when the class is loaded and hence this is
        guaranteed to be thread safe.

        Use this method only when your singleton class is light and is used throughout the
        execution of your program.
     */

}
