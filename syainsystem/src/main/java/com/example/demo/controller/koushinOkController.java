package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class koushinOkController {
    @GetMapping("/koushinok")
    public String tourokuok(Model model) {
        return "koushinok";
    }
}