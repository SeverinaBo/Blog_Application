package com.severinaBo.Blog_Application.repository;

import antlr.collections.List;
import com.severinaBo.Blog_Application.posts.postEntities.BlogPost;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<BlogPost, String> {

  //  Page<BlogPost> findAllByTopic(String postTopic, List list);

    Page<BlogPost> findByTitle(String postTitle,
                               Pageable pageable);
}
