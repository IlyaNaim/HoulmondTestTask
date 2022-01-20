package ru.creditManager.web.dtos;

import lombok.Data;

@Data
public class CustomerDto {

    private String firstName;

    private String lastName;

    private String patronymic;

    private String telephoneNumber;

    private String email;

    private String passportNumber;
}
