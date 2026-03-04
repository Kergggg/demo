package com.example.demo.model.Post;

public class Post {
    String text;
    Integer likes;
    public Post(String text){
        this.text = text;
        this.likes = 0;
    }

    public Integer getLikes() {return likes;}

    public String getText() {return text;}
}
