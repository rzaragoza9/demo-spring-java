package com.example.demo.models;

import com.example.demo.models.DTOs.HomeDTO;
import com.example.demo.models.DTOs.RoomDTO;
import com.example.demo.models.DTOs.ValueHomeDTO;

import java.util.HashMap;
import java.util.logging.Handler;

public class HomeCalculator {

    public static ValueHomeDTO calculateHomeValue(HomeDTO home){
        ValueHomeDTO valueHomeDTO = new ValueHomeDTO();
        HashMap<String, Double> listSizeRooms = new HashMap<>();
        Double size = 0.0;
        Double value = 0.0;
        RoomDTO largerRoom = null;
        Double largerSizeRoom = 0.0;
        for(RoomDTO room : home.getRooms()){
            size += RoomCalculator.getSize(room);
            if(RoomCalculator.getSize(room) > largerSizeRoom){
                largerRoom = room;
                largerSizeRoom = RoomCalculator.getSize(room);
            }
            listSizeRooms.put(room.getName(), RoomCalculator.getSize(room));
        }
        valueHomeDTO.setSquareMetres(size);
        valueHomeDTO.setValue(size*800);
        valueHomeDTO.setLargerRoom(largerRoom);
        valueHomeDTO.setListSizeRooms(listSizeRooms);

        return  valueHomeDTO;
    }

}
