package com.airline.reservation.system.controller;

import com.airline.reservation.system.service.AbstractCrudService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public abstract class AbstractControllerImpl <E, D, R extends AbstractCrudService<E, D>> implements AbstractController <E, D>{
    @Autowired
    private R abstractService;

    @Override
    public Optional<E> findByID(Long id) {
        return abstractService.findByID(id);
    }

    @Override
    public List<E> findAll() {


        return abstractService.findAll();
    }

    @Override
    public void delete(Long id) {
        abstractService.delete(id);
    }

    @Override
    public E create(D dto) {
        return abstractService.create(dto);
    }
}
