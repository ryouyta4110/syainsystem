package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.LoginRequest;


@Controller
public class MenuController {
    @RequestMapping("/menu")
    public String menu(Model model) {
    	model.addAttribute("loginRequest", new LoginRequest());
        return "menu";
    }
}