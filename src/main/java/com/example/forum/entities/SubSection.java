package com.example.forum.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="SubSection")
public class SubSection {

    @Id
    @Column(name="SectionId")
    private int id;

    @Column(name="SubSectionName")
    private String subSectionName;

    @Column(name="Opis")
    private String opis;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="Section_SectionName")
    private Section section;



    @OneToMany(mappedBy = "subSection")
    private List<Topic> topics;



    private int numberOfTopics;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubSectionName() {
        return subSectionName;
    }

    public void setSubSectionName(String subSectionName) {
        this.subSectionName = subSectionName;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public int getNumberOfTopics() {
        return topics.size();
    }

    public void setNumberOfTopics(int numberOfTopics) {
        this.numberOfTopics = numberOfTopics;
    }


}
