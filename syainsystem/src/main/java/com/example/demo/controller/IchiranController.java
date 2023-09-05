package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IchiranController {
    @RequestMapping("/ichiran")
    public String ichiran(Model model) {
        return "ichiran";
    }
}