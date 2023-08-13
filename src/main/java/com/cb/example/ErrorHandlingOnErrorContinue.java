package com.cb.example;
import reactor.core.publisher.Flux;

public class ErrorHandlingOnErrorContinue {
    public static void main(String[] args) {
        Flux<String> numberStrings = Flux.just("1", "2", "Three", "4");
        var numbers = numberStrings
                .map(numberString -> Integer.parseInt(numberString))
                .onErrorContinue((e,value)->{
                    System.out.println("Error for value: "+value+", error: "+e.getMessage());
                })
                .subscribe(value -> System.out.println(value));
    }
}
