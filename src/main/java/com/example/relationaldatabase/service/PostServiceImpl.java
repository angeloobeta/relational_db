package com.example.relationaldatabase.service;


import com.example.relationaldatabase.entity.Comment;
import com.example.relationaldatabase.entity.Post;
import com.example.relationaldatabase.repository.CommentRepository;
import com.example.relationaldatabase.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostServices{

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;


    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    public Optional<Post> getPostById(String postId){;
         return postRepository.findById(Long.valueOf(postId));
    }

    public String createPost(Post userPost){
        Post post = Post.builder()
//                .id(userPost.getId())
                .comments(userPost.getComments())
                .title(userPost.getTitle())
                .description(userPost.getDescription())
                .build();
        postRepository.save(post);
        return "Posted successfully";
    }

    @Override
    public String addComment(Comment comment) {
        postRepository.findById(comment.getId());

                Comment userComment = Comment
                        .builder()
                        .author(comment.getAuthor())
                        .content(comment.getContent())
                        .postId(comment.getPostId())
                        .build();
                commentRepository.save(userComment);
        return "Comment Added Successfully";
    }
}
