package com.airline.reservation.system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    private long id;
    private String password;
    private String email;
    private LocalDateTime created_on;
    private LocalDateTime last_login;
}
