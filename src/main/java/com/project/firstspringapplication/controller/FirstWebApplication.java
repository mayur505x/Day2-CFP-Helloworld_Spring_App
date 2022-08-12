package com.project.firstspringapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstWebApplication {
    @RequestMapping("/web")
    public String hello() {
        return "hello.html";
    }

    @RequestMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("message", "Hello From Mayur Pawar");
        return "message.html";
    }
}
