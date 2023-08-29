package com.example.springpractice.mvcPractice.controller;

import com.example.springpractice.mvcPractice.dto.ParamDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/practice")
    public String practice(Model model,
                           @RequestParam(value = "no", required = false, defaultValue = "0") int no,
                           @RequestParam(value = "job", required = false) String job) {
        System.out.println(no + " " + job);
        return "index";
    }

    @PostMapping("/formPractice")
    public String formPractice(Model model, @ModelAttribute ParamDto paramDto){
        System.out.println(paramDto);
        return "index";
    }
    //'application/x-www-form-urlencoded;charset=UTF-8' -> @RequestBody 필요없음
    // @ModelAttribute 로 받으면 된다.
}
