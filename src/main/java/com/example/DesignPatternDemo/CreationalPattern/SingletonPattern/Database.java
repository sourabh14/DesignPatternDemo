package com.example.DesignPatternDemo.CreationalPattern.SingletonPattern;

public class Database {

    private static Database database;

    private Database() {}

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    // The main problem with above method is that it is not thread safe.
    // two objects for singleton can be created.
}
