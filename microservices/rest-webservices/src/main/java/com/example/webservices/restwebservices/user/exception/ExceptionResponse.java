package com.example.webservices.restwebservices.user.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionResponse {

    private Date Timestamp;
    private String message;
    private String details;

}
