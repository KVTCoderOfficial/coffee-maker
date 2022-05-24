package ru.kvt.coffeemaker.services;

import ru.kvt.coffeemaker.model.BoilingMode;
import ru.kvt.coffeemaker.model.CoffeeMakerState;

public interface CoffeeMakerService {

    void enable();

    void disable();

    void pourCoffee();

    Integer setStrength(Integer coffeeStrength);

    void boiling();

    BoilingMode setBoilingMode(BoilingMode boilingMode);

    CoffeeMakerState getState();

}
