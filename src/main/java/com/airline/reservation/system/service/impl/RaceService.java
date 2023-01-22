package com.airline.reservation.system.service.impl;

import com.airline.reservation.system.converter.AbstractConverter;
import com.airline.reservation.system.converter.impl.RaceConverter;
import com.airline.reservation.system.dto.RaceDTO;
import com.airline.reservation.system.persistence.entity.Race;
import com.airline.reservation.system.persistence.repository.RaceRepository;
import com.airline.reservation.system.service.interfaces.AbstractRaceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RaceService implements AbstractRaceService {

    private final RaceRepository repository;
    private final AbstractConverter<Race, RaceDTO> raceConverter;

    @Autowired
    public RaceService(RaceRepository repository) {
        raceConverter = new RaceConverter();
        this.repository = repository;
    }

    @Override
    public Optional<Race> findByID(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Race> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Race create(RaceDTO dto) {
        return repository.save(raceConverter.convertDtoToEntity(dto));
    }
}
