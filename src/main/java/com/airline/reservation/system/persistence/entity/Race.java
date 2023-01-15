package com.airline.reservation.system.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Table(name="races")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @JoinColumn(name="plane_id", nullable=false, unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Plane plane;

    @Column(name = "takeoff_time", nullable = false)
    private Date takeoff_time;

    @Column(name = "landing_time", nullable = false)
    private Date landing_time;

    @Column(name = "delay")
    private Timestamp delay;

    @Column(name = "number_of_tickets", nullable = false)
    private int number_of_tickets;
}
