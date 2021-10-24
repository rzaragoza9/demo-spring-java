package com.example.demospringjavabasic.controllers;

import com.example.demospringjavabasic.models.RomanNumerals;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanNumeralsController {

    @GetMapping(path = "/romannumerals/{numeroDecimal}")
    public String convertDecimalToRoman(@PathVariable String numeroDecimal){
        StringBuilder numDec = new StringBuilder();
        try {
            numDec.append(numeroDecimal.concat("  ----  ".concat(RomanNumerals.convertDecimalToRoman(Integer.parseInt(numeroDecimal)))));
        }catch (NumberFormatException e){
            e.printStackTrace();
            numDec.append("Escriba un número decimal correcto");
        }
        return numDec.toString();
    }

}
