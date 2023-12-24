package com.example.DesignPatternDemo.StructuralPattern.FacadePattern;

public class FacadeDemo {

    public void execute() {
        System.out.println("\n--Facade pattern demo--");

        /*
            A facade provides a simplified interface to a library, a framework, or any other complex set of classes.

            A facade might provide limited functionality in comparison to working with the subsystem directly.
            However, it includes only those features that clients really care about. Having a facade is handy when
            you need to integrate your app with a sophisticated library that has dozens of features, but you just need
            a tiny bit of its functionality.

            Besides a much simpler interface, there's one more benefit of using this design pattern. It decouples a client
            implementation from the complex subsystem. Thanks to this, we can make changes to the existing subsystem and don't
            affect a client.

            Usage:
            1. Use the Facade pattern when you need to have a limited but straightforward interface to a complex subsystem.
            2. Use the Facade when you want to structure a subsystem into layers.


            Eg: DAO layer in application. We need few interaction of db layer. Also if there are any changes in db,
            such as change from mysql to mongo, only changes required are in dao layer and not in service logic.
            This introduces decoupling.


         */
    }

}
