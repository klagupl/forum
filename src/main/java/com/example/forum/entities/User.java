package com.example.forum.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue
    @Column(name="UserId")
    private int id;

    @Column(name="UserName")
    private String username;

    @Column(name="UserPassword")
    private String userpassword;

    @Column(name="Role")
    private String role;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    @OneToMany(mappedBy = "userid")
    private List<Topic> topics;


}
