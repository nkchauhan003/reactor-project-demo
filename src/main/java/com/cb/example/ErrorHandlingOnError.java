package com.cb.example;
import reactor.core.publisher.Flux;

public class ErrorHandlingOnError {
    public static void main(String[] args) {
        Flux<String> numberStrings = Flux.just("1", "2", "Three", "4");
        var numbers = numberStrings
                .map(numberString -> Integer.parseInt(numberString))
                .doOnError(e -> System.out.println("Error happened: " + e.getMessage()))
                .subscribe(value -> System.out.println(value));
    }
}
