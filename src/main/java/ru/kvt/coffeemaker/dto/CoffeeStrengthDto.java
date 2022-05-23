package ru.kvt.coffeemaker.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@ApiModel(description = "Data transfer object for coffee strength, representing coffee strength")
@Data
@NoArgsConstructor
public class CoffeeStrengthDto {

    @ApiModelProperty(notes = "Strength of coffee in percents. You can only set values from 0 to 100", example = "35", required = true, position = 0)
    @Min(0)
    @Max(100)
    @NotNull
    private int coffeeStrength;

}
