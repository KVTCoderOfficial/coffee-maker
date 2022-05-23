package ru.kvt.coffeemaker.mappers;

import ru.kvt.coffeemaker.dto.CoffeeMakerStateDto;
import ru.kvt.coffeemaker.model.CoffeeMakerState;


public class CoffeeMakerStateMapper {

    public static CoffeeMakerStateDto toCoffeeMakerStateDto(CoffeeMakerState coffeeMakerState) {
        CoffeeMakerStateDto coffeeMakerStateDto = new CoffeeMakerStateDto();
        coffeeMakerStateDto.setCoffeeMakerEnabled(coffeeMakerState.getIsCoffeeMakerEnabled());
        coffeeMakerStateDto.setCoffeeStrength(coffeeMakerState.getCoffeeStrength());
        coffeeMakerStateDto.setBoilingMode(coffeeMakerState.getBoilingMode());
        return coffeeMakerStateDto;
    }

}
