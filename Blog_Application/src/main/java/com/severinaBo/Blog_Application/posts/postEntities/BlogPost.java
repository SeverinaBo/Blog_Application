package com.severinaBo.Blog_Application.posts.postEntities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;



import javax.persistence.*;
import java.time.LocalDateTime;




@Data
@Entity
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;
  /*  @Column(nullable = false)*/



/*
    @Column(columnDefinition = "TEXT")
*/
    @Lob()
    private String content;

    //  @Column(nullable = false)
    private String username;


  //  @Column(nullable = false)
    @CreationTimestamp
    public LocalDateTime createdAt;





  /*  @NotNull
    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id", nullable = false)
    private Account account;*/
}
