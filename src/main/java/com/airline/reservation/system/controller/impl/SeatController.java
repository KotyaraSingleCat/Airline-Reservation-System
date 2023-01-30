package com.airline.reservation.system.controller.impl;

import com.airline.reservation.system.controller.AbstractControllerImpl;
import com.airline.reservation.system.dto.SeatDTO;
import com.airline.reservation.system.persistence.entity.Seat;
import com.airline.reservation.system.service.impl.SeatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seat")
public class SeatController extends AbstractControllerImpl <Seat, SeatDTO, SeatService> {
}
