package com.workshop.workshopmongo.resources.exceptions;

import com.workshop.workshopmongo.services.exception.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandarError> resourceNotFound(ObjectNotFoundException e, HttpServletRequest request){
        String error = "Resouce  not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandarError err = new StandarError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

//    @ExceptionHandler(DatabaseException.class)
//    public ResponseEntity<StandarError> database(DatabaseException e, HttpServletRequest request){
//        String error = "Database error";
//        HttpStatus status = HttpStatus.BAD_REQUEST;
//        StandarError err = new StandarError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
//        return ResponseEntity.status(status).body(err);
//    }
}
