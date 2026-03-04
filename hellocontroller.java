package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    // GET /api/hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    // GET /api/hello/John
    @GetMapping("/hello/{name}")
    public String sayHelloToName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // GET /api/greet?name=John&age=25
    @GetMapping("/greet")
    public String greet(@RequestParam String name,
                        @RequestParam int age) {
        return "Hi " + name + ", you are " + age + " years old!";
    }
}
