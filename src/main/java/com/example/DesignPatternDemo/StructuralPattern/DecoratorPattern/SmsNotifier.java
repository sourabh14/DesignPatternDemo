package com.example.DesignPatternDemo.StructuralPattern.DecoratorPattern;

import java.util.List;

import lombok.Builder;

@Builder
public class SmsNotifier implements Notifier {

    List<String> contacts;

    @Override
    public void send(String message) {
        for (String contact : contacts) {
            System.out.println("Contact: : " + contact + ", Sending sms : " + message);
        }
    }

}
