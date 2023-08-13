package com.cb.example;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

public class BackpressureExample {
    public static void main(String[] args) {
        Flux<Integer> numbers = Flux.range(1, 10);

        numbers.subscribe(new BaseSubscriber<Integer>() {
            @Override
            protected void hookOnSubscribe(Subscription subscription) {
                System.out.println("Subscribed!");
                request(3); // Request 3 elements initially
            }

            @Override
            protected void hookOnNext(Integer value) {
                System.out.println("Received: " + value);
                request(1); // Request 1 element at a time
            }

            @Override
            protected void hookOnError(Throwable throwable) {
                System.err.println("Error: " + throwable.getMessage());
            }

            @Override
            protected void hookOnComplete() {
                System.out.println("Completed");
            }
        });
    }
}
