package com.airline.reservation.system.converter.impl;

import com.airline.reservation.system.converter.AbstractConverter;
import com.airline.reservation.system.dto.PlaneDTO;
import com.airline.reservation.system.dto.RaceDTO;
import com.airline.reservation.system.persistence.entity.Plane;
import com.airline.reservation.system.persistence.entity.Race;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.ZoneId;

public class RaceConverter implements AbstractConverter<Race, RaceDTO> {

    private final AbstractConverter<Plane, PlaneDTO> planeConverter;

    public RaceConverter() {
        planeConverter = new PlaneConverter();
    }

    @Override
    public Race convertDtoToEntity(RaceDTO dto) {
        Race race = new Race();
        race.setId(dto.getId());
        race.setPlane(planeConverter.convertDtoToEntity(dto.getPlane()));
        race.setDelay(Timestamp.valueOf(dto.getDelay()));
        race.setTakeoff_time(Date.valueOf(dto.getTakeoff_time().toLocalDate()));
        race.setLanding_time(Date.valueOf(dto.getLanding_time().toLocalDate()));
        return race;
    }

    @Override
    public RaceDTO convertEntityToDto(Race entity) {
        RaceDTO raceDTO = new RaceDTO();
        raceDTO.setId(entity.getId());
        raceDTO.setPlane(planeConverter.convertEntityToDto(entity.getPlane()));
        raceDTO.setTakeoff_time(entity.getTakeoff_time().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
        raceDTO.setLanding_time(entity.getLanding_time().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
        return raceDTO;
    }
}
