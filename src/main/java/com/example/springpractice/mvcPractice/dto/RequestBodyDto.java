package com.example.springpractice.mvcPractice.dto;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestBodyDto {

    private String name;
    private long age;
    private String password;
    private String email;

   // 기본 생성자도 삭제
    // 아무 생성자도 없으면 기본 생성자가 생기니깐 새롭게 생성자 생성


    // 생성자와 setter 없앰


}
