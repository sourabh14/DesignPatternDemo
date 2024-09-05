package com.example.DesignPatternDemo.StructuralPattern.ProxyPattern;

public class ProxyDemo {
    public void execute() {
        System.out.println("\n--Proxy pattern demo--");

        /*
            Proxy means an object representing another object. According to GoF, a Proxy Pattern "provides the control
            for accessing the original object".

            So, we can perform many operations like hiding the information of original object, on demand loading etc.
            Proxy pattern is also known as Surrogate or Placeholder.

            The Proxy pattern allows us to create an intermediary that acts as an interface to another resource, while
            also hiding the underlying complexity of the component.



            Usage:
            - It can be used in Virtual Proxy scenario---Consider a situation where there is multiple database
                call to extract huge size image. Since this is an expensive operation so here we can use the proxy
                pattern which would create multiple proxies and point to the huge size memory consuming object for
                further processing. The real object gets created only when a client first requests/accesses the object
                and after that we can just refer to the proxy to reuse the object. This avoids duplication of the
                object and hence saving memory.

            - It can be used in Protective Proxy scenario---It acts as an authorization layer to verify that whether
                the actual user has access the appropriate content or not. For example, a proxy server which provides
                restriction on internet access in office. Only the websites and contents which are valid will be
                allowed and the remaining ones will be blocked.

            - It can be used in Remote Proxy scenario---A remote proxy can be thought about the stub in the RPC call.
                The remote proxy provides a local representation of the object which is present in the different address
                location. Another example can be providing interface for remote resources such as web service or REST resources.

            - It can be used in Smart Proxy scenario---A smart proxy provides additional layer of security by interposing
                specific actions when the object is accessed. For example, to check whether the real object is locked or
                not before accessing it so that no other objects can change it.
         */

        ExpensiveObject expensiveObject1 = new ExpensiveObjectImpl();
        expensiveObject1.process();

        ExpensiveObject expensiveObject2 = new ExpensiveObjectImpl();
        expensiveObject2.process();

        ExpensiveObject expensiveObject3 = new ExpensiveObjectImpl();
        expensiveObject3.process();

        /*
            Consider a heavy Java object (like a JDBC connection or a SessionFactory) that
            requires some initial configuration.

            We only want such objects to be initialized on demand, and once they are, we'd want
            to reuse them for all calls:
         */

        System.out.println("\n ** after using ExpensiveObjectProxy\n");

        ExpensiveObject expensiveObject4 = new ExpensiveObjectProxy();
        expensiveObject4.process();

        ExpensiveObject expensiveObject5 = new ExpensiveObjectProxy();
        expensiveObject5.process();

        ExpensiveObject expensiveObject6 = new ExpensiveObjectProxy();
        expensiveObject6.process();

        /*
            When to use proxy pattern:
            - When we want a simplified version of a complex or heavy object. In this case, we may represent it with
                a skeleton object which loads the original object on demand, also called as lazy initialization.
                This is known as the Virtual Proxy
            - When the original object is present in different address space, and we want to represent it locally.
                We can create a proxy which does all the necessary boilerplate stuff like creating and maintaining
                the connection, encoding, decoding, etc., while the client accesses it as it was present in their
                local address space. This is called the Remote Proxy
            - When we want to add a layer of security to the original underlying object to provide controlled access
                based on access rights of the client. This is called Protection Proxy

         */

    }
}
