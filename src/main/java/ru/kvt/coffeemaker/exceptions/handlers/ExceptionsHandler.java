package ru.kvt.coffeemaker.exceptions.handlers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import ru.kvt.coffeemaker.dto.error.CoffeeMakerErrorMessage;
import ru.kvt.coffeemaker.exceptions.*;
import ru.kvt.coffeemaker.dto.error.CoffeeMakerErrorDto;


@ControllerAdvice
@Slf4j
public class ExceptionsHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.error(e.getMessage());
        CoffeeMakerErrorDto err = new CoffeeMakerErrorDto(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), CoffeeMakerErrorMessage.INVALID_REQUEST_PARAMS.getMessage());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<?> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e) {
        log.error(e.getMessage());
        CoffeeMakerErrorDto err = new CoffeeMakerErrorDto(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), CoffeeMakerErrorMessage.INVALID_REQUEST_PARAMS.getMessage());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<?> handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        log.error(e.getMessage());
        CoffeeMakerErrorDto err = new CoffeeMakerErrorDto(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), CoffeeMakerErrorMessage.INVALID_REQUEST_PARAMS.getMessage());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CoffeeMakerDisabledException.class)
    public ResponseEntity<?> handleCoffeeMakerDisabledException(CoffeeMakerDisabledException e) {
        log.error(e.getMessage());
        CoffeeMakerErrorDto err = new CoffeeMakerErrorDto(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), CoffeeMakerErrorMessage.COFFEE_MAKER_DISABLED.getMessage());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CoffeeMakerStateNotFoundException.class)
    public ResponseEntity<?> handleCoffeeMakerStateNotFoundException(CoffeeMakerStateNotFoundException e) {
        log.error(e.getMessage());
        CoffeeMakerErrorDto err = new CoffeeMakerErrorDto(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), CoffeeMakerErrorMessage.COFFEE_MAKER_STATE_NOT_FOUND.getMessage());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CurrentBoilingModeAlreadySelectedException.class)
    public ResponseEntity<?> handleCurrentBoilingModeAlreadySelectedException(CurrentBoilingModeAlreadySelectedException e) {
        log.error(e.getMessage());
        CoffeeMakerErrorDto err = new CoffeeMakerErrorDto(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), CoffeeMakerErrorMessage.CURRENT_BOILING_MODE_ALREADY_SELECTED.getMessage());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CoffeeMakerAlreadyDisabledException.class)
    public ResponseEntity<?> handleCoffeeMakerAlreadyDisabledException(CoffeeMakerAlreadyDisabledException e) {
        log.error(e.getMessage());
        CoffeeMakerErrorDto err = new CoffeeMakerErrorDto(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), CoffeeMakerErrorMessage.COFFEE_MAKER_ALREADY_DISABLED.getMessage());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CoffeeMakerAlreadyEnabledException.class)
    public ResponseEntity<?> handleCoffeeMakerAlreadyEnabledException(CoffeeMakerAlreadyEnabledException e) {
        log.error(e.getMessage());
        CoffeeMakerErrorDto err = new CoffeeMakerErrorDto(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), CoffeeMakerErrorMessage.COFFEE_MAKER_ALREADY_ENABLED.getMessage());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

}
