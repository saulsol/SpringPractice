package com.example.springpractice.mvcPractice.controller;


import com.example.springpractice.mvcPractice.dto.RequestBodyDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class practiceController {



    @PostMapping("requestBody")
    public ResponseEntity<RequestBodyDto> testRequestBody(@RequestBody RequestBodyDto requestBodyDto){
        return ResponseEntity.ok(requestBodyDto);
    }




}
