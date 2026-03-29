package com.zanguetsuinc.petstoreapi.api.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserIdRequest {

    @NotNull
    private UUID id;

}
