package com.airline.reservation.system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class PlaneDTO {
    private long id;
    private String company;
    private String number;
    private List<SeatDTO> seats;
}
