package com.example.springpractice.mvcPractice.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@Controller
public class practiceController {

    @GetMapping("/redirect")
    public ResponseEntity<?> redirect() {
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create("/"));
        return ResponseEntity.status(HttpStatus.MOVED_PERMANENTLY) // 301 Moved Permanently
                .headers(headers)
                .build();
    }



    @GetMapping("/redirect/prefix")
    public String redirectPrefix() {
        return "redirect:/";
    }


    @GetMapping("/")
    public String basicController(){
        return "index";
    }


}
