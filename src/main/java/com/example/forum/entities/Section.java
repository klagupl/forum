package com.example.forum.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Section")
public class Section {


    @Id
    @Column(name="SectionName")
    private String id;

    @OneToMany(mappedBy = "section")
    private List<SubSection> sections;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<SubSection> getSections() {
        return sections;
    }

    public void setSections(List<SubSection> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", sections=" + sections +
                '}';
    }
}
