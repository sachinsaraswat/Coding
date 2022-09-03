package com.example.webservices.restwebservices.user.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.http.HttpHeaders;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

        @ExceptionHandler(Exception.class)
        public ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest request)
                        throws java.lang.Exception {

                ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
                                request.getDescription(false));
                return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        @ExceptionHandler(UserNotFoundException.class)
        public ResponseEntity<ExceptionResponse> handleUserNotFoundException(Exception ex, WebRequest request)
                        throws java.lang.Exception {

                ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
                                request.getDescription(false));
                return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_FOUND);
        }

        @Override
        protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                        HttpHeaders headers, HttpStatus status, WebRequest request) {

                ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(),
                                "Validation failure: Input Data Issue",
                                ex.getBindingResult().getAllErrors().toString());

                return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);

        }

}
