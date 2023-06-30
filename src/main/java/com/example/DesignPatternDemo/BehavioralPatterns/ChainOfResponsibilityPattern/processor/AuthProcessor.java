package com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.processor;

import com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.request.AuthRequest;

// Abstract class for processors
public abstract class AuthProcessor {
    AuthProcessor nextProcessor;

    public AuthProcessor(AuthProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean process(AuthRequest authRequest);
}
