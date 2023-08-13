package com.cb.operations;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FilterDemo {
    public static void main(String[] args) {
        Mono<Integer> mono = Mono.just(1);
        mono.filter(n -> n % 2 == 0).map(number -> number + 2).subscribe(System.out::println);

        Flux<Integer> flux = Flux.range(1, 3);
        flux.filter(n -> n % 2 == 0).map(number -> "Number: " + number).subscribe(System.out::println);
    }
}
