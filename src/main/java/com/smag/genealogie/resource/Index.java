package com.smag.genealogie.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Index {

    @GetMapping ("/")public String home(){
        return "index.html";
    }
    @GetMapping ("/genealogie/")public String home1(){
        return "index.html";
    }
}
