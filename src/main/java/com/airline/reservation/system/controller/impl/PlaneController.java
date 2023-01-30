package com.airline.reservation.system.controller.impl;

import com.airline.reservation.system.controller.AbstractControllerImpl;
import com.airline.reservation.system.dto.PlaneDTO;
import com.airline.reservation.system.persistence.entity.Plane;
import com.airline.reservation.system.service.impl.PlaneService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plane")
public class PlaneController extends AbstractControllerImpl<Plane, PlaneDTO, PlaneService> {
}
