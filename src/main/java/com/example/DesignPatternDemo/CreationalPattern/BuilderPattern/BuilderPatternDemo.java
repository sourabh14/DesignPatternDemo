package com.example.DesignPatternDemo.CreationalPattern.BuilderPattern;

public class BuilderPatternDemo {
    /*
        Intro:
            - Builder is a creational design pattern that lets you construct complex object step by step.
            - The pattern allows you to produce different types and representations of an object using the same
                construction code.
            - It is often used when creating objects with a large number of optional parameters or configurations.

        Example:
             - We have an employee class with several fields, such as first name, last name, age etc..
             - The fields of employee won't change in the future.
                Challenge - We don't want to provide setters i.e. once the fields are set during constructor call,
                    we don't want to change the object. It will be immutable.
             - There's a possibility of new fields getting introduced for the employee.
                Challenge - the constructor will have to be changed, since only constructor is allowed.
                    - Also the constructor get overloaded to accommodate various optional fields This is called
                    telescoping constructors problem.
             - Some fields are mandatory, but many fields are optional.
                Challenge - In constructor call, we will have many null values

         Builder pattern is useful when
              1. We don't want to lose immutability.
              2. There's a possibility of new fields.
              3. We don't want to overload constructors.

          Lombok:
            - use @Builder annotation - that cuts boilerplate code

     */
    public void execute() {

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


        Car car = new Car.CarBuilder(1, "testcar")
                .setModel("New model")
                .build();
        System.out.println("Car: " + car);
    }
}
