package com.severinaBo.Blog_Application.controller;

import com.severinaBo.Blog_Application.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/accounts")
public class MainController {

    @GetMapping("/account")
    public String print() {
        return "hello";
/*
    @Autowired
    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }


    @GetMapping("/main")
        public String hello(@PathVariable String firstName) {
            return mainService.getGreeting(firstName);
        }
*/




    }}


