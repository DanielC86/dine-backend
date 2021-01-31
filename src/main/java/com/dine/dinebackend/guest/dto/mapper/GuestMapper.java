package com.dine.dinebackend.guest.dto.mapper;

import com.dine.dinebackend.guest.Guest;
import com.dine.dinebackend.guest.dto.GuestDto;

public class GuestMapper {

    public static GuestDto getReadDtoFromEntity(Guest entity) {
        if (entity == null) {
            return null;
        }
        return GuestDto.builder()
                .id(entity.getId())
                .token(entity.getToken())
                .build();
    }
}
