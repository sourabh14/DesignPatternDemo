package com.example.DesignPatternDemo.CreationalPattern.BuilderPattern.test;

import java.util.Date;

public class Employee {
    private String name;
    private String address;

    private Date dob;
    private Boolean married;

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    class EmployeeBuilder {
        private String name;
        private String address;

        private Date dob;
        private Boolean married;

        public EmployeeBuilder(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public EmployeeBuilder dob(Date dob) {
            this.dob = dob;
            return this;
        }

        public EmployeeBuilder married(Boolean married) {
            this.married = married;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee(this.name, this.address);
            employee.setDob(this.dob);
            employee.setMarried(this.married);
            return employee;
        }
    }
}
