package com.dine.dinebackend.repository;

import com.dine.dinebackend.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "restaurant", path = "restaurants")
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
