package com.projeto.project_spring.services.exception;

public class ResourceNotFoudException extends RuntimeException{

    public ResourceNotFoudException(Object id){
        super("Resourece not found. Id "+ id);
    }
}
