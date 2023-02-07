package com.severinaBo.Blog_Application;


import com.severinaBo.Blog_Application.controller.AccountController;
import com.severinaBo.Blog_Application.dto.Account;
import com.severinaBo.Blog_Application.dto.AccountDto;
import com.severinaBo.Blog_Application.dto.AccountRegistrationDto;
import com.severinaBo.Blog_Application.services.AccountService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.util.Map;
import java.util.Optional;

import static com.severinaBo.Blog_Application.AccountTestUtils.getAccSample;
import static com.severinaBo.Blog_Application.AccountTestUtils.getAccountRegistrationDtoSample;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

@SpringBootTest
class AccountControllerTest {

    @InjectMocks
    private AccountController accountController;

    @Mock
    private AccountService accountService;


    @Test
    void addAccount(){
        AccountRegistrationDto accToAdd = getAccountRegistrationDtoSample(null);

        AccountDto expectedAcc = getAccSample(1L);
        RedirectAttributes redirectAttributes = new RedirectAttributesModelMap();

        doReturn(Optional.of(expectedAcc)).when(accountService).registerAccount(any(AccountRegistrationDto.class), any());
        BindingResult bindingResult = new BeanPropertyBindingResult(accToAdd, "accToAdd");

        //when
     //   String result = accountController.registerNewAccount(accToAdd, bindingResult, redirectAttributes);

        //then
        //Verify redirectAttributes contain expected key
/*
        Map<String, ?> flashAttributes = redirectAttributes.getFlashAttributes();
        assertThat(flashAttributes.containsKey("registeredAccount")).isTrue();
        assertThat(flashAttributes.keySet().size()).isEqualTo(1);
*/

        //Verify redirectAttributes contain something of UserDto.class
       /* assertThat(flashAttributes.get("registeredAccount")).isInstanceOf(Optional.class);
        Optional<?> accountAddedResponseOptional = (Optional<?>) flashAttributes.get("registeredAccount");
        assertThat(accountAddedResponseOptional).isNotEmpty().containsInstanceOf(AccountDto.class);
        AccountDto accountAddedResponse = (AccountDto) accountAddedResponseOptional.get();*/

        //Verify redirectAttributes.registeredUser has expected properties
  /*      assertThat(accountAddedResponse).isNotNull();
        assertThat(accountAddedResponse).isNotSameAs(accToAdd); //verify it's not same object (doesn't point same memory location)

        assertThat(accountAddedResponse.getId()).isEqualTo(expectedAcc.getId());
        assertThat(accountAddedResponse.getFirstName()).isEqualTo(expectedAcc.getFirstName());
        assertThat(accountAddedResponse.getLastName()).isEqualTo(expectedAcc.getLastName());
        assertThat(accountAddedResponse.getEmail()).isEqualTo(expectedAcc.getEmail());
*/
        //Verify controller method points to expected html
      //  assertThat(result).isEqualTo("redirect:/accounts/logIn");
    }
}
