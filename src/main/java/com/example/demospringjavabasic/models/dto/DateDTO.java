package com.example.demospringjavabasic.models.dto;

public class DateDTO {
    private Integer day;
    private Integer month;
    private Integer year;

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDate(){
        return day.toString().concat("/".concat(this.month.toString().concat("/".concat(this.year.toString()))));
    }
}
