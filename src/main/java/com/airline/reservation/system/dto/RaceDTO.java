package com.airline.reservation.system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RaceDTO {
    private long id;
    private PlaneDTO plane;
    private String takeoff_time;
    private String landing_time;
    private String delay;
    private int number_of_tickets;

}
