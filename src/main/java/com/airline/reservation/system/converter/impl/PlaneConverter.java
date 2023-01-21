package com.airline.reservation.system.converter.impl;

import com.airline.reservation.system.converter.AbstractConverter;
import com.airline.reservation.system.dto.PlaneDTO;
import com.airline.reservation.system.dto.SeatDTO;
import com.airline.reservation.system.persistence.entity.Plane;
import com.airline.reservation.system.persistence.entity.Seat;

import java.util.stream.Collectors;

public class PlaneConverter implements AbstractConverter<Plane, PlaneDTO> {
    private final AbstractConverter<Seat, SeatDTO> seatConverter;

    public PlaneConverter() {
        seatConverter = new SeatConverter();
    }

    @Override
    public Plane convertDtoToEntity(PlaneDTO dto) {
        Plane plane = new Plane();
        plane.setId(dto.getId());
        plane.setNumber(dto.getNumber());
        plane.setCompany(dto.getCompany());
        plane.setSeats(dto.getSeats().stream().map(seatConverter::convertDtoToEntity).collect(Collectors.toList()));
        return plane;
    }

    @Override
    public PlaneDTO convertEntityToDto(Plane entity) {
        PlaneDTO planeDTO = new PlaneDTO();
        planeDTO.setId(entity.getId());
        planeDTO.setNumber(entity.getNumber());
        planeDTO.setCompany(entity.getCompany());
        planeDTO.setSeats(entity.getSeats().stream().map(seatConverter::convertEntityToDto).collect(Collectors.toList()));
        return planeDTO;
    }
}
