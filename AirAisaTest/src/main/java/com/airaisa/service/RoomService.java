package com.airaisa.service;

import com.airaisa.entity.Room;
import com.airaisa.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    @Autowired
    RoomRepository repository;

    public Room save(Room room) {
        return repository.save(room);

    }
}
