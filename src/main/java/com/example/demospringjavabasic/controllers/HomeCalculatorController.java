package com.example.demospringjavabasic.controllers;

import com.example.demospringjavabasic.models.HomeCalculator;
import com.example.demospringjavabasic.models.dto.HomeDTO;
import com.example.demospringjavabasic.models.dto.ValueHomeDTO;
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
