package com.example.demospringjavabasic.controllers;

import com.example.demospringjavabasic.models.DiplomaGenerator;
import com.example.demospringjavabasic.models.dto.DiplomaDTO;
import com.example.demospringjavabasic.models.dto.StudentDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiplomaGeneratorController {

    @PostMapping("/diploma")
    public ResponseEntity<DiplomaDTO> generateDiploma(@RequestBody StudentDTO student){
        try{
            return new ResponseEntity<>(DiplomaGenerator.generateDiploma(student),HttpStatus.OK);
        }catch (NullPointerException e){
            e.printStackTrace();
            return  new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
