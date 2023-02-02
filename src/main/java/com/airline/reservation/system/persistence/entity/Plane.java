package com.airline.reservation.system.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="planes")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "company", nullable = false)
    private String company;

    @Column(name = "number", nullable=false, unique = true)
    private String number;

//    @OneToMany(mappedBy = "plane")
//    private List<Seat> seats;

}
