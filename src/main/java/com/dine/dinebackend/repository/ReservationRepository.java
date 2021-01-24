package com.dine.dinebackend.repository;

import com.dine.dinebackend.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "reservation", path = "reservations")
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
