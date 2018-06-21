package com.example.forum.entities;


import javax.persistence.*;

@Entity
@Table(name="Post")
public class Post {

    @Id
    @GeneratedValue
    @Column(name = "PostId")
    private int id;

    @Column(name = "PostContent")
    private String content;

    @Basic
    @Column(name = "PostDate")
    private java.time.LocalDate localDate;


    @ManyToOne
    @JoinColumn(name = "Topic_TopicId")
    private Topic topic;

    @ManyToOne
    @JoinColumn(name = "User_UserId")
    private User user;

}