package com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern;

import com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.processor.AuthProcessor;
import com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.processor.OAuthProcessor;
import com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.processor.UsernamePasswordProcessor;
import com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.request.OAuthRequest;
import com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.request.SamlRequest;
import com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.request.UsernamePasswordRequest;

public class ChainOfResponsibilityDemo {
    public void execute() {
        System.out.println("-- Chain of Responsibility pattern demo --");
        /*
            Chain of Responsibility is a behavioral design pattern that lets you pass requests along
            a chain of handlers. Upon receiving a request, each handler decides either to process the
            request or to pass it to the next handler in the chain.

            Chain of Responsibility relies on transforming particular behaviors into stand-alone objects
            called handlers. In our case, each check should be extracted to its own class with a single
            method that performs the check. The request, along with its data, is passed to this method as
            an argument.

            The Chain of Responsibility pattern is handy for:
                - Decoupling a sender and receiver of a command
                - Picking a processing strategy at processing-time

            The pattern suggests that you link these handlers into a chain. Each linked handler has a field
            for storing a reference to the next handler in the chain. In addition to processing a request,
            handlers pass the request further along the chain.

         */

        // Eg - handling authentication requests
        AuthProcessor authProcessorChain = getChainOfAuthProcessors();
        System.out.println("OAuthRequest : " + authProcessorChain.process(new OAuthRequest()));
        System.out.println("SamlRequest : " + authProcessorChain.process(new SamlRequest()));
        System.out.println("UsernamePasswordRequest : " + authProcessorChain.process(new UsernamePasswordRequest()));

    }

    private AuthProcessor getChainOfAuthProcessors() {
        // creates a chain of authentication processors: UsernamePasswordProcessor -> OAuthProcessor.
        // The auth will succeed if any of the processor returns true
        AuthProcessor oAuthProcessor = new OAuthProcessor(null);
        return new UsernamePasswordProcessor(oAuthProcessor);
    }
}
