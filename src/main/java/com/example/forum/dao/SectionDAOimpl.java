package com.example.forum.dao;

import com.example.forum.entities.Section;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SectionDAOimpl implements SectionDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Section> getSections() {
        List<Section> sections =entityManager.createQuery("FROM Section",Section.class).getResultList();
        return sections;
    }

    @Override
    public String getStringSections() {
        String result=entityManager.createQuery("FROM Section",Section.class).getSingleResult().toString();
    return result;
    }
}
