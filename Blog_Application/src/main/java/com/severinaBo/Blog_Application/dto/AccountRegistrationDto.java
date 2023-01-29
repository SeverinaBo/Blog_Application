package com.severinaBo.Blog_Application.dto;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class AccountRegistrationDto {


   @Size(min = 2, max = 60, message = "Name '${validatedValue}' must be between {min} and {max} characters")
    private String firstName;

    @Size(min = 2, max = 60, message = "{validation.lastName.size}")
    private String lastName;

    @NotBlank
    @Email
    private String email;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{2,8}$",
            message = "{validation.password.requirements}")
    private String password;

}
