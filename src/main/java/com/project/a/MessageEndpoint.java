package com.project.a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageEndpoint {

    @GetMapping("/message")
    public String getMessage(){
        return "The quick brown fox jumps over the lazy dog";
    }
}
