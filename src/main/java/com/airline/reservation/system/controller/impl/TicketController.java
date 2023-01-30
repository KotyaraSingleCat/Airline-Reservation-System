package com.airline.reservation.system.controller.impl;

import com.airline.reservation.system.controller.AbstractControllerImpl;
import com.airline.reservation.system.dto.TicketDTO;
import com.airline.reservation.system.persistence.entity.Ticket;
import com.airline.reservation.system.service.impl.TicketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController extends AbstractControllerImpl <Ticket, TicketDTO, TicketService> {
}
