package com.tomtan.spring_boot_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
   
    @Autowired
    private Student student;

    @GetMapping(value="/index")
    public String sayHello() {
        return student.showInfo();
    }
}
