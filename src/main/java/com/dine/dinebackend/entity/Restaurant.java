package com.dine.dinebackend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "restaurant")
@Data
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "restaurant_name")
    private String restaurantName;

    @Column(name = "restaurant_phone")
    private String restaurantPhone;

    @Column(name = "restaurant_email")
    private String restaurantEmail;

    @Column(name = "restaurant_country")
    private String restaurantCountry;

    @Column(name = "restaurant_city")
    private String restaurantCity;

    @Column(name = "restaurant_postcode")
    private String restaurantPostCode;

    @Column(name = "restaurant_address")
    private String restaurantAddress;

    @Column(name = "number_of_tables")
    private int numberOfTables;

    @Column(name = "restaurant_type")
    private String restaurantType;

    @Column(name = "is_takeaway")
    private boolean isTakeaway;
}
