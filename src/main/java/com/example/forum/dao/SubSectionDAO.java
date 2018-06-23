package com.example.forum.dao;

import com.example.forum.entities.SubSection;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubSectionDAO {

    public List<SubSection> getSubSections();
    public List<SubSection> getSubSectionsbyId(int id);

}
