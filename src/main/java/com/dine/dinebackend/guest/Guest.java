package com.dine.dinebackend.guest;

import com.dine.dinebackend.reservation.Reservation;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "guest")
@Data
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "token")
    private String token;

    @ManyToOne
    @JoinColumn(name = "reservation_id", nullable = false)
    private Reservation guestReservation;
}
