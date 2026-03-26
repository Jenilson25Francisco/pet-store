package com.zanguetsuinc.petstoreapi.api.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetRequest {

    @NotBlank
    @Size(max = 255)
    private String raca;
    @NotBlank
    @Size(max = 255)
    private String cor;
    @NotNull
    private int idade;
    @NotBlank
    @Size(max = 255)
    private String sexo;
    @NotBlank
    @Size(max = 255)
    private String imageUrl;
    private UserIdRequest userIdRequest;

}
