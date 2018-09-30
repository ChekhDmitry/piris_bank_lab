package com.piris.validation.message;

public enum ErrorMessage {
    EMPTYFIELD("Поле не должно быть пустым."),
    EMAILINUSE("Такой email уже зарегистрирован"),
    PHONEINUSE("Такой номер телефона уже зарегистрирован");

    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
