package com.tomtan.spring_boot_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonBean {

    @Autowired
    private PrototypeBean prototypeBean;

    public String get() {
        return this.prototypeBean.get();
    }

}
