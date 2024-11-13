package com.picpaysimplificado.dtos;

import com.picpaysimplificado.model.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, BigDecimal balance, String email, String phoneNumber, String password, UserType type, String document) {
}
