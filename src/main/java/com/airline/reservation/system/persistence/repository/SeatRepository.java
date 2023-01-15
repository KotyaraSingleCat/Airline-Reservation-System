package com.airline.reservation.system.persistence.repository;

import com.airline.reservation.system.persistence.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
}
