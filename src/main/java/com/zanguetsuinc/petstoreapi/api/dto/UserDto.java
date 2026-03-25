package com.zanguetsuinc.petstoreapi.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
public class UserDto {

   private UUID id;
   private String nome;
   private String email;
   private OffsetDateTime createdAt;
   private OffsetDateTime updatedAt;

}
