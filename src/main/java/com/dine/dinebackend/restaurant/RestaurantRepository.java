package com.dine.dinebackend.restaurant;

import com.dine.dinebackend.restaurant.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "restaurant", path = "restaurants")
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
