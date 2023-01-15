package com.airline.reservation.system.persistence.repository;

import com.airline.reservation.system.persistence.entity.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race, Long> {
}
