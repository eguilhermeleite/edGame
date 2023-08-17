package com.leite.edvaldo.edgame.exceptions;

import com.leite.edvaldo.edgame.exceptions.models.ErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.Instant;

@RestControllerAdvice
public class GlobalHandlerException {

    //recurso nao encontrado
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException e){

        Instant moment = Instant.now();
        String message = e.getMessage();
        ErrorException errorException = new ErrorException(moment, HttpStatus.NOT_FOUND.value(),message);
        return ResponseEntity.status(errorException.getStatus()).body(errorException);
    }
}
