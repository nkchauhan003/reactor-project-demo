package com.cb.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxToMonoExampleTake {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.range(1, 5);
        Mono<Integer> mono = flux.take(1).single();

        mono.subscribe(value -> System.out.println("Value: " + value));
    }
}
