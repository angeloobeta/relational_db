package com.example.relationaldatabase.service;

import com.example.relationaldatabase.entity.Comment;
import com.example.relationaldatabase.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostServices {

    public List<Post> getAllPost();

    public Optional<Post> getPostById(String postId);

    public String createPost(Post post);

    public String addComment(Comment comment);
}
