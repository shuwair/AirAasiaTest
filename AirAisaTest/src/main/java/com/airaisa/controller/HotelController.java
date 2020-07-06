package com.airaisa.controller;

import com.airaisa.entity.Hotel;
import com.airaisa.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @PostMapping("/save")
    public Hotel saveHotel(@RequestBody Hotel hotel) {
        return hotelService.save(hotel);
    }
}