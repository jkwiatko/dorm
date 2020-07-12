package com.dorm.backend.room.dtos;

import lombok.Data;

@Data
public class AddressDTO {

    private String city;

    private String street;

    private String number;

    private Double longitude;

    private Double latitude;

}
