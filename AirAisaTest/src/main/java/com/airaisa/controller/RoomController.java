package com.airaisa.controller;

import com.airaisa.entity.Room;
import com.airaisa.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    RoomService roomService;

    @PostMapping("/save")
    public Room saveRoom(@RequestBody Room room) {
        return roomService.save(room);
    }
}