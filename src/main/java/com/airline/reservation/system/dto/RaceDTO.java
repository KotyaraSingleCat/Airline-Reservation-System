package com.airline.reservation.system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class RaceDTO {
    private long id;
    private PlaneDTO plane;
    private LocalDateTime takeoff_time;
    private LocalDateTime landing_time;
    private LocalDateTime delay;
    private int number_of_tickets;

}
