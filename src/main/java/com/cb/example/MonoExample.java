package com.cb.example;
import reactor.core.publisher.Mono;

public class MonoExample {
    public static void main(String[] args) {
        Mono<String> mono = Mono.just("Hello, Mono!");
        mono.subscribe(result -> System.out.println(result));
    }
}
