package com.airline.reservation.system.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AbstractCrudService <E, D>{
    E findByID(String id);
    List<E> findAll();
    boolean delete(String id);
    E create(D dto);
    E update(D dto);

}
