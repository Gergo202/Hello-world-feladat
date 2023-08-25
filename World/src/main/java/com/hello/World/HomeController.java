package com.hello.World;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @GetMapping("/")
    public String toString() {
        return "Hello World!";
    }
}
