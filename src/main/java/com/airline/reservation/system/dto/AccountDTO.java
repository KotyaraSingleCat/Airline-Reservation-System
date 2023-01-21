package com.airline.reservation.system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDTO {
    private long id;
    private String password;
    private String email;
    private String created_on;
    private String last_login;
}
