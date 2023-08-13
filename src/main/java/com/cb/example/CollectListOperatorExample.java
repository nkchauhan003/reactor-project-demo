package com.cb.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.List;

public class CollectListOperatorExample {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.range(1, 5);
        Mono<List<Integer>> listMono = flux.collectList();
        listMono.subscribe(list -> System.out.println("Collected List: " + list));
    }
}
