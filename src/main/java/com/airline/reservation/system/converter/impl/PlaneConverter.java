package com.airline.reservation.system.converter.impl;

import com.airline.reservation.system.converter.AbstractConverter;
import com.airline.reservation.system.dto.PlaneDTO;
import com.airline.reservation.system.persistence.entity.Plane;

public class PlaneConverter implements AbstractConverter<Plane, PlaneDTO> {

    @Override
    public Plane convertDtoToEntity(PlaneDTO dto) {
        Plane plane = new Plane();
        plane.setId(dto.getId());
        plane.setNumber(dto.getNumber());
        plane.setCompany(dto.getCompany());
        return plane;
    }

    @Override
    public PlaneDTO convertEntityToDto(Plane entity) {
        PlaneDTO planeDTO = new PlaneDTO();
        planeDTO.setId(entity.getId());
        planeDTO.setNumber(entity.getNumber());
        planeDTO.setCompany(entity.getCompany());
        return planeDTO;
    }
}
