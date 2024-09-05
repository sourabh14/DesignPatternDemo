package com.example.DesignPatternDemo.StructuralPattern.DecoratorPattern;

import java.util.List;

public class SlackNotifier extends NotifierDecorator {
    private List<String> slackIds;

    public SlackNotifier(Notifier notifier, List<String> slackIds) {
        super(notifier);
        this.slackIds = slackIds;
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSlackMessage(message);
    }

    public void sendSlackMessage(String message) {
        for (String slackId : slackIds) {
            System.out.println("Slack id: " + slackId + ", Sending message: " + message);
        }
    }
}
