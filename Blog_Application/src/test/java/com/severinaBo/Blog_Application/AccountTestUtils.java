package com.severinaBo.Blog_Application;

import com.severinaBo.Blog_Application.dto.AccountDto;
import com.severinaBo.Blog_Application.dto.AccountRegistrationDto;

public class AccountTestUtils {

    public static AccountDto getAccSample(Long id){
        AccountDto account = new AccountDto();
        account.setId(id);
        account.setFirstName("firstName" + id);
        account.setLastName("lastName" + id);
        account.setEmail("random@email.com" + id);
        return account;
    }

    /*public static fakeAccount(String email){
        AccountDto fakeAccount = new AccountDto();
        fakeAccount.setEmail(email);
        return fakeAccount;
    }*/
    public static AccountRegistrationDto getAccountRegistrationDtoSample(Long id) {
        AccountRegistrationDto account = new AccountRegistrationDto();
        account.setFirstName("firstName" + id);
        account.setLastName("lastName" + id);
        account.setEmail("email@email.com" + id);
        account.setPassword("pass" + id);
        return account;
}}
