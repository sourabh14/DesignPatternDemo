package com.example.DesignPatternDemo;

import com.example.DesignPatternDemo.BehavioralPatterns.ChainOfResponsibilityPattern.ChainOfResponsibilityDemo;
import com.example.DesignPatternDemo.BehavioralPatterns.CommandPattern.CommandPatternDemo;
import com.example.DesignPatternDemo.BehavioralPatterns.IteratorPattern.IteratorPatternDemo;
import com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern.MediatorPatternDemo;
import com.example.DesignPatternDemo.BehavioralPatterns.MementoPattern.MementoPatternDemo;
import com.example.DesignPatternDemo.BehavioralPatterns.ObserverPattern.ObserverPatternDemo;
import com.example.DesignPatternDemo.BehavioralPatterns.StatePattern.StatePatternDemo;
import com.example.DesignPatternDemo.BehavioralPatterns.StrategyPattern.StrategyPatternDemo;
import com.example.DesignPatternDemo.BehavioralPatterns.TemplatePattern.TemplatePatternDemo;
import com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.VisitorPatternDemo;
import com.example.DesignPatternDemo.CreationalPattern.BuilderPattern.BuilderPatternDemo;
import com.example.DesignPatternDemo.CreationalPattern.FactoryPattern.FactoryPatternDemo;
import com.example.DesignPatternDemo.CreationalPattern.PrototypePattern.PrototypeDemo;
import com.example.DesignPatternDemo.CreationalPattern.SingletonPattern.SingletonDemo;
import com.example.DesignPatternDemo.StructuralPattern.AdapterPattern.AdapterDemo;
import com.example.DesignPatternDemo.StructuralPattern.BridgePattern.BridgeDemo;
import com.example.DesignPatternDemo.StructuralPattern.CompositePattern.CompositeDemo;
import com.example.DesignPatternDemo.StructuralPattern.DecoratorPattern.DecoratorDemo;
import com.example.DesignPatternDemo.StructuralPattern.FlyweightPattern.FlyweightDemo;
import com.example.DesignPatternDemo.StructuralPattern.ProxyPattern.ProxyDemo;
import com.example.DesignPrincipleDemo.SOLIDPrinciples;

public class DesignPatternDemoApplication {

	public static void main(String[] args) {
		System.out.println("Design Principles Demo\n");

		new SOLIDPrinciples().execute();

		System.out.println("Design Pattern Demo\n");

		new FactoryPatternDemo().execute();

		new BuilderPatternDemo().execute();

		new PrototypeDemo().execute();

		new SingletonDemo().execute();

		new AdapterDemo().execute();

		new BridgeDemo().execute();

		new CompositeDemo().execute();

		new DecoratorDemo().execute();

		new FlyweightDemo().execute();

		new ProxyDemo().execute();

		new ChainOfResponsibilityDemo().execute();

		new CommandPatternDemo().execute();

		new IteratorPatternDemo().execute();

		new MediatorPatternDemo().execute();

		new MementoPatternDemo().execute();

		new ObserverPatternDemo().execute();

		new StatePatternDemo().execute();

		new StrategyPatternDemo().execute();

		new TemplatePatternDemo().execute();

		new VisitorPatternDemo().execute();
	}

}
