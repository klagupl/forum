package com.example.forum.services;

import com.example.forum.dao.SectionDAO;
import com.example.forum.entities.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceimpl implements SectionService {

    @Autowired
    private SectionDAO sectionDAO;


    @Override
    public List<Section> getSections() {
        return sectionDAO.getSections();
    }

    @Override
    public String getStringSections() {
        return sectionDAO.getStringSections();
    }
}
