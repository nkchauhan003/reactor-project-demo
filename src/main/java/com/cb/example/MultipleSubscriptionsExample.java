package com.cb.example;

import reactor.core.publisher.Flux;

public class MultipleSubscriptionsExample {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.range(1, 5);

        // First subscriber
        flux.subscribe(
                value -> System.out.println("Subscriber 1: " + value),
                error -> System.err.println("Subscriber 1 Error: " + error.getMessage()),
                () -> System.out.println("Subscriber 1 Completed.")
        );

        // Second subscriber
        flux.subscribe(
                value -> System.out.println("Subscriber 2: " + value),
                error -> System.err.println("Subscriber 2 Error: " + error.getMessage()),
                () -> System.out.println("Subscriber 2 Completed.")
        );
    }
}