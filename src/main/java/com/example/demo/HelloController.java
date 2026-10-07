package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/hello")
@RestController 
public class HelloController {

    @GetMapping 
    public HelloResponse hello(){
        return new HelloResponse("Hello world");
    }

    @PostMapping("/{name}")
    public String postMethodName(@RequestBody String entity,@PathVariable String name) {
        return entity+" "+name+ " epadi iruka" ;
    }
    
}
