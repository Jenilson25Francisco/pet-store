package com.zanguetsuinc.petstoreapi.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ResumeUserDto {

    private UUID id;
    private String nome;

}
