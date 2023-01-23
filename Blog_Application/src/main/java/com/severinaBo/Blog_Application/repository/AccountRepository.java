package com.severinaBo.Blog_Application.repository;

import com.severinaBo.Blog_Application.dto.Account;
import com.severinaBo.Blog_Application.entities.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

    /*AccountEntity getFirstName(String firstName);*/
}
