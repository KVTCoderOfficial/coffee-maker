package ru.kvt.coffeemaker.services;

import ru.kvt.coffeemaker.model.CoffeeMakerState;

import java.util.Optional;

public interface CoffeeMakerStateService {

    Optional<CoffeeMakerState> findById(Long id);

    CoffeeMakerState save(CoffeeMakerState coffeeMakerState);
}
