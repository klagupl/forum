package com.example.forum.services;

import com.example.forum.dao.SubSectionDAO;
import com.example.forum.entities.SubSection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubSectionServiceimpl implements SubSectionService {


    @Autowired
    private SubSectionDAO subSectionDAO;

    @Override
    public List<SubSection> getSubSection() {
        return subSectionDAO.getSubSections();
    }

    @Override
    public List<SubSection> getSubSectionsbyId(int id) {
        return subSectionDAO.getSubSectionsbyId(id);
    }

}
