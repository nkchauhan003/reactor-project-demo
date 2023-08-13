package com.cb.operations;

import reactor.core.publisher.Flux;

public class ReduceDemo {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.range(1, 3);
        flux.reduce(0, (v1, v2) -> v1 + v2).subscribe(System.out::println);
    }
}
