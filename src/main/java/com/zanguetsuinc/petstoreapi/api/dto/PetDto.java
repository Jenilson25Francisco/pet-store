package com.zanguetsuinc.petstoreapi.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class PetDto {

    private UUID id;
    private String raca;
    private String cor;
    private String sexo;
    private String imageUrl;
    private int idade;
    private BigDecimal preco;
    private ResumeUserDto user;

}
