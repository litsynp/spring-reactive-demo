package com.litsynp.webfluxdemo.api;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Stream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/hello")
public class HelloHandler {

    @GetMapping
    Flux<String> hello() {
        return Flux.just("Hello", "World");
    }

    @GetMapping("/stream")
    Flux<Map<String, Integer>> stream() {
        Stream<Integer> stream = Stream.iterate(0, i -> i + 1);
        return Flux.fromStream(stream.limit(10))
                .map(i -> Collections.singletonMap("value", i));
    }

    // Send with Accept: application/stream+json
    @GetMapping("/inf-stream")
    Flux<Map<String, Integer>> infiniteStream() {
        Stream<Integer> stream = Stream.iterate(0, i -> i + 1);
        return Flux.fromStream(stream)
                .map(i -> Collections.singletonMap("value", i));
    }

    @PostMapping("/to-upper")
    Mono<String> toUpper(@RequestBody Mono<String> body) {
        return body.map(String::toUpperCase);
    }

    @PostMapping("/double")
    Flux<Map<String, Integer>> doubleValue(@RequestBody Flux<Map<String, Integer>> body) {
        return body.map(m -> Collections.singletonMap("double", m.get("value") * 2));
    }
}
