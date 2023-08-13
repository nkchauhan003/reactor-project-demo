package com.cb.operations;

import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

public class ZipDemo {
    public static void main(String[] args) {
        Flux<String> verb = Flux.just("Running", "Sitting");
        Flux<String> noun = Flux.just("Cat", "Dog", "Tiger");
        Flux<Tuple2<String, String>> zipped = Flux.zip(verb, noun);

        zipped.map(t -> t.getT1() + " " + t.getT2()).subscribe(System.out::println);
    }
}
