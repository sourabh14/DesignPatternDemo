package com.example.DesignPatternDemo.BehavioralPatterns.ObserverPattern;

public class ObserverPatternDemo {
    public void execute() {
        System.out.println("\n---- ObserverPatternDemo.execute ----");

        /*
            Intro:
                Observer pattern lets you define a subscription mechanism to notify multiple objects about any
                events that happen to the object they’re observing.

                Imagine that you have two types of objects: a Customer and a Store . The customer is very interested in
                a particular brand of product (say, it’s a new model of the iPhone) which should become available in the
                store very soon. The customer could visit the store every day and check prod- uct availability. But
                while the product is still en route, most of these trips would be pointless.

                Publisher: The object that has some interesting state and it’s also going to notify other objects about
                    the changes to its state
                Subscribers: All other objects that want to track changes to the publisher’s state

                The Observer pattern suggests that you add a subscription mechanism to the publisher class so individual
                objects can subscribe to or unsubscribe from a stream of 'events' coming from that publisher.
                Now, whenever an important event happens to the publisher, it goes over its subscribers and calls the
                specific notification method on their objects.

                In sum:
                    - Publisher publishes notification events to subscribers.
                    - Subscribers can start or stop listening to notifications at runtime

                Example, a news agency can notify channels when it receives news. Receiving news is what changes the
                state of the news agency, and it causes the channels to be notified.
         */

        AajTakNewsChannel aajTak = new AajTakNewsChannel();
        NdtvNewsChannel ndtv = new NdtvNewsChannel();

        NewsEventManager newsEventManager = new NewsEventManager();
        newsEventManager.subscribe(aajTak);
        newsEventManager.subscribe(ndtv);
        newsEventManager.showSubscribers();

        NewsAgency newsAgency = new NewsAgency(newsEventManager);
        newsAgency.setNews("Climate change");
        newsAgency.setNews("Ukraine war");

        newsEventManager.unsubscribe(ndtv);
        newsAgency.setNews("Economic slowdown");

        /*
            Usage:
                - Use the Observer pattern when changes to the state of one object may require changing other objects,
                    and the actual set of objects is unknown beforehand or changes dynamically.

                - Use the pattern when some objects in your app must observe others, but only for a limited time or in
                specific cases.
         */

    }

}
