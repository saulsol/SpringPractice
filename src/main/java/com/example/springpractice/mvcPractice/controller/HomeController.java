package com.example.springpractice.mvcPractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping("/login")
    public String loginView(){
        return "index";
    }

    @PostMapping("/loginProcess")
    public String loginProcess(String id, String pass){
        System.out.println(id + " " + pass);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String listProcess(Model model){

        model.addAttribute("list","Arraylist");
        return "list";
    }

}
