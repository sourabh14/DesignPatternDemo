package com.example.DesignPatternDemo.CreationalPattern.BuilderPattern;

public class Employee {
    // Mandatory fields
    public int id;
    public String firstName;
    public String lastName;

    // Optional fields
    public int age;
    public String address;
    public String department;
    public String bloodGroup;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.id = employeeBuilder.id;
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.age = employeeBuilder.age;
        this.address = employeeBuilder.address;
        this.department = employeeBuilder.department;
        this.bloodGroup = employeeBuilder.bloodGroup;
    }

    // Only getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    // toString


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                '}';
    }

    // Builder
    public static class EmployeeBuilder {
        // Mandatory fields
        public int id;
        public String firstName;
        public String lastName;
        // Optional fields
        public int age;
        public String address;
        public String department;
        public String bloodGroup;

        public EmployeeBuilder(int id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public EmployeeBuilder setBloodGroup(String bloodGroup) {
            this.bloodGroup = bloodGroup;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
