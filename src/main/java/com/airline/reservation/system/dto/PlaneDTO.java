package com.airline.reservation.system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class PlaneDTO {
    private long id;
    private String company;
    private String number;
    private List<SeatDTO> seats;
}
