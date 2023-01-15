package com.airline.reservation.system.persistence.repository;

import com.airline.reservation.system.persistence.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long> {
}
