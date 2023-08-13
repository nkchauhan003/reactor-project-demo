package com.cb.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // Simulate non-blocking CompletableFuture operation
        CompletableFuture<String> resultFuture = performCompletableFutureOperation();

        resultFuture.thenAccept(
                result -> processResult(result)
        ).exceptionally(
                error -> {
                    handleError(error);
                    return null;
                }
        ).thenRun(() -> System.out.println("Program completed."));

        // The program continues without waiting for the CompletableFuture operation to finish
        System.out.println("Continuing program execution...");

        // Delay to allow CompletableFuture operation to complete
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static CompletableFuture<String> performCompletableFutureOperation() {
        return CompletableFuture.supplyAsync(() -> {
            // Simulate a time-consuming operation
            try {
                Thread.sleep(2000);  // Non-blocking operation
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "CompletableFuture Result";
        }, Executors.newFixedThreadPool(2));
    }

    private static void processResult(String result) {
        System.out.println("Processed result: " + result);
    }

    private static void handleError(Throwable error) {
        System.err.println("Error: " + error.getMessage());
    }
}
