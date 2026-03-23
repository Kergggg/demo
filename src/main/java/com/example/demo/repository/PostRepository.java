//package com.example.demo.repository;
//
//import com.example.demo.model.Post;
//import org.springframework.data.repository.CrudRepository;
//
//public interface PostRepository extends CrudRepository<Post, Long> {
//}


//package com.example.demo.repository;
//
//import com.example.demo.model.Post.Post;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface PostRepository extends JpaRepository<Post, Long> {
//}

//package com.example.demo.repository;
//
//import com.example.demo.model.Post.Post;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface PostRepository extends JpaRepository<Post, Long> {
//}

package com.example.demo.repository;

import com.example.demo.model.Post.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}