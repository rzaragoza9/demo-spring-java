package com.example.demospringjavabasic.models;



import com.example.demospringjavabasic.models.dto.HomeDTO;
import com.example.demospringjavabasic.models.dto.RoomDTO;
import com.example.demospringjavabasic.models.dto.ValueHomeDTO;

import java.util.HashMap;

public class HomeCalculator {

    public static ValueHomeDTO calculateHomeValue(HomeDTO home){
        ValueHomeDTO valueHomeDTO = new ValueHomeDTO();
        HashMap<String, Double> listSizeRooms = new HashMap<>();
        double size = 0.0;
        RoomDTO largerRoom = null;
        double largerSizeRoom = 0.0;
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
