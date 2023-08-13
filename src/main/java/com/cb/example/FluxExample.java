package com.cb.example;

import reactor.core.publisher.Flux;

public class FluxExample {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.range(1, 5);
        flux.subscribe(item -> System.out.println(item));
    }
}
