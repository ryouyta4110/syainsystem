package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TourokuOkController {
    @RequestMapping(value = "/user/create", method = RequestMethod.GET)
    public String tourokuok(Model model) {
        return "tourokuok";
    }
}