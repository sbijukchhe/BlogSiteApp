package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(){
        return "home";
    }

    @RequestMapping("/profile")
    public String profilepage(){
        return "profile";
    }

    @RequestMapping("/entry")
    public String entrypage(){
        return "entry";
    }

    @RequestMapping("/about")
    public String aboutpage(){
        return "about";
    }

}