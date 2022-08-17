package com.gates.aped;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackControl 
{
    @RequestMapping("/orderFallBack")
    public Mono<String> orderServeFall()
    {
        return Mono.just("Order service is taking too long to respond or is down.");
    }

    @RequestMapping("/paymentFallBack")
    public Mono<String> paymentServeFall()
    {
        return Mono.just("Payment service is taking too long to respond or is down.");
    }
}
