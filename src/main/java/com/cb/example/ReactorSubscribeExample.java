package com.cb.example;

import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

public class ReactorSubscribeExample {
    public static void main(String[] args) {
        // Subscribe to a Mono
        Mono<String> mono = Mono.just("Hello, Mono!");
        mono.subscribe(
                value -> System.out.println("Received: " + value), // OnNext
                error -> System.err.println("Error: " + error.getMessage()), // OnError
                () -> System.out.println("Mono completed.") // OnComplete
        );

        // Subscribe to a Flux
        Flux<Integer> flux = Flux.range(1, 5);
        flux.subscribe(
                value -> System.out.println("Received: " + value), // OnNext
                error -> System.err.println("Error: " + error.getMessage()), // OnError
                () -> System.out.println("Flux completed.") // OnComplete
        );
    }
}
