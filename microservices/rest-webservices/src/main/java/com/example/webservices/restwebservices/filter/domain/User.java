package com.example.webservices.restwebservices.filter.domain;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.validation.Valid;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Valid
@JsonIgnoreProperties(value = { "id" })
public class User {

    @GeneratedValue
    private Integer id;

    @Size(min = 2, message = "Name must be two or more characters")
    private String name;

    @Past
    @JsonIgnore
    private Date birthDate;

}
