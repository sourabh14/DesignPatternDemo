package com.example.DesignPatternDemo.StructuralPattern.DecoratorPattern;

import java.util.List;

public class WhatsappNotifier extends NotifierDecorator {

    List<String> contacts;

    public WhatsappNotifier(Notifier notifier, List<String> contacts) {
        super(notifier);
        this.contacts = contacts;
    }

    public void send(String message) {
        super.send(message);
        sendWhatsappMessage(message);
    }

    public void sendWhatsappMessage(String message) {
        for (String contact : contacts) {
            System.out.println("Contact no: : " + contact + ", Sending whatsapp msg : " + message);
        }
    }
}
