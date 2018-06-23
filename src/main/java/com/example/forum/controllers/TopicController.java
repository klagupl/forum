package com.example.forum.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="subsection/{id}/topic")
public class TopicController {


    @RequestMapping(value="/{id}")
    public String topics(){
        return "topic";
    }
}
