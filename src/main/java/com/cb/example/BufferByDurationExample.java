package com.cb.example;

import reactor.core.publisher.Flux;
import java.time.Duration;

public class BufferByDurationExample {
    public static void main(String[] args) throws InterruptedException {
        Flux<Long> flux = Flux.interval(Duration.ofMillis(100));
        flux.buffer(Duration.ofMillis(500)).take(3).subscribe(buffer -> System.out.println("Buffer: " + buffer));
        Thread.sleep(1500);
    }
}

