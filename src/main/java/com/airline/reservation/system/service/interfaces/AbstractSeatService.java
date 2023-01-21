package com.airline.reservation.system.service.interfaces;

import com.airline.reservation.system.dto.SeatDTO;
import com.airline.reservation.system.persistence.entity.Seat;
import com.airline.reservation.system.service.AbstractCrudService;

public interface AbstractSeatService extends AbstractCrudService<Seat, SeatDTO> {
}
