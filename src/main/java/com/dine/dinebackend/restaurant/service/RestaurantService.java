package com.dine.dinebackend.restaurant.service;

import com.dine.dinebackend.restaurant.RestaurantRepository;
import com.dine.dinebackend.restaurant.dto.RestaurantDto;
import com.dine.dinebackend.restaurant.dto.mapper.RestaurantMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;


    public List<RestaurantDto> getAllRestaurantDto() {
        return restaurantRepository.findAll().stream().map(RestaurantMapper::getReadDtoFromEntity).collect(Collectors.toList());
    }

}
