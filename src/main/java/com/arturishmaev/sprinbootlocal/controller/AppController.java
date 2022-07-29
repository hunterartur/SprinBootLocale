package com.arturishmaev.sprinbootlocal.controller;

import com.arturishmaev.sprinbootlocal.service.AppService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    private final AppService service;

    public AppController(AppService service) {
        this.service = service;
    }

    @GetMapping(path = "/index")
    public String index() {
//        model.addAttribute("users", service.getAll());
        return "index";
    }
}
