package com.tomtan.spring_boot_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    private Address address;

    public String showInfo() {
        return "Student address is: " + address.getAddress();
    }
}
