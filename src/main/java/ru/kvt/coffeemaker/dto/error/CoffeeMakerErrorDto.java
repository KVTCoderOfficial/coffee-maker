package ru.kvt.coffeemaker.dto.error;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(description = "Error, sent to client, when something goes wrong")
@Data
public class CoffeeMakerErrorDto {

    @ApiModelProperty(notes = "Creation timestamp of error", example = "2000-05-23T09:38:40.299+00:00", required = true, position = 0)
    private Date timestamp;

    @ApiModelProperty(notes = "Number of HTTP status response", example = "400", required = true, position = 1)
    private Integer status;

    @ApiModelProperty(notes = "Reason phrase of HTTP status response", example = "Bad Request", required = true, position = 2)
    private String error;

    @ApiModelProperty(notes = "Message with reason of error for client", example = "Неверные параметры запроса", required = true, position = 3)
    private String message;

    public CoffeeMakerErrorDto(Integer status, String error, String message) {
        this.timestamp = new Date();
        this.status = status;
        this.error = error;
        this.message = message;
    }

}
