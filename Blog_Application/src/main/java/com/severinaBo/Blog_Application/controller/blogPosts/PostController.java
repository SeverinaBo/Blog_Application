package com.severinaBo.Blog_Application.controller.blogPosts;


import com.severinaBo.Blog_Application.services.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Slf4j
@Controller
@RequestMapping(value = "/posts")
public class PostController {

private final PostService postService;

@Autowired
public PostController(PostService postService){
    this.postService = postService;
}

public String pagePosts(@PageableDefault(size = 9, sort = {"title"}, direction = Sort.Direction.DESC)Pageable pageable,
                        @RequestParam(required = false) String type,
                        Model model, String postTitle){
    model.addAttribute("post", postService.getPostPage(type, pageable, postTitle));
    return "posts/post";
}

}
