package com.cb.example;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class ReactiveExample {
    public static void main(String[] args) {
        // Simulate non-blocking reactive operation
        Mono<String> resultMono = performReactiveOperation()
                .subscribeOn(Schedulers.parallel());

        resultMono.subscribe(
                result -> processResult(result),
                error -> handleError(error),
                () -> System.out.println("Program completed.")
        );

        // The program continues without waiting for the reactive operation to finish
        System.out.println("Continuing program execution...");

        // Delay to allow reactive operation to complete
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static Mono<String> performReactiveOperation() {
        return Mono.fromCallable(() -> {
            // Simulate a time-consuming operation
            Thread.sleep(2000);  // Non-blocking operation
            return "Reactive Result";
        });
    }

    private static void processResult(String result) {
        System.out.println("Processed result: " + result);
    }

    private static void handleError(Throwable error) {
        System.err.println("Error: " + error.getMessage());
    }
}
