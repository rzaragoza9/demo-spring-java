package com.example.demospringjavabasic.models.dto;

public class PriceDTO {
    public String location;
    public Integer price;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
