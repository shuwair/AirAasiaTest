package com.airaisa.entity;

import javax.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String number;
    private Integer adultCapacity;
    private Integer childCapacity;
    private Double cost;

    @ManyToOne()
    @JoinColumn(name = "hotelId", referencedColumnName = "id")
    private Hotel hotel;

    protected Room() {
    }

    public Room(String name, String number, Integer adultCapacity, Integer childCapacity, Double cost, Hotel hotel) {
        this.name = name;
        this.number = number;
        this.adultCapacity = adultCapacity;
        this.childCapacity = childCapacity;
        this.hotel = hotel;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Integer getAdultCapacity() {
        return adultCapacity;
    }

    public Integer getChildCapacity() {
        return childCapacity;
    }

    public Hotel getHotel() {
        return hotel;
    }
}
