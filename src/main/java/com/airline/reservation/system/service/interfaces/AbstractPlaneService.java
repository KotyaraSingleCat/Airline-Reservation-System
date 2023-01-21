package com.airline.reservation.system.service.interfaces;

import com.airline.reservation.system.dto.PlaneDTO;
import com.airline.reservation.system.persistence.entity.Plane;
import com.airline.reservation.system.service.AbstractCrudService;

public interface AbstractPlaneService extends AbstractCrudService<Plane, PlaneDTO> {
}
