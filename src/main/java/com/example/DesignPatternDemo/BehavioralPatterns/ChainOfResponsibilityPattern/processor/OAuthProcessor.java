package com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.processor;

import com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.request.AuthRequest;
import com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.request.OAuthRequest;

public class OAuthProcessor extends AuthProcessor {

    public OAuthProcessor(AuthProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean process(AuthRequest authRequest) {
        if (authRequest instanceof OAuthRequest) {
            return true;
        }
        else if (this.nextProcessor != null) {
            return nextProcessor.process(authRequest);
        }
        return false;
    }
}
