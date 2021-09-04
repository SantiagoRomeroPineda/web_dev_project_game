package com.javeriana.Game.dto;

public class DTOResponse<T> {

    private int code;

    private String message;

    private T object;

    public DTOResponse() {
    }

    public DTOResponse(int code, String message, T object) {
        this.code = code;
        this.message = message;
        this.object = object;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
