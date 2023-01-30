package com.airline.reservation.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


public interface AbstractController <E, D>{

    @GetMapping("/{id}")
    Optional<E> findByID(@PathVariable Long id);

    @GetMapping("/all")
    List<E> findAll();

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id);

    @PostMapping
    E create(@RequestBody D dto);
}
