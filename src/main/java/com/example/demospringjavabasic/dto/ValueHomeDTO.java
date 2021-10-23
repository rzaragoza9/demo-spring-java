package com.example.demo.models.DTOs;

import java.util.HashMap;

public class ValueHomeDTO {
    private Double squareMetres;
    private Double value;
    private RoomDTO largerRoom;
    private HashMap<String, Double> listSizeRooms;

    public Double getSquareMetres() {
        return squareMetres;
    }

    public void setSquareMetres(Double squareMetres) {
        this.squareMetres = squareMetres;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public RoomDTO getLargerRoom() {
        return largerRoom;
    }

    public void setLargerRoom(RoomDTO largerRoom) {
        this.largerRoom = largerRoom;
    }

    public HashMap<String, Double> getListSizeRooms() {
        return listSizeRooms;
    }

    public void setListSizeRooms(HashMap<String, Double> listSizeRooms) {
        this.listSizeRooms = listSizeRooms;
    }
}
