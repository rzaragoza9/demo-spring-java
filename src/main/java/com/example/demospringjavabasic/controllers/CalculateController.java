package com.example.demospringjavabasic.controllers;

import com.example.demospringjavabasic.models.dto.PriceDTO;
import com.example.demospringjavabasic.services.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping("/{location}")
    public ResponseEntity<PriceDTO> calculate(@PathVariable String location){
        try{
            return new ResponseEntity<>(calculateService.calculate(location), HttpStatus.OK);
        }catch (NullPointerException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
