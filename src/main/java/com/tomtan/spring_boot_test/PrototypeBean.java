package com.tomtan.spring_boot_test;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {

    private String s;

    public PrototypeBean() {
        System.out.println("PrototypeBean created");
        this.s = new Date().toString();
    }

    public String get() {
        return this.s;
    }

}
