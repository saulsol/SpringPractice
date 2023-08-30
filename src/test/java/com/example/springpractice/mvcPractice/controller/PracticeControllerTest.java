package com.example.springpractice.mvcPractice.controller;

import com.example.springpractice.mvcPractice.dto.RequestBodyDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@WebMvcTest
@Slf4j
class PracticeControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    void requestBody() throws Exception{

        String requestBody = "{\"name\":\"req\",\"age\":1,\"password\":\"pass\",\"email\":\"email\"}\n";
        log.info("log : " + requestBody);

        mockMvc.perform(MockMvcRequestBuilders.post("/requestBody")

                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBody))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("name").value("req"))
                .andExpect(MockMvcResultMatchers.jsonPath("age").value(1L))
                .andExpect(MockMvcResultMatchers.jsonPath("password").value("pass"))
                .andExpect(MockMvcResultMatchers.jsonPath("email").value("email"));

    }
}