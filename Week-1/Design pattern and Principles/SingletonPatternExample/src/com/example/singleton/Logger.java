package com.example.singleton;

public class Logger {
    // Step 3: Define a private static instance of Logger
    private static Logger instance;

    // Step 4: Make the constructor private to prevent instantiation
    private Logger() {
        // Initialization code, if needed
    }

    // Step 5: Provide a public static method to get the instance of the Logger class
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // A method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
