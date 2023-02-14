package com.docker.example3.dockerjar3.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class spring_hello {
    @GetMapping
    public String hello(){
        return "Hello Spring world";
    }
}
