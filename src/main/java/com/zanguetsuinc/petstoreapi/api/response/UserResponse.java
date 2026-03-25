package com.zanguetsuinc.petstoreapi.api.response;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    @NotBlank(message = "Por favor digite o seu nome")
    @Size(max = 255)
    private String nome;
    @Email(message = "por favor digite o seu e-mail corretamente")
    @NotBlank(message = "Por favor digite o seu e-mail")
    @Size(max = 255)
    private String email;
    @NotBlank(message = "Por favor digite a sua password")
    @Size(max = 255)
    private String password;

}
