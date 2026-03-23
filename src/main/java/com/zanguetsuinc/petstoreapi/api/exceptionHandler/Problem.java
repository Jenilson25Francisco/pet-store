package com.zanguetsuinc.petstoreapi.api.exceptionHandler;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Problem {

    private String titulo;
    private OffsetDateTime dataHora;
    private int status;
    private List<Campo> campos;

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Campo{
        private String nome;
        private String mensagem;
    }

}
