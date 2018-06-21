package com.example.forum.services;

import com.example.forum.entities.Section;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SectionService {

    public List<Section> getSections();
    public String getStringSections();
}
