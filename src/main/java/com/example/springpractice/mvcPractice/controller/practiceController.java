package com.example.springpractice.mvcPractice.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class practiceController {

    @GetMapping("/redirect")
    public ResponseEntity<?> redirect(){

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create("/"));

        return new ResponseEntity<>(headers, HttpStatus.MOVED_PERMANENTLY);
        // MOVED_PERMANENTLY 는 영구적으로 해당 주소는 사용하지 않으니
        // 서버에서 알려준 주소로 다시 요청을 보내라는 뜻이다.
    }

    @GetMapping("/")
    public String basicController(){
        return "리다이렉트된 값입니다.";
    }



}
