package com.dayo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {

    @GetMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model){
        int result = a + b;
        model.addAttribute("msg", "结果是：" + result);
        return "hello";
    }

    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        int result = a + b;
        model.addAttribute("msg", "结果是：" + result);
        return "hello";
    }
}
