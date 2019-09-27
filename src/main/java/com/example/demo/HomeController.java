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

    @RequestMapping("/corejava1")
    public String corejava1page(){
        return "corejava1";
    }

    @RequestMapping("/corejava2")
    public String corejava2page(){
        return "corejava2";
    }

    @RequestMapping("/github1")
    public String github1page(){
        return "github1";
    }

    @RequestMapping("/github2")
    public String github2page(){
        return "github2";
    }

    @RequestMapping("/oopjava1")
    public String oopjava1page(){
        return "oopjava1";
    }

    @RequestMapping("/oopjava2")
    public String oopjava2page(){
        return "oopjava2";
    }

    @RequestMapping("/pda1")
    public String pda1page(){
        return "pda1";
    }

    @RequestMapping("/pda2")
    public String pda2page(){
        return "pda2";
    }

    @RequestMapping("/bootstrap")
    public String bootstrappage(){
        return "bootstrap";
    }

    @RequestMapping("/introhtml")
    public String htmlpage(){
        return "introhtml";
    }

    @RequestMapping("/about")
    public String aboutpage(){
        return "about";
    }

}