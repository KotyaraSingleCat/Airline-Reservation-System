package com.airline.reservation.system.service.impl;

import com.airline.reservation.system.converter.AbstractConverter;
import com.airline.reservation.system.converter.impl.PlaneConverter;
import com.airline.reservation.system.dto.PlaneDTO;
import com.airline.reservation.system.persistence.entity.Plane;
import com.airline.reservation.system.persistence.repository.PlaneRepository;
import com.airline.reservation.system.service.interfaces.AbstractPlaneService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PlaneService implements AbstractPlaneService {

    private final PlaneRepository repository;
    private final AbstractConverter<Plane, PlaneDTO> planeConverter;

    @Autowired
    public PlaneService(PlaneRepository repository) {
        planeConverter = new PlaneConverter();
        this.repository = repository;
    }

    @Override
    public Optional<Plane> findByID(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Plane> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Plane create(PlaneDTO dto) {
        return repository.save(planeConverter.convertDtoToEntity(dto));
    }
}
