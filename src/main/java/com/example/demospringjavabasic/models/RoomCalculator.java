package com.example.demo.models;

import com.example.demo.models.DTOs.RoomDTO;

public class RoomCalculator {

    public static Double getSize(RoomDTO room){
        return room.getWidth()* room.getHeight();
    }

}
