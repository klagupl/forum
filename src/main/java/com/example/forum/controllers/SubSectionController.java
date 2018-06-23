package com.example.forum.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/subsection")
public class SubSectionController {


    @RequestMapping(value="/{id}")
    public String show(){
        return "subsection";
    }
}
