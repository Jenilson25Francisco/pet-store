package com.zanguetsuinc.petstoreapi.domain.exceptions;

public class NegocioException extends RuntimeException{

    public NegocioException(String message){
        super(message);
    }

}
