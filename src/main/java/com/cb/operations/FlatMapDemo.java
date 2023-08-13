package com.cb.operations;

import reactor.core.publisher.Flux;

public class FlatMapDemo {
    public static void main(String[] args) {
        Flux<Integer> numbers = Flux.range(1, 3);
        var numberStrings = numbers.flatMap(number -> Flux.just("A: " + number, "B: " + number));
        numberStrings.subscribe(System.out::println);
    }
}
