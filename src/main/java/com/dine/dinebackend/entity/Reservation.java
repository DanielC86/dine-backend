package com.dine.dinebackend.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "reservation")
//@Data -- bug with relational db
@Getter
@Setter
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "reservationDate")
    private Date reservationDate;

    @Column(name = "reservationTime")
    private Time reservationTime;

    @Column(name = "guestNumber")
    private int guestNumber;

    @Column(name = "paymentType")
    private String paymentType;

    @Column(name = "notes")
    private String notes;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tableReservation")
    private Set<RestaurantTable> restaurantTables;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "guestReservation")
    private Set<Guest> guests;

}
