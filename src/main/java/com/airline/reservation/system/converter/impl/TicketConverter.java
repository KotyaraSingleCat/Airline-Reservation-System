package com.airline.reservation.system.converter.impl;

import com.airline.reservation.system.converter.AbstractConverter;
import com.airline.reservation.system.dto.RaceDTO;
import com.airline.reservation.system.dto.TicketDTO;
import com.airline.reservation.system.dto.UserDTO;
import com.airline.reservation.system.persistence.entity.Race;
import com.airline.reservation.system.persistence.entity.Ticket;
import com.airline.reservation.system.persistence.entity.User;

public class TicketConverter implements AbstractConverter<Ticket, TicketDTO> {
    private final AbstractConverter<Race, RaceDTO> raceConverter;
    private final AbstractConverter<User, UserDTO> userConverter;

    public TicketConverter() {
        raceConverter = new RaceConverter();
        userConverter = new UserConverter();
    }

    @Override
    public Ticket convertDtoToEntity(TicketDTO dto) {
        Ticket ticket = new Ticket();
        ticket.setId(dto.getId());
        ticket.setCode(dto.getCode());
        ticket.setRace(raceConverter.convertDtoToEntity(dto.getRace()));
        ticket.setUser(userConverter.convertDtoToEntity(dto.getUser()));
        return ticket;
    }

    @Override
    public TicketDTO convertEntityToDto(Ticket entity) {
        TicketDTO ticketDTO = new TicketDTO();
        ticketDTO.setId(entity.getId());
        ticketDTO.setCode(entity.getCode());
        ticketDTO.setRace(raceConverter.convertEntityToDto(entity.getRace()));
        ticketDTO.setUser(userConverter.convertEntityToDto(entity.getUser()));
        return ticketDTO;
    }
}
