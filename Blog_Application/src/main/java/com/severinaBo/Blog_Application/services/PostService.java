package com.severinaBo.Blog_Application.services;

import antlr.collections.List;
import com.severinaBo.Blog_Application.posts.PostNotFoundException;
import com.severinaBo.Blog_Application.posts.postEntities.BlogPost;
import com.severinaBo.Blog_Application.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Page<BlogPost> getPostPage(String postTopic, Pageable pageable, String postTitle) {
        //return postRepository.findAllByTopic(postTopic, pageable);
        if (postTopic == null || postTopic.isBlank() || postTopic.equalsIgnoreCase("lang"))
            return postRepository.findAll(pageable);
        return postRepository.findByTitle(postTitle, pageable);
    }
}
 /*   public BlogPost getPostByTitle(String postTitle, Pageable pageable) {
        return postRepository.findByTitle(postTitle)
                .orElseThrow(() -> new PostNotFoundException(postTitle));
    }*/

