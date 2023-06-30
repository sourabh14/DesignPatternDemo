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

    // The above fields of user won't change in the future.
    // Hence, we don't want to provide setters i.e. once the fields are set during constructor call, we
    // don't want to change the object. It will be immutable.
    // Also what happens when new fields get introduced.

    // We don't want to overload constructors to accommodate various optional fields
    // This is called telescoping constructors problem.

    // Builder pattern is useful when
    //      1. we don't want to lose immutability,
    //      2. there's a possibility of new fields
    //      3. we don't want to overload constructors.

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
