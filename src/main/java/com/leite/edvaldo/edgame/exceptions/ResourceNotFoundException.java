package com.leite.edvaldo.edgame.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Long id, String message){
        super(message);
    }
}
