package com.example.forum.services;

import com.example.forum.entities.SubSection;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SubSectionService {


    public List<SubSection> getSubSection();

}
