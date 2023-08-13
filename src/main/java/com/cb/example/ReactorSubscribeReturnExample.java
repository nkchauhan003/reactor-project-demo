package com.cb.example;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;

public class ReactorSubscribeReturnExample {
    public static void main(String[] args) {
        Flux<String> flux = Flux.just("A", "B", "C", "D");

        Disposable disposable = flux.subscribe(
                value -> System.out.println("Received: " + value),
                error -> System.err.println("Error: " + error.getMessage()),
                () -> System.out.println("Completed.")
        );

        // You can use the disposable to cancel the subscription if needed
        disposable.dispose();
    }
}
