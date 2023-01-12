package com.pangus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/world")
    public String sayHi(){
        System.out.println("abc");
        System.out.println("efg");
        System.out.println("dev");
        System.out.println("dev modify");
        System.out.println("master modify");
        System.out.println("local code");
        return "helloworld";
    }
}
