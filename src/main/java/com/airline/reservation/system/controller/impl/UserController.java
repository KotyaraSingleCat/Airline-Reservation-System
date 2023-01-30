package com.airline.reservation.system.controller.impl;

import com.airline.reservation.system.controller.AbstractControllerImpl;
import com.airline.reservation.system.dto.UserDTO;
import com.airline.reservation.system.persistence.entity.User;
import com.airline.reservation.system.service.impl.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractControllerImpl <User, UserDTO, UserService> {
}
