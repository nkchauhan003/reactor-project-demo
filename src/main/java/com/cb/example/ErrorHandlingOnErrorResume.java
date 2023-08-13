package com.cb.example;
import reactor.core.publisher.Flux;

public class ErrorHandlingOnErrorResume {
    public static void main(String[] args) {
        Flux<String> numberStrings = Flux.just("1", "2", "Three", "4");
        var numbers = numberStrings
                .map(numberString -> Integer.parseInt(numberString))
                .onErrorResume(e -> {
                    System.out.println("Error: " + e.getMessage());
                    return Flux.just(10, 20);
                })
                .subscribe(value -> System.out.println(value));
    }
}
