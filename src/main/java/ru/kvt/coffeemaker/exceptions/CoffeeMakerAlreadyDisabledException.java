package ru.kvt.coffeemaker.exceptions;

public class CoffeeMakerAlreadyDisabledException extends RuntimeException {

    public CoffeeMakerAlreadyDisabledException(String message) {
        super(message);
    }

}
