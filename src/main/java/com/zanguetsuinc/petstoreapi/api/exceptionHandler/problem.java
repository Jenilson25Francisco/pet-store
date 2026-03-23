package com.zanguetsuinc.petstoreapi.api.exceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class problem {

    private String message;
    private OffsetDateTime data;
    private int status;
    private String path;

}
