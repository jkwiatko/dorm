package com.dorm.backend.room.dtos;

import lombok.Data;

import java.util.Date;
import java.util.Optional;

@Data
public class RoomSearchCriteria {

    private String roomName;

    private String cityName;

    private Date startingDate;

    private Integer duration;

    private Integer maxPrice;

    private boolean lookingForUserOffer;

    //optional getters

    public Optional<String> getRoomName() {
        return Optional.ofNullable(roomName);
    }

    public Optional<Date> getStartingDate() {
        return Optional.ofNullable(startingDate);
    }

    public Optional<Integer> getDuration() {
        return Optional.ofNullable(duration);
    }

    public Optional<Integer> getMaxPrice() {
        return Optional.ofNullable(maxPrice);
    }
}
