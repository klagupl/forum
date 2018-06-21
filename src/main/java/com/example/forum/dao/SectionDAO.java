package com.example.forum.dao;

import com.example.forum.entities.Section;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionDAO {

    public List<Section> getSections();
    public String getStringSections();
}
