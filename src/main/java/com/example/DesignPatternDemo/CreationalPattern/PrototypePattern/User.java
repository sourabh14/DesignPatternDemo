package com.example.DesignPatternDemo.CreationalPattern.PrototypePattern;

public class User implements Cloneable {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public User clone() {
        User cloneUser = new User(this.id, this.name);
        return cloneUser;
    }

}
