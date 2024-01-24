package com.example.DesignPatternDemo.BehavioralPatterns.CommandPattern;

public class CommandPatternDemo {

    public void execute() {
        System.out.println("\n---- CommandPatternDemo.execute -----");
        /*
            Intro:
                Command is a behavioral design pattern that turns a request into a stand-alone object that contains all
                information about the request. This transformation lets you pass requests as a method arguments, delay
                or queue a request’s execution, and support undoable operations. Command design pattern is used to
                implement loose coupling in a request-response model.

                The pattern intends to encapsulate in an object all the data required for performing a given action
                (command), including what method to call, the method's arguments, and the object to which the method belongs.

                This model allows us to decouple objects that produce the commands from their consumers, so that's why the
                pattern is commonly known as the producer-consumer pattern.

                Rather than directly executing any request with your business logic, you will convert your request into
                command and that command will be executed via business logic.

            Working:
                In command pattern, the request is sent to the invoker and invoker pass it to the encapsulated command
                object. Command object passes the request to the appropriate method of Receiver to perform the specific
                action.

                Invoker -> Command -> Receiver

                The client program create the receiver object and then attach it to the Command. Then it creates
                the invoker object and attach the command object to perform an action. Now when client program executes
                the action, it’s processed based on the command and receiver object.

            Components:
                The command pattern requires implementing four components:

                - Command - A command is an object whose role is to store all the information required for executing
                    an action, including the method to call, the method arguments, and the object (known as the
                    receiver) that implements the method.

                - Receiver - A receiver is an object that performs a set of cohesive actions. It's the component that
                    performs the actual action when the command's execute() method is called.

                - Invoker - An invoker is an object that knows how to execute a given command but doesn't know how the
                    command has been implemented. It only knows the command's interface. It has the list of commands.

                - Client - Will use the invoker.

            Example:
                Let's say we have a text editor, we have different kind of functionalities eg: open, copy, save.
                We can have button for these. Also we can execute these functions via keyboard shortcuts.

                So we can see that our business logic is same for different types of events - button click, keyboard
                shortcut. We can use command pattern to avoid code duplicacy.

         */


        TextFile textFile = new TextFile("File1");

        TextFileCommandInvoker invoker = new TextFileCommandInvoker();
        OpenTextFileCommand openTextFileCommand = new OpenTextFileCommand(textFile);
        SaveTextFileCommand saveTextFileCommand = new SaveTextFileCommand(textFile);

        invoker.executeCommand(openTextFileCommand);
        invoker.executeCommand(saveTextFileCommand);

        System.out.println("");

        /*
            Good software design is often based on the principle of separation of concerns, which usually results in
            breaking an app into layers. The most common example: a layer for the graphical user interface and another
            layer for the business logic. The GUI layer is responsible for rendering a beautiful picture on the screen,
            capturing any input and showing results of what the user and the app are doing. However, when it comes to
            doing something important, like calculating the trajectory of the moon or composing an annual report, the
            GUI layer delegates the work to the underlying layer of business logic.

            In the code it might look like this: a GUI object calls a method of a business logic object, passing it some
            arguments. This process is usually described as one object sending another a request.

            The Command pattern suggests that GUI objects shouldn’t send these requests directly. Instead, you should
            extract all of the request details, such as the object being called, the name of the method and the list of
            arguments into a separate com- mand class with a single method that triggers this request.

            Command objects serve as links between various GUI and business logic objects. From now on, the GUI object
            doesn’t need to know what business logic object will receive the request and how it’ll be processed. The
            GUI object just triggers the command, which handles all the details.

            Usage:
                - Use the Command pattern when you want to parametrize objects with operations.
                - Use the Command pattern when you want to queue operations, schedule their execution, or execute them remotely.
                - Use the Command pattern when you want to implement reversible operations.
         */

    }
}
