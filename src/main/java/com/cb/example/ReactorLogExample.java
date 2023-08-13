package com.cb.example;

import reactor.core.publisher.Flux;

public class ReactorLogExample {
    public static void main(String[] args) {
        Flux<String> mono = Flux.just("A", "B", "C", "D", "E");
        mono.log().subscribe(
                value -> System.out.println("Received: " + value),
                error -> System.err.println("Error: " + error.getMessage()),
                () -> System.out.println("Mono completed.")
        );
    }
}
