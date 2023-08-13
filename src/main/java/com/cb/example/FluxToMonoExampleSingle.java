package com.cb.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxToMonoExampleSingle {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.just(42);
        Mono<Integer> mono = flux.single();

        mono.subscribe(value -> System.out.println("Value: " + value));
    }
}
