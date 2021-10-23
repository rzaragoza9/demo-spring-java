package com.example.demo.models;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public static Integer calculateAge(Integer day, Integer month, Integer year){
        Period age;
        try{
            LocalDate date = LocalDate.of(year,month,day);
            age = Period.between(date, LocalDate.now());
            return age.getYears();
        }catch (Exception e){
            return 0;
        }
    }

}
