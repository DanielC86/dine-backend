package com.dine.dinebackend.guest.dto;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GuestDto {

    private long id;
    private String token;

}
