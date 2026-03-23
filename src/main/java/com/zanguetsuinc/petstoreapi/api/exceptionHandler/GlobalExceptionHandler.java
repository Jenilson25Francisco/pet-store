package com.zanguetsuinc.petstoreapi.api.exceptionHandler;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.time.OffsetDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

//    private ResponseEntity<ErrorResponse> exceptioHandler(final String message, final HttpServletRequest request, final HttpStatus status, OffsetDateTime date){
//        return ResponseEntity.status(status)
////                .body(new ErrorResponse(message, date
//                        , status.value(), request.getRequestURI()));
//
//    }

}
