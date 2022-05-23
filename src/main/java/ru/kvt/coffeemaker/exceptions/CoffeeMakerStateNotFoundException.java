package ru.kvt.coffeemaker.exceptions;

public class CoffeeMakerStateNotFoundException extends RuntimeException {

    public CoffeeMakerStateNotFoundException(String message) {
        super(message);
    }

}
