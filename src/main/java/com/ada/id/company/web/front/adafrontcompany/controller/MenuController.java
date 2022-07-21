package com.ada.id.company.web.front.adafrontcompany.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MenuController {

    @GetMapping("/")
    public String main(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
