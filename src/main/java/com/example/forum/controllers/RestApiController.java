package com.example.forum.controllers;


import com.example.forum.entities.Section;
import com.example.forum.entities.SubSection;
import com.example.forum.services.SectionService;
import com.example.forum.services.SubSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class RestApiController {


    @Autowired
    private SectionService sectionService;
    @Autowired
    private SubSectionService subSectionService;


    @GetMapping(value="/sections")
    public List<Section> sections(){
        return sectionService.getSections();
    }

    @GetMapping(value="/subsection/{id}")
    public List<SubSection> subsections(@PathVariable int id){
        return subSectionService.getSubSectionsbyId(id);
    }

}
