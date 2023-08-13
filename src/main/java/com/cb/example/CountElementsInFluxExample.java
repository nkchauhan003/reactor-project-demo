package com.cb.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class CountElementsInFluxExample {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.range(1, 5);
        Mono<Long> countMono = flux.count();
        countMono.subscribe(count -> System.out.println("Number of Elements: " + count));
    }
}
