package org.example.kinolibrary.exception;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@RequiredArgsConstructor
public class KinoLibraryExceptionHandler {
    @ExceptionHandler(MovieException.class)
    public ResponseEntity<String> handleMovieException(final MovieException e) {

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ExceptionMessages.MOVE_NOT_FOUND.getMessage());
    }
}
