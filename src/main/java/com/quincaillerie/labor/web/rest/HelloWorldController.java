package com.quincaillerie.labor.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {
    //GET
    //URI - /hello-world
    //method - "Hello World"
    @GetMapping("getHello")

    public String helloWorld(){
        return "Hello World";
    }
}
