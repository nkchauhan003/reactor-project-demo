package com.cb.example;

import reactor.core.publisher.Mono;
import reactor.core.publisher.SignalType;

public class DoFinallyOperatorExample {
    public static void main(String[] args) {
        Mono<String> mono = Mono.just("Hello, Reactor!")
                .doFinally(signalType -> {
                    if (signalType == SignalType.ON_COMPLETE) {
                        System.out.println("Stream completed successfully.");
                    } else if (signalType == SignalType.ON_ERROR) {
                        System.out.println("Stream completed with an error.");
                    }
                });
        mono.subscribe(
                value -> System.out.println("Value: " + value),
                error -> System.err.println("Error: " + error.getMessage()),
                () -> System.out.println("Completed.")
        );
    }
}




