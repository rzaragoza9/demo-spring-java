package com.example.demo.controllers;

import com.example.demo.models.DTOs.AgeDTO;
import com.example.demo.models.AgeCalculator;
import com.example.demo.models.DTOs.DateDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculateAgeController {

    @GetMapping("/calculateAge/{day}/{month}/{year}")
    @ResponseBody
    public AgeDTO getAge(@PathVariable Integer day, @PathVariable Integer month, @PathVariable Integer year){
        AgeDTO ageDTO = new AgeDTO();
        ageDTO.setDate(day + "/" + month + "/" + year);
        ageDTO.setAge(AgeCalculator.calculateAge(day, month, year));
        return ageDTO;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }

    @PostMapping("/calculateage")
    public AgeDTO getAge(@RequestBody DateDTO date){
        AgeDTO ageDTO = new AgeDTO();
        ageDTO.setDate(date.getDate());
        ageDTO.setAge(AgeCalculator.calculateAge(date.getDay(), date.getMonth(), date.getYear()));
        return ageDTO;
    }

}
