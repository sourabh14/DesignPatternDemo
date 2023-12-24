package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example2;

import java.util.List;

public class InsuranceMessagingVisitor implements Visitor {

    @Override
    public void sendInsuranceMails(List<Client> clientList) {
        for (Client client : clientList) {
            client.accept(this);
        }
    }

    @Override
    public void visitResident() {
        System.out.println("Mail to resident: New insurance scheme for residents");
    }

    @Override
    public void visitBank() {
        System.out.println("Mail to bank: New insurance scheme for banks");
    }

    @Override
    public void visitRestaurant() {
        System.out.println("Mail to restaurant: New insurance scheme for restaurants");
    }

}
