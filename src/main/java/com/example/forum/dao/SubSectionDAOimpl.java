package com.example.forum.dao;

import com.example.forum.entities.SubSection;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SubSectionDAOimpl implements SubSectionDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<SubSection> getSubSections() {
        List<SubSection> subSections =entityManager.createQuery("FROM SubSection",SubSection.class).getResultList();
        return subSections;
    }

    @Override
    public List<SubSection> getSubSectionsbyId(int id) {
       String hql="from SubSection s where s.id = :ids";
       List<SubSection> result = entityManager.createQuery(hql,SubSection.class).setParameter("ids",id).getResultList();
        return result;
    }
}
