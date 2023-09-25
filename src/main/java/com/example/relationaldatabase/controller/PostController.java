package com.example.relationaldatabase.controller;

import com.example.relationaldatabase.entity.Comment;
import com.example.relationaldatabase.entity.Post;
import com.example.relationaldatabase.service.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class PostController {

    @Autowired
    private PostServices postServices;

    @GetMapping("/getPost/{id}")
    public Optional<Post> getPostById(@PathVariable String postId){
        return postServices.getPostById(postId);
    }

    @PostMapping("/createPost")
    public String createPost(Post post){
        return postServices.createPost(post);
    }

    @PostMapping("/addComment")
        public String addComment(Comment comment){
            return postServices.addComment(comment);
    }
}
