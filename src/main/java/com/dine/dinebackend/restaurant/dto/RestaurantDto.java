package com.dine.dinebackend.restaurant.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RestaurantDto {

    private long id;
    private String restaurantName;
}
