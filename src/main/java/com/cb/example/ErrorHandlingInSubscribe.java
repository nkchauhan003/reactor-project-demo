package com.cb.example;
import reactor.core.publisher.Flux;

public class ErrorHandlingInSubscribe {
    public static void main(String[] args) {
        Flux<String> numberStrings = Flux.just("1", "2", "Three", "4");
        var numbers = numberStrings
                .map(numberString -> Integer.parseInt(numberString))
                .subscribe(value -> System.out.println(value),
                        e -> System.out.println("Error happened: "+e.getMessage()));
    }
}
