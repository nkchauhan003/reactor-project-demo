package com.cb.operations;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MapDemo {
    public static void main(String[] args) {
        Mono<Integer> mono = Mono.just(1);
        mono.map(number -> number + 2).subscribe(System.out::println);

        Flux<Integer> flux = Flux.range(1, 10);
        flux.map(number -> "Number: " + number).subscribe(System.out::println);
    }
}
