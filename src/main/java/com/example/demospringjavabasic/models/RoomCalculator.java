package com.example.demospringjavabasic.models;


import com.example.demospringjavabasic.models.dto.RoomDTO;

public class RoomCalculator {

    public static Double getSize(RoomDTO room){
        return room.getWidth()* room.getHeight();
    }

}
