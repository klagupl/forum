package com.example.forum.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Topic")
public class Topic {

    @Id
    @GeneratedValue
    @Column(name="TopicId")
    private int id;

    @Column(name="TopicName")
    private String topicname;

    @ManyToOne
    @JoinColumn(name="SubSection_SectionID")
    private SubSection subSection;

    @OneToMany(mappedBy = "topic")
    private List<Post> posts;



}
