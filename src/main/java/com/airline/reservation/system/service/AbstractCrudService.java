package com.airline.reservation.system.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AbstractCrudService <E, D>{
    Optional<E> findByID(Long id);
    List<E> findAll();
    void delete(Long id);
    E create(D dto);
}
