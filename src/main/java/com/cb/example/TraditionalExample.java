package com.cb.example;

public class TraditionalExample {
    public static void main(String[] args) {
        // Simulate blocking I/O operation
        String result = performBlockingOperation();

        // Process the result
        processResult(result);

        System.out.println("Program completed.");
    }

    private static String performBlockingOperation() {
        // Simulate a time-consuming operation
        try {
            Thread.sleep(2000);  // Blocking operation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Operation Result";
    }

    private static void processResult(String result) {
        System.out.println("Processed result: " + result);
    }
}
