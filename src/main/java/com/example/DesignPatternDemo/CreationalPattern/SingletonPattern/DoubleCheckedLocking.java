package com.example.DesignPatternDemo.CreationalPattern.SingletonPattern;

public class DoubleCheckedLocking {

    private static volatile DoubleCheckedLocking database;

    private DoubleCheckedLocking() {}

    public static DoubleCheckedLocking getInstance() {
        if (database == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (database == null) {
                    database = new DoubleCheckedLocking();
                }
            }
        }
        return database;
    }

    /*
        Once an object is created synchronization is no longer useful because now obj
        will not be null and any sequence of operations will lead to consistent results.

        So we will only acquire lock on the getInstance() once, when the obj is null.
        This way we only synchronize the first way through

        We have declared the obj volatile which ensures that multiple threads offer the obj
        variable correctly when it is being initialized to Singleton instance.
     */

}
