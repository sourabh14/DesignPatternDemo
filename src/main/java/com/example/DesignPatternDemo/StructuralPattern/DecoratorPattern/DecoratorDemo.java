package com.example.DesignPatternDemo.StructuralPattern.DecoratorPattern;

import java.util.Arrays;

public class DecoratorDemo {
    public void execute() {
        System.out.println("\n--Decorator/Wrapper pattern demo--");
        /*
            Intro:
                Decorator design pattern is used to modify the functionality of an object at runtime. At the same
                time other instances of the same class will not be affected by this, so individual object gets
                the modified behavior.

                A Decorator Pattern says that just "attach a flexible additional responsibilities to an object dynamically".

                The Decorator Pattern uses composition instead of inheritance to extend the functionality
                of an object at runtime. The Decorator Pattern is also known as Wrapper.

                We use inheritance or composition to extend the behavior of an object but this is done at
                compile time and its applicable to all the instances of the class. We can’t add any new
                functionality of remove any existing behavior at runtime - this is when Decorator pattern comes
                into picture.

                See problem statement in the book.
         */

        Notifier emailNotifier = EmailNotifier.builder().emails(Arrays.asList("test1@gmail.com", "test2@gmail.com")).build();
        emailNotifier.send("hello world !!");

        Notifier smsNotifier = SmsNotifier.builder().contacts(Arrays.asList("9999999999", "8888888888")).build();
        smsNotifier.send("notif from sms");

        Notifier facebookNotifier = FacebookNotifier.builder().facebookIds(Arrays.asList("abc1", "def2")).build();
        facebookNotifier.send("notification from fb");

        /*
            What if we want both email and sms notifier, or email and fb notifier.
            We can create a new class EmailAndSmsNotifier, however this has several flaws as mentioned in the book.

            Sending email is our basic functionality. It is altered by decorators.
            We want to attach additional responsibilities to emailNotifier either statically or dynamically.

         */

        // Component
        Notifier notifier = new EmailNotifier(Arrays.asList("test1@gmail.com", "test2@gmail.com"));

        // Decorators
        notifier = new WhatsappNotifier(notifier, Arrays.asList("7676767676", "4848484848"));
        notifier = new SlackNotifier(notifier, Arrays.asList("slid1", "slid2", "slid3"));

        notifier.send("this is decorator pattern");

        /*
            Usage:
            1. Use the Decorator pattern when you need to be able to assign extra behaviors to
            objects at runtime without breaking the code that uses these objects.

            2. Use the pattern when it’s awkward or not possible to extend an object’s behavior
            using inheritance.

            Example:

                I've recently used the decorator pattern in a web service which uses the following CommandProcessor interface:

                public Command receive(Request request);
                public Response execute(Command command);
                public void respond(Response response);

                Basically, the CommandProcessor receives a Request and creates the proper Command, executes the Command
                and creates the appropriate Response, and sends the Response. When I wanted to add timing and log it,
                I created a TimerDecorator that used an existing CommandProcessor as its component.

                The TimerDecorator implements CommandProcessor interface, but just adds timing and then calls its target
                , which is the real CommandProcessor. Something like this:

                public class TimerDecorator implements CommandProcessor {
                   private CommandProcessor target;
                   private Timer timer;

                   public TimerDecorator(CommandProcessor processor) {
                      this.target = processor;
                      this.timer = new Timer();
                   }

                   public Command receive(Request request) {
                      this.timer.start();
                      return this.target.receive(request);
                   }

                   public Response execute(Command command) {
                      return this.target.execute(command);
                   }

                   public void respond(Response response) {
                      this.target.response(response);
                      this.timer.stop();
                      // log timer
                   }

                }
                So the real CommandProcessor is wrapped inside TimerDecorator, and I can treat TimerDecorator just
                like the target CommandProcessor, but now timing logic has been added.




         */

    }
}
