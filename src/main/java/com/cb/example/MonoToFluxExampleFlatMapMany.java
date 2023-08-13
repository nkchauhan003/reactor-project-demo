package com.cb.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoToFluxExampleFlatMapMany {
    public static void main(String[] args) {
        Mono<Integer> mono = Mono.just(10);
        Flux<Integer> flux = mono.flatMapMany(value -> Flux.just(value));

        flux.subscribe(value -> System.out.println("Value: " + value));
    }
}
