package com.airline.reservation.system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDTO {
    private long id;
    private String name;
    private String surname;
    private String lastname;
    private String date_of_birth;
    private Long card;
    private AccountDTO accountDTO;
}
