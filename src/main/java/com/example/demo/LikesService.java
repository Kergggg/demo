package com.example.demo;

import com.example.demo.model.Post.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesService {
    @Autowired
    private PostRepository postRepository;

    public Integer like(Long postId) {
        final Post post = postRepository.findById(postId).get();
        post.setLikes(post.getLikes() + 1);
        postRepository.save(post);
        return post.getLikes();
    }
}