package com.dine.dinebackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "reservation")
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "guestNumber")
    private int guestNumber;

    @Column(name = "reservationDate")
    private Date reservationDate;

    @Column(name = "reservationTime")
    private Time reservationTime;

    @Column(name = "paymentType")
    private String paymentType;

    @Column(name = "notes")
    private String notes;

}
