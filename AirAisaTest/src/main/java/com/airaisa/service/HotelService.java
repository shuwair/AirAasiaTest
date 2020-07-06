package com.airaisa.service;

import com.airaisa.entity.Hotel;
import com.airaisa.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
    @Autowired
    HotelRepository repository;

    public Hotel save(Hotel hotel) {
        return repository.save(hotel);

    }
}
