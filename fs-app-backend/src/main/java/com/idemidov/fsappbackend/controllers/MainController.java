package com.idemidov.fsappbackend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = {"/things", "/things/*"})
    public String main() {
        return "forward:/index.html";
    }
}
