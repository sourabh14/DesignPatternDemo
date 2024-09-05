package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example2;

import java.util.List;

public interface Visitor {
    void sendInsuranceMails(List<Client> clientList);
    void visitResident();
    void visitBank();
    void visitRestaurant();

}
