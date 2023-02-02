package com.airline.reservation.system.service.impl;

import com.airline.reservation.system.converter.AbstractConverter;
import com.airline.reservation.system.converter.impl.SeatConverter;
import com.airline.reservation.system.dto.SeatDTO;
import com.airline.reservation.system.persistence.entity.Seat;
import com.airline.reservation.system.persistence.repository.SeatRepository;
import com.airline.reservation.system.service.interfaces.AbstractSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeatService implements AbstractSeatService {

    private final SeatRepository repository;
    private final AbstractConverter<Seat, SeatDTO> seatConverter;

    @Autowired
    public SeatService(SeatRepository repository) {
        seatConverter = new SeatConverter();
        this.repository = repository;
    }

    @Override
    public Optional<Seat> findByID(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Seat> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Seat create(SeatDTO dto) {
        return repository.save(seatConverter.convertDtoToEntity(dto));
    }
}
