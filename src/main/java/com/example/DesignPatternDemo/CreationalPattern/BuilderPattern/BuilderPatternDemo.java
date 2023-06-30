package com.example.DesignPatternDemo.CreationalPattern.BuilderPattern;

public class BuilderPatternDemo {
    public void execute() {
        // use lombok @Bbuilder - that cuts boilerplatee code
        System.out.println("--Builder pattern demo--");
        Employee employee1 = new Employee
                .EmployeeBuilder(1, "fname1", "lname1")
                .build();
        System.out.println(employee1.toString());

        Employee employee2 = new Employee
                .EmployeeBuilder(1, "fname1", "lname1")
                .setAge(34)
                .setBloodGroup("B-")
                .build();
        System.out.println(employee2.toString());

    }
}
