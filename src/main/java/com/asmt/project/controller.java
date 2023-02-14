package com.asmt.project;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/")
    public String HelloWorld(){
        return "To-do Application";
    }

    public void hello(){
        System.out.println("하이");
    }
}
