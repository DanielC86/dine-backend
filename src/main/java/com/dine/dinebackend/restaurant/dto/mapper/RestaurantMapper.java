package com.dine.dinebackend.restaurant.dto.mapper;

import com.dine.dinebackend.restaurant.Restaurant;
import com.dine.dinebackend.restaurant.dto.RestaurantDto;

public class RestaurantMapper {

    public static RestaurantDto getReadDtoFromEntity(Restaurant entity) {
        if (entity == null) {
         return null;
        }
        return RestaurantDto.builder()
                .id(entity.getId())
                .restaurantName(entity.getRestaurantName())
                .build();
    }
}
