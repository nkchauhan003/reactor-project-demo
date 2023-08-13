package com.cb.operations;

import reactor.core.publisher.Flux;

public class ScanDemo {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.range(1, 3);
        flux.scan(0, (v1, v2) -> v1 + v2).subscribe(System.out::println);
    }
}
