package com.airaisa.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "customer_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date checkInDate;
    private Date checkOutDate;
    private Date bookingDate;
    private Integer guests;
    private String status;
    private Double totalAmount;

    protected Order() {
    }

    public Order(Date checkInDate, Date checkOutDate, Date bookingDate, Integer guests, String status, Double totalAmount, Hotel hotel, Room room, Customer customer) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingDate = bookingDate;
        this.guests = guests;
        this.status = status;
        this.totalAmount = totalAmount;
        this.hotel = hotel;
        this.room = room;
        this.customer = customer;
    }

    @ManyToOne()
    @JoinColumn(name = "hotelId", referencedColumnName = "id")
    private Hotel hotel;

    @ManyToOne()
    @JoinColumn(name = "roomId", referencedColumnName = "id")
    private Room room;

    @ManyToOne()
    @JoinColumn(name = "customerId", referencedColumnName = "id")
    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Integer getGuests() {
        return guests;
    }

    public void setGuests(Integer guests) {
        this.guests = guests;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
