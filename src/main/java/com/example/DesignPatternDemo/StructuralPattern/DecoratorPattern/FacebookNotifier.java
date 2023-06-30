package com.example.DesignPatternDemo.StructuralPattern.DecoratorPattern;

import java.util.List;

import lombok.Builder;

@Builder
public class FacebookNotifier implements Notifier {
    List<String> facebookIds;

    @Override
    public void send(String message) {
        for (String facebookId : facebookIds) {
            System.out.println("FacebookId: : " + facebookId + ", Sending chat message : " + message);
        }
    }
}
