package com.software.instruments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/v1")
public class MessageController {

    @GetMapping("/message")
    public String get() {
        return "The quick brown fox jumps over the lazy dog";
    }
}
