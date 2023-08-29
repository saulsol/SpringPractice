package com.example.springpractice.mvcPractice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class practiceController {

    @GetMapping("/redirect")
    public String redirect(){
        return "redirect:/";
    }

}
