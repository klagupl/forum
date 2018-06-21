package com.example.forum.controllers;

import com.example.forum.entities.Section;
import com.example.forum.entities.SubSection;
import com.example.forum.services.SectionService;
import com.example.forum.services.SubSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SectionsController {


    @Autowired
    private SectionService sectionService;
    @Autowired
    private SubSectionService subSectionService;


    @GetMapping(value="/sections")
    public List<Section> sections(){
        return sectionService.getSections();
    }

    @GetMapping(value="/subsections")
    public List<SubSection> subSections(){
        return subSectionService.getSubSection();
    }
}
