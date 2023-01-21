package com.airline.reservation.system.service.interfaces;

import com.airline.reservation.system.dto.TicketDTO;
import com.airline.reservation.system.persistence.entity.Ticket;
import com.airline.reservation.system.service.AbstractCrudService;

public interface AbstractTicketService extends AbstractCrudService<Ticket, TicketDTO> {
}
