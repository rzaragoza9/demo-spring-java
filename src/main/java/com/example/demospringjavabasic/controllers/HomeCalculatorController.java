package com.example.demo.controllers;

import com.example.demo.models.DTOs.HomeDTO;
import com.example.demo.models.DTOs.ValueHomeDTO;
import com.example.demo.models.HomeCalculator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCalculatorController {

    @PostMapping("/homecalculator")
    public ResponseEntity<ValueHomeDTO> calculateValueHome(@RequestBody HomeDTO home){
        try{
            return new ResponseEntity<>(HomeCalculator.calculateHomeValue(home), HttpStatus.OK);
        }catch (NullPointerException e){
            //e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
