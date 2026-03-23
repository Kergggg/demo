////package com.example.demo.service.PostService;
////
////import com.example.demo.model.Post.Post;
////import org.springframework.stereotype.Service;
////import java.util.ArrayList;
////import java.util.Date;
////import java.util.List;
////import java.util.concurrent.atomic.AtomicLong;
////
////@Service
////public class PostService {
////    private List<Post> posts;
////    private AtomicLong id = new AtomicLong(3);
////
////    {
////        posts = new ArrayList<>();
////        posts.add(new Post(0L,"Первый пост.", new Date()));
////        posts.add(new Post(1L,"Второй пост.", new Date()));
////        posts.add(new Post(2L,"Третий пост.", new Date()));
////    }
////
////    public List<Post> listAllPosts(){
////        return posts;
////    }
////
////    public void create(String text) {
////        Long newId = id.getAndIncrement();
////        posts.add(new Post(newId, text, new Date()));
////    }
////}
//
//package com.example.demo.service.PostService;
//
//import com.example.demo.model.Post.Post;
//import com.example.demo.repository.PostRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.stream.StreamSupport;
//
//@Service
//public class PostService {
//    private final List<Post> posts = new ArrayList<>(List.of(
//            new Post(0L, "post1", new Date()),
//            new Post(1L, "post2", new Date()),
//            new Post(2L, "post3", new Date())
//    ));
//    @Autowired
//    PostRepository postRepository;
//
//    public List<Post> listAllPosts() {
//        return posts;
//        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
//    }
//
//    public void create(final String text) {
//        posts.add(new Post((long) posts.size(), text, new Date()));
//        Post post = new Post(null, text, new Date());
//        postRepository.save(post);
//    }
//}
package com.example.demo.service.PostService;

import com.example.demo.model.Post.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> listAllPosts() {
        // Возвращаем все посты из базы данных
        return StreamSupport.stream(postRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public void create(final String text) {
        // Создаем новый пост без ID (ID сгенерируется автоматически базой данных)
        Post post = new Post(text, new Date());
        // Сохраняем пост в базу данных
        postRepository.save(post);
    }
}