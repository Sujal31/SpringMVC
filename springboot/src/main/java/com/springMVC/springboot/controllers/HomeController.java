package com.springMVC.springboot.controllers;

import com.springMVC.springboot.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome(){
        System.out.println("in home controller");
        return "index";
    }

    @GetMapping("/goToSearch")
    public String goToSearch(){
        System.out.println("going to Search page");
        return "search";
    }

    @GetMapping("/goToLogin")
    public String goToLogin(){
        System.out.println("going to Login page");
        return "login";
    }

    @GetMapping("/goToRegistration")
    public String goToRegistration(){
        System.out.println("going to register page");
        return "register";
    }

    @ModelAttribute("newuser")
    public User getDefaultUser(){
        return new User();
    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems(){
        return Arrays.asList(new String[]{"Male", "Female", "Other"});
    }

}
