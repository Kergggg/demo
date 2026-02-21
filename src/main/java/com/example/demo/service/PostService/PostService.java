package com.example.demo.service.PostService;

import com.example.demo.model.Post.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        List<Post> posts = new ArrayList<>();

        posts.add(new Post("Первый пост."));
        posts.add(new Post("Второй пост."));
        posts.add(new Post("Третий пост."));

        return posts;
    }
}
