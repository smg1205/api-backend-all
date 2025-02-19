//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.smg.controller;

import com.smg.module.entity.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/"})
public class HelloController {
    @Autowired
    private BeanFactory beanFactory;

    @GetMapping({"/hello/*"})
    public String hello() {
        System.out.println(this.beanFactory.getBean(User.class));
        return "<h1>Hello, Spring MVC Start</h1>";
    }
}
