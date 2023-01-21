package com.airline.reservation.system.converter.impl;

import com.airline.reservation.system.converter.AbstractConverter;
import com.airline.reservation.system.dto.PlaneDTO;
import com.airline.reservation.system.dto.SeatDTO;
import com.airline.reservation.system.dto.TicketDTO;
import com.airline.reservation.system.persistence.entity.Plane;
import com.airline.reservation.system.persistence.entity.Seat;
import com.airline.reservation.system.persistence.entity.Ticket;

public class SeatConverter implements AbstractConverter<Seat, SeatDTO> {

    private final AbstractConverter<Plane, PlaneDTO> planeConverter;
    private final AbstractConverter<Ticket, TicketDTO> ticketConverter;

    public SeatConverter() {
        planeConverter = new PlaneConverter();
        ticketConverter = new TicketConverter();
    }

    @Override
    public Seat convertDtoToEntity(SeatDTO dto) {
        Seat seat = new Seat();
        seat.setId(dto.getId());
        seat.setNumber(dto.getNumber());
        seat.setPlane(planeConverter.convertDtoToEntity(dto.getPlane()));
        seat.setTicket(ticketConverter.convertDtoToEntity(dto.getTicket()));
        seat.setVip(dto.isVip());
        return seat;
    }

    @Override
    public SeatDTO convertEntityToDto(Seat entity) {
        SeatDTO seatDTO = new SeatDTO();
        seatDTO.setId(entity.getId());
        seatDTO.setNumber(entity.getNumber());
        seatDTO.setPlane(planeConverter.convertEntityToDto(entity.getPlane()));
        seatDTO.setTicket(ticketConverter.convertEntityToDto(entity.getTicket()));
        seatDTO.setVip(entity.isVip());
        return seatDTO;
    }
}
