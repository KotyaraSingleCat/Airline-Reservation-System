package com.airline.reservation.system.controller.impl;

import com.airline.reservation.system.controller.AbstractControllerImpl;
import com.airline.reservation.system.dto.RaceDTO;
import com.airline.reservation.system.persistence.entity.Race;
import com.airline.reservation.system.service.impl.RaceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/race")
public class RaceController extends AbstractControllerImpl <Race, RaceDTO, RaceService> {
}
