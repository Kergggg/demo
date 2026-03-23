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
        return StreamSupport.stream(postRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public void create(final String text) {
        Post post = new Post(text, new Date());
        postRepository.save(post);
    }
}