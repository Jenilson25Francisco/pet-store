package com.zanguetsuinc.petstoreapi.api.response;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    @NotBlank
    @Size(max = 255)
    private String nome;
    @Email
    @NotBlank
    @Size(max = 255)
    private String email;
    @NotBlank
    @Size(max = 255)
    private String password;

}
