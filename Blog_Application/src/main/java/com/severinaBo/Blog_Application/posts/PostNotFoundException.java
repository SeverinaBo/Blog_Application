package com.severinaBo.Blog_Application.posts;

import lombok.Getter;

import java.util.UUID;

@Getter
public class PostNotFoundException {

    private final String postTitle;

    private final UUID errorId;

    public PostNotFoundException(String postTitle) {
        this.postTitle = postTitle;
        this.errorId = UUID.randomUUID();
    }
}
