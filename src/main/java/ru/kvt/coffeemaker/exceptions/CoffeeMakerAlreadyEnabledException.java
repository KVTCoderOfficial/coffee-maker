package ru.kvt.coffeemaker.exceptions;

public class CoffeeMakerAlreadyEnabledException extends RuntimeException {

    public CoffeeMakerAlreadyEnabledException(String message) {
        super(message);
    }

}
