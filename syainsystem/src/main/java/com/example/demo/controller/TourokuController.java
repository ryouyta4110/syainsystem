package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TourokuController {
    @RequestMapping(value = "/touroku", method = RequestMethod.GET)
    public String touroku(Model model) {
        return "touroku";
    }
}