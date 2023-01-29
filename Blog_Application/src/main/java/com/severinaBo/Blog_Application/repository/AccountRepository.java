package com.severinaBo.Blog_Application.repository;

import com.severinaBo.Blog_Application.dto.Account;
import com.severinaBo.Blog_Application.entities.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    boolean existsByEmail(String email);

    Optional<Account> findByEmailAndPassword(String email, String password);
/*    AccountEntity getFirstName(String firstName);*/
}
