package com.cb;

import reactor.core.publisher.Mono;

public class App 
{
    public static void main(String[] args) {
        Mono<String> mono = Mono.just("Hello, Reactor!");

        mono.subscribe(message -> System.out.println(message));
    }
}
