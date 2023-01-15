package com.airline.reservation.system.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="seats")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @JoinColumn(name="plane_id", nullable=false, unique = true)
    @ManyToOne(cascade = CascadeType.ALL)
    private Plane plane;

    @Column(name = "number", nullable = false)
    private String number;

    @JoinColumn(name="ticket_id", nullable=false, unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Ticket ticket;

    @Column(name = "vip", nullable = false)
    private boolean vip;
}
