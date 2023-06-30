package com.example.DesignPatternDemo.StructuralPattern.DecoratorPattern;

import java.util.List;

import lombok.Builder;

@Builder
public class EmailNotifier implements Notifier {

    List<String> emails;

    public EmailNotifier(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void send(String message) {
        for (String email : emails) {
            System.out.println("Email id: : " + email + ", Sending email : " + message);
        }
    }

}
