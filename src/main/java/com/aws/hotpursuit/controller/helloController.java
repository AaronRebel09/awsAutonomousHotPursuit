package com.aws.hotpursuit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/ping")
    public String getPing(){
        return "pong";
    }

}
