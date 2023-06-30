package com.example.DesignPatternDemo.CreationalPattern.SingletonPattern;

public class ThreadSafeDatabase {

    private static ThreadSafeDatabase database;

    private ThreadSafeDatabase() {}

    // Make getInstance synchronized
    // using synchronized makes sure that only one thread at a time can execute getInstance()

    // The main disadvantage of this is method is that using synchronized every time while
    // creating the singleton object is expensive and may decrease the performance of your program.
    // However if performance of getInstance() is not critical for your application this method
    // provides a clean and simple solution.
    public static synchronized ThreadSafeDatabase getInstance() {
        if (database == null) {
            database = new ThreadSafeDatabase();
        }
        return database;
    }

}
