package com.smartosc.exmaple.exception.advice;

public class CityNotFoundException extends Throwable {
    public CityNotFoundException(Long id) {

        super(String.format("City with Id %d not found", id));
    }
}
