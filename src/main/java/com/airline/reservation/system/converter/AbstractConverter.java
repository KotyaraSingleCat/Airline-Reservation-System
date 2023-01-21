package com.airline.reservation.system.converter;

public interface AbstractConverter <E, D> {
    E convertDtoToEntity(D dto);
    D convertEntityToDto(E entity);
}
