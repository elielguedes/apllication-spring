package com.projeto.project_spring.services.exception.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.Instant;

public class StandartError implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant timesTemp;
    private Integer status;
    private String error;
    private String menssage;
    private String path;

    public StandartError(){

    }

    public StandartError(Instant timesTemp, Integer status, String error, String menssage, String path) {
        this.timesTemp = timesTemp;
        this.status = status;
        this.error = error;
        this.menssage = menssage;
        this.path = path;
    }

    public Instant getTimesTemp() {
        return timesTemp;
    }

    public void setTimesTemp(Instant timesTemp) {
        this.timesTemp = timesTemp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMenssage() {
        return menssage;
    }

    public void setMenssage(String menssage) {
        this.menssage = menssage;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
