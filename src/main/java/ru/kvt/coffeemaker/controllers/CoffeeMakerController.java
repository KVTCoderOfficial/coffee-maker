package ru.kvt.coffeemaker.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kvt.coffeemaker.dto.BoilingModeDto;
import ru.kvt.coffeemaker.dto.CoffeeMakerStateDto;
import ru.kvt.coffeemaker.dto.CoffeeStrengthDto;
import ru.kvt.coffeemaker.mappers.CoffeeMakerStateMapper;
import ru.kvt.coffeemaker.model.BoilingMode;
import ru.kvt.coffeemaker.model.CoffeeMakerState;
import ru.kvt.coffeemaker.services.CoffeeMakerService;

import javax.validation.Valid;


@Api(value = "Set of endpoints for coffee-maker", produces = "application/json", consumes = "application/json", protocols = "http")
@RestController
@RequestMapping("/api/v1/coffee-maker")
@RequiredArgsConstructor
public class CoffeeMakerController {

    private final CoffeeMakerService coffeeMakerService;

    @ApiOperation("Turns on coffee-maker")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 500, message = "Server Error")
    })
    @PostMapping("/enable")
    public void enable() {
        coffeeMakerService.enable();
    }

    @ApiOperation("Turns off coffee-maker")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 500, message = "Server Error")
    })
    @PostMapping("/disable")
    public void disable() {
        coffeeMakerService.disable();
    }

    @ApiOperation("Pours coffee")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 500, message = "Server Error")
    })
    @PostMapping("/pour-coffee")
    public void pourCoffee() {
        coffeeMakerService.pourCoffee();
    }

    @ApiOperation("Sets coffee strength")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "Coffee Strength Set"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Option Not Found"),
            @ApiResponse(code = 500, message = "Server Error")
    })
    @PostMapping("/set-strength")
    public CoffeeStrengthDto setStrength(@RequestBody @Valid CoffeeStrengthDto coffeeStrengthDto) {
        Integer coffeeStrength = coffeeMakerService.setStrength(coffeeStrengthDto.getCoffeeStrength());
        CoffeeStrengthDto newCoffeeStrengthDto = new CoffeeStrengthDto();
        newCoffeeStrengthDto.setCoffeeStrength(coffeeStrength);
        return newCoffeeStrengthDto;
    }

    @ApiOperation("Pours water or vapor")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 500, message = "Server Error")
    })
    @PostMapping("/boiling")
    public void boiling() {
        coffeeMakerService.boiling();
    }

    @ApiOperation("Sets boiling mode")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "Boiling Mode Set"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Option Not Found"),
            @ApiResponse(code = 500, message = "Server Error")
    })
    @PostMapping("/boiling/set-mode")
    public BoilingModeDto setBoilingMode(@RequestBody @Valid BoilingModeDto boilingModeDto) {
        BoilingMode boilingMode = coffeeMakerService.setBoilingMode(boilingModeDto.getBoilingMode());
        BoilingModeDto newBoilingModeDto = new BoilingModeDto();
        newBoilingModeDto.setBoilingMode(boilingMode);
        return newBoilingModeDto;
    }

    @ApiOperation("Returns state of coffee-maker")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Coffee-makers State Found"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Coffee-maker Defected"),
            @ApiResponse(code = 500, message = "Server Error")
    })
    @GetMapping("/get-state")
    public CoffeeMakerStateDto getState() {
        CoffeeMakerState coffeeMakerState = coffeeMakerService.getState();
        return CoffeeMakerStateMapper.toCoffeeMakerStateDto(coffeeMakerState);
    }

}
