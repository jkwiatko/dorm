package com.dorm.backend.shared.data.entities;

import com.dorm.backend.shared.data.entities.address.Address;
import com.dorm.backend.shared.data.entities.base.BaseEntity;
import com.dorm.backend.shared.data.enums.EAmenity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Room extends BaseEntity {

    private User owner;
    private Address address;
    private List<Picture> pictures;
    private Set<User> possibleRoommates;
    private User rentee;
    private List<Message> chat;

    private String name;
    private String description;
    private BigDecimal monthlyPrice;
    private BigDecimal deposit;
    private Date availableFrom;
    private Integer minDuration;
    private Integer houseArea;
    private Integer roomsNumber;
    private List<EAmenity> amenities;

    @ManyToOne
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @OneToMany(mappedBy = "ofRoom", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    //TODO resolve to more safe cascading type
    @ManyToMany(mappedBy = "possibleRooms", cascade = CascadeType.ALL)
    public Set<User> getPossibleRoommates() {
        return possibleRoommates;
    }

    public void setPossibleRoommates(Set<User> possibleRoommates) {
        this.possibleRoommates = possibleRoommates;
    }

    @OneToOne(mappedBy = "rentedRoom")
    public User getRentee() {
        return rentee;
    }

    public void setRentee(User rentee) {
        this.rentee = rentee;
    }

    @OneToMany(mappedBy = "room")
    public List<Message> getChat() {
        return chat;
    }

    public void setChat(List<Message> chat) {
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(BigDecimal monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public Date getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(Date availableFrom) {
        this.availableFrom = availableFrom;
    }

    public Integer getMinDuration() {
        return minDuration;
    }

    public void setMinDuration(Integer minDuration) {
        this.minDuration = minDuration;
    }

    public Integer getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(Integer houseArea) {
        this.houseArea = houseArea;
    }

    public Integer getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(Integer roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    @Enumerated(value = EnumType.STRING)
    @ElementCollection(targetClass = EAmenity.class)
    public List<EAmenity> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<EAmenity> amenities) {
        this.amenities = amenities;
    }
}
