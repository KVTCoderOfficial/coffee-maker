package ru.kvt.coffeemaker.exceptions;

public class CurrentBoilingModeAlreadySelectedException extends RuntimeException {

    public CurrentBoilingModeAlreadySelectedException(String message) {
        super(message);
    }

}
