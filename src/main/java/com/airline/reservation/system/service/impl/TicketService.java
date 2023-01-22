package com.airline.reservation.system.service.impl;

import com.airline.reservation.system.converter.AbstractConverter;
import com.airline.reservation.system.converter.impl.TicketConverter;
import com.airline.reservation.system.dto.TicketDTO;
import com.airline.reservation.system.persistence.entity.Ticket;
import com.airline.reservation.system.persistence.repository.TicketRepository;
import com.airline.reservation.system.service.interfaces.AbstractTicketService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TicketService implements AbstractTicketService {

    private final TicketRepository repository;
    private final AbstractConverter<Ticket, TicketDTO> ticketConverter;

    @Autowired
    public TicketService(TicketRepository repository) {
        ticketConverter = new TicketConverter();
        this.repository = repository;
    }

    @Override
    public Optional<Ticket> findByID(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Ticket> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Ticket create(TicketDTO dto) {
        return repository.save(ticketConverter.convertDtoToEntity(dto));
    }
}
