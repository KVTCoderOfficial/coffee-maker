package ru.kvt.coffeemaker.exceptions;

public class CoffeeMakerDisabledException extends RuntimeException {

    public CoffeeMakerDisabledException(String message) {
        super(message);
    }

}
