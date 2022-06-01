package ru.kvt.coffeemaker.controllers.handlers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import ru.kvt.coffeemaker.dto.errors.CoffeeMakerErrorMessage;
import ru.kvt.coffeemaker.exceptions.*;
import ru.kvt.coffeemaker.dto.errors.CoffeeMakerErrorDto;

@ControllerAdvice
@Slf4j
public class ExceptionsHandler {

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<CoffeeMakerErrorDto> handleException(Exception exception) {
        log.error(exception.getMessage());

        if (exception instanceof MethodArgumentNotValidException)
            return process(HttpStatus.BAD_REQUEST, CoffeeMakerErrorMessage.INVALID_REQUEST_PARAMS);

        if (exception instanceof MethodArgumentTypeMismatchException)
            return process(HttpStatus.BAD_REQUEST, CoffeeMakerErrorMessage.INVALID_REQUEST_PARAMS);

        if (exception instanceof HttpMessageNotReadableException)
            return process(HttpStatus.BAD_REQUEST, CoffeeMakerErrorMessage.INVALID_REQUEST_PARAMS);

        if (exception instanceof CoffeeMakerDisabledException)
            return process(HttpStatus.BAD_REQUEST, CoffeeMakerErrorMessage.COFFEE_MAKER_DISABLED);

        if (exception instanceof CoffeeMakerStateNotFoundException)
            return process(HttpStatus.BAD_REQUEST, CoffeeMakerErrorMessage.COFFEE_MAKER_STATE_NOT_FOUND);

        if (exception instanceof CurrentBoilingModeAlreadySelectedException)
            return process(HttpStatus.BAD_REQUEST, CoffeeMakerErrorMessage.CURRENT_BOILING_MODE_ALREADY_SELECTED);

        if (exception instanceof CoffeeMakerAlreadyDisabledException)
            return process(HttpStatus.BAD_REQUEST, CoffeeMakerErrorMessage.COFFEE_MAKER_ALREADY_DISABLED);

        if (exception instanceof CoffeeMakerAlreadyEnabledException)
            return process(HttpStatus.BAD_REQUEST, CoffeeMakerErrorMessage.COFFEE_MAKER_ALREADY_ENABLED);

        return process(HttpStatus.INTERNAL_SERVER_ERROR, CoffeeMakerErrorMessage.UNEXPECTED_ERROR);
    }

    private ResponseEntity<CoffeeMakerErrorDto> process(HttpStatus httpStatus, CoffeeMakerErrorMessage coffeeMakerErrorMessage) {
        CoffeeMakerErrorDto err = new CoffeeMakerErrorDto(httpStatus.value(), httpStatus.getReasonPhrase(), coffeeMakerErrorMessage.getMessage());
        return new ResponseEntity<>(err, httpStatus);
    }

}
