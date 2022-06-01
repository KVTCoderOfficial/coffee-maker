package ru.kvt.coffeemaker.dto.errors;

import lombok.Getter;

@Getter
public enum CoffeeMakerErrorMessage {

    INVALID_REQUEST_PARAMS("Неверные параметры запроса"),
    COFFEE_MAKER_DISABLED("Кофеварка выключена. Включите кофеварку для работы с ней"),
    COFFEE_MAKER_STATE_NOT_FOUND("Установите начальное состояние кофеварки"),
    CURRENT_BOILING_MODE_ALREADY_SELECTED("Данный режим уже включен"),
    COFFEE_MAKER_ALREADY_DISABLED("Кофеварка уже выключена"),
    COFFEE_MAKER_ALREADY_ENABLED("Кофеварка уже включена"),
    UNEXPECTED_ERROR("Неизвестная ошибка");

    private final String message;

    CoffeeMakerErrorMessage(String message) {
        this.message = message;
    }

}
