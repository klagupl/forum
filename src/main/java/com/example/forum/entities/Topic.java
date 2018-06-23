package com.example.forum.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="SubSection_SectionID")
    private SubSection subSection;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="User_UserId", insertable=false, updatable=false)
    private User userid;

    @OneToMany(mappedBy = "topic")
    private List<Post> posts;


    private int numberOfPosts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopicname() {
        return topicname;
    }

    public void setTopicname(String topicname) {
        this.topicname = topicname;
    }

    public SubSection getSubSection() {
        return subSection;
    }

    public void setSubSection(SubSection subSection) {
        this.subSection = subSection;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public int getNumberOfPosts() {
        return posts.size();
    }

    public void setNumberOfPosts(int numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }


}
