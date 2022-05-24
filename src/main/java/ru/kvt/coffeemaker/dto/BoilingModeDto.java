package ru.kvt.coffeemaker.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kvt.coffeemaker.model.BoilingMode;

import javax.validation.constraints.NotNull;

@ApiModel(description = "Data transfer object for boiling mode, representing boiling mode")
@Data
@NoArgsConstructor
public class BoilingModeDto {

    @ApiModelProperty(notes = "Boiling mode of coffee-maker. Only two modes are available: WATER/VAPOR", example = "WATER", required = true, position = 0)
    @NotNull
    private BoilingMode boilingMode;

}
