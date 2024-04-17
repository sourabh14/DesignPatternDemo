package com.example.DesignPatternDemo.CreationalPattern.SingletonPattern;

public class NewDb {
    private static NewDb database;

    private NewDb() {};

    public static NewDb getInstance() {
        if (database == null) {
            synchronized (NewDb.class) {
                if (database == null) {
                    database = new NewDb();
                }
            }
        }
        return database;
    }


}
