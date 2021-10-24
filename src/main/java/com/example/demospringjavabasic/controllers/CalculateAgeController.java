package com.example.demospringjavabasic.controllers;

import com.example.demospringjavabasic.models.AgeCalculator;
import com.example.demospringjavabasic.models.dto.AgeDTO;
import com.example.demospringjavabasic.models.dto.DateDTO;
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
