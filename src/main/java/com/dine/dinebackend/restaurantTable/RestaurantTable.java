package com.dine.dinebackend.restaurantTable;

import com.dine.dinebackend.reservation.Reservation;
import com.dine.dinebackend.restaurant.Restaurant;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "restaurant_table")
//@Data -- bug with relational db
@Getter
@Setter
public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "number_of_seats")
    private int numberOfSeats;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurants;

    @ManyToOne
    @JoinColumn(name = "reservation_id", nullable = false)
    private Reservation tableReservation;

}
