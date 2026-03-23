package com.example.demo.model.Post;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "POST")
public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    private Integer likes;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date")
    private Date creationDate;

    public Post() {
    }

    public Post(String text, Date creationDate) {
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
    }

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}