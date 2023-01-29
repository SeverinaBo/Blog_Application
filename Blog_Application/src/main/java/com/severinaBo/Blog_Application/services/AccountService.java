package com.severinaBo.Blog_Application.services;

import com.severinaBo.Blog_Application.dto.Account;
import com.severinaBo.Blog_Application.dto.AccountDto;
import com.severinaBo.Blog_Application.dto.AccountRegistrationDto;
import com.severinaBo.Blog_Application.repository.AccountRepository;
import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.Optional;

@Service
public class AccountService {


    private final AccountRepository accountRepository;


    private final ModelMapper modelMapper;

    @Autowired
private AccountService(AccountRepository accountRepository, ModelMapper modelMapper){
    this.accountRepository = accountRepository;
    this.modelMapper = modelMapper;
}
public Optional<AccountDto> registerAccount(AccountRegistrationDto accountRegistrationDto, BindingResult bindingResult) {
    if (validateAccount(accountRegistrationDto, bindingResult).hasErrors())
        return Optional.empty();
      Account accountToSave = modelMapper.map(accountRegistrationDto, Account.class);
      Account savedAcc = accountRepository.save(accountToSave);
      return Optional.of(modelMapper.map(savedAcc, AccountDto.class));
}

    private BindingResult validateAccount(AccountRegistrationDto accountRegistrationDto, BindingResult bindingResult){
        if (!accountRepository.existsByEmail(accountRegistrationDto.getEmail()))
            return bindingResult;
        bindingResult.rejectValue(
                "email",
                "validation.email.exists",
                new Object[]{accountRegistrationDto.getEmail()},
                "user with this email already exist");
        return bindingResult;
    }

}
