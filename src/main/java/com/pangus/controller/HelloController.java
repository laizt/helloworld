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
        return "helloworld";
    }
}
