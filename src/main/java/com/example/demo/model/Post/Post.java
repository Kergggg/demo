////package com.example.demo.model.Post;
////
////import java.util.Date;
////
////public class Post {
////    String text;
////    Integer likes;
////    private Date creationDate;
////    private Long id;
////
////    public Post(Long id, String text, Date creationDate){
////        this.id = id;
////        this.text = text;
////        this.likes = 0;
////        this.creationDate = creationDate;
////    }
////
////    public Integer getLikes() {return likes;}
////
////    public void setLikes(Integer likes){this.likes = likes;}
////
////    public String getText() {return text;}
////
////    public Date getCreationDate() {return creationDate;}
////
////    public Long getId() {return id;}
////}
//
//
//package com.example.demo.model.Post;
//
//import jakarta.persistence.*;
//
//import java.util.Date;
//
//@Entity
//@Table(name = "POST")
//public class Post {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String text;
//
//    private Integer likes;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "creation_date")
//    private Date creationDate;
//
//    // Конструктор по умолчанию (обязателен для JPA)
//    public Post() {
//    }
//
//    public Post(Long id, String text, Date creationDate) {
//        this.id = id;
//        this.text = text;
//        this.likes = 0;
//        this.creationDate = creationDate;
//    }
//
//    // Геттеры
//    public Long getId() {
//        return id;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public Integer getLikes() {
//        return likes;
//    }
//
//    public Date getCreationDate() {
//        return creationDate;
//    }
//
//    // Сеттеры
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public void setLikes(Integer likes) {
//        this.likes = likes;
//    }
//
//    public void setCreationDate(Date creationDate) {
//        this.creationDate = creationDate;
//    }
//}

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

    // Конструктор по умолчанию (обязателен для JPA)
    public Post() {
    }

    // Конструктор без id (для создания новых постов)
    public Post(String text, Date creationDate) {
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
    }

    // Конструктор с id (для загрузки из базы данных)
    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
    }

    // Геттеры
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

    // Сеттеры
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