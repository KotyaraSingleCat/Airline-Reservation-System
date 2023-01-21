package com.airline.reservation.system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class SeatDTO {
    private long id;
    private PlaneDTO plane;
    private String number;
    private TicketDTO ticket;
    private boolean vip;
}
