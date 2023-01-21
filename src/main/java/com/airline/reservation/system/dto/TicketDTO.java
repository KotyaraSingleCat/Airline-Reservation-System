package com.airline.reservation.system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class TicketDTO {
    private long id;
    private String code;
    private RaceDTO race;
    private UserDTO user;
    private SeatDTO seatDTO;
}
