package ru.kvt.coffeemaker.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kvt.coffeemaker.model.BoilingMode;


@ApiModel(description = "Data transfer object for coffee-maker state, representing is coffee-maker enabled, current coffee strength in percents and current boiling mode")
@Data
@NoArgsConstructor
public class CoffeeMakerStateDto {

    @ApiModelProperty(notes = "Strength of coffee in percents. You can only set values from 0 to 100", example = "35", required = true, position = 0)
    private int coffeeStrength;

    @ApiModelProperty(notes = "Boiling mode of coffee-maker. Only two modes are available: WATER/VAPOR", example = "WATER", required = true, position = 1)
    private BoilingMode boilingMode;

    @ApiModelProperty(notes = "Representing is coffee-maker enabled. Only two states are available: true/false", example = "true", required = true, position = 2)
    private boolean isCoffeeMakerEnabled;

}
