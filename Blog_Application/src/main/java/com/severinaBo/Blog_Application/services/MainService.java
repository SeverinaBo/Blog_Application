package com.severinaBo.Blog_Application.services;

import com.severinaBo.Blog_Application.dto.Account;
import com.severinaBo.Blog_Application.entities.AccountEntity;
import com.severinaBo.Blog_Application.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    public String print() {
        System.out.println("hellooo");
        return "hellooo";
/*
    @Autowired
    private AccountRepository accountRepository;

    public String getGreeting(String firstName) {
        return "Hello, " + accountRepository.getFirstName(firstName);
    }
*/

    }
}



