package com.dev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping
    public String  greeting(){
        return  "Hi, Hello Everyone!";
    }
}
