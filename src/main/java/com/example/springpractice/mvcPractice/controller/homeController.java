package com.example.springpractice.mvcPractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {


    @GetMapping("/")
    public String hello(Model model){
        model.addAttribute("greeting", "HI");

        return "index";
    }

    @GetMapping("/modelAndView")
    public ModelAndView hello2(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("modelAndView", "modelAndView 1");
        modelAndView.setViewName("modelAndView");
        return modelAndView;
    }


}
