package com.airline.reservation.system.service.interfaces;

import com.airline.reservation.system.dto.UserDTO;
import com.airline.reservation.system.persistence.entity.User;
import com.airline.reservation.system.service.AbstractCrudService;

public interface AbstractUserService extends AbstractCrudService<User, UserDTO> {
}
