package com.tomtan.spring_boot_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
   
    @GetMapping(value="/index")
    public String sayHello() {
        return ("Hello world from Spring Boot...");
    }
}
