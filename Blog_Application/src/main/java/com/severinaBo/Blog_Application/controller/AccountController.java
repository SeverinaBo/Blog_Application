package com.severinaBo.Blog_Application.controller;

import com.severinaBo.Blog_Application.dto.AccountDto;
import com.severinaBo.Blog_Application.dto.AccountRegistrationDto;
import com.severinaBo.Blog_Application.services.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;


@Slf4j
@Controller
@RequestMapping(value = "/accounts")
public class AccountController  {


    private AccountService accountService;


    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @GetMapping("/registration")
    public String getRegistrationView(Model model) {
        model.addAttribute("accountToRegister", new AccountRegistrationDto());
        //create to allow to create username
        return "/registration";
    }
    @GetMapping("/logIn")
    public String getLoginView(Model model){
        model.addAttribute("loginInToAccount", new AccountRegistrationDto());
        return "/logIn";
    }

    @PostMapping("/registration")
    public String registerNewAccount(@ModelAttribute("accountToRegister") @Valid AccountRegistrationDto accountToRegister,
                                     BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors())
            return "/accounts/registration";       //Return user to same page, showing the errors
        Optional<AccountDto> registeredAccount = accountService.registerAccount(accountToRegister, bindingResult);
        if (registeredAccount.isEmpty())
            return "/accounts/registration";       //Return user to same page, showing the errors
        redirectAttributes.addFlashAttribute("registeredAccount", registeredAccount);
        return "redirect:/accounts";  //Redirects to URL (not HTML document, but an endpoint)
    }

}



