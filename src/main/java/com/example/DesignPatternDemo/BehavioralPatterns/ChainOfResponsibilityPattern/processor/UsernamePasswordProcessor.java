package com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.processor;

import com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.request.AuthRequest;
import com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.request.UsernamePasswordRequest;

public class UsernamePasswordProcessor extends AuthProcessor {

    public UsernamePasswordProcessor(AuthProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean process(AuthRequest authRequest) {
        if (authRequest instanceof UsernamePasswordRequest) {
            return true;
        }
        else if (this.nextProcessor != null) {
            return this.nextProcessor.process(authRequest);
        }
        return false;
    }

}
