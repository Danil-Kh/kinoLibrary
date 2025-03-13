package org.example.kinolibrary.exception;

import lombok.Getter;

@Getter
public enum ExceptionMessages {
    THIS_MOVIE_ALREADY_ADDED("This movie has already been added"),
    MOVE_NOT_FOUND("Movie not found");

    private final String message;
    private ExceptionMessages(String message) {this.message = message;}
    public String getMessage() {
        return this.message;
    }

}
