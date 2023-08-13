package com.cb.example;

import reactor.core.publisher.Flux;

public class BufferByCountExample {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.range(1, 10);
        flux.buffer(2).subscribe(buffer -> System.out.println("List: " + buffer));
    }
}
