package com.example.springpractice.mvcPractice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RequestBodyDto {

    private String name;
    private long age;
    private String password;
    private String email;

    public RequestBodyDto(){

    }

    public RequestBodyDto(String name, long age, String password, String email) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.email = email;
    }


}
